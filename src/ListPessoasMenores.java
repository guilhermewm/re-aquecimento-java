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
		
	}


	@Override
	public String toString() {
		return "ListPessoasMenores [pessoas_menores=" + pessoas_menores + "]";
	}


	public int sizePessoas(){
		return pessoas_menores.size();
	}
	
	public void excluiDaFila(){
		pessoas_menores.remove(0);
	}
	
	public Pessoa getPessoaFila(){
		return pessoas_menores.get(0);
	}

	
}
