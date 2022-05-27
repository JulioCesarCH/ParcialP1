package parcial1;

public class Horario {
    private String idHorario;
    private String horaInicio;
    private String horaFin;
    private String tipoHorario;

    public Horario(String idHorario, String horaInicio,String horaFin,String tipoHorario) {
        this.idHorario = idHorario;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoHorario = tipoHorario;
    }

    public String getidHorario() {
        return idHorario;
    }

    public String gethoraInicio() {
        return horaInicio;
    }
    public String gethoraFin() {
        return horaFin;
    }
    public String gettipoHorario() {
        return tipoHorario;
    }
}
