public class Apicultor {
    private final String nombre;
    private final String id;
    private final String contacto;

    public Apicultor(String nombre, String id, String contacto) {
        this.nombre = nombre;
        this.id = id;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getContacto() {
        return contacto;
    }

    @Override
    public String toString() {
        return "Apicultor{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", contacto='" + contacto + '\'' +
                '}';
    }
    
}
