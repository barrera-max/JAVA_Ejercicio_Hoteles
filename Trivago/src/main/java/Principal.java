

public class Principal {
    public static void main(String[] args) {
        System.out.println("HOTEL TRIVAGO");
        Trivago trivago = new Trivago(10);
        System.out.println("Resultados de la busqueda");
        System.out.println(trivago);
        System.out.println("Promedio de precios por sitio ");
        System.out.println(trivago.promediarPrecios());
        System.out.println("Mejor precio por hotel " + trivago.compararPrecios());
    }
}
