/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pd1.ut1_pd1;

/**
 *
 * @author Administrador
 */
public class UT1_PD1 {

    public static void main(String[] args) {
        System.out.println("Ejercicio Mulsuma");
        Multsuma m1 = new Multsuma();
        m1.mulsuma(1.0,2.0,3.0);
        
        System.out.println("Ejercicio Alumno");
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
        alumno.recorrer("abcd");
        alumno.getValor();
        System.out.println(alumno.getPrimerCaracter("Antonio"));
        System.out.print(alumno.paraAString(3));
        
    }
}
