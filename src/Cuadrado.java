public class Cuadrado {
    double lado;

    public Cuadrado(){}
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado_cuadrado() {
        return lado;
    }

    public void setLado_cuadrado(double lado) {
        this.lado = lado;
    }

    public double areaCuadrado() {
        return lado * lado;
    }

    public double perimetroCuadrado() {
        return 4 * lado;
    }
    public void imprimir_cuadrdo(){
        System.out.println("Area de cuadrado: " + areaCuadrado());
        System.out.println("Perimetro de cuadrado: " + perimetroCuadrado());
    }

}

