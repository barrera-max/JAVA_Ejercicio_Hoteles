import java.util.Arrays;

public class Trivago {
    private Matriz precios;
    private int hoteles = 10;
    private String sitios[] = {"Despegar", "Booking", "Expedia"};

    public Trivago(int hoteles) {
        precios = new Matriz(hoteles, sitios.length);
        precios.generate();
    }

    @Override
    public String toString() {
        return "Trivago{" +
                "Hoteles=" + hoteles +
                ", \nSitios=" +Arrays.toString(sitios) +
                " \nPrecios=\t\t" + "\t\t\t" +precios +
                '}';
    }

    public String promediarPrecios() {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < sitios.length; i++) {
            stb.append("\n" + sitios[i] + ": " + precios.promediarColumna(i));
        }
        return stb.toString();
    }

    public String compararPrecios() {
        StringBuilder stb = new StringBuilder();
        for (int h = 0; h < hoteles; h++) {
            stb.append("Hotel" + (h + 1) + " $" + precios.buscarMenorEnFila(h));
        }

        return stb.toString();
    }
}