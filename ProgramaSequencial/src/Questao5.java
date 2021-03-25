import java.util.Scanner;
public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b,c,d,r,s,D;
Scanner ler = new Scanner (System.in);
System.out.println("Entre com a expressão a: ");
a= ler.nextInt();
System.out.println("Entre com a expressão b: ");
b= ler.nextInt();
System.out.println("Entre com a expressão c: ");
c= ler.nextInt();

s = Math.pow (a+c,2);
r= Math.pow(a+b,2);
d= (r+s)/2;
System.out.println("A expressão D é: " + d);

	}

}
