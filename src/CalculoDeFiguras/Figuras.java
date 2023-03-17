/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculoDeFiguras;
import javax.swing.JOptionPane;
/**
 *
 * @author ElChistes (Kevin Moreno Rojas)
 */
public class Figuras {
    public static double area;
    public void AreaCirculo(double radio){
        area = Math.PI*Math.pow(radio, 3);
        JOptionPane.showMessageDialog(null,"El area del circulo es: "+area);
    }
    public void AreaCuadrado(double lado){
        area = Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+area);
    }
    public void AreaTriangulo(double base, double altura){
        area = base * altura /2;
        JOptionPane.showMessageDialog(null,"El area del triangulo es: "+area);
    }
    public void AreaRectangulo(double base2, double altura2){
        area = base2 * altura2;
        JOptionPane.showMessageDialog(null," El area del rectangulo es: "+area);
    }
    public void AreaEsfera (double radio2){
        area = 4 * Math.PI * Math.pow(radio2, 2);
        JOptionPane.showMessageDialog(null," El area de la esfera es: "+area);
    }
    public void AreaCubo (double arista){
        area = 6 * Math.pow(arista, 2);
        JOptionPane.showMessageDialog(null," El area del cubo es:  "+area);
    }
}

