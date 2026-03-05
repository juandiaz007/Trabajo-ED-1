package classes;

public class EventoPrivado extends Evento{

    private String cliente;
    private char confidencialdiad;

    public EventoPrivado(String nombreEvento, String fecha, String lugar, Modelo[] modelo, Fotografo[] fotografo) {
        super(nombreEvento, fecha, lugar, modelo, fotografo);
    }

    @Override
    protected void mostrarDetalles() {

    }
}
