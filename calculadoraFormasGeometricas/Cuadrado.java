public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado) {
        super(lado, lado);
        this.apotema = this.getLado1() / 2;
    }

    // Implementación del método getArea() para el cuadrado
    @Override
    public double getArea() {
        return super.getLado1() * super.getLado2();
    }
}

