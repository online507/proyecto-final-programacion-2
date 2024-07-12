
import java.util.Date;

public class Inspeccion {
    
    private final Date fecha;
    private final String resultados;
    private final String acciones;

    public Inspeccion(Date fecha, String resultados, String acciones) {
        this.fecha = fecha;
        this.resultados = resultados;
        this.acciones = acciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getResultados() {
        return resultados;
    }

    public String getAcciones() {
        return acciones;
    }

    @Override
    public String toString() {
        return "Inspeccion{" +
                "fecha=" + fecha +
                ", resultados='" + resultados + '\'' +
                ", acciones='" + acciones + '\'' +
                '}';
    }
}
