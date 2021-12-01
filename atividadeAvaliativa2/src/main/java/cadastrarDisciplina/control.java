package cadastrarDisciplina;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/control")
public class control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public control() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ac = request.getParameter("ac");
		listaDisciplinas sis = (listaDisciplinas) getServletContext().getAttribute(ContextListener.PROGWEB);
		
		String resposta = "menu.jsp";
		
		if ("cadastrar".equals(ac)) {
			resposta = "cadastroDisciplinas.jsp";
			
		} else if ("confirmarCadastro".equals(ac)) {
			cadastrarDiscipl x = new cadastrarDiscipl();   //objeto criado da classe cadastrarDiscipl
			x.setNomeDi(request.getParameter("nomeDi"));    // parametros recebidos da pagina de cadastro de disciplinas JSP
			x.setNota1(request.getParameter("nota1"));
			x.setSituacao(request.getParameter("nota1"));
			
		
			
			sis.addi(x);                                ///lista de disciplinas
			
			request.setAttribute("lista", sis.listarDi());
			resposta = "listaDisciplinas.jsp";

		}else if ("listar".equals(ac)) {
			request.setAttribute("lista", sis.listarDi());
			resposta = "listaDisciplinas.jsp";
		}
		
		request.getRequestDispatcher(resposta).forward(request, response);    //redirecionar página
		
	}

}
