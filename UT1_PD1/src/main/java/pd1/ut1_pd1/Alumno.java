/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd1.ut1_pd1;

/**
 *
 * @author Administrador
 */
public class Alumno {

    private String nombre = "Juan";

    public String Alumno() {
        return nombre; // El nombre no puede ser null ya que no se puede conactenar
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }
    public void setNombreAdmiracion(){
        this.nombre = nombre;
    }
// } Esta llave va al final ya que no pueden existir métodos por fuera de una clase
    public static int recorrer(String cadena) {
        int res = 0;
        for (int i = 1; i <= cadena.length()-1; i++) { //El error era que se iba de rango el i.
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = {6, 16, 26, 36, 46, 56, 66, 76};
        int idx = 7; // El problema es que con 8 se va de rango ya que el array arranca en 0 (0-7 = 8 elementos).
        //System.out.println(vector[idx]);
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        //String string[] = new String[5]; El string[1] está apuntando a null, ese es el error.
        //Además hay que acceder a la posicion 0 para obtener el primero y no a la 1.
        //System.out.print(string.toString());
        return (palabra.charAt(0));
    }
    
    public static String paraAString(int a) {
        return (String.valueOf(a)); //La idea es devolver el int en string, lo hice con este método.Corregido}!
    }
}// Este es el lugar correcto de la llave.
