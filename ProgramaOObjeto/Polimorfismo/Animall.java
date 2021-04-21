
public abstract class Animall {

	private String classeAnimal ;
	
 public Animall (String classe) {
	 this.classeAnimal= classe;
	 
 }
 abstract public void getraca (int raca);
 abstract public void getidade (int idade);
 abstract public void getsom (String som);
public String getClasseAnimal() {
	return classeAnimal;
}
public void setClasseAnimal(String classeAnimal) {
	this.classeAnimal = classeAnimal;
}
 
}
