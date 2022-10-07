public class Ciudad {
    String codCiudad;
    String nombre;
    public Ciudad(String codCiudad, String nombre) {
        this.codCiudad = codCiudad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "codCiudad='" + codCiudad + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
