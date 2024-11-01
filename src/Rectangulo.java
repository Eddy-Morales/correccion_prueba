public class Rectangulo {
    double base;
    double altura;

    public Rectangulo(){}
    public Rectangulo(double base, double altura) {
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

    public double areaRectangulo() {
        return base * altura;
    }

    public double perimetroRectangulo() {
        return 2 * (base + altura);
    }
    public void imprimir_rectangulo(){
        System.out.println("Area rectangulo: " + areaRectangulo());
        System.out.println("Perimetro rectangulo: " + perimetroRectangulo());
    }


}
