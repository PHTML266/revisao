package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}