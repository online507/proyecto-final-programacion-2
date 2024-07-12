import java.io.Serializable;

public class AbejaReina implements Serializable {
    private final int edad;
    private final double productividad;
    private final String estadoSalud;

    public AbejaReina(int edad, double productividad, String estadoSalud) {
        this.edad = edad;
        this.productividad = productividad;
        this.estadoSalud = estadoSalud;
    }

    public int getEdad() {
        return edad;
    }

    public double getProductividad() {
        return productividad;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    @Override
    public String toString() {
        return "AbejaReina{" +
                "edad=" + edad +
                ", productividad=" + productividad +
                ", estadoSalud='" + estadoSalud + '\'' +
                '}';
    }
}
