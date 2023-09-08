package com.mycompany.reportematricula;
import java.util.List;
import com.mycompany.reportematricula.Estudiante;
import com.mycompany.reportematricula.Curso;

public class ReporteMatricula {
    private String semestre;
    private Estudiante estudiante;
    private List<Curso> cursosMatriculados;

    public ReporteMatricula(String semestre, Estudiante estudiante, List<Curso> cursosMatriculados) {
        this.semestre = semestre;
        this.estudiante = estudiante;
        this.cursosMatriculados = cursosMatriculados;
    }

    public void mostrarInformacion() {
        System.out.println("===============================");
        System.out.println("Semestre: " + semestre);
        estudiante.mostrarDatos();

        System.out.println("===============================");
        System.out.println("Cursos matriculados:");
        for (Curso curso : cursosMatriculados) {
            curso.mostrarDatos();
        }
    }

    public static void main(String[] args) {
        Estudiante luiz = new Estudiante();
        luiz.setCodigo(12345);
        luiz.setNombre("Luiz");
        luiz.setFacultad("Facultad de Ingeniera de Sistemas e Informatica");
        luiz.setEscuela("E.A.P Ingeniería de Software");
        luiz.setEspecialidad("Ingeniería de Software");
        luiz.setPlanEstudios("2018");

        Curso curso1 = new Curso();
        curso1.setNombre("Algoritmica ll");
        curso1.setCodigoEstudiante(12345);
        curso1.setCreditosTotales(5);

        Curso curso2 = new Curso();
        curso2.setNombre("Matematica Discreta");
        curso2.setCodigoEstudiante(12345);
        curso2.setCreditosTotales(4);

        List<Curso> cursosMatriculados = List.of(curso1, curso2);

        ReporteMatricula reporte = new ReporteMatricula("2023-ll", luiz, cursosMatriculados);

        System.out.println("Informacion del objeto:");
        reporte.mostrarInformacion();
    }
}
