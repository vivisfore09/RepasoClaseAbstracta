
public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area;
        area=lado*lado;
        return area;
    }
}
