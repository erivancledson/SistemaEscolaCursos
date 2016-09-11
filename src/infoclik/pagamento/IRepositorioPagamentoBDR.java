
package infoclik.pagamento;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */
public interface IRepositorioPagamentoBDR {
    public void Cadastrar(Pagamento pagamento) throws SQLException, CampoObrigatorioException;
	public  Pagamento procurarId(int id_aluno) throws PagamentoNaoEncontradoException, SQLException, CampoObrigatorioException;
        public  Pagamento procurar(String nome) throws PagamentoNaoEncontradoException, SQLException, CampoObrigatorioException;
        
	public void atualizar(Pagamento pagamento)throws PagamentoNaoEncontradoException, SQLException, CampoObrigatorioException;
	public void remover(int id_aluno)throws PagamentoNaoEncontradoException, SQLException, CampoObrigatorioException;
       
	
        public ArrayList<Pagamento> listar()throws SQLException;
        public ArrayList<Pagamento> listar(String complemento)throws SQLException;
        ArrayList<Pagamento> pesquisarNaoPagoPorMes(String mes) throws SQLException, SelecioneMes;
}
