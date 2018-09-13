import java.util.Scanner;

public class prog15{
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    OpMatrices ejecutaOperac = new OpMatrices();

    // limpiar pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    //
    System.out.println("Ingrese el numero de elementos de cada matriz: ");
    int tam = entrada.nextInt();
    int arreglo1[][] = new int[2][tam];

    ejecutaOperac.LlenarArreglo(arreglo1, tam);
    System.out.println();
    // ejecutaOperac.ImprimirArreglo(arreglo1);
    System.out.println("\nResultados:");
    ejecutaOperac.Sumar(arreglo1);
    ejecutaOperac.Restar(arreglo1);
    ejecutaOperac.Multiplicar(arreglo1);
  }
}
