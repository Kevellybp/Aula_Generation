import java.util.*;
public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b,c,d,e,f,x,y;
Scanner ler = new Scanner (System.in);
System.out.println("Entre com a: ");
a= ler.nextDouble();
System.out.println("Entre com b: ");
b= ler.nextDouble();
System.out.println("Entre com c: ");
c= ler.nextDouble();
System.out.println("Entre com d: ");
d= ler.nextDouble();
System.out.println("Entre com e: ");
e= ler.nextDouble();
System.out.println("Entre com f: ");
f= ler.nextDouble();


		x=(c*e) - (b*f) / (a*e)- (b*d);
		y=(a*f)- (c*a) / (a*b)-(b*d);
		
		System.out.printf("O valor de x é %2.2f e o de y é %2.2f ",x,y);
	}

}
