
public class clienteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cliente [] pessoa= new Cliente [3];
pessoa [0]= new Cliente ("Roberto ", "ps5 ", 5000);
pessoa [1]= new Cliente ("Fernanda ", "celular ", 2000);
pessoa [2]= new Cliente ("Monique " , "boneca " , 100);
 for (Cliente loop:pessoa) {
	 loop.imprimirInfo();
	 System.out.println();
 }

}
}