package dia4.modules;

import java.util.Scanner;

import dia4.interfases.Calculadora;
import dia4.interfases.CalculatorMenu;
import dia4.interfases.CalculatorOperations;

public class CalculatorWithMenu implements CalculatorMenu {

    private CalculatorOperations operations;
    private Scanner scanner;

    public CalculatorWithMenu(CalculatorOperations operations, Scanner scanner) {
        this.operations = operations;
        this.scanner = scanner;
    }

    @Override
    public void menuCalculadora() {
        System.out.println("Menu calculadora:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
    }

    @Override
    public void ejecutarOperacion() {
        while (true) {
            menuCalculadora();
            System.out.println("Seleccione una opción:");
            int opcionSeleccionada = scanner.nextInt();

            if (opcionSeleccionada == 0) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.println("Seleccione un número:");
            double numero1 = scanner.nextDouble();
            System.out.println("Ingrese otro número:");
            double numero2 = scanner.nextDouble();

            switch (opcionSeleccionada) {
                case 1:
                    System.out.println("La suma entre " + numero1 + " y " + numero2 + " es igual a " + operations.suma(numero1, numero2));
                    break;
                case 2:
                    System.out.println("La resta entre " + numero1 + " y " + numero2 + " es igual a " + operations.resta(numero1, numero2));
                    break;
                case 3:
                    System.out.println("La multiplicacion entre " + numero1 + " y " + numero2 + " es igual a " + operations.multiplicacion(numero1, numero2));
                    break;
                case 4:
                    if (numero2 != 0) {
                        System.out.println("La division entre " + numero1 + " y " + numero2 + " es igual a " + operations.division(numero1, numero2));
                    } else {
                        System.out.println("no se puede dividir en 0");
                    }
                    break;
                default:
                    System.out.println("esta opcion no es valida");
                    break;
            }
        }
    }
}
