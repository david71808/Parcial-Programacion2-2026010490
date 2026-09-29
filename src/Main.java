public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("David", 2000, new ComisionEstandar());
        v.mostrarDetalle();
    }
}