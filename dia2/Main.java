package dia2;

import dia2.models.Persona;
import dia2.models.TarjetaDeIdentidad;

public class Main {
    public static void main(String[] args) {
        String [] mascotasFran = {"Simon", "Leon"};
        Persona fran = new Persona(new TarjetaDeIdentidad("Francisco","Páez Lastra", "FASF564846"), mascotasFran , false, 1.74, 28  );
        fran.presentacion();

        String [] mascotasGuadi = {"Tito", "Goku", "Zahira"};
        Persona guadi = new Persona(new TarjetaDeIdentidad("Guadalupe", "Ramirez", "FASGGDD45465"), mascotasGuadi, true, 1.60, 30);
        guadi.presentacion();
    }
}
