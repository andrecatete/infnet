package br.edu.infnet.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    
    @RequestMapping("/") // mesma coisa que     value = "/"
    public String welcome(){
                
        return "index";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET) 
    public String login(){
                
        return "index";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(HttpServletRequest request, Model model){
        
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
                
        if (login.equals("admin") && senha.equals("admin")){
            
            model.addAttribute("login", login);
            return "sucesso";
        }
        else
            return "erro";
    }
}
