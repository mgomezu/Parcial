
package parcial2;


public class LocalComercial extends Inmueble {
    private String descripcion;
    private boolean ubicadoEnAvenidaPrincipal;

    public LocalComercial(String descripcion, boolean ubicadoEnAvenidaPrincipal, String nombreComunDelBarrio, int estrato, double valorDeArriendo, double areaConstruida, boolean alquilado) {
        super(nombreComunDelBarrio, estrato, valorDeArriendo, areaConstruida, alquilado);
        this.descripcion = descripcion;
        this.ubicadoEnAvenidaPrincipal = ubicadoEnAvenidaPrincipal;
    }

    @Override
    public String darInformacion() {
        String estado;
        String ubicacion;
        
        if (isAlquilado()){
            estado = "Alquilado";
        }
        else{
            estado = "Disponible";
        }
        
        if (ubicadoEnAvenidaPrincipal){
            ubicacion = "Esta en una avenida principal";
        }
        else{
            ubicacion = "No esta en una avenida principal";
        }
        
        String informacion = getNombreComunDelBarrio()+ " " + getEstrato() + " " + getValorDeArriendo() + " " +
                getAreaConstruida() + " " + ubicacion + " " + estado;
        return informacion;
    }

}
