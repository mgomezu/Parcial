
package parcial2;


public class Propietario {
    private String nombre;
    private int edad;
    private double DNI;
    private String sexo;

    public Propietario(String nombre, int edad, double DNI, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
    }
    
    public String informacion(){
        String informacion = nombre + " " + edad + " " + DNI + " " + sexo;
        return informacion;
    }
}
