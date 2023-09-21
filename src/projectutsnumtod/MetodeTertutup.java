/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectutsnumtod;

/**
 *
 * @author Andreas Bayu P
 */
public class MetodeTertutup extends MetodeDasar {
    /* Menggunakan Metode Regula Falsi*/
    
    private double akarX2;
    
    public double getAkarX2() {
        return akarX2;
    }

    public void setAkarX2(double akarX2) {
        this.akarX2 = akarX2;
    }
    
    public MetodeTertutup(double akarX1, double akarX2, int angkaSignifikan, int maxLoop) {
        super(akarX1, angkaSignifikan, maxLoop);
        this.akarX2 = akarX2;
    }
    
    @Override
    public double Hitung_x_sekarang(double x_lower, double x_upper) {
        return (double)(x_upper - ((this.Hitung_f_x(x_upper)) / (this.Hitung_f_x(x_lower) - this.Hitung_f_x(x_upper)) * (x_lower - x_upper)));
    }
}
