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
public class Swing {

    public Swing(double[] timestamps, double[] ax, double[] ay, double[] az, double[] wx, double[] wy, double[] wz) {
        this.timestamps = timestamps;
        this.ax = ax;
        this.ay = ay;
        this.az = az;
        this.wx = wx;
        this.wy = wy;
        this.wz = wz;
    }

    public Swing() {
    }

    private double[] timestamps;
    private double[] ax;
    private double[] ay;
    private double[] az;
    private double[] wx;
    private double[] wy;
    private double[] wz;
    
    public Point getPointA(int index){
        return new Point(ax[index], ay[index], az[index]);
    }
    
    public Point getPointW(int index){
        return new Point(wx[index], wy[index], wz[index]);
    }
    
    public double getTimestamp(int index){
        return timestamps[index];
    }
    
    /**
     * @return the timestamps
     */
    public double[] getTimestamps() {
        return timestamps;
    }

    /**
     * @param timestamps the timestamps to set
     */
    public void setTimestamps(double[] timestamps) {
        this.timestamps = timestamps;
    }

    /**
     * @return the ax
     */
    public double[] getAx() {
        return ax;
    }

    /**
     * @param ax the ax to set
     */
    public void setAx(double[] ax) {
        this.ax = ax;
    }

    /**
     * @return the ay
     */
    public double[] getAy() {
        return ay;
    }

    /**
     * @param ay the ay to set
     */
    public void setAy(double[] ay) {
        this.ay = ay;
    }

    /**
     * @return the az
     */
    public double[] getAz() {
        return az;
    }

    /**
     * @param az the az to set
     */
    public void setAz(double[] az) {
        this.az = az;
    }

    /**
     * @return the wx
     */
    public double[] getWx() {
        return wx;
    }

    /**
     * @param wx the wx to set
     */
    public void setWx(double[] wx) {
        this.wx = wx;
    }

    /**
     * @return the wy
     */
    public double[] getWy() {
        return wy;
    }

    /**
     * @param wy the wy to set
     */
    public void setWy(double[] wy) {
        this.wy = wy;
    }

    /**
     * @return the wz
     */
    public double[] getWz() {
        return wz;
    }

    /**
     * @param wz the wz to set
     */
    public void setWz(double[] wz) {
        this.wz = wz;
    }
}
