package parcial1;

public class Alumno {
    private String idAlumno;
    private String nombres;
    private String apellidos;

    public Alumno(String idAl, String nomb, String apell) {
        this.idAlumno = idAl;
        this.nombres = nomb;
        this.apellidos = apell;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

}
