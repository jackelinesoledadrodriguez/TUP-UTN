import java.util.Scanner;

public class EjercicioEstacionesSwitch {
    public static void main(String[] args) {
        int mes;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresar un numero del mes: ");
            mes = sc.nextInt();
        }
        switch (mes) {
            case 1, 2, 3 -> System.out.println("verano");
            case 4, 5, 6 -> System.out.println("otoño");
            case 7, 8, 9 -> System.out.println("invierno");
            case 10, 11, 12 -> System.out.println("primavera");
            default -> System.out.println("El mes ingresado no es valido");
        }
    }
}
