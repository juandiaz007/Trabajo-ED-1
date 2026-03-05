package classes;

public class Fotografo extends Persona{

    private String especialidad;
    private int añosExperiencia;

    public Fotografo(String especialidad, int añosExperiencia) {
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    public Fotografo(String nombre, String identificacion, int contacto, String especialidad, int añosExperiencia) {
        super(nombre, identificacion, contacto);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    protected void mostrarInformacion() {

    }
}
