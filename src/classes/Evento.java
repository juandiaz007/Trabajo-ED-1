package classes;

public abstract class Evento {
    protected String nombreEvento;
    protected String fecha;
    protected Lugar lugar;
    protected Modelo[] modelo;
    protected Fotografo[] fotografo;

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar.toString();
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Modelo[] getModelo() {
        return modelo;
    }

    public void setModelo(Modelo[] modelo) {
        this.modelo = modelo;
    }

    public Fotografo[] getFotografo() {
        return fotografo;
    }

    public void setFotografo(Fotografo[] fotografo) {
        this.fotografo = fotografo;
    }

    public Evento(String nombreEvento, String fecha, Lugar lugar, Modelo[] modelo, Fotografo[] fotografo) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.lugar = lugar;
        this.modelo = modelo;
        this.fotografo = fotografo;
    }

    protected abstract void mostrarDetalles();

    public void tipoEvento() {

    }
}
