package infoclik.controle;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */
public interface IRepositorioControle {
    public void Cadastrar(Controle controle) throws  SQLException, CampoObrigatorioException;
	public Controle procurarId(int id_aluno) throws ControleNaoEncontradoException, SQLException, CampoObrigatorioException;
        
        public Controle procurarNome(String nome) throws ControleNaoEncontradoException, SQLException, CampoObrigatorioException;
       
	public void atualizar(Controle controle)throws ControleNaoEncontradoException, SQLException, CampoObrigatorioException;
	public void removerId(int id_aluno)throws ControleNaoEncontradoException, SQLException, CampoObrigatorioException;
        
	
        public ArrayList<Controle> listar()throws SQLException;
        public ArrayList<Controle> listar(String complemento)throws SQLException;
       
}
