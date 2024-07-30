package dia1;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /////////////////1/////////////////
        String nombre = "Francisco";
        String apellido = "Páez Lastra";
        int edad = 28;

        System.out.println("Hola, mi nombre es " + apellido + ", " + nombre + " y tengo " + edad + " años");
        //////////////////2///////////////
        saludar();


        ////////////////3/////////////////
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingrese un numero");
//        int numero = scanner.nextInt();
//
//        System.out.print("Ingrese otro numero");
//        int numero2 = scanner.nextInt();
//
//        System.out.print("Ingrese otro numero");
//        int numero3 = scanner.nextInt();
//
//        mayor(numero,numero2,numero3);
//
//        scanner.close();

        ////////////////4///////////////////

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Igrese un numero");
//        int numero = scanner.nextInt();
//
//        parImpar(numero);

        /////////////////5///////////////////

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingrese una palabra");
//        String palabra1 = scanner.nextLine();
//
//        System.out.println("Ingrese una palabra");
//        String palabra2 = scanner.nextLine();
//
//        sonIguales(palabra1,palabra2);
//
//        scanner.close();

        ///////////////6////////////////////

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("ingrese un numero");
//        int numero = scanner.nextInt();
//
//        esNumeroPrimo(numero);
//
//        scanner.close();

        ///////////////7/////////////////////

//        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        sumarImpares(numeros);
//
//        numerosParesYSumaDePrimos(numeros);
//
//
//        ////////////8/////////////////////////
//
//        mostrarMenuCalculadora();
//
//        //////////////9///////////////////////
//
//        Scanner scanner = new Scanner(System.in);
//        calculadora(scanner);

        ////////////////10,11//////////////

        capacidadYDinero();





    }

    public static void saludar() {
        System.out.println("Hola");
    }

    public static void mayor(int numero1, int numero2, int numero3) {
        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println(numero1 + " es mayor");
        } else if (numero2 > numero1 && numero2 >= numero3) {
            System.out.println(numero2 + " es mayor");

        } else System.out.println(numero3 + " es mayor");

    }

    public static void parImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else System.out.println("Es impar");
    }

    public static void sonIguales(String palabra, String palabra2) {
        if (palabra.equals(palabra2)) {
            System.out.println("son iguales");
        } else System.out.println("son diferentes");
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sumarImpares(int[] numeros) {
        int sumaImpares = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                sumaImpares += numero;
            }
        }
        System.out.println("la suma de los impares es igual a " + sumaImpares);

    }


    public static void numerosParesYSumaDePrimos(int[] numeros) {
        Set<Integer> numerosPares = new HashSet<>();
        int sumaPrimos = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
            if (esPrimo(numero)) {
                sumaPrimos += numero;
                ;

            }
        }
        System.out.println("los numeros pares son" + numerosPares + " y la suma de los numeros primos es igual a: " + sumaPrimos);


    }

    public static void mostrarMenuCalculadora() {
        System.out.println("menu calculadora:");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("0. salir");
    }

    public static void calculadora(Scanner scanner) {
        mostrarMenuCalculadora();
        System.out.println("seleccione una opcion");
        int opcionSeleccionada = scanner.nextInt();

        if (opcionSeleccionada == 0) {
            System.out.println("saliendo...");
        } else {

            System.out.println("introduzca un numero");
            double numero1 = scanner.nextDouble();
            System.out.println("introduzca otro numero");
            double numero2 = scanner.nextDouble();

            switch (opcionSeleccionada) {
                case 1:
                    System.out.println("la suma entre " + numero1 + " y " + numero2 + " es igual a " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("la resta entre " + numero1 + " y " + numero2 + " es igual a " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("la multiplicacion entre " + numero1 + " y " + numero2 + " es igual a " + (numero1 * numero2));
                    break;
                case 4:
                    if (numero2 == 0) {
                        System.out.println("no se puede dividir por 0.");
                    } else {
                        System.out.println("la division entre " + numero1 + " y " + numero2 + " es igual a " + (numero1 / numero2));
                    }
                    break;
                default:
                    System.out.println("opcion no valida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Menú de la bolera:");
        System.out.println("1. Registrar un nuevo cliente.");
        System.out.println("2. Registrar una nueva reserva de pista.");
        System.out.println("3. Mostrar todas las reservas.");
        System.out.println("4. Eliminar una reserva.");
        System.out.println("5. Salir.");
    }



        private static void capacidadYDinero() {
            double capacidadMax = 500;
            double entrada = 1500;
            double VIP = 2000;
            double contadorDineroEntrada = 0;
            double contadorGente = 0;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                if (contadorGente >= capacidadMax) {
                    System.out.println("el lugar esta lleno");
                    break;
                }

                System.out.print("Ingrese nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese edad: ");
                int edad = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ingrese DNI: ");
                String dni = scanner.nextLine();

                System.out.print("Ingrese contraseña: ");
                String contrasena = scanner.nextLine();

                if (edad < 21) {
                    System.out.println("Usted es menor, no puede pasar");
                } else {
                    System.out.print("¿Tiene pase VIP? responda 'si' o 'no': ");
                    String tienePaseVip = scanner.nextLine();

                    if (tienePaseVip.equalsIgnoreCase("si")) {
                        System.out.println("Bienvenido " + nombre);
                        contadorDineroEntrada += VIP;
                        contadorGente++;
                        System.out.println("Se van recaudando: $" + contadorDineroEntrada);
                        System.out.println("Va entrando " + contadorGente + "pesonas"  );
                    } else {
                        System.out.print("¿Tiene cupon de descuento? responda 'si' o 'no': ");
                        String tieneDescuento = scanner.nextLine();

                        if (tieneDescuento.equalsIgnoreCase("si")) {
                            System.out.println("Bienvenido " + nombre);
                            contadorDineroEntrada += entrada / 2;
                            contadorGente++;
                            System.out.println("Se van recaudando: $" + contadorDineroEntrada);
                            System.out.println("Va entrando " + contadorGente + "pesonas"  );
                        } else {
                            System.out.print("¿Qué entrada desea comprar? 'VIP' o 'General': ");
                            String quiereVIPoGral = scanner.nextLine();

                            if (quiereVIPoGral.equalsIgnoreCase("vip")) {
                                System.out.println("Bienvenido " + nombre);
                                contadorDineroEntrada += VIP;
                                contadorGente++;
                                System.out.println("Se van recaudando: $" + contadorDineroEntrada);
                                System.out.println("Va entrando " + contadorGente + "pesonas"  );
                            } else if (quiereVIPoGral.equalsIgnoreCase("general")) {
                                System.out.println("Bienvenido " + nombre);
                                contadorDineroEntrada += entrada;
                                contadorGente++;
                                System.out.println("Se van recaudando: $" + contadorDineroEntrada);
                                System.out.println("Va entrando " + contadorGente + "pesonas"  );
                            } else {
                                System.out.println("Opción no válida, no se puede procesar la entrada.");
                                System.out.println("Se van recaudando: $" + contadorDineroEntrada);
                                System.out.println("Va entrando " + contadorGente + "pesonas"  );

                            }
                        }
                    }
                }
            }

        }
    }
