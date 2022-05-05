package com.generation.ecommerce.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.ecommerce.farmacia.model.Produto;

	@Repository
	public interface ProdutoRepository extends JpaRepository <Produto, Long>{
		
		public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
		public List <Produto> findAllByPrecoLessThan(BigDecimal preco);
		public List <Produto> findAllByPrecoGreaterThan(BigDecimal preco);
		public List <Produto> findByNomeAndLaboratorio(@Param("nome")String nome, String laboratorio);
		public List <Produto> findByNomeOrLaboratorio(String nome, String laboratorio);
		
		
}


