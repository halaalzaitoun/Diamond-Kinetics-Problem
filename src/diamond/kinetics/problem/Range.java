/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamond.kinetics.problem;

/**
 *
 * @author Hala
 */
public class Range {

    public Range() {
    }

    public Range(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
    
    private int startIndex;
    private int endIndex;

    /**
     * @return the startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * @param startIndex the startIndex to set
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * @return the endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * @param endIndex the endIndex to set
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
    
}
