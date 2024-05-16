import java.util.Scanner;

public class CamareroMusica {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Bienvenidos al bar musical, en breves os tomamos el pedido.");
        boolean suenaMusica = false;
        boolean tomarAlgo = false;
        boolean validar = false;
        // while (!Camarero.suenaMusica(scan)){

        // }
        // while (Camarero.tomarAlgo(scan)) {
                
        // }

        while (!validar) {
            
            suenaMusica = Camarero.suenaMusica(scan);
            if (suenaMusica) {
                tomarAlgo = Camarero.tomarAlgo(scan);
                if (!tomarAlgo) {
                    validar=true;
                }
            }
            


        }

    }
}

// Mientras siga sonando la música, vas por las mesas preguntando si quieren
// tomar algo más. SI NO SUENA LA MUSICA NO LES PREGUNTAS
// MAS. Si la gente te dice que sí quieren tomar algo más, sigues preguntando a
// otros si quieren tomar algo más. Si alguien te dice que no, dejas de
// preguntar si quieren algo más (aunque siga sonando la
// música).
// ***
