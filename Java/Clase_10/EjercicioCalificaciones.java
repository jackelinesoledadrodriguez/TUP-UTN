import java.util.Scanner;

public class EjercicioCalificaciones {
    public static void main(String[] args) {
        int calificacion;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresar calificacion: ");
            calificacion = Integer.parseInt(sc.nextLine());
        }
        switch (calificacion) {
            case 9,10 -> System.out.println("A");
            case 8 -> System.out.println("B");
            case 7 -> System.out.println("C");
            case 6 -> System.out.println("D");
            case 0,1,2,3,4,5 -> System.out.println("F");
            default -> System.out.println("La calificacion ingresada no es valida");
        }
    }
}
