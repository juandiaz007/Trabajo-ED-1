package classes;

public abstract class Evento {

    protected String nombreEvento;
    protected String fecha;
    protected Lugar lugar;

    protected Modelo[] modelos;
    protected Fotografo[] fotografos;

    protected int numModelos;
    protected int numFotografos;

    public Evento(String nombreEvento, String fecha, Lugar lugar, int maxModelos, int maxFotografos) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.lugar = lugar;

        modelos = new Modelo[maxModelos];
        fotografos = new Fotografo[maxFotografos];

        numModelos = 0;
        numFotografos = 0;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public Modelo[] getModelos() {
        return modelos;
    }

    public Fotografo[] getFotografos() {
        return fotografos;
    }

    // agregar modelo al evento
    public void agregarModelo(Modelo m) {

        if (numModelos < modelos.length) {
            modelos[numModelos] = m;
            numModelos++;
        } else {
            System.out.println("No se pueden agregar más modelos.");
        }
    }

    // agregar fotografo al evento
    public void agregarFotografo(Fotografo f) {

        if (numFotografos < fotografos.length) {
            fotografos[numFotografos] = f;
            numFotografos++;
        } else {
            System.out.println("No se pueden agregar más fotografos.");
        }
    }

    protected abstract void mostrarDetalles();

    public void tipoEvento() {

    }
}
