/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class Ejercicio_1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        String nombre,apellido;
        int codigo,salario,salario_diario;
        System.out.print("Ingrese Codigo:");
        codigo=teclado.nextInt();
        System.out.print("Ingrese el nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese el apellido:");
        apellido=teclado.next();
        System.out.print("Ingrese salario mensual:");
        salario=teclado.nextInt();
        salario_diario=salario/30;
        
        System.out.println("Codigo de acceso : "+codigo);
        System.out.println("Buenos dias : "+nombre+" "+apellido);
        System.out.println("Su salario diario es de :"+salario_diario);
        
                
    }
    
}
