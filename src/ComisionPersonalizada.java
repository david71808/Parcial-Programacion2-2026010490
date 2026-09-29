public class ComisionPersonalizada implements EstrategiaComision {
    private static final int N = 5;

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * (5 + N) / 100.0;
    }
}