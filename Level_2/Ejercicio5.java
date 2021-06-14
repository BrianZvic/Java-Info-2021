import java.util.*;




public class Ejercicio5 {
    public static void main(String[] args){
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 4, 5));
        ArrayList<Integer> valorPorHora = new ArrayList<Integer>(Arrays.asList(350, 345, 550, 600, 320));
        
        sueldoSemanal(calcularSueldo(horasTrabajadas, valorPorHora));
    }

    public static ArrayList<Integer> calcularSueldo(ArrayList<Integer> horasTrabajadas,ArrayList<Integer> valorPorHora){
        ArrayList<Integer> dineroDia = new ArrayList<Integer>();
        for (int i = 0; i < horasTrabajadas.size();){
            dineroDia.add(horasTrabajadas.get(i) * valorPorHora.get(i));
            i++;
            
        }

        return dineroDia;
        
    }

    public static void sueldoSemanal(ArrayList<Integer> calcularSueldo){
        int sueldoSemanal = 0;
        for (int i = 0; i < calcularSueldo.size();){
            sueldoSemanal = sueldoSemanal + calcularSueldo.get(i);

        
        }

        System.out.println(sueldoSemanal);
    }
   
    
}