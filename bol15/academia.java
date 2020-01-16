package bol15;
import java.util.Scanner;
/**
 *
 * @author sverdecadilla
 */
public class academia {
    Scanner sc = new Scanner(System.in);
    private String referencia;
    private String nome;
    private int nota;

    public static void numReferencia(int referencia){
        do{
            System.out.println("El alumno esta matriculado en "+referencia);
            referencia++;
        }while(referencia<=2025);
    }
    
    public void pedNome(){
        System.out.println("Cual es el nombre del alumno");
        nome = sc.nextLine();
    }
    
    public void alumno(){
        numReferencia();
        pedNome();
        
    }
    
    @Override
    public String toString() {
        return "academia{" + "referencia=" + referencia + ", nome=" + nome + ", nota=" + nota + '}';
    }
    
}
