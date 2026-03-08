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
            BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_MODELOS));

            for (int i = 0; i < cantidad; i++) {

                Modelo m = modelos[i];

                bw.write(
                        m.getNombre() + ";" +
                                m.getIdentificacion() + ";" +
                                m.getContacto() + ";" +
                                m.getCodigoModelo() + ";" +
                                m.getEstatura() + ";" +
                                m.getCategoria() + ";" +
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

        File archivo = new File(ARCHIVO_MODELOS);

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
                String identificacion = partes[1];
                int contacto = Integer.parseInt(partes[2]);
                String codigoModelo = partes[3];
                int estatura = Integer.parseInt(partes[4]);
                String categoria = partes[5];
                boolean disponibilidad = Boolean.parseBoolean(partes[6]);

                modelos[contador] = new Modelo(
                        nombre,
                        identificacion,
                        contacto,
                        codigoModelo,
                        estatura,
                        categoria,
                        disponibilidad
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
                                f.getIdentificacion() + ";" +
                                f.getContacto() + ";" +
                                f.getEspecialidad() + ";" +
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

        File archivo = new File(ARCHIVO_FOTOGRAFOS);

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
                String identificacion = partes[1];
                int contacto = Integer.parseInt(partes[2]);
                String especialidad = partes[3];
                int añosExperiencia = Integer.parseInt(partes[4]);

                fotografos[contador] = new Fotografo(
                        nombre,
                        identificacion,
                        contacto,
                        especialidad
                );

                fotografos[contador].setAñosExperiencia(añosExperiencia);

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
                        l.getNombre() + ";" +
                                l.getDireccion() + ";" +
                                l.getCapacidad() + ";" +
                                l.getCiudad() + ";" +
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

        File archivo = new File(ARCHIVO_LUGARES);

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
                String ciudad = partes[2];
                int capacidad = Integer.parseInt(partes[3]);
                String tipoLugar = partes[4];

                lugares[contador] = new Lugar(
                        nombre,
                        direccion,
                        ciudad,
                        capacidad,
                        tipoLugar
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
                                e.getFotografos() + ";" +
                                e.getLugar()+ ";" +
                                e.getModelos()

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
