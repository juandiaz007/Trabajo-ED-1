package classes;

public class EventoPublico extends Evento {

    private int capacidad;
    private String patrocinador;


    public EventoPublico(String nombreEvento, String fecha, Lugar lugar, Modelo[] modelo, Fotografo[] fotografo) {
        super(nombreEvento, fecha, lugar, modelo, fotografo);
    }

    @Override
    protected void mostrarDetalles() {

    }
}