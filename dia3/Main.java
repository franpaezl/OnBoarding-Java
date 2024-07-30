package dia3;


import dia3.models.Id;
import dia3.models.Mascota;
import dia3.models.Person;
import dia3.models.PetType;

public class Main {
    public static void main(String[] args) {
        Id id1 = new Id("Francisco","Paez Lastra","39477480SSa");
        Person persona1 = new Person(id1, 28, 1.74, false);

        Mascota mascota1 = new Mascota(PetType.PERRO, 5, "Simon");
        Mascota mascota2 = new Mascota(PetType.GATO, 3, "Gaga");

        persona1.addPet(mascota1);
        persona1.addPet(mascota2);

        persona1.present();
    }
}
