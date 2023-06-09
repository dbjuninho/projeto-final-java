package br.com.srm.gerenciartarefa.database;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.srm.gerenciartarefa.entidades.User;

public interface RepositorioUser extends JpaRepository<User,Long>{
    
}