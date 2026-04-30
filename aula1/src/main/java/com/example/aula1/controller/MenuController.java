package com.example.aula1.controller;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.context.ApplicationContext;
>>>>>>> bddbb95f75b27207512fb390130087b6805d0677
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.aula1.model.Paquera;
import com.example.aula1.model.PaqueraService;

<<<<<<< HEAD
@Controller
public class MenuController {

    @Autowired
    private PaqueraService paqueraService;

    @GetMapping("/")
    public String paginaPrincipal() {
=======
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

        @Autowired
    private ApplicationContext context;

    @GetMapping("/")
    public String paginaPrincipal(){
>>>>>>> bddbb95f75b27207512fb390130087b6805d0677
        return "index";
    }

    @GetMapping("/p1")
<<<<<<< HEAD
    public String pagina1() {
        return "p1";
    }

    @GetMapping("/p2")
    public String pagina2() {
        return "p2";
    }

    // Sem esse GET o Thymeleaf não consegue montar o th:object="${Paquera}"
    @GetMapping("/formpaquera")
    public String formularioPaquera(Model model) {
        model.addAttribute("Paquera", new Paquera());
        return "formpaquera";
    }

    @PostMapping("/Paquera")
    public String postPaquera(@ModelAttribute Paquera paquera, Model model) {
        paqueraService.inserirPaquera(paquera);
        return "sucesso";
    }

    @GetMapping("/paqueras")
    public String listarPaqueras(Model model) {
        model.addAttribute("paqueras", paqueraService.listarPaqueras());
        return "paqueras";
    }
}
=======
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
>>>>>>> bddbb95f75b27207512fb390130087b6805d0677
