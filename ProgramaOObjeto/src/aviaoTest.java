
public class aviaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aviao [] objeto = new Aviao [3];
objeto[0]= new Aviao ("Boeing 787 ", "200", 2000);
objeto[1]= new Aviao ("Airbus A330 " ," 335" , 2012);
objeto[2]= new Aviao ("Paulistinha ", " 2 " , 1941);
for (Aviao loop: objeto) {
	loop.imprimirInfo();
	System.out.println();
}

	}

}
