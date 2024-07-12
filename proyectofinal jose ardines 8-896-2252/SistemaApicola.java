import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaApicola {
    
    private List<Colmena> colmenas;
    private List<Apicultor> apicultores;

    public SistemaApicola() {
        this.colmenas = new ArrayList<>();
        this.apicultores = new ArrayList<>();
    }

    public void agregarColmena(Colmena colmena) {
        this.colmenas.add(colmena);
    }

    public void agregarApicultor(Apicultor apicultor) {
        this.apicultores.add(apicultor);
    }

    public List<Colmena> getColmenas() {
        return colmenas;
    }

    public List<Apicultor> getApicultores() {
        return apicultores;
    }

    public void guardarDatos() throws IOException {
        ManejoDeArchivos.guardarDatos(colmenas, "colmenas.dat");
        ManejoDeArchivos.guardarDatos(apicultores, "apicultores.dat");
    }

    public void cargarDatos() throws IOException, ClassNotFoundException {
        colmenas = ManejoDeArchivos.cargarDatos("colmenas.dat");
        apicultores = ManejoDeArchivos.cargarDatos("apicultores.dat");
    }

    public List<Colmena> obtenerColmenasEnMalEstado() {
        return colmenas.stream()
                .filter(colmena -> colmena.getEstadoSalud().equalsIgnoreCase("mal"))
                .collect(Collectors.toList());
    }
}
