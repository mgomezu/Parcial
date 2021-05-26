
package parcial2;

import java.util.ArrayList;


public class Edificio extends Inmueble{
    private ArrayList <LocalComercial> locales;
    private ArrayList <Piso> Pisos;

    public Edificio(ArrayList<LocalComercial> locales, ArrayList<Piso> Pisos, String nombreComunDelBarrio, int estrato, double valorDeArriendo, double areaConstruida, boolean alquilado) {
        super(nombreComunDelBarrio, estrato, valorDeArriendo, areaConstruida, alquilado);
        this.locales = locales;
        this.Pisos = Pisos;
    }

    public ArrayList<LocalComercial> getLocales() {
        return locales;
    }

    public ArrayList<Piso> getPisos() {
        return Pisos;
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
        
        String informacion = getNombreComunDelBarrio() + " " + getEstrato() + " " + getValorDeArriendo() + " " +
                getAreaConstruida() + " " + estado;
        return informacion;
    }
    
    
}
