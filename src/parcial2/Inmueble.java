
package parcial2;


public abstract class Inmueble {
    private String nombreComunDelBarrio;
    private int estrato;
    private double valorDeArriendo;
    private double areaConstruida;
    private boolean alquilado;

    public Inmueble(String nombreComunDelBarrio, int estrato, double valorDeArriendo, double areaConstruida, boolean alquilado) {
        this.nombreComunDelBarrio = nombreComunDelBarrio;
        this.estrato = estrato;
        this.valorDeArriendo = valorDeArriendo;
        this.areaConstruida = areaConstruida;
        this.alquilado = alquilado;
    }

    public String getNombreComunDelBarrio() {
        return nombreComunDelBarrio;
    }
    
    public String getEstrato() {
        return String.valueOf(estrato);
    }

    public String getValorDeArriendo() {
        return String.valueOf(valorDeArriendo);
    }

    public String getAreaConstruida() {
        return String.valueOf(areaConstruida);
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setNombreComunDelBarrio(String nombreComunDelBarrio) {
        this.nombreComunDelBarrio = nombreComunDelBarrio;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public void setValorDeArriendo(double valorDeArriendo) {
        this.valorDeArriendo = valorDeArriendo;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    
    
    
    public abstract String darInformacion();
    
}
