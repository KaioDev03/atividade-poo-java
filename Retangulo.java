public class Retangulo {
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.largura = 5;
        retangulo.altura = 3;

        System.out.println("Área: " + retangulo.calcularArea());
    }
}