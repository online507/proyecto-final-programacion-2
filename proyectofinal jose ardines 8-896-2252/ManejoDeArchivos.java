import java.io.*;
import java.util.List;

public class ManejoDeArchivos {
    public static <T> void guardarDatos(List<T> datos, String archivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(datos);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> cargarDatos(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<T>) ois.readObject();
        }
    }
}
