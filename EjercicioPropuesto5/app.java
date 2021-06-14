import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class app {
    
    public static void main(String[] args) throws IOException {
        List<Empleado> lista_empleados = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String path = "empleado.txt";
        lista_empleados = leer(path);
        
        System.out.println("Su archivo se leyo con exito.....");
        System.out.println("-----------------------------------");
        System.out.print("Ingrese una letra para realizar el filtrado: ");
        String letraComienzo = scan.nextLine().toUpperCase();
        scan.close();
        System.out.println("Realizando filtrado....., espere un momento");
        System.out.println("Estos son los resultados de la busqueda con la letra " + 
            letraComienzo + " son : "+ filtroEmpl(lista_empleados, letraComienzo));

        System.out.println("-----------------------------------");
        System.out.println("Esta es la persona con menor edad en la lista: " +  getMenorEdad(lista_empleados) );
        System.out.println("-----------------------------------");
        System.out.println("Esta es la persona con mayor edad en la lista: " +  getMeyorEdad(lista_empleados) );
        System.out.println("-----------------------------------");
        System.out.println("Esta es la persona con menor sueldo en la lista: " +  getMenorSueldo(lista_empleados));
        System.out.println("-----------------------------------");
        System.out.println("Esta es la persona con mayor sueldo en la lista: " + getMayorSueldo(lista_empleados));
        System.out.println("-----------------------------------");
        
        
        
               
        
    }

    public static List<Empleado> leer(String path){
        List<Empleado> empleados = new ArrayList<>();
        System.out.println("Leyendo el archivo........");
        try(BufferedReader linea = new BufferedReader(new FileReader(path))){
            String empleado = linea.readLine();
            
            while (empleado != null){
                String[] datosEmpleado = empleado.split(",");
                
                Empleado empl = new Empleado(datosEmpleado[0], datosEmpleado[1], datosEmpleado[2], datosEmpleado[3]);
                empleados.add(empl);
                empleado = linea.readLine(); 
            }
            
            linea.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
        return empleados;
    }

    public static List<Empleado> filtroEmpl(List<Empleado> empleados, String letraComienzo){
        List<Empleado> emp = new ArrayList<>();
        for(int i = 0; i < empleados.size(); i++){
            if (empleados.get(i).getNombre().startsWith(letraComienzo)){
                emp.add(empleados.get(i));
            }
        }
        return emp;
    }

    public static List<Empleado> getMayorSueldo(List<Empleado> empleados){
        List<Empleado>getMayor = new ArrayList<>();
        double mayor_sueldo = empleados.get(0).getSueldo();
        for (int i = 0; i < empleados.size(); i++){
            if (empleados.get(i).getSueldo() > mayor_sueldo){
                mayor_sueldo = empleados.get(i).getSueldo();
            }
        }

        
        for (int j = 0; j < empleados.size(); j++){
            if (empleados.get(j).getSueldo() == mayor_sueldo){
                getMayor.add(empleados.get(j));
                
                
            }
        }
        return getMayor; 



       
    }
    public static List<Empleado> getMenorSueldo(List<Empleado> empleados){
        List<Empleado> get_MenorSueldo = new ArrayList<>();
        double mayor_sueldo = empleados.get(0).getSueldo();
        for (int i = 0; i < empleados.size(); i++){
            if (empleados.get(i).getSueldo() < mayor_sueldo){
                mayor_sueldo = empleados.get(i).getSueldo();
            }
        }

        
        for (int j = 0; j < empleados.size(); j++){
            if (empleados.get(j).getSueldo() == mayor_sueldo){
                get_MenorSueldo.add(empleados.get(j));
            }
        }
        return get_MenorSueldo; 
       
    }

    public static List<Empleado> getMenorEdad(List<Empleado> empleados){
        List<Empleado> get_MenorEdad = new ArrayList<>();
        int menor_edad = empleados.get(0).getEdad();
        for (int i = 0; i < empleados.size(); i++){
            if (empleados.get(i).getEdad() < menor_edad){
                menor_edad = empleados.get(i).getEdad();
            }
        }
        for (int j = 0; j < empleados.size(); j++){
            if (empleados.get(j).getEdad() == menor_edad){
                get_MenorEdad.add(empleados.get(j));
            }
        }
        return get_MenorEdad;   
    }
    public static List<Empleado> getMeyorEdad(List<Empleado> empleados){
        List<Empleado> get_MayorEdad = new ArrayList<>();
        int mayor_edad = empleados.get(0).getEdad();
        for (int i = 0; i < empleados.size(); i++){
            if (empleados.get(i).getEdad() > mayor_edad){
                mayor_edad = empleados.get(i).getEdad();
            }
        }
        for (int j = 0; j < empleados.size(); j++){
            if (empleados.get(j).getEdad() == mayor_edad){
                get_MayorEdad.add(empleados.get(j));
            }
        }
        return get_MayorEdad;   
    }
    
    
}