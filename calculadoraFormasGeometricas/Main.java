import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Bienvenido a tu calculadora de áreas.---------");

        while (true) {
            System.out.println("\nA continuación te presentamos las figuras disponibles. Ingresa el número correspondiente para seleccionar una figura:");

            System.out.println("1. Rectángulo");
            System.out.println("2. Círculo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Hexágono");
            System.out.println("5. Triángulo");
            System.out.println("6. Salir");

            Scanner scanner = new Scanner(System.in);

            System.out.print("\nIngresa la opción deseada: ");
            int opcion = scanner.nextInt();

            Forma geometricForm = null;

            switch (opcion) {
                case 1:
                    while (true) {
                        try {
                            System.out.print("Ingresa la base del rectángulo: ");
                            double baseRectangulo = scanner.nextDouble();
                            System.out.print("Ingresa la altura del rectángulo: ");
                            double alturaRectangulo = scanner.nextDouble();

                            geometricForm = new Rectangulo(baseRectangulo, alturaRectangulo);
                            break;
                        } catch (Exception e) {
                            System.out.println("Valores no válidos. Inténtalo de nuevo.");
                            scanner.nextLine();
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        try {
                            System.out.print("Ingresa el radio del círculo: ");
                            double radioCirculo = scanner.nextDouble();

                            geometricForm = new Circulo(radioCirculo);
                            break;
                        } catch (Exception e) {
                            System.out.println("Valores no válidos. Inténtalo de nuevo.");
                            scanner.nextLine();
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        try {
                            System.out.print("Ingresa el valor del lado del cuadrado: ");
                            double ladoCuadrado = scanner.nextDouble();

                            geometricForm = new Cuadrado(ladoCuadrado);
                            break;
                        } catch (Exception e) {
                            System.out.println("Valores no válidos. Inténtalo de nuevo.");
                            scanner.nextLine();
                        }
                    }
                    break;

                case 4:
                    while (true) {
                        try {
                            System.out.print("Ingresa el valor del lado del hexágono: ");
                            double ladoHexagono = scanner.nextDouble();

                            geometricForm = new Hexagono(ladoHexagono);
                            break;
                        } catch (Exception e) {
                            System.out.println("Valores no válidos. Inténtalo de nuevo.");
                            scanner.nextLine();
                        }
                    }
                    break;

                case 5:
                    while (true) {
                        try {
                            System.out.println("Elige 1 para Triángulo Equilátero, 2 para Triángulo Rectángulo: ");
                            int tipoTriangulo = scanner.nextInt();

                            if (tipoTriangulo == 1) {
                                System.out.print("Ingresa el lado del triángulo equilátero: ");
                                double ladoTriangulo = scanner.nextDouble();

                                geometricForm = new TrianguloEquilatero(ladoTriangulo);
                            } else if (tipoTriangulo == 2) {
                                System.out.print("Ingresa la base del triángulo rectángulo: ");
                                double baseTriangulo = scanner.nextDouble();
                                System.out.print("Ingresa la altura del triángulo rectángulo: ");
                                double alturaTriangulo = scanner.nextDouble();

                                geometricForm = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);
                            } else {
                                System.out.println("Opción no disponible.");
                                continue;
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Valor no válido, ingresa los datos nuevamente.");
                            scanner.nextLine();
                        }
                    }
                    break;

                

                case 6:
                    System.out.println("Gracias por usar nuestro software. ¡Hasta luego!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no disponible.");
                    continue;
            }

            operacion(geometricForm);
        }
    }

    public static void operacion(Forma formaGeometricaRecibida) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEstas son las operaciones que manejamos, elige una:");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.println("3. Apotema");
            System.out.println("4. Ángulos Internos");
            System.out.println("5. Ángulos Externos");
            System.out.println("6. Todo");
            System.out.println("7. Salir");

            System.out.print("\nPor favor, ingresa la opción deseada: ");
            int operacion = scanner.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println("\nCalculando el área solicitada...");
                    System.out.println("El área es: " + formaGeometricaRecibida.getArea());
                    break;

                case 2:
                    System.out.println("\nCalculando el perímetro solicitado...");
                    System.out.println("El perímetro es: " + formaGeometricaRecibida.getPerimetro());
                    break;

                case 3:
                    System.out.println("\nCalculando la apotema solicitada...");
                    System.out.println("La apotema es: " + formaGeometricaRecibida.getApotema());
                    break;

                case 4:
                    System.out.println("\nCalculando los ángulos internos solicitados...");
                    System.out.println("Los ángulos internos son: " + Arrays.toString(formaGeometricaRecibida.getAngulosInternos()));
                    break;

                case 5:
                    System.out.println("\nCalculando los ángulos externos solicitados...");
                    System.out.println("Los ángulos externos son: " + Arrays.toString(formaGeometricaRecibida.getAngulosExternos()));
                    break;

                case 6:
                    System.out.println("\nCalculando toda la información solicitada...");
                    System.out.println(formaGeometricaRecibida);
                    break;

                case 7:
                    return;

                default:
                    System.out.println("Opción no disponible.");
                    continue;
            }
        }
    }

    
}
