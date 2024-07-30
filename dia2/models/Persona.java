package dia2.models;

public class  Persona {

    private TarjetaDeIdentidad tarjetaDeIdentidad;

    private int edad;

    private double altura;

    private boolean casado;

    private String [] pet;

    public Persona(TarjetaDeIdentidad tarjetaDeIdentidad, String[] pet, boolean casado, double altura, int edad) {
        this.tarjetaDeIdentidad = tarjetaDeIdentidad;
        this.pet = pet;
        this.casado = casado;
        this.altura = altura;
        this.edad = edad;
    }

    public TarjetaDeIdentidad getTarjetaDeIdentidad() {
        return tarjetaDeIdentidad;
    }

    public void setTarjetaDeIdentidad(TarjetaDeIdentidad tarjetaDeIdentidad) {
        this.tarjetaDeIdentidad = tarjetaDeIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String[] getPet() {
        return pet;
    }

    public void setPet(String[] pet) {
        this.pet = pet;
    }

    public void presentacion (){
        System.out.println("presentacion de " + this.tarjetaDeIdentidad.getNombre() + ": ");
        System.out.println("Hola mi nombre es " + this.getTarjetaDeIdentidad().getNombre() + " " + this.getTarjetaDeIdentidad().getApellido());
        System.out.println("Tengo " + this.getEdad() + " y mido " + this.getAltura() + " metros");
        if (this.casado == true){
            System.out.println("Estoy casado/a");
        }
        else System.out.println("No estoy casado/a");
        System.out.println("Mi DNI es " + this.getTarjetaDeIdentidad().getTarjetaDeIdentidad());
        System.out.println("Mi mascotas se llaman: ");
        for (String mascota: this.pet){
            System.out.println("- " + mascota );
        }

    }
}
