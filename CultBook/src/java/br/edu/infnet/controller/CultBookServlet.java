package br.edu.infnet.controller;

import br.edu.infnet.model.Cliente;
import br.edu.infnet.model.ListaDeLivros;
import br.edu.infnet.model.Livro;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CultBookServlet", urlPatterns = {"/CultBookServlet"})
public class CultBookServlet extends HttpServlet {

    private void gravarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String fone = request.getParameter("fone");
        String endereco = request.getParameter("endereco");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        ArrayList<String> erros = new ArrayList<String>();

//            VALIDAÇÃO
//            1- nome, email e login obrigatorios;
        if (nome.isEmpty()) {
            erros.add("Falta nome");
        }
        if (email.isEmpty()) {
            erros.add("Falta email");
        }
        if (login.isEmpty()) {
            erros.add("Falta login");
        }
//            2- login ter no minimo 8 caracteres;
        if (login.length() < 8) {
            erros.add("Login deve ter pelo meno 8 caracteres");
        }
//            3- nome deve ter no minimo duas palavras;
        if (nome.trim().split(" ").length < 2) {
            erros.add("Nome deve ter pelo menos duas palavras");
        }

        //redirecionamento
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setEmail(email);
        c.setFone(fone);
        c.setEndereco(endereco);
        c.setLogin(login);
        c.setSenha(senha);
        request.setAttribute("cliente", c);
        request.setAttribute("erros", erros);

        //request.getRequestDispatcher("sucesso.jsp").forward(request, response);
        //mesmo efeito de "response.sendRedirect" mas passa parametros;
        if (erros.isEmpty()) {
            request.getRequestDispatcher("sucesso.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("cadastro.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doAction(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doAction(request, response);
    }

    protected void doAction(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String tarefa = request.getParameter("tarefa");

            switch (tarefa) {

                case "cadastrar":
                    response.sendRedirect("cadastro.jsp");
                    break;
                case "gravar":
                    gravarCliente(request, response);
                    break;
                case "buscar":
                    ArrayList<Livro> livros = new ListaDeLivros().buscarLivros();
                    request.setAttribute("livros", livros);
                    request.getRequestDispatcher("listarLivros.jsp").forward(request, response);
                    break;
                case "detalhar":
                    String isbn = request.getParameter("isbn");
                    Livro livro = new ListaDeLivros().obterLivro(isbn);
                    request.setAttribute("livro", livro);
                    request.getRequestDispatcher("detalhe.jsp?isbn=" + isbn).forward(request, response);
                    break;
                default:
                    response.sendRedirect("menuInicial.jsp");
                    break;
            }

        } catch (Exception e) {

        }
    }
}
