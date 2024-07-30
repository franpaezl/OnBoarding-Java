package dia4.interfases;

public class Calculadora implements CalculatorOperations {


    @Override
    public double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    @Override
    public double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    @Override
    public double multiplicacion(double numero1, double numero2) {
         return numero1 * numero2;
    }

    @Override
    public double division(double numero1, double numero2) {
        if (numero2 == 0){
            System.out.println("no se puede dividir en 0");
        }
        return numero1 / numero2;
    }
}
