package parcial1;

public class CargaAcademica {
    private int contC;
    private int contD;
    private int contH;
    private int contP;
    private String idCarga;
    private Curso[] curso;
    private Docente[] docente;
    private Horario[] horario;
    private Periodo[] periodo;

    public CargaAcademica(String idCarga) {
        this.idCarga = idCarga;
        this.curso = new Curso[3];
        this.docente = new Docente[2];
        this.horario = new Horario[1];
        this.periodo = new Periodo[1];
        this.contC = 0;
        this.contD = 0;
        this.contH = 0;
        this.contP = 0;
    }

    public void setCurso(Curso curso) {
        this.curso[this.contC] = curso;
        this.contC++;
    }

    public Curso[] getCurso() {
        return this.curso;
    }

    public void setDocente(Docente docente) {
        this.docente[this.contD] = docente;
        this.contD++;
    }

    public Docente[] getDocente() {
        return this.docente;
    }

    public void setHorario(Horario horario) {
        this.horario[this.contH] = horario;
        this.contH++;
    }

    public Horario[] getHorario() {
        return this.horario;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo[this.contP] = periodo;
        this.contP++;
    }

    public Periodo[] getPeriodo() {
        return this.periodo;
    }

    public String getidCarga() {
        return idCarga;
    }

    public void setidCarga(String idCarga) {
        this.idCarga = idCarga;
    }

    public int getcontC() {
        return contC;
    }

    public void setcontC(int contC) {
        this.contC = contC;
    }

    public int getcontD() {
        return contD;
    }

    public void setcontD(int contD) {
        this.contD= contD;
    }

    public int getcontH() {
        return contH;
    }

    public void setcontH(int contH) {
        this.contH = contH;
    }
    public int getcontP() {
        return contP;
    }

    public void setcontP(int contP) {
        this.contP = contP;
    }
}
