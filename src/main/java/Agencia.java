import java.util.ArrayList;

public class Agencia {
    private String nombre;
    private ArrayList<Agente> listaAgentes;
    private ArrayList<Cliente> listaClientes;

    public Agencia(String nombre, ArrayList<Agente> listaAgentes, ArrayList<Cliente> listaClientes) {
        this.nombre = nombre;
        this.listaAgentes = listaAgentes;
        this.listaClientes = listaClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Agente> getListaAgentes() {
        return listaAgentes;
    }

    public void setListaAgentes(ArrayList<Agente> listaAgentes) {
        this.listaAgentes = listaAgentes;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
