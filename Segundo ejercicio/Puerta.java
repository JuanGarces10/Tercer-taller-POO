
class Puerta {
    private String tipo;
    private String color;

    public Puerta(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Puerta [Tipo: " + tipo + ", Color: " + color + "]";
    }
}
