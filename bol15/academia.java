package bol15;
import java.util.Scanner;
import datos.personal;
/**
 *
 * @author sverdecadilla
 */
public class academia {
    Scanner sc = new Scanner(System.in);
    public static int referencia = 2020;
    private int ref;
    private String nome;
    private float nota;
    private personal alumno = new personal();

    public academia() {
        ref=referencia;
        referencia++;
    }   

    public academia(int ref, String nome, int nota, String personal) {
        this.ref = ref;
        this.nome = nome;
        this.nota = nota;
    }

    public int getRef() {
        return ref;
    }

    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    public personal getAlumno() {
        return alumno;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setAlumno(personal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "academia{" + "sc=" + sc + ", ref=" + ref + ", nome=" + nome + ", nota=" + nota + ", alumno=" + alumno + '}';
    }

    
    
}