package classes;

import java.io.*;

public class Agencia {

    private Modelo[] modelos;
    private Fotografo[] fotografos;
    private Evento[] eventos;

    private int numModelos;
    private int numFotografos;
    private int numEventos;

    public Agencia(int maxModelos, int maxFotografos, int maxEventos) {

        modelos = new Modelo[maxModelos];
        fotografos = new Fotografo[maxFotografos];
        eventos = new Evento[maxEventos];

        numModelos = 0;
        numFotografos = 0;
        numEventos = 0;
    }

    // -------------------------
    // GESTIONAR MODELOS
    // -------------------------

    public void agregarModelo(Modelo m) {

        if (numModelos < modelos.length) {
            modelos[numModelos] = m;
            numModelos++;
        } else {
            System.out.println("No se pueden agregar más modelos");
        }
    }

    public void mostrarModelos() {

        for (int i = 0; i < numModelos; i++) {
            System.out.println(modelos[i]);
        }
    }

    // -------------------------
    // GESTIONAR FOTOGRAFOS
    // -------------------------

    public void agregarFotografo(Fotografo f) {

        if (numFotografos < fotografos.length) {
            fotografos[numFotografos] = f;
            numFotografos++;
        } else {
            System.out.println("No se pueden agregar más fotografos");
        }
    }

    public void mostrarFotografos() {

        for (int i = 0; i < numFotografos; i++) {
            System.out.println(fotografos[i]);
        }
    }

    // -------------------------
    // GESTIONAR EVENTOS
    // -------------------------

    public void agregarEvento(Evento e) {

        if (numEventos < eventos.length) {
            eventos[numEventos] = e;
            numEventos++;
        } else {
            System.out.println("No se pueden agregar más eventos");
        }
    }

    public void mostrarEventos() {

        for (int i = 0; i < numEventos; i++) {
            System.out.println(eventos[i].getNombreEvento());
        }
    }

    // -------------------------
    // RELACIONAR PERSONAS CON EVENTOS
    // -------------------------

    public Evento buscarEvento(String nombre) {

        for (int i = 0; i < numEventos; i++) {

            if (eventos[i].getNombreEvento().equals(nombre)) {
                return eventos[i];
            }
        }

        return null;
    }

    public void agregarModeloEvento(String nombreEvento, Modelo m) {

        Evento e = buscarEvento(nombreEvento);

        if (e != null) {
            e.agregarModelo(m);
        } else {
            System.out.println("Evento no encontrado");
        }
    }

    public void agregarFotografoEvento(String nombreEvento, Fotografo f) {

        Evento e = buscarEvento(nombreEvento);

        if (e != null) {
            e.agregarFotografo(f);
        } else {
            System.out.println("Evento no encontrado");
        }
    }

    // -------------------------
    // GUARDAR MODELOS EN ARCHIVO
    // -------------------------

    public void guardarModelos() throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("modelos.txt"));

        for (int i = 0; i < numModelos; i++) {

            bw.write(modelos[i].toString());
            bw.newLine();
        }

        bw.close();
    }

}
