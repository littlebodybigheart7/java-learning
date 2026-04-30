<<<<<<< HEAD
package com.example.aula1.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PaqueraDAO {

    @Autowired
    private JdbcTemplate jdbc;

    public void inserirPaquera(Paquera paquera) {
        String sql = "INSERT INTO paquera(nome, idade) VALUES (?, ?)";
        Object[] obj = new Object[2];
        obj[0] = paquera.getNome();
        obj[1] = paquera.getIdade();
        jdbc.update(sql, obj);
    }

    public Paquera mostrarPaquera(String uuid) {
        String sql = "SELECT * FROM paquera WHERE id = ?::uuid";
        return Paquera.converter(jdbc.queryForMap(sql, uuid));
    }

    public ArrayList<Paquera> listarPaqueras() {
        String sql = "SELECT * FROM paquera";
        return Paquera.converterTodos(jdbc.queryForList(sql));
    }
}
=======
package com.example.aula1.model;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class PaqueraDAO {

    @Autowired
	DataSource dataSource;
	
	//JdbcTemplate jdbc;
	
	@PostConstruct
	private void initialize() {
		//jdbc = new JdbcTemplate(dataSource);
	}
	
	public void inserirPaquera(Paquera Paquera) {
		String sql = "INSERT INTO Paquera(nome,idade)" +
	                 " VALUES (?,?)";
		Object[] obj = new Object[2];
		//primeiro ?
		obj[0] = Paquera.getNome();
		//segundo ?
		//obj[1] = Paquera.getIdade();
		//JDBCAppender.update(sql, obj);
	}
    //public Paquera mostrarPaquera(String uuid){
        String sql = "SELECT * FROM Paqueras where id=?::uuid";
        //return Paquera.converter(jdbc.queryForMap(sql,uuid));
	}

    public ArrayList<Paquera> listarPaqueras(){
		String sql = "SELECT * FROM Paqueras";
		//return Paquera.converterTodos(jdbc.queryForList(sql));
	}

}
>>>>>>> bddbb95f75b27207512fb390130087b6805d0677
