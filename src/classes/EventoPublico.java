package classes;

public class EventoPublico extends Evento {

    private int capacidad;
    private String patrocinador;


    public EventoPublico(String nombreEvento, String fecha, Lugar[] lugar, Modelo[] modelo, Fotografo[] fotografo) {
        super(nombreEvento, fecha, lugar, modelo, fotografo);
    }




    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    @Override
    protected void mostrarDetalles() {

    }
}
