package dia4;


import dia4.interfases.Calculadora;
import dia4.interfases.CalculatorOperations;
import dia4.modules.CalculatorWithMenu;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            CalculatorWithMenu sumaDeUnoYDos = new CalculatorWithMenu(new Calculadora(),new Scanner(System.in));
            sumaDeUnoYDos.ejecutarOperacion();

        }
    }

