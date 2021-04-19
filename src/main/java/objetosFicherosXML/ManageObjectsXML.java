package objetosFicherosXML;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ManageObjectsXML {
    private static void serializeToXML (Coche coche){
        try {
            XMLEncoder encoder = new XMLEncoder(new FileOutputStream("coche1.xml"));
            encoder.writeObject(coche);
            encoder.close();
        }catch (FileNotFoundException e) {e.printStackTrace();}
    }

    private static Coche deserializeFromXML(String file){
        Coche decodedSettings = null;
        try {
            XMLDecoder decoder = new XMLDecoder(new FileInputStream(file));
            decodedSettings = (Coche) decoder.readObject();
            decoder.close();
        } catch (IOException e) {e.printStackTrace();}
        return decodedSettings;
    }
}
