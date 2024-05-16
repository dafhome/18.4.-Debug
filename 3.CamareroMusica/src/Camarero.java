import java.util.Scanner;

public class Camarero {

    public static boolean suenaMusica(Scanner scan) {
        boolean suenaMusica;
        System.out.println("¿Está sonando la musica?");

        if (scan.nextLine().equalsIgnoreCase("si")) {
            suenaMusica = true;
        } else
            suenaMusica = false;

        return suenaMusica;

    }

    public static boolean tomarAlgo(Scanner scan) {
        boolean tomarAlgo;
        System.out.println("¿Quieres tomar algo?");
        if (scan.nextLine().equalsIgnoreCase("si")) {
            tomarAlgo = true;
            System.out.println("Aquí tienes!");
        } else
            tomarAlgo = false;

        return tomarAlgo;

    }

    public static boolean pregunta(Scanner scan, String pregunta) {
        boolean respuesta;
        System.out.println(pregunta);
        if (scan.nextLine().equalsIgnoreCase("si")) {
            respuesta = true;
        } else
            respuesta = false;

        return respuesta;

    }

}
