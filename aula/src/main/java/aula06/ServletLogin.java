package aula06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static final String USUARIO = "usuario";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html><body> ");
		
		String nomeUser = request.getParameter(USUARIO);
		String senhaUser = request.getParameter("senha");
		
		if (autentica(nomeUser, senhaUser)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, nomeUser);
		
			
			resposta.write("Bem vindo " + nomeUser);
		}else {
			resposta.write("Usuário ou senha inválidos");
		}
		
		resposta.write("</body> </html>");
	}

	private boolean autentica(String usuario, String senha) {
		// TODO Auto-generated method stub
		if (!usuario.equals("") && usuario != null && senha != null && senha.equals("1234")) {
			return true;
		}
		
		return false;
	}

}
