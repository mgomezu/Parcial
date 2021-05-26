
package parcial2;


public class Oficina extends Inmueble {

    private String tipoDePiso;

    public Oficina(String tipoDePiso, String nombreComunDelBarrio, int estrato, double valorDeArriendo, double areaConstruida, boolean alquilado) {
        super(nombreComunDelBarrio, estrato, valorDeArriendo, areaConstruida, alquilado);
        this.tipoDePiso = tipoDePiso;
    }

    
    
    
    @Override
    public String darInformacion() {
        String estado;
        if (isAlquilado()){
            estado = "Alquilado";
        }
        else{
            estado = "Disponible";
        }
        String informacion = getNombreComunDelBarrio()+ " " + getEstrato() + " " + getValorDeArriendo() + " " +
                getAreaConstruida() + " " + tipoDePiso+ " " + estado;
        return informacion;
    }
    
    
    
}
