
public class EletronicoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Eletronico [] objeto= new Eletronico [3];
objeto [0] = new Eletronico ("celular ","Samsung ", 2000);
objeto [1]= new Eletronico ("Iphone ", "Apple ", 7000);
objeto [2] = new Eletronico ("Fone ", "JBL ", 150);
for (Eletronico loop:objeto) {
	loop.imprimirInfo();
	System.out.println();
}
;

	}

}
