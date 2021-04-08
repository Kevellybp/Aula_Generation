import java.text.NumberFormat;

public class Funcionario {
	//F= funcionário
private String nomeF;
private String cpf;
private String email;
private String cargof;
private int salariof;

public Funcionario (String nomeF, String cpf, String email, String cargof, int salariof) {
this.nomeF=nomeF;
this.cpf=cpf;
this.email= email;
this.cargof=cargof;
this.salariof=salariof;
}

public String getNomeF() {
	return nomeF;
}

public void setNomeF(String nomeF) {
	this.nomeF = nomeF;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCargof() {
	return cargof;
}

public void setCargof(String cargof) {
	this.cargof = cargof;
}

public int getSalariof() {                                  
	return salariof;
}

public void setSalariof(int salariof) {
	this.salariof = salariof;
}
public String importarMoeda() {
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	nf.setMinimumFractionDigits(2);
	String FormatMoeda = nf.format(salariof);
	return FormatMoeda;
}
  public void imprimirInfo () {
	  System.out.println("Funcionário (a): " + nomeF + "\nCPF: " +cpf + "\nE-mail: " +email + "\nCargo: " + cargof +  "\nSalário " +this.importarMoeda());
  }
}
