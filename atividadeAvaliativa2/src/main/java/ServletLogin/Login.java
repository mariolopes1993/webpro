package ServletLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/ServletLogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Login() {
        super();
        
    }
    
    public static final String USUARIO = "usuario";    


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html><body> ");
		
		
		String nomeUser = request.getParameter(USUARIO);        //  Captura o nome de usuário	
		String senhaUser = request.getParameter("senha");		//  Captura a senha digitada
		
		
		
		String redirecionar = "menu.jsp";              ////Direciona para a pagina de login
		
		
		if (autentica(nomeUser, senhaUser)) {             //verifica se 
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, nomeUser);


			request.getRequestDispatcher(redirecionar).forward(request, response);   // Redirecionar paagina
			
		}else {
			resposta.write("Usuário ou senha inválidos");
			

		}
		
		resposta.write("</body> </html>");
	}

	private boolean autentica(String usuario, String senha) {                   // Dados do usuário para realizar o login

		if (usuario != null && usuario.equals("professor") && senha != null && senha.equals("Progweb2021")) {
			return true;
		}
		
		return false;
	}

}
