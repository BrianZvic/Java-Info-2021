import java.util.Scanner;


public class Ejercicio_5 {
    
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese el segundo numero numero: ");
        int num2 = scan.nextInt();
        scan.close();
        int mult = num1;

        for (int i=1; i <num2; i++){
            mult = mult+num1;
            
        }
        System.out.println("--------------------------------------------------------");
        System.out.print("La multiplicacion de "+ num1 + " * " + num2 + " = " + mult);
    }
}