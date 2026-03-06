package persistencia;
import classes.*;
import java.io.*;
public class Persistencia {

    private static final String ARCHIVO_MODELOS = "modelos.txt";
    private static final String ARCHIVO_FOTOGRAFOS = "fotografos.txt";
    private static final String ARCHIVO_LUGARES = "lugares.txt";
    private static final String ARCHIVO_EVENTOS = "eventos.txt";



    public void guardarModelos(Modelo[] modelos, int cantidad) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_MODELOS)); // abre el archivo para escribir

            for (int i = 0; i < cantidad; i++) {

                Modelo m = modelos[i];

                bw.write(
                        m.getCodigoModelo() + ";" +
                                m.getIdentificacion() + ";" +
                                m.getNombre() + ";" +
                                m.getCategoria() + ";" +
                                m.getEstatura() + ";" +
                                m.isDisponibilidad()
                );

                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("Error guardando modelos");
        }
    }


    public int cargarModelos(Modelo[] modelos) {

        File archivo = new File("modelos.txt");

        if (!archivo.exists()) {
            return 0;
        }

        int contador = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";"); // corta en pedazos la cadena para organizar los datos

                String nombre = partes[0];
                String identificacion = partes[1];
                int contacto = Integer.parseInt(partes[2]);
                String codigoModelo = partes[3];
                int estatura = Integer.parseInt(partes[4]);
                String categoria = partes[5];
                boolean disponibilidad = Boolean.parseBoolean(partes[6]);

                modelos[contador] = new Modelo( // crea el objeto y ya se creo el modelo
                        nombre,
                        identificacion,
                        contacto,
                        codigoModelo,
                        categoria
                );

                contador++;
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return contador;
    }



    public void guardarFotografos(Fotografo[] fotografos, int cantidad) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_FOTOGRAFOS));

            for (int i = 0; i < cantidad; i++) {

                Fotografo f = fotografos[i];

                bw.write(
                        f.getNombre() + ";" +
                                f.getEspecialidad() +";"+
                                f.getAñosExperiencia()
                );

                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("Error guardando fotografos");
        }
    }


    public int cargarFotografos(Fotografo[] fotografos) {

        File archivo = new File("Fotografos.txt");

        if (!archivo.exists()) {
            return 0;
        }

        int contador = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");

                String nombre = partes[0];
                String especialidad = partes[1];
                String añosExperiencia = partes[2];


                fotografos[contador] = new Fotografo(
                        nombre,
                        especialidad,
                        añosExperiencia
                );

                contador++;
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return contador;
    }



    public void guardarLugares(Lugar[] lugares, int cantidad) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_LUGARES));

            for (int i = 0; i < cantidad; i++) {

                Lugar l = lugares[i];

                bw.write(
                        l.getCiudad() + ";" +
                                l.getNombre() + ";" +
                                l.getDireccion() + ";" +
                                l.getCapacidad() + ";" +
                                l.getTipoLugar()
                );

                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("Error guardando lugares");
        }
    }


    public int cargarLugar(Lugar[] lugares) {

        File archivo = new File("lugar.txt");

        if (!archivo.exists()) {
            return 0;
        }

        int contador = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");

                String nombre = partes[0];
                String direccion = partes[1];
                int capacidad = Integer.parseInt(partes[2]);
                String ciudad = partes[3];
                String tipoLugar = partes[5];

                lugares[contador] = new Lugar(
                        nombre

                );

                contador++;
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return contador;
    }



    public void guardarEventos(Evento[] eventos, int cantidad) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_EVENTOS));

            for (int i = 0; i < cantidad; i++) {

                Evento e = eventos[i];

                bw.write(
                        e.getNombreEvento() + ";" +
                                e.getFecha() + ";" +
                                e.getFotografo() + ";" +
                                e.getLugar()+ ";" +
                                e.getModelo()

                );

                bw.newLine();
            }

            bw.close();

        } catch (IOException ex) {
            System.out.println("Error guardando eventos");
        }
    }


    public int cargarEventos(Evento[] eventos) {

        File archivo = new File("eventos.txt");

        if (!archivo.exists()) {
            return 0;
        }

        int contador = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");

                String nombre = partes[0];
                String fecha = partes[1];

                Lugar lugar = new Lugar(partes[2]);

                Modelo[] modelos = new Modelo[1];
                Fotografo[] fotografos = new Fotografo[1];

                eventos[contador] = new EventoPublico(
                        nombre,
                        fecha,
                        new Lugar[]{lugar},
                        modelos,
                        fotografos
                );

                contador++;
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return contador;
    }

}
