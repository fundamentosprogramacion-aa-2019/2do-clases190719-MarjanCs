
package manejoconstructoresdos;

public class Entrenador {
    private String nombre;
    private int edad;
    private String deporte;
    private double salario;
    private Equipo equipo;
   
  
    public Entrenador(String n, int e, String d, double sal, Equipo eq){
        establecerNombre(n);
        establecerEdad(e);
        establecerDeporte(d);
        establecerSalario(sal);
        establecerEquipo(eq);
    }
    
    public void establecerNombre(String e){
        nombre = e;
    }
    
    public void establecerEdad(int e){
        edad = e;
        
    }
    
    public void establecerDeporte(String d){
        deporte = d;
    }
    
    public void establecerSalario(double s){
        salario = s;
    }
    
    public void establecerEquipo(Equipo e){
        equipo = e;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerEdad(){
        return edad;
    }
    
    public String obtenerDeporte(){
        return deporte;
    }
    
    public double obtenerSalario(){
        return salario;
    }
    
    public Equipo obtenerEquipo(){
        return equipo;
    }
     
    public String toString(){
        
        String cadena = String.format("Entrenador:\n\tNombre: %s\n\tDeporte: %s\n\tEquipo:"
                + " %s\n\tProvincia: %s\n", obtenerNombre(), obtenerDeporte(), 
                obtenerEquipo().obtenerNombre(), obtenerEquipo().obtenerCiudad().obtenerProvincia());
        return cadena;
    }
}
