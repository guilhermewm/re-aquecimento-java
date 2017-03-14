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
		
		
	}

	@Override
	public String toString() {
		return "ListPessoasMaiores [pessoas_maiores=" + pessoas_maiores + "]";
	}

	public int sizePessoas(){
		return pessoas_maiores.size();
	}
	
	public void excluiDaFila(){
		pessoas_maiores.remove(0);
	}
	
	public Pessoa getPessoaFila(){
		return pessoas_maiores.get(0);
	}

	
	
}
