
import java.time.*;
import java.time.format.DateTimeFormatter;


public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private double sueldo ;
    

    public double getSueldo() {
        return sueldo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        int edad = LocalDate.now().getYear() - fechaNac.getYear();
        return edad;
    }

//--------------------------------------------------------------------------------------//
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = Double.parseDouble(sueldo);
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

   
    public void setFechaNac(String fechaNac) {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNac = LocalDate.parse(fechaNac,formatter);
    }
    //-----------------------------------------------------------------------------------------//

    public Empleado(String nombre, String apellido, String fechaNac, String sueldo){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setSueldo(sueldo);
        this.setFechaNac(fechaNac);
        
    }
    public String toString() {
        return this.getNombre() +" " +  this.getApellido();
    }
    
}