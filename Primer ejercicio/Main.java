
public class Main {
    public static void main(String[] args) {
        
        Jugador jugador1 = new Jugador("Lionel Messi");
        Jugador jugador2 = new Jugador("Cristiano Ronaldo");
        Jugador jugador3 = new Jugador("Neymar");

        Equipo equipo = new Equipo();

        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        String nombreABuscar = "Neymar";
        Jugador jugadorEncontrado = equipo.buscarJugador(nombreABuscar);
        if (jugadorEncontrado != null) {
            System.out.println("Jugador encontrado: " + jugadorEncontrado.getNombre());
        } else {
            System.out.println("Jugador no encontrado.");
        }

        boolean eliminado = equipo.elimminarJugador(jugador2);
        if (eliminado) {
            System.out.println(jugador2.getNombre() + " ha sido eliminado del equipo.");
        } else {
            System.out.println("No se pudo eliminar al jugador.");
        }

        System.out.println("Jugadores en el equipo:");
        for (Jugador jugador : equipo.jugadores) {
            System.out.println("- " + jugador.getNombre());
        }

        equipo.eliminarTodosLosJugadores();
        System.out.println("Todos los jugadores han sido eliminados.");
        System.out.println("Jugadores en el equipo: " + equipo.jugadores.size());
    }
}

