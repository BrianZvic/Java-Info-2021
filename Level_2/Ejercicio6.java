
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Ejercicio6 {
  public static void main(String[] args) {
    Empleados emp1 = new Empleados(40, 200, "Rodrigo", "Perez", "43023943");
    Empleados emp2 = new Empleados(30, 250, "Esteban", "Lopez", "43242343");
    Empleados emp3 = new Empleados(35, 300, "Maria", "Suarez", "40000000");
    Empleados emp4 = new Empleados(25, 210, "Rodrigo", "Moralez", "35023120");
    Empleados emp5 = new Empleados(42, 180, "Juan", "Gordillo", "29321843");

    Set<Empleados> empleados = new HashSet<>(){{
      add(emp1);
      add(emp2);
      add(emp3);
      add(emp4);
      add(emp5);
    }};
    Map<String, Integer> sueldos = new HashMap<>();

    for(Empleados e : empleados){
      sueldos.put(e.DNI, (e.horasTrabajadas*e.valorPorHora));
    }

    System.out.println(sueldos.get(emp1.DNI));
    

  }
}

