
import java.util.ArrayList;
import java.util.List;

class Persona {
    private String nombre;
    private List<Matrimonio> matrimonios;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.matrimonios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarMatrimonio(Matrimonio matrimonio) {
        if (!matrimonios.contains(matrimonio)) {
            matrimonios.add(matrimonio);
            matrimonio.agregarPersona(this);
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}
