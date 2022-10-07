import java.util.List;

public class Servicio {
    String idServicio;
    String nombre;
    List<Hospital> hospitales;
    int numeroCamas;
    String comentario;

    public Servicio(String idServicio, String nombre, List<Hospital> hospitales, int numeroCamas, String comentario) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.hospitales = hospitales;
        this.numeroCamas = numeroCamas;
        this.comentario = comentario;
    }
}
