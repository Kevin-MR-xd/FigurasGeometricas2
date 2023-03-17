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
public class Datos {
    public static double lado;
    public static double radio;
    public static double radio2;
    public static double base;
    public static double base2;
    public static double altura;
    public static double altura2;
    public static double arista;
    public void Valores(){
       JOptionPane.showMessageDialog(null,"//Area del Circulo//");
       radio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
       JOptionPane.showMessageDialog(null,"//Area del Cuadrado//");
       lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del lado"));
       JOptionPane.showMessageDialog(null,"//Area del Triangulo //");
       base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
       altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
       JOptionPane.showMessageDialog(null,"//Area del Rectangulo //");
       base2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
       altura2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
       JOptionPane.showMessageDialog(null,"//Area de Esfera//");
       radio2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
       JOptionPane.showMessageDialog(null,"//Area del Cubo//");
       arista = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de una sus aristas "));
       
       
       Figuras areas = new Figuras();
       areas.AreaCirculo(radio);
       areas.AreaCuadrado(lado);
       areas.AreaTriangulo(base,altura);
       areas.AreaRectangulo(base2,altura2);
       areas.AreaEsfera(radio2);
       areas.AreaCubo(arista);
    }
}
