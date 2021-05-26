
package parcial2;

import java.util.ArrayList;


public class Piso extends Inmueble {
    private int numeroDeOficinas;
    private int area;
    private ArrayList <Oficina> oficinas;

    public Piso(int area, ArrayList<Oficina> oficinas, String nombreComunDelBarrio, int estrato, double valorDeArriendo, double areaConstruida, boolean alquilado) {
        super(nombreComunDelBarrio, estrato, valorDeArriendo, areaConstruida, alquilado);
        this.area = area;
        this.oficinas = oficinas;
        this.numeroDeOficinas = oficinas.size();
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
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
                getAreaConstruida() + " " + area + " " + " " + numeroDeOficinas + " " + estado;
        return informacion;
    }

    
    
    
    
}
