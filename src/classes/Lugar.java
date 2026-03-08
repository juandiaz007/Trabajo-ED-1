package classes;

public class Lugar {
    private String nombre;
    private String direccion;
    private String ciudad;
    private int capacidad;
    private String tipoLugar;


    public Lugar(String nombre, String direccion, String ciudad, int capacidad, String tipoLugar) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.tipoLugar = tipoLugar;
    }

    public Lugar(String parte) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(String tipoLugar) {
        this.tipoLugar = tipoLugar;
    }
}
