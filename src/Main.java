import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        List<Hospital> hospitalesA= new ArrayList<>();
        hospitalesA.add(hospital);
        Servicio servicio =new Servicio();
        List<Servicio> servicios = new ArrayList<>();
        servicios.add(servicio);
        Date fecha=new Date();
        Ciudad oruro= new Ciudad("15b","Oruro");
        Medico medico =new Medico("2020","Juan","Perez","Condori","13910474",fecha,servicios,hospital);
        hospital.setCodHospital("or");
        hospital.setNombre("Cochabamba");
        hospital.setCiudad(oruro);
        hospital.setServicios(servicios);
        hospital.setDirector(medico);
        servicio.setIdServicio("odontologia");
        servicio.setNombre("Odontologia Perez");
        servicio.setHospitales(hospitalesA);
        servicio.setNumeroCamas(15);
        servicio.setComentario("Buen Hospital");

        Ciudad cochabamba= new Ciudad("or","Oruro");
        Paciente paciente= new Paciente("pab","Jhon","Condori","Aguilar","13910474","14/04/01","72236719");
        System.out.println(hospital.toString());

    }
}
