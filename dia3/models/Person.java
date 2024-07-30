package dia3.models;


import java.util.ArrayList;
import java.util.List;

public class Person {

    private Id tarjetaDeIdentidad;
    private int edad;
    private double altura;
    private boolean casado;
    private List<Mascota> mascotas;

    public Person(Id tarjetaDeIdentidad, int edad, double altura, boolean casado) {
        this.tarjetaDeIdentidad = tarjetaDeIdentidad;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
        this.mascotas = new ArrayList<>(); // Inicializar la lista de mascotas
    }

    public Id getTarjetaDeIdentidad() {
        return tarjetaDeIdentidad;
    }

    public void setTarjetaDeIdentidad(Id tarjetaDeIdentidad) {
        this.tarjetaDeIdentidad = tarjetaDeIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void addPet(Mascota mascota) {
        this.mascotas.add(mascota);
        mascota.setPerson(this);
    }

    public void present() {
        System.out.println("presentacion de " + this.tarjetaDeIdentidad.getNombre() + ": ");
        System.out.println("Hola mi nombre es " + this.getTarjetaDeIdentidad().getNombre() + " " + this.getTarjetaDeIdentidad().getApellido());
        System.out.println("Tengo " + this.getEdad() + " y mido " + this.getAltura() + " metros");
        if (this.casado == true){
            System.out.println("Estoy casado/a");
        }
        else System.out.println("No estoy casado/a");
        System.out.println("Mi DNI es " + this.getTarjetaDeIdentidad().getTarjetaDeIdentidad());
        System.out.println("Mi mascotas son: ");
        for (Mascota mascota : mascotas) {
            System.out.println(" - " + mascota.getNombre() + " es un " + mascota.getType() + " y tiene " + mascota.getEdad() + "años");
        }
    }
}
