import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                lorem impsum
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2020){
            System.out.println("peliculas populares del momento");
        }else {
            System.out.println("Pelicula retro que vale la pena ver");
        }


        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Cual es tu puntuacion de la película " + nombre + "?");
            double notaMatrix = teclado.nextDouble();

            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;

        }
        System.out.println("la media de puntuacion de la pelicula matrix es: " + mediaEvaluacionUsuario/3);

    }
}