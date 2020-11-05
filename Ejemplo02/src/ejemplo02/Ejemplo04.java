/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02; 
/**
 *
 * @author Usuario iTC
 */
import java.util.Scanner;

public class Ejemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        String apellidos;
        String ciudad;
        String pais;
        String nacimiento;
        System.out.println("Ingrese sus nombres");
        nombres = entrada.nextLine();
        
        System.out.println("Ingrese sus apellidos");
        apellidos = entrada.nextLine();
        
        System.out.println("Ingrese el nombre de la ciudad");
        ciudad = entrada.nextLine();
        
        System.out.println("Ingrese el nombre del pais");
        pais = entrada.nextLine();
        
        System.out.println("ingrese el año de nacimiento");
        nacimiento = entrada.nextLine();
        
        System.out.printf("Datos del estudiante\n%s\n%s\n%s\n%s\n%s\n",
                nombres,apellidos,ciudad,pais,nacimiento);
        

 } 
    
} 
    
