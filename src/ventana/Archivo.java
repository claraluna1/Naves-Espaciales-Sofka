
package ventana;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Archivo {
    
    private File archivo;
    
    public void crearArchivo(){
        archivo = new File("inventarioNaves.txt");
        
        try {
            if(archivo.createNewFile()){
                //archivo creado
            }
        } catch (IOException ex) {
            System.out.println("Error, "+ex);
        }
    }
    
    public void escribirTexto(Naves naves){
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(naves.getNombre()+"%"+naves.getPais()+"%"+naves.getTipoNave()+"%"+naves.getCombustible()+"%"+naves.getDescripcion()+"\r\n");
            escribir.close();
            
        } catch (IOException ex) {
            System.out.println("Error, "+ex);
        }
    }
}
