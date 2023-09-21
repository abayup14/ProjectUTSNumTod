/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectutsnumtod;

/**
 *
 * @author Andreas Bayu P
 */
public class MetodeTerbuka extends MetodeDasar{
    /* Menggunakan Metode Newton Raphson */
    
    public MetodeTerbuka(double akarX1, int angkaSignifikan, int maxLoop) {
        super(akarX1, angkaSignifikan, maxLoop);
    }
    
    public double Hitung_dfdx(double x_sebelum) {
        return (double)(Math.cos(x_sebelum) - Math.exp(x_sebelum) - 1.0);
    }
    
    @Override
    public double Hitung_x_sekarang(double x_sebelum) {
        return (double)(x_sebelum - (this.Hitung_f_x(x_sebelum) / this.Hitung_dfdx(x_sebelum)));
    }
}
