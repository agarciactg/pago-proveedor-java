public class Compra implements Comparable<Compra> {
    private double valor;
    private String description;

    public Compra(double valor, String description) {
        this.valor = valor;
        this.description = description;
    }

    public double getValor() {
        return valor;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Compra: valor=" + valor +
                ", description='" + description;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
