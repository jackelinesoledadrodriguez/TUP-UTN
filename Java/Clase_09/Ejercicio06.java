
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        int Guillermo;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresar dolares de Guillermo: ");
            Guillermo = sc.nextInt();
        }
        int Luis = Guillermo / 2;
        int Juan = (Guillermo + Luis) / 2;
        int juntos = Guillermo+Luis+Juan;
        System.out.println("Guillermo: " + Guillermo);
        System.out.println("Luis: " + Luis);
        System.out.println("Juan: " + Juan);
        System.out.println("Todo junto: "+juntos);
    }
}
