package aplicacion;

// Importar la clase Matematicas
import mates.Matematicas;

/**
 * Clase principal de la aplicación.
 */
public class Principal {
/**
    * Método principal de la aplicación.
    * @param args Argumentos pasados por línea de comandos.
    */
    public static void main(String[]args)
    {
     // Comprobar que se ha pasado un argumento.
        int iter = 100000000;
        System.out.println("El numero pi es "+ Matematicas.generarNumeroPiIt(iter));
    }
}