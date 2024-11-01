public class Circulo {
    double radio;

    public Circulo() {}
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double areaCirculo() {
        return Math.PI * radio * radio;
    }

    public double perimetroCirculo() {
        return radio*2;
    }
    public void imprimir_circulo(){
        System.out.println("Area Circulo: " + areaCirculo());
        System.out.println("Perimetro Circulo: " + perimetroCirculo());
    }
}

