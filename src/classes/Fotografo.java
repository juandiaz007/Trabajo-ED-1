package classes;

public class Fotografo extends Persona{

    private String especialidad;
    private int añosExperiencia;

    public Fotografo(String especialidad, int añosExperiencia) {
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }


    public Fotografo(String nombre, String identificacion, int contacto, String especialidad) {
        super(nombre, identificacion, contacto);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    public Fotografo(String nombre, String especialidad, String añosExperiencia) {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }


    @Override
    protected void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Contacto: " + contacto);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Años experiencia: " + añosExperiencia);

    }
}
