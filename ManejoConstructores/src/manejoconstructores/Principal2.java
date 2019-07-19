
package manejoconstructores;


public class Principal2 {
    public static void main(String[] args) {
        
        Entrenador entrenador1 = new Entrenador("Rene",35, "Basquet");
        Entrenador entrenador2 = new Entrenador();
        entrenador2.setDeporte("Tenis");
        
        
        System.out.printf("%s\n", entrenador1);
        System.out.printf("%s\n", entrenador2);
    }
}
