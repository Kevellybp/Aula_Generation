
public class PacienteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Paciente [] pessoa= new Paciente [3];
pessoa [0]= new Paciente ("Maria", "João", "Estável", "01/09/2020");
pessoa [1]= new Paciente ("João", "Maria" , "Grave" , "09/03/2021");
pessoa [2]= new Paciente ("Ester" , "Cássia", "Risco" ,"11/12/2020");
for (Paciente loop:pessoa) {
	loop.imprimirInfo();
	System.out.println("*********************");
}
	}

}
