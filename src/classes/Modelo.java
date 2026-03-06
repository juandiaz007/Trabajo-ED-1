package classes;
public class Modelo extends Persona {

    private String codigoModelo;
    private int estatura;
    private String categoria;
    private boolean disponibilidad;

    public Modelo(String nombre, String identificacion, int contacto, String codigoModelo, String categoria) {
        super(nombre, identificacion, contacto);
        this.codigoModelo = codigoModelo;
        this.estatura = estatura;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }

    public String getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(String codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Modelo(String codigoModelo, int estatura, String categoria, boolean disponibilidad) {
        this.codigoModelo = codigoModelo;
        this.estatura = estatura;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }

    @Override
    protected void mostrarInformacion() {

    }
}