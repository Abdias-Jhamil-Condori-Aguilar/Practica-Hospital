import java.util.Date;

public class Visita{
    String codVisita;
    Date fechaHora;
    Hospital hospital;
    Medico medico;
    String diagnostico;
    String tratamientos;
    int numeroCama;
    Date fechadeSalida;
    Historial historial;

    public Visita(String codVisita, Date fechaHora, Hospital hospital, Medico medico, String diagnostico, String tratamientos, int numeroCama, Date fechadeSalida, Historial historial) {
        this.codVisita = codVisita;
        this.fechaHora = fechaHora;
        this.hospital = hospital;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.tratamientos = tratamientos;
        this.numeroCama = numeroCama;
        this.fechadeSalida = fechadeSalida;
        this.historial = historial;
    }


}
