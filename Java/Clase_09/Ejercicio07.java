import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        final double salarioMensual;
        double comision;
        double precioCarro;
        int cantidadVendidos;
        try (Scanner sc = new Scanner(System.in)) {
            salarioMensual = 1000;
            comision = 150;
            System.out.print("Ingresar precio de los carros vendidos: ");
            precioCarro = sc.nextDouble();
            System.out.print("Ingresar cantidad vendidos: ");
            cantidadVendidos = sc.nextInt();
        }
        double salarioTotal = salarioMensual + (comision * cantidadVendidos) + 5 * (cantidadVendidos * precioCarro) / 100;
        System.out.println("Salario mensual: " + salarioMensual);
        System.out.println("Comision por venta: " + comision);
        System.out.println("Precio de los carros vendidos: " + precioCarro);
        System.out.println("Cantidad vendidos: " + cantidadVendidos);
        System.out.println("Salario total: " + salarioTotal);
    }
}
