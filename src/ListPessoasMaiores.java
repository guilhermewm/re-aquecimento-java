import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class ListPessoasMaiores {
	private List<Pessoa> pessoas_maiores = new LinkedList<Pessoa>();
	private Pessoa p;
	
	
	public void addPessoa(String nome, Integer idade){
		p = new Pessoa(nome, idade);
		pessoas_maiores.add(p);
		
		System.out.println("Lista maior: " + pessoas_maiores);
	}

	public int sizePessoas(){
		return pessoas_maiores.size();
	}

	
	
}
