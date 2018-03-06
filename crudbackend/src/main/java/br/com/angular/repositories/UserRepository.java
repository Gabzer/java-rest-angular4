package br.com.angular.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.angular.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
