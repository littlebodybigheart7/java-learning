<<<<<<< HEAD
package com.example.aula1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Paquera {

    private String id, nome, idade;

    // Construtor para o formulário (Spring MVC @ModelAttribute)
    public Paquera() {
    }

    // Construtor para SELECT (com id)
    public Paquera(String id, String nome, String idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor para INSERT (sem id)
    public Paquera(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getIdade() { return idade; }

    public void setId(String id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(String idade) { this.idade = idade; }

    public static Paquera converter(Map<String, Object> registro) {
        UUID id = (UUID) registro.get("id");
        String nome = (String) registro.get("nome");
        String idade = (String) registro.get("idade");
        return new Paquera(id.toString(), nome, idade);
    }

    public static ArrayList<Paquera> converterTodos(List<Map<String, Object>> registros) {
        ArrayList<Paquera> aux = new ArrayList<>();
        for (Map<String, Object> registro : registros) {
            aux.add(converter(registro));
        }
        return aux;
    }
}
=======
package com.example.aula1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Paquera {

    private String id, nome, idade;

    //Constrtuor para a pagina do formulario
    public Paquera(){
        
    }

    //Construtor bom para Select
    public Paquera(String idade, String id, String nome) {
        this.idade = idade;
        this.id = id;
        this.nome = nome;
    }

    //Construtor bom para insert
    public Paquera(String idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
        public static Paquera converter(Map<String,Object> registro){
        UUID id = (UUID) registro.get("id");
        String idade = (String) registro.get("idade");
        String nome = (String) registro.get("nome");
        return new Paquera(id.toString(), idade, nome);
    }

    public static ArrayList<Paquera> converterTodos(List<Map<String,Object>> registros){
        ArrayList<Paquera> aux = new ArrayList<>();
        for(Map<String,Object> registro : registros){
            aux.add(converter(registro));
        }
        return aux;
    }
}

>>>>>>> bddbb95f75b27207512fb390130087b6805d0677
