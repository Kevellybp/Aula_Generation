import java.util.Scanner;
public class vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada= new Scanner (System.in);
int [] vetor1 = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
int [] vetor2 = {43,42,4,8,55,21,2,45};
double [] nota=new double [5];
if (vetor2.length >8) {
	System.out.println("Tamanho do vetor2 -maior que 8" );
} else {
	System.out.println("Tamanho do vetor2 - menor que 8" );
}
System.out.println("Tamanho do vetor1= " + vetor1.length);
String [] cars = { "Volvo ", "", "ford", "Mazda"};
for (String i: cars) {
	System.out.println(i);
}
for (int i=0;i<5;i++) {
	System.out.println("Entre com uma nota: ");
	nota[i]=entrada.nextDouble ();
}
for (int i=0;i<=5;i++) {
	System.out.println("Nota " +i+1 + "=" + nota[i]);
}
	}

}
