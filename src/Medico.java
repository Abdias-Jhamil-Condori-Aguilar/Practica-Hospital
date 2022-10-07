import java.util.Date;
import java.util.List;

public class Medico {
    String codMedico;
    String nombre;
    String nombreApellido;
    String segundoApellido;
    String DNI;
    Date fechaNacimiento;
    List<Servicio> servicios;
    Hospital hospital;

    public Medico(String codMedico, String nombre, String nombreApellido, String segundoApellido, String DNI, Date fechaNacimiento, List<Servicio> servicios, Hospital hospital) {
        this.codMedico = codMedico;
        this.nombre = nombre;
        this.nombreApellido = nombreApellido;
        this.segundoApellido = segundoApellido;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.servicios = servicios;
        this.hospital = hospital;
    }
}
