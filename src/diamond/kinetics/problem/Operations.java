/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamond.kinetics.problem;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Hala
 */
public final class Operations {

    private Operations() {
    }
    
    public static int searchContinuityAboveValue(double[] data, int indexBegin, int indexEnd, double threshold, int winLength) {
        return backSearchContinuityWithinRange(data, indexBegin, indexEnd, threshold, Float.POSITIVE_INFINITY, winLength);
    }

    public static int backSearchContinuityWithinRange(double[] data, int indexBegin, int indexEnd, double thresholdLo, double thresholdHi, int winLength) {
        int requiredIndex = -1;
        if (indexBegin <= indexEnd) {
            int length = 0;
            for (int i = indexBegin; i <= indexEnd; i++) {
                if ((data[i] > thresholdLo) && (data[i] < thresholdHi)) {
                    if (requiredIndex == -1) {
                        requiredIndex = i;
                    }
                    length++;
                    if (length == winLength) {
                        return requiredIndex;
                    }
                } else {
                    requiredIndex = -1;
                    length = 0;
                }
            }
        } else {
            System.out.println("Exception: start index is greater than end index");
        }
        return requiredIndex;
    }

    public static int searchContinuityAboveValueTwoSignals(double[] data1, double[] data2, int indexBegin, int indexEnd, double threshold1, double threshold2, int winLength) {
        int requiredIndex = -1;
        if (indexBegin <= indexEnd) {
            int length = 0;
            for (int i = indexBegin; i <= indexEnd; i++) {
                if ((data1[i] > threshold1) && (data2[i] > threshold2)) {
                    if (requiredIndex == -1) {
                        requiredIndex = i;
                    }
                    length++;
                    if (length == winLength) {
                        return requiredIndex;
                    }
                } else {
                    requiredIndex = -1;
                    length = 0;
                }
            }
        } else {
            System.out.println("Exception: start index is greater than end index");
        }

        return requiredIndex;
    }

    public static List<Range> searchMultiContinuityWithinRange(double[] data, int indexBegin, int indexEnd, double thresholdLo, double thresholdHi, int winLength) {
        if (indexBegin <= indexEnd) {
            int FirstIndex = -1;
            int length = 0;
            List<Range> requiredIndices = new LinkedList<>();
            for (int i = indexBegin; i <= indexEnd; i++) {
                if ((data[i] > thresholdLo) && (data[i] < thresholdHi)) {
                    if (FirstIndex == -1) {
                        FirstIndex = i;
                    }
                    length++;
                } else {
                    if (length >= winLength) {
                        requiredIndices.add(new Range(FirstIndex, i - 1));
                    }
                    FirstIndex = -1;
                    length = 0;
                }
            }
            return requiredIndices;
        } else {
            System.out.println("Exception: start index is greater than end index");
            return null;
        }
    }
}
