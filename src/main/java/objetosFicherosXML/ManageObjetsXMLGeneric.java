package objetosFicherosXML;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ManageObjetsXMLGeneric<T> {
    private void serializeToXML(T t, String file){
        try {
            XMLEncoder encoder = new XMLEncoder(new FileOutputStream(file));
            encoder.writeObject(t);
            encoder.close();
        }catch (FileNotFoundException e) {e.printStackTrace();}
    }

    public T deserializeFromXML(String file){
        T decodedSettings = null;
        try {
            XMLDecoder decoder = new XMLDecoder(new FileInputStream(file));
            decodedSettings = (T) decoder.readObject();
            decoder.close();
        } catch (IOException e) {e.printStackTrace();}
        return decodedSettings;
    }
}
