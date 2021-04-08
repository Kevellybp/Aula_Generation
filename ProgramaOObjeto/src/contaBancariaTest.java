
public class contaBancariaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ContaBancaria [] conta= new ContaBancaria [3];
conta [0]= new ContaBancaria ("Esther", "Poupança", 0011, 0022, 150, 250);
conta [1]= new ContaBancaria ("Igor", "Corrente", 2200, 1100, 1200, 30000);
conta [2]= new ContaBancaria ("Roberto", "Poupança",3000, 1500, 90000, 5000);

for (ContaBancaria loop:conta) {
loop.imprimirInfo();
System.out.println();
}
	}

}
