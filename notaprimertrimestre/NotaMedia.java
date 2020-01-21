package notaprimertrimestre;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class NotaMedia {
private float teorico1,teorico2,notaPractico,num;
private int notaBoletins, boletins,notaMedia,valor;
private final String fin="fin";
Scanner sc = new Scanner(System.in);
private String msg;

public float pedirNotas(){
do{
    System.out.println("Introduce a nota");
    num=sc.nextFloat();
    }while(num>10 || num<0); 
return num;
}
public void pedirBoletins(){
do{
System.out.println("Introduce a numero de boletins feitos (0-19)");
boletins=sc.nextInt();    
}while(boletins>19 || boletins<0);    
}

public void calcularNotaBoletins(){
pedirBoletins();
    if(boletins>17){
    notaBoletins=2;
    }
    else if(boletins>13){
    notaBoletins=1;
    }
    else{
    notaBoletins=0;
    }       
}


public void calcularNotaMedia(){
System.out.println("Teorico 1");    
teorico1=pedirNotas();
System.out.println("Teorico 2"); 
teorico2=pedirNotas();
System.out.println("Practico"); 
notaPractico=pedirNotas();
calcularNotaBoletins();
notaMedia =(int) Math.round(((teorico1+teorico2)/2*0.4)+notaPractico*0.4+notaBoletins);   
System.out.println("A nota media é: "+notaMedia);
}

public void programa(){
do{
calcularNotaMedia();
System.out.println("Introduce calquera cousa para continuar e fin para terminar");    
msg=sc.next();
valor=msg.compareToIgnoreCase(fin);
}while(valor!=0);
}

}
