import java.util.Scanner;

public class EjercicioEstaciones {
    public static void main(String[] args) {
        int mes;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresar un numero del mes: ");
            mes = sc.nextInt();
        }
        if (mes >= 1 && mes <= 3) {
            System.out.println("verano");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("otoño");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("invierno");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("primavera");
        } else {
            System.out.println("El mes ingresado no es valido");
        }
    }
}