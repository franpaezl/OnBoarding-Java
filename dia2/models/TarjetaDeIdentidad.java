package dia2.models;

public class TarjetaDeIdentidad {
    private String nombre;

    private String apellido;

    private String tarjetaDeIdentidad;

    public TarjetaDeIdentidad(String nombre, String apellido, String tarjetaDeIdentidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjetaDeIdentidad = tarjetaDeIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTarjetaDeIdentidad() {
        return tarjetaDeIdentidad;
    }

    public void setTarjetaDeIdentidad(String tarjetaDeIdentidad) {
        this.tarjetaDeIdentidad = tarjetaDeIdentidad;
    }

    @Override
    public String toString() {
        return "TarjetaDeIdentidad{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tarjetaDeIdentidad='" + tarjetaDeIdentidad + '\'' +
                '}';
    }
}
