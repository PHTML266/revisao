package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {

}
