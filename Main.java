package parcial1;

public class Main {
    public static void main(String arg[]) {
        // registrar periodos
        Periodo p2022I = new Periodo(1,"2022-I");
        //Periodo p2022II = new Periodo(2,"2022-II");
        // registrar horarios
        Horario maniana = new Horario("M","08:00 am","12:00 am","Manana");
       // Horario tarde = new Horario("T","01:00 pm","06:00 pm","Tarde");
        // registrar cursos
        Curso POO = new Curso("POO", "Programacion Orientada a Objetos");
        Curso PGII = new Curso("PGII", "lenguaje de programacion II");
        Curso ISW = new Curso("ISW", "Ingenieria de Software");
        // registrar alumnos
        Alumno julio = new Alumno("1", "Julio", "Cueva");
        Alumno beker = new  Alumno("2", "Beker", "Hilario");

        // registrar docentes
        Docente edgardo = new Docente(12345678, "Edgardo", "Ramirez");
        Docente alberto = new Docente(87654321, "Alberto", "Salvador");

        //registrar cargas academicas
        CargaAcademica ca2022I01 = new CargaAcademica("2022I.01");
        ca2022I01.setCurso(POO);
        ca2022I01.setDocente(edgardo);
        ca2022I01.setHorario(maniana);
        ca2022I01.setPeriodo(p2022I);

        CargaAcademica ca2022I02 = new CargaAcademica("2022I.02");
        ca2022I01.setCurso(PGII);
        ca2022I01.setDocente(alberto);
        ca2022I01.setHorario(maniana);
        ca2022I01.setPeriodo(p2022I);

        CargaAcademica ca2022I03 = new CargaAcademica("2022I.03");
        ca2022I01.setCurso(ISW);
        ca2022I01.setDocente(edgardo);
        ca2022I01.setHorario(maniana);
        ca2022I01.setPeriodo(p2022I);

         //registrar matricula
         // alumno julio
         Matricula Ma12022I01 = new Matricula("1.2022I.01");
         Ma12022I01.setAlumno(julio);
         Ma12022I01.setCargaAcademica(ca2022I01);
         Ma12022I01.setCargaAcademica(ca2022I02);
         Ma12022I01.setCargaAcademica(ca2022I03);

        // alumno beker
         Matricula Ma22022I01 = new Matricula("2.2022I.01");
         Ma22022I01.setAlumno(beker);
         Ma22022I01.setCargaAcademica(ca2022I01);
         Ma22022I01.setCargaAcademica(ca2022I02);
         Ma22022I01.setCargaAcademica(ca2022I03);

        
         System.out.println("Codigo de Matricula: "+Ma12022I01.getidMatricula());

         for(Alumno a: Ma12022I01.getAlumno())
         {  
            System.out.println("Alumno: "+a.getNombres() + " " + a.getApellidos());
            for(CargaAcademica ca: Ma12022I01.getCargaAcademica())
                {
                    System.out.println("Carga: "+ca.getidCarga() );

                    for(Periodo p: ca.getPeriodo())
                    {
                        System.out.println("Semestre: "+p.getnPeriodo());
                    }
                    for(Curso c: ca.getCurso())
                    {
                        System.out.println("Curso: "+c.getnCurso());
                    }
                    for(Docente d: ca.getDocente())
                    {
                        System.out.println("Docente: "+d.getNombres()+" "+d.getApellidos());
                    }
                    for(Horario h: ca.getHorario())
                    {
                        System.out.println("Horario: "+h.gettipoHorario()+" Inicio: "+h.gethoraInicio()+" Fin: "+h.gethoraFin());
                    }
            }
        }

        System.out.println("Codigo de Matricula: "+Ma22022I01.getidMatricula());
         
        for(Alumno a: Ma22022I01.getAlumno())
        {  
           System.out.println("Alumno: "+a.getNombres() + " " + a.getApellidos());
            for(CargaAcademica ca: Ma22022I01.getCargaAcademica())
                {
                    for(Periodo p: ca.getPeriodo())
                    {
                        System.out.println("Semestre: "+p.getnPeriodo());
                    }
                    for(Curso c: ca.getCurso())
                    {
                        System.out.println("Curso: "+c.getnCurso());
                    }
                    for(Docente d: ca.getDocente())
                    {
                        System.out.println("Docente: "+d.getNombres()+" "+d.getApellidos());
                    }
                    for(Horario h: ca.getHorario())
                    {
                        System.out.println("Horario: "+h.gettipoHorario()+" Inicio: "+h.gethoraInicio()+" Fin: "+h.gethoraFin());
                    }
            }
        }
}
}
