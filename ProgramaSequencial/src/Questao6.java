import java.util.*;
public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double x1,x2,y1,y2,D,x,y,Subx,Suby;
Scanner ler = new Scanner (System.in);
System.out.println("Entre com x1: ");
x1= ler.nextDouble();
System.out.println("Entre com x2: ");
x2= ler.nextDouble();
System.out.println("Entre com y1: ");
y1= ler.nextDouble();
System.out.println("Entre com y2: ");
y2= ler.nextDouble();

x= x2-x1;
Subx= Math.pow(x, 2);
y=y2-y1;
Suby = Math.pow(y,2);
D= Subx + Suby;

System.out.printf("A distancia entre o ponto %2.2f e o ponto %2.2f  é %2.2f:" ,x,y,D);









	}

}



/*Construa um programa em c que, tendo como dados

quaisquer no plano, P(x1, y1) e P(x2, y2), 
escreva a distância entre eles. A fórmula

que efetua tal cálculo é:*/