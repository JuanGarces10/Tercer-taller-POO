
import java.util.ArrayList;
import java.util.List;

class Matrimonio {
    private List<Persona> personas;
    private List<Evento> eventos;

    public Matrimonio() {
        this.personas = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        if (!personas.contains(persona)) {
            personas.add(persona);
        }
    }

    public void agregarEvento(Evento evento) {
        if (!eventos.contains(evento)) {
            eventos.add(evento);
        }
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    @Override
    public String toString() {
        return "Matrimonio: " + personas + " en eventos: " + eventos;
    }
}

