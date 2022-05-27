package parcial1;

public class Matricula {
    private String idMatricula;
    private int contC;
    private int contA;
    private CargaAcademica[] cargaacademica;
    private Alumno[] alumno;

    public Matricula(String idMatricula) {
        this.idMatricula = idMatricula;
        this.cargaacademica = new CargaAcademica[3];
        this.alumno = new Alumno[2];
        this.contC = 0;
        this.contA = 0;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno[this.contA] = alumno;
        this.contA++;
    }

    public Alumno[] getAlumno() {
        return this.alumno;
    }

    public void setCargaAcademica(CargaAcademica cargaacademica) {
        this.cargaacademica[this.contC] = cargaacademica;
        this.contC++;
    }

    public CargaAcademica[] getCargaAcademica() {
        return this.cargaacademica;
    }

    public String getidMatricula() {
        return idMatricula;
    }

    public void setidMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getcontC() {
        return contC;
    }

    public void setcontC(int contC) {
        this.contC = contC;
    }

    public int getcontA() {
        return contA;
    }

    public void setcontA(int contA) {
        this.contA= contA;
    }
}
