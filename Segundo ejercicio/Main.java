
public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        
        // Agregar puertas
        casa.agregarPuerta(new Puerta("Principal", "Rojo"));
        casa.agregarPuerta(new Puerta("Trasera", "Blanco"));
        
        // Listar puertas
        casa.listarPuertas();
        
        // Buscar puerta
        Puerta puertaBuscada = casa.buscarPuerta("Principal");
        System.out.println("Puerta buscada: " + puertaBuscada);
        
        // Eliminar puerta
        try {
            casa.eliminarPuerta("Principal");
            casa.listarPuertas();
            casa.eliminarPuerta("Garaje"); // Intentar eliminar una puerta que no existe
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

