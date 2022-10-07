import java.util.Date;

public class Paciente {
    String codPaciente;
    String nombre;
    String primerApellido;
    String segundoApellido;
    String DNI;
    Date fechaNacimiento;
    String numeroSeguridadSocial;

    public Paciente(String codPaciente, String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento, String numeroSeguridadSocial) {
        this.codPaciente = codPaciente;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
