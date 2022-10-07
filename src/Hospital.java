import java.util.List;

public class Hospital {
    String codHospital;
    String nombre;
    Ciudad ciudad;
    List<Servicio> servicios;
    Medico director;

    public Hospital(String codHospital, String nombre, Ciudad ciudad, List<Servicio> servicios, Medico director) {
        this.codHospital = codHospital;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.servicios = servicios;
        this.director = director;
    }
}
