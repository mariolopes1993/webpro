package Aula02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String data = request.getParameter("data");
		
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>AGENDA <BR></BODY></HTML>");
		saida.write("NOME: " + nome + "<BR>" );
		saida.write("TELEFONE: " + telefone + "<BR>" );
		saida.write( "DATA NASCIMENTO: " + data + "<BR>");
		
		saida.close();
	}

}
