import classes.*;

public class Main {

    public static void main(String[] args) {

        // Crear la agencia
        Agencia agencia = new Agencia(20, 10, 10);

        // Crear modelos

        Modelo modelo1 = new Modelo(
                "Ana Lopez",
                "12345",
                300123456,
                "M001",
                175,
                "Pasarela",
                true
        );

        Modelo modelo2 = new Modelo(
                "Maria Gomez",
                "54321",
                301987654,
                "M002",
                168,
                "Comercial",
                true
        );

        agencia.agregarModelo(modelo1);
        agencia.agregarModelo(modelo2);

        // Crear fotografos

        Fotografo fotografo1 = new Fotografo(
                "Carlos Perez",
                "88888",
                300555111,
                "Moda"
        );

        fotografo1.setAñosExperiencia(5);

        Fotografo fotografo2 = new Fotografo(
                "Laura Torres",
                "99999",
                301777222,
                "Publicidad"
        );

        fotografo2.setAñosExperiencia(8);

        agencia.agregarFotografo(fotografo1);
        agencia.agregarFotografo(fotografo2);

        System.out.println("MODELOS:");
        agencia.mostrarModelos();

        System.out.println("\nFOTOGRAFOS:");
        agencia.mostrarFotografos();
    }
}