/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author bertoa
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
        System.out.println("modificado por alumno 1"); // alumno 1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	System.out.println("This method has been modified by Haritz");
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");

	System.out.println("Haritz"); //Lo ha escrito el alumno 2

        // modificaciones alumno 1
        System.out.println("Alumno 1 inserta esta sentencia");

    }
}
