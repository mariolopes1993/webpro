package cadastrarDisciplina;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cadastrarDiscipl")
public class cadastrarDiscipl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String nomeDi;   
	private String nota1;
	private String situacao;
	
    public String getNomeDi() {           // Método nomeDi que é o nome da disciplina e retorna nomeDi
		return nomeDi;
	}
	public void setNomeDi(String nomeDi) {   
		this.nomeDi = nomeDi;
	}
	public String getNota1() {               //// Método nota1 que é a nota da disciplina e retorna nota1
		return nota1;
	}
	public void setNota1(String nota1) {
		this.nota1 = nota1;
	}
	public cadastrarDiscipl() {
        super();
    }
	
	
	public String getSituacao() {          /////// Método situação é se está aprovado ou reprovado. Pega da Control.java
		
		
		return situacao;
	}
	public void setSituacao(String situacao) {
		
		String convertida = situacao;                  //converte a nota da disciplina (string) em numero inteiro
		int conv = Integer.parseInt(convertida);
		
		
		if(conv >= 5){                                 //Se a nota for maior que 5 esta aprovado
			situacao = "aprovado";
			
		}else {
			situacao = "reprovado";
		}
		
		
		this.situacao = situacao;
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}


}
