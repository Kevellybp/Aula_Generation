
public class PatinetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Patinete [] objeto= new Patinete [3];
objeto [0]= new Patinete ("Patinete Clássico ", "Azul ", 170);
objeto [1]= new Patinete ("Patinete Atual ", "vermelho", 180);
objeto[2]= new Patinete ("Patinete Motorizado", "preto", 500);
for (Patinete loop:objeto) {
	loop.imprimirInfo();
	System.out.println();
}
	}

}
