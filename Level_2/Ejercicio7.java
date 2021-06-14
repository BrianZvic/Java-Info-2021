import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1, num2;
    System.out.print("Ingrese un numero: ");
    num1 = scan.nextInt();
    System.out.print("Ingrese otro numero (debe ser mayor al primero): ");
    while(true){
      num2 = scan.nextInt();
      if(num2 > num1) {
        break;
      }
      System.out.println("Error, el numero no puede ser mayor al primero, ingrese nuevamente");
    }
    String[] arrayFinal = geneArray(num1, num2);

    for(int i = 0; i<arrayFinal.length; i++){
      System.out.println(arrayFinal[i]);
    }
    scan.close();
  }
  
  public static String[] geneArray(int num1, int num2){
    int longitudArray = num2 - num1;
    System.out.println(longitudArray);
    String[] arreglo = new String[longitudArray];
    int j = 0;
    for(int i = num1; i<num2;i++){
      arreglo[j] = detElemento(i);
      j++;
    }
    return arreglo;
  }

  public static String detElemento(int n){
    String s = String.valueOf(n);
    if( n%2 == 0 && n%3 == 0){
      s="FizzBuzz";
    } else if(n%3 == 0){
      s="Buzz";
    } else if(n%2 == 0){
      s="Fizz";
    } 
    return s;
  }

}
