
package Persistencia;

import Datos.Person;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nicolas
 */
public class BaseDatos {
    
    public void almacenar(Person person){
        
          FileWriter escritura = null;
        try {
            File archivo = new File("hola.txt");
            if(archivo.exists()){
                System.out.println("existe");
        }else{
            archivo.createNewFile();
        }
    escritura = new FileWriter(archivo);
    escritura.write(person.toString() + "\n");
    escritura.flush();
    escritura.close();
                
       } catch (IOException ex) {
           ex.printStackTrace();
        }finally{
            try {
                escritura.close();
            }catch(IOException ex) {
           ex.printStackTrace();
        }
      }
    }

 }
    
