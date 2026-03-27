package com.example.aula1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.aula1.model.Paquera;
import com.example.aula1.model.PaqueraService;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

        @Autowired
    private ApplicationContext context;

    @GetMapping("/")
    public String paginaPrincipal(){
        return "index";
    }

    @GetMapping("/p1")
    public String pagina1(){
        return "p1";
    }

        @GetMapping("/p2")
    public String pagina2(){
        return "p2";
    }

       @PostMapping({"/Paquera"})
    public String postCliente(@ModelAttribute Paquera Paquera, Model model) {
      PaqueraService cs = (PaqueraService)this.context.getBean(PaqueraService.class);
      cs.inserirPaquera(Paquera);
      return "sucesso";
   }
}