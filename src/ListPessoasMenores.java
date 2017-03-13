import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ListPessoasMenores {
	private List<Pessoa> pessoas_menores = new LinkedList<Pessoa>();
	private Pessoa p;
	
	
	public void addPessoa(String nome, Integer idade){
		p = new Pessoa(nome, idade);
		pessoas_menores.add(p);
		
		System.out.println("Lista menor: " + pessoas_menores);
	}
	
	
}
