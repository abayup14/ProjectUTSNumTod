/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectutsnumtod;

/**
 *
 * @author Andreas Bayu P
 */
public class MetodeDasar {
    private double akarX1;
    private int angkaSignifikan;
    private int maxLoop;
    
    public double getAkarX1() {
        return akarX1;
    }

    public void setAkarX1(double akarX1) {
        this.akarX1 = akarX1;
    }

    public int getAngkaSignifikan() {
        return angkaSignifikan;
    }

    public void setAngkaSignifikan(int angkaSignifikan) {
        this.angkaSignifikan = angkaSignifikan;
    }

    public int getMaxLoop() {
        return maxLoop;
    }

    public void setMaxLoop(int maxLoop) {
        this.maxLoop = maxLoop;
    }
    

    public MetodeDasar(double akarX1, int angkaSignifikan, int maxLoop) {
        this.akarX1 = akarX1;
        this.angkaSignifikan = angkaSignifikan;
        this.maxLoop = maxLoop;
    }
    
    public double Hitung_f_x(double nilai) {
        return (double)(Math.sin(nilai) - Math.exp(nilai) - nilai);
    }
    
    public double Hitung_epsilon_a(double x_sebelum, double x_sekarang) {
        return (double)(Math.abs((x_sekarang - x_sebelum) / x_sekarang  * 100.0));
    }
    
    public double Hitung_epsilon_s() {
        return (double)(0.5 * Math.pow(10, (double)(2 - this.getAngkaSignifikan())));
    }
    
    public double Hitung_x_sekarang(double x_lower, double x_upper) {
        return 0;
    }
    
    public double Hitung_x_sekarang(double x_sebelum) {
        return 0;
    }
}
