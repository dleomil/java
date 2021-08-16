package br.com.isidrocorp.eventdash.dao;

// Import de modulos a serem utilizados
import org.springframework.data.repository.CrudRepository;
import br.com.isidrocorp.eventdash.model.Alarme;


public interface AlarmeDAO extends CrudRepository <Alarme, Integer> {	
	

}
