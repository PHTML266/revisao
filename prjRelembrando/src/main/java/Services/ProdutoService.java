package Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Produto;
import repository.ProdutoRepository;

@Service
public class ProdutoService {
	private final ProdutoRepository produtoRepository;
	
	@Autowired
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public Produto getProdutoById(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	public List<Produto> getAllProdutos() {
		return produtoRepository.findAll();
	}
	
	public boolean deleteProduto(Long id) {
		Optional<Produto> produtoExistente = produtoRepository.findById(id);
		if (produtoExistente.isPresent()) {
			produtoRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	public Produto updateProduto(Long id, Produto novoProduto) {
		Optional<Produto> produtoOptional = produtoRepository.findById(id);
		if (produtoOptional.isPresent()) {
			Produto produtoExistente = produtoOptional.get();
			produtoExistente.setData(novoProduto.getData());
			produtoExistente.setPrice(novoProduto.getPrice());

			if (novoProduto.getCliente() != null) {
				produtoExistente.setCliente(novoProduto.getCliente());
			}		
			return produtoRepository.save(produtoExistente);
		} else {
			return null;
		}
	}


}