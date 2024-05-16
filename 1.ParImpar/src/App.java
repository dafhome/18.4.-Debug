import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num1 = scan.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = scan.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>();
        int par = 0;
        int impar = 0;

        for (int i = num1;i<num2;i++){

            if (i%2 == 0) {
                numeros.add(i*2);
                par++;
            }
            else{
                numeros.add(i*3);
                impar++;
            }

        }
        System.out.println("El intervalo entre "+num1+" y "+num2+" tiene "+par+" numeros pares y "+impar+" numeros impares.");
        for (Integer integer : numeros) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }
}

// El usuario entra dos números. Se hace un bucle del primero al segundo, y si es par, multiplica por dos, si es impar multiplica por tres.
// Mostrar todos los resultados, y decir de la serie inicial cuántos son impares y cuántos son pares (debe dar la misma cantidad o uno de diferencia).
