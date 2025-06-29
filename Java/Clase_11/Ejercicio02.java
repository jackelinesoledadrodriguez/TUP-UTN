import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        float compra, descuento, precioFinal;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite la cantidad a pagar: ");
            compra = sc.nextFloat();
        }
        if (compra > 100) {
            descuento = compra * 0.2f;
        } else {
            descuento = 0;
        }
        precioFinal = compra-descuento;
        System.out.println("El precio a pagar es: "+String.format("%.2f", precioFinal));
    }
}
