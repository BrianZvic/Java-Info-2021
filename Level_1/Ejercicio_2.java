import java.util.*;



public class Ejercicio_2 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scan.nextInt();
        scan.close();
        imprimir(num1,num2, resto(num1, num2), div(num1,num2), mult(num1, num2), suma(num1, num2),resta(num1, num2));



    }


    public static Integer resta(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }
    public static Integer suma(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    public static Integer mult(int num1, int num2){
        int mult = num1 * num2;
        return mult;
    }
    public static Integer div(int num1, int num2){
        int div = num1 / num2;
        return div;
    }
    public static Integer resto(int num1, int num2){
        int resto = num1 % num2;
        return resto;
    }

    public static void imprimir(int num1, int num2,Integer resto,Integer div,Integer mult,Integer suma,Integer resta){
        System.out.println("El resultado de las siguentes operaciones son:");
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicacion: " + num1 + " * " + num2 + " = " + mult);
        System.out.println("Divicion: " + num1 + " / " + num2 + " = " + div);
        System.out.println("Resto: " + num1 + " / " + num2 + " = " + resto);
        



    }

}
