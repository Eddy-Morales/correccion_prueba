import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuadrado cuadrado= new Cuadrado();
        Rectangulo rectangulo= new Rectangulo();
        Circulo circulo= new Circulo();
        Triangulo triangulo= new Triangulo();

        System.out.print("Ingrese el lado del cuadrado: ");
        double ladoCuadrado = scanner.nextDouble();
        cuadrado.setLado_cuadrado(ladoCuadrado);
        System.out.print("Ingrese la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();
        rectangulo.setBase(baseRectangulo);
        System.out.print("Ingrese la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();
        rectangulo.setAltura(alturaRectangulo);
        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        circulo.setRadio(radioCirculo);
        System.out.print("Ingrese la base del triángulo: ");
        double baseTriangulo = scanner.nextDouble();
        triangulo.setBase(baseTriangulo);
        System.out.print("Ingrese la altura del triángulo: ");
        double alturaTriangulo = scanner.nextDouble();
        triangulo.setAltura(alturaTriangulo);

        cuadrado.imprimir_cuadrdo();
        rectangulo.imprimir_rectangulo();
        circulo.imprimir_circulo();
        triangulo.imprimir_triangulo();

        calcularSumatoriaAreas(cuadrado, rectangulo, circulo, triangulo);

        scanner.close();
    }
    public static void calcularSumatoriaAreas(Cuadrado cuadrado, Rectangulo rectangulo, Circulo circulo, Triangulo triangulo) {
        double sumatoria = cuadrado.areaCuadrado() +
                rectangulo.areaRectangulo() +
                circulo.areaCirculo() +
                triangulo.areaTriangulo();

        System.out.println("Sumatoria de las áreas de las cuatro figuras: " + sumatoria);
    }
}