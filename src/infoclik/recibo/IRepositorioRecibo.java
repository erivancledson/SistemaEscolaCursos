package infoclik.recibo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */
public interface IRepositorioRecibo {
     public void Cadastrar(Recibo recibo) throws  SQLException, CampoObrigatorioException;
	public Recibo procurarId(int id_aluno) throws ReciboNaoEncontradoException, SQLException, CampoObrigatorioException;
        
        public Recibo procurarNome(String nome) throws ReciboNaoEncontradoException, SQLException, CampoObrigatorioException;
       
	public void atualizar(Recibo recibo)throws ReciboNaoEncontradoException, SQLException, CampoObrigatorioException;
	public void removerId(int id_aluno)throws ReciboNaoEncontradoException, SQLException, CampoObrigatorioException;
        
	
        public ArrayList<Recibo> listar()throws SQLException;
        public ArrayList<Recibo> listar(String complemento)throws SQLException;
   
}
