
public class Main {
    public static void main(String[] args) {
        // Crear personas
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Carlos");

        // Crear eventos
        Evento e1 = new Evento("Boda");
        Evento e2 = new Evento("Aniversario");

        // Crear matrimonio
        Matrimonio matrimonio1 = new Matrimonio();
        matrimonio1.agregarPersona(p1);
        matrimonio1.agregarPersona(p2);
        matrimonio1.agregarEvento(e1);

        Matrimonio matrimonio2 = new Matrimonio();
        matrimonio2.agregarPersona(p1);
        matrimonio2.agregarPersona(p3);
        matrimonio2.agregarEvento(e2);

        // Mostrar información
        System.out.println(matrimonio1);
        System.out.println(matrimonio2);
    }
}

