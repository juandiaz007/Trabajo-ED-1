package classes;

public class Fotografo extends Persona{

    private String especialidad;
    private String añosExperiencia;

    public Fotografo(String especialidad, String añosExperiencia, String experiencia) {
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(String añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public Fotografo(String nombre, String identificacion, int contacto, String especialidad, String añosExperiencia) {
        super(nombre, identificacion, contacto);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    protected void mostrarInformacion() {

    }
}