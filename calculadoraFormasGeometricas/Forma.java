import java.util.Arrays;

public abstract class Forma {
    protected double area;
    protected double perimetro;
    protected double apotema;
    protected double[] angulosInternos;
    protected double[] angulosExternos;

    public Forma() {
        System.out.println("Has elegido la figura " + this.getClass().getSimpleName());
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getApotema() {
        return apotema;
    }

    public double[] getAngulosInternos() {
        return angulosInternos;
    }

    public double[] getAngulosExternos() {
        return angulosExternos;
    }


    @Override
    public String toString() {
        return String.format(
                "El área del %s es: %.2f%n" +
                "El perímetro del %s es: %.2f%n" +
                "La apotema del %s es: %.2f%n" +
                "Los ángulos internos del %s son: %s%n" +
                "Los ángulos externos del %s son: %s%n",
                this.getClass().getSimpleName(), getArea(),
                this.getClass().getSimpleName(), getPerimetro(),
                this.getClass().getSimpleName(), getApotema(),
                this.getClass().getSimpleName(), Arrays.toString(getAngulosInternos()),
                this.getClass().getSimpleName(), Arrays.toString(getAngulosExternos())
        );
    }
}
