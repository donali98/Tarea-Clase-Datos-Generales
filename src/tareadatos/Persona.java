package tareadatos;

/**
 *
 * @author Donali
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
   
    public Persona(String nombre, String apellido, int edad, String sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        System.out.println("Nombre: "+this.nombre+"\t");
        System.out.println("Apellido: "+this.apellido+"\t");
        System.out.println("Edad: "+this.edad+"\t");
        System.out.println("Sexo: "+this.sexo+"\t");
    }
   
}
