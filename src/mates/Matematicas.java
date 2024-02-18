package mates;

import java.util.Random;
/**
 * Clase con métodos matemáticos.
 */
public class Matematicas
{
   /**
     * Genera una aproximación de pi mediante el método de Monte Carlo.
     * @param pasos Número de pasos a realizar.
     * @return Aproximación de pi.
     */

    public static double generarNumeroPiIt(long pasos)
    {
     // Variable dentroCirculo
     // Contador de puntos dentro del círculo.
        int dentroC = 0;
        long puntos = pasos;

    // Genera los puntos aleatorios para poder contar cuantos caen dentro del círculo.
        Random random = new Random();

        for (int i = 0; i < pasos; i++) 
        {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double distanciaAlMedio = x * x + y * y;

            // Si el punto está dentro del círculo, incrementa el contador.
            if (distanciaAlMedio <= 1) 
            {
                dentroC++;
            }
        }

        // Devuelve el valor de la aproximacion de Pi
        return (4.0 * dentroC) / puntos;
    }
}