import java.util.Map;
import java.util.TreeMap;

public class ListPessoas {
	private Map<Integer, String> list = new TreeMap<>();


	@Override
	public String toString() {
		return "ListPessoas [list=" + list + "]";
	}

	public Map<Integer, String> getList() {
		return list;
	}

	public void addPessoa(Integer key, String nome) {
		list.put(key, nome);
		
	}
	
	
}
