import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personas persona1 = new Personas("Mauro", "Largo");
        Personas persona2 = new Personas("Diego", "Solis");
        Personas persona3 = new Personas("Andres", "Falcao");
        Personas persona4 = new Personas("Simon", "Phoenix");
        List<Personas> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        System.out.println("Listado Ordenado por Ingreso");
        for (Personas personas : listaPersonas) {
            System.out.println("persona = " + personas.getNombre() +" "+  personas.getApellido());
        }
        //Ordenar por nombre de manera ascendente
        System.out.println("Listado Ordenado por Nombre Ascendente");
        listaPersonas.sort(Comparator.comparing(Personas::getNombre));
        for (Personas personas : listaPersonas) {
            System.out.println("persona = " + personas.getNombre() +" "+ personas.getApellido());
        }

        //Ordenar por nombre de manera descendente
        System.out.println("Listado Ordenado por Nombre Descendente");
        listaPersonas.sort(Comparator.comparing(Personas::getNombre).reversed());
        for (Personas personas : listaPersonas) {
            System.out.println("persona = " + personas.getNombre() +" "+ personas.getApellido());
        }

        //Ordenar por apellido de manera descendente
        System.out.println("Listado Ordenado por Apellido Descendente");
        listaPersonas.sort(Comparator.comparing(Personas::getApellido).reversed());
        for (Personas personas : listaPersonas) {
            System.out.println("persona = " + personas.getNombre() +" "+ personas.getApellido());
        }
    }
}