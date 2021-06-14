import java.util.Scanner;


public class ejercicio_4 {
   
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int entrada = scan.nextInt();
        scan.close();
        factorial(entrada);
        
       
    }

    public static void factorial(int entrada){
        int fact = 1;
        for(int i = 1;i <= entrada; i++){    
            fact = fact * i;    
        } 
        System.out.println("El factorial de "+ entrada +" es: "+ fact);
    }


}

