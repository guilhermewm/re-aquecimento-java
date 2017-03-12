import java.util.Map;
import java.util.TreeMap;

public class Pessoa {
	private int flag_idade;
	private String nome;
	private int idade;
	private ListPessoas lp = new ListPessoas();
	
	
	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.flag_idade = 0;
		 
		
		if(idade >= 65){
			flag_idade = 1;
		}else{
			flag_idade = 0;
		}
		
		lp.addPessoa(flag_idade, nome);
		
		System.out.println(lp);
	}
		
}
