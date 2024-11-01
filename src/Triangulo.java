public class Triangulo {
    double base;
    double altura;

    public Triangulo() {}
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double areaTriangulo() {
        return (base * altura) / 2;
    }

    public double perimetroTriangulo() {
        return base*4;
    }

    public void imprimir_triangulo() {
        System.out.println("Area triangulo: " +areaTriangulo());
        System.out.println("Perimetro triangulo: " +perimetroTriangulo());
    }
}
