public class CalculoArea {

    public static double calcularArea(double base, double altura) {
            return base * altura / 2;
        
    }

    public static void main(String[] args) {
        double base = 25;
        double altura = 12;
        double area = calcularArea(base, altura);
        System.out.println("El área del triangulo es: "+area);
    }

}
