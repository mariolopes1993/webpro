package cadastrarDisciplina;

import java.util.ArrayList;
import java.util.List;



public class listaDisciplinas {
	
	private List<cadastrarDiscipl> disciplinas = new ArrayList<cadastrarDiscipl>();
	
	public void addi(cadastrarDiscipl x) {
		disciplinas.add(x);
	}
	
	public List<cadastrarDiscipl> listarDi(){
		return disciplinas;
	}
}
