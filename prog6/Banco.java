import java.util.Scanner;

public class Banco{
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    float compra;

    System.out.println("Bienvenido, su saldo inicial es de: $2000" );
    System.out.print("Ingrese el monto de la compra que va a realizar: ");
    compra = entrada.nextFloat();
    OperacionesBanco ejecutaOperac = new OperacionesBanco(2000);
    System.out.println("Tu saldo final es de: " + ejecutaOperac.RealizarCompra(compra));
  }
}
