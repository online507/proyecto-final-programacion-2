import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Colmena implements Serializable {
    private final String id;
    private final String ubicacion;
    private final String estadoSalud;
    private final int cantidadAbejas;
    private final double produccionMiel;
    private final AbejaReina abejaReina;
    private final List<Inspeccion> inspecciones;

    public Colmena(String id, String ubicacion, String estadoSalud, int cantidadAbejas, double produccionMiel, AbejaReina abejaReina) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.estadoSalud = estadoSalud;
        this.cantidadAbejas = cantidadAbejas;
        this.produccionMiel = produccionMiel;
        this.abejaReina = abejaReina;
        this.inspecciones = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public int getCantidadAbejas() {
        return cantidadAbejas;
    }

    public double getProduccionMiel() {
        return produccionMiel;
    }

    public AbejaReina getAbejaReina() {
        return abejaReina;
    }

    public List<Inspeccion> getInspecciones() {
        return inspecciones;
    }

    public void agregarInspeccion(Inspeccion inspeccion) {
        this.inspecciones.add(inspeccion);
    }

    @Override
    public String toString() {
        return "Colmena{" +
                "id='" + id + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", estadoSalud='" + estadoSalud + '\'' +
                ", cantidadAbejas=" + cantidadAbejas +
                ", produccionMiel=" + produccionMiel +
                ", abejaReina=" + abejaReina +
                '}';
    }
}
