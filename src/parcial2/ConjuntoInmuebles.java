
package parcial2;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;


public class ConjuntoInmuebles {
    private ArrayList <Inmueble> Inmuebles;

    public ConjuntoInmuebles(ArrayList<Inmueble> Inmuebles) {
        this.Inmuebles = Inmuebles;
    }
    
    public void Guardar () throws IOException{
        File salida = new File("Inventario.txt");
           if(!salida.exists())
               salida.createNewFile();
           PrintStream flujoSalida = new PrintStream(salida);
           
           for (int i = 0; i < Inmuebles.size(); i++) {
            flujoSalida.println(Inmuebles.get(i).darInformacion());
        }
    }
    
    public void listar (){
        for (int i = 0; i < Inmuebles.size(); i++) {
            System.out.print(Inmuebles.get(i).darInformacion());
            if(Inmuebles.getClass().equals("Piso")){
                Piso piso = (Piso) Inmuebles.get(i);
                System.out.print(" con las siguientes oficinas:");
                for (int j = 0; j < piso.getOficinas().size(); j++) {
                    System.out.print(" " + piso.getOficinas().get(j).darInformacion());
                }
            }
            if(Inmuebles.getClass().equals("Edificio")){
                
                Edificio edificio = (Edificio) Inmuebles.get(i);
                
                System.out.print(" con las siguientes pisos:");
                for (int j = 0; j < edificio.getPisos().size() ; j++) {
                    System.out.print(" " + edificio.getPisos().get(j).darInformacion());
                }
                for (int j = 0; j < edificio.getLocales().size() ; j++) {
                    System.out.print(" " + edificio.getLocales().get(j).darInformacion());
                }
                
            }
            System.out.println();
        }
    }
}
