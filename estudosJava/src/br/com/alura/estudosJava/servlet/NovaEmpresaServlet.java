package br.com.alura.estudosJava.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String paramData=request.getParameter("data");
		Date dataAbertura=null;
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		try {
			dataAbertura= sdf.parse(paramData);
			
		} catch (ParseException e) {
			throw new ServletException(e);
		}
	
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setData(dataAbertura);
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		//chamar o JPS
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
		request.setAttribute("dataAbertura", empresa.getData());
		rd.forward(request, response);
	}

}
