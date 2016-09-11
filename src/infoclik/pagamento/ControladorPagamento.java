
package infoclik.pagamento;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */
public class ControladorPagamento {
    
     
    private IRepositorioPagamentoBDR repositorioPagamento;
	
	
	public ControladorPagamento() throws Exception {
		this.repositorioPagamento = new RepositorioPagamentoBDR();
		
	}
	
	public void cadastrar(Pagamento pagamento) throws  CampoObrigatorioException, SQLException,PagamentoNaoEncontradoException{
		
		if(pagamento.getNome().equals("") == true) throw new CampoObrigatorioException();
		
		
		
		
		this.repositorioPagamento.Cadastrar(pagamento);
		
	
	}
	
	public void remover(int id_aluno) throws  PagamentoNaoEncontradoException, SQLException, CampoObrigatorioException{
				Pagamento pagamento = null;
		
		
		pagamento = this.repositorioPagamento.procurarId(id_aluno);
		
		
		this.repositorioPagamento.remover(id_aluno);
		
	}
        
        
        
        
        public Pagamento procurarId(int id_aluno) throws  PagamentoNaoEncontradoException, SQLException, CampoObrigatorioException{
		
		return this.repositorioPagamento.procurarId(id_aluno);
		
	}
        
        public Pagamento procurarNome(String nome) throws  PagamentoNaoEncontradoException, SQLException, CampoObrigatorioException{
		
		return this.repositorioPagamento.procurar(nome);
		
	}
	

	public void atualizar(Pagamento pagamento) throws PagamentoNaoEncontradoException, SQLException,  CampoObrigatorioException{
		
		if(pagamento.getNome().equals("") == true) throw new CampoObrigatorioException();
		
		this.repositorioPagamento.atualizar(pagamento);
	}

	public ArrayList<Pagamento> listar() throws SQLException{
		return this.repositorioPagamento.listar();
	}

public ArrayList<Pagamento> pesquisarNaoPagoPorMes(String mes) throws SQLException, SelecioneMes{
    if(mes.equals("Selecione")){
        throw new SelecioneMes();
    }
    
    return repositorioPagamento.pesquisarNaoPagoPorMes(mes);
}
    
}
