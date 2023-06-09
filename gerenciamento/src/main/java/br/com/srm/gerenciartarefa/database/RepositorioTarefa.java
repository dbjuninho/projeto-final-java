package br.com.srm.gerenciartarefa.database;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.srm.gerenciartarefa.entidades.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa,Long>{
    
}