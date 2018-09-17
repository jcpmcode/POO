import java.util.Scanner;

public class OpMatrices{
  Scanner entrada = new Scanner (System.in);

  public void LlenarArreglo(int arreglo1[][], int tam){
    for (int i = 0; i < 2; i++){
      System.out.println("Matriz " + (i+1) + ": ");
      for (int j = 0; j < tam; j++){
        System.out.print("[" + i + "]" + "[" + j + "]: ");
        arreglo1[i][j] = entrada.nextInt();
      }
    }
  }

  public void ImprimirArreglo(int arreglo1[][]){
    for (int i = 0; i < arreglo1.length - 1; i++){
      for (int j = 0; j < arreglo1[i].length; j++){
        System.out.println(arreglo1[i][j] + " " + arreglo1[i+1][j]);
      }
    }
  }

  public void Sumar(int arreglo1[][]){
    System.out.println("Suma:");
    for (int i = 0; i < arreglo1.length - 1; i++){
      for (int j = 0; j < arreglo1[i].length; j++){
        System.out.println(arreglo1[i][j] + arreglo1[i+1][j]);
      }
    }
  }

  public void Restar(int arreglo1[][]){
    System.out.println("Resta:");
    for (int i = 0; i < arreglo1.length - 1; i++){
      for (int j = 0; j < arreglo1[i].length; j++){
        System.out.println(arreglo1[i][j] - arreglo1[i+1][j]);
      }
    }
  }

  public void Multiplicar(int arreglo1[][]){
    System.out.println("Multiplicacion:");
    for (int i = 0; i < arreglo1.length - 1; i++){
      for (int j = 0; j < arreglo1[i].length; j++){
        System.out.println(arreglo1[i][j] * arreglo1[i+1][j]);
      }
    }
  }

}
