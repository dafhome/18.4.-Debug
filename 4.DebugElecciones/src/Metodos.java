import java.util.ArrayList;

public class Metodos {
    public static void calculoPorcentaje(ArrayList<Partido> elecciones) {
        int sumaTotal = 0;

        for (int i = 0; i < elecciones.size(); i++) {
            sumaTotal += elecciones.get(i).getEscanos();
        }


        for (Partido partido : elecciones) {
            double porc = (double) partido.getEscanos() / sumaTotal * 100;
            partido.setPorcentaje((int) Math.round(porc));
        }

    }

    public static void printLentamente(String frase, int enter, int sleep){
        try {
            for (int i = 0; i < frase.length(); i++) {
                System.out.print(frase.charAt(i));
                if (sleep == 1) {
                    Thread.sleep(20);
                }
            }
            if (enter == 1) {
                System.out.println(" ");
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
