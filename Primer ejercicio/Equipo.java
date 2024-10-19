import java.util.ArrayList;
import java.util.List;

public class Equipo {
    List<Jugador> jugadores;

    public Equipo(){
        this.jugadores = new ArrayList<>();
    }

    public Equipo(List<Jugador> jugadores){
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public Jugador buscarJugador(String nombre) {
        return jugadores.stream()
        .filter(jugador-> jugador.getNombre().equals(nombre))
        .findFirst()
        .orElse(null);
    }

    public boolean elimminarJugador(Jugador jugador){
        return jugadores.remove(jugador);
    }

    public void eliminarTodosLosJugadores(){
        jugadores.clear();
    }
}
