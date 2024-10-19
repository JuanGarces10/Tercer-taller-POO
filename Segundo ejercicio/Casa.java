import java.util.ArrayList;

class Casa {
    private ArrayList<Puerta> puertas;

    public Casa() {
        this.puertas = new ArrayList<>();
    }

    public void agregarPuerta(Puerta puerta) {
        puertas.add(puerta);
        System.out.println("Puerta agregada: " + puerta);
    }

    public Puerta buscarPuerta(String tipo) {
        for (Puerta puerta : puertas) {
            if (puerta.getTipo().equalsIgnoreCase(tipo)) {
                return puerta;
            }
        }
        return null;
    }

    public void eliminarPuerta(String tipo) throws Exception {
        Puerta puerta = buscarPuerta(tipo);
        if (puerta != null) {
            puertas.remove(puerta);
            System.out.println("Puerta eliminada: " + puerta);
        } else {
            throw new Exception("No se pudo eliminar la puerta: " + tipo + " no encontrada.");
        }
    }

    public void listarPuertas() {
        if (!puertas.isEmpty()) {
            System.out.println("Puertas en la casa:");
            for (Puerta puerta : puertas) {
                System.out.println(puerta);
            }
        } else {
            System.out.println("No hay puertas en la casa.");
        }
    }
}