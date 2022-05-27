package parcial1;

public class Docente {
    private int dniDoc;
    private String nombres;
    private String apellidos;

    public Docente(int dniDoc, String nomb, String apell) {
        this.dniDoc = dniDoc;
        this.nombres = nomb;
        this.apellidos = apell;
    }

    public int getdniDoc() {
        return dniDoc;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

}
