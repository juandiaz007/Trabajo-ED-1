package classes;

public class EventoPrivado extends Evento{

    private String cliente;
    private char confidencialdiad;

    public EventoPrivado(String nombreEvento, String fecha, Lugar[] lugar, Modelo[] modelo, Fotografo[] fotografo) {
        super(nombreEvento, fecha, lugar, modelo, fotografo);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public char getConfidencialdiad() {
        return confidencialdiad;
    }

    public void setConfidencialdiad(char confidencialdiad) {
        this.confidencialdiad = confidencialdiad;
    }

    @Override
    protected void mostrarDetalles() {

    }
}
