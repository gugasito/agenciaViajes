import java.util.ArrayList;

public class Agente {
    private String nombre;
    private int identificacion;
    private ArrayList<Cliente> clientesAsignados;

    public Agente(String nombre, int identificacion, ArrayList<Cliente> clientesAsignados) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.clientesAsignados = clientesAsignados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public ArrayList<Cliente> getClientesAsignados() {
        return clientesAsignados;
    }

    public void setClientesAsignados(ArrayList<Cliente> clientesAsignados) {
        this.clientesAsignados = clientesAsignados;
    }
}
