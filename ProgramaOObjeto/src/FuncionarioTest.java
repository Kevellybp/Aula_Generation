
public class FuncionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Funcionario [] dados= new Funcionario [3];
dados [0]= new Funcionario ("Maria ", "02398476383 ", "maria@gmail.com " ,"Diretora ", 10000);
dados [1]= new Funcionario ("Eduardo ", "8837493984" , "eduardo@gmail.com " , "Serviços Geriais ", 1000);
dados [2]= new Funcionario ("Cláudio " , "234678889 " , "claudia@gmail.com ", "Auxiliar Administrativo ", 2000);
	for (Funcionario loop:dados) {
		loop.imprimirInfo();
		System.out.println();
	}
	
	}

}
