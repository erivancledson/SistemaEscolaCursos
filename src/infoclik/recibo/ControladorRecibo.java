package infoclik.recibo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */
public class ControladorRecibo {
     private IRepositorioRecibo repositorioRecibo;
	
	
	public ControladorRecibo() throws Exception {
		this.repositorioRecibo = new RepositorioReciboBDR();
		
	}
	
	public void cadastrar(Recibo recibo) throws  CampoObrigatorioException, SQLException, ReciboNaoEncontradoException{
		
		if(recibo.getNome().equals("") == true) throw new CampoObrigatorioException();
		
		
		
		
		this.repositorioRecibo.Cadastrar(recibo);
		
	
	}
	
	public void removerId(int id_aluno) throws  ReciboNaoEncontradoException, SQLException, CampoObrigatorioException{
				Recibo recibo = null;
		
		
		recibo = this.repositorioRecibo.procurarId(id_aluno);
		
		
		this.repositorioRecibo.removerId(id_aluno);
		
	}
        
        
        
        
        public Recibo procurarId(int id_aluno) throws  ReciboNaoEncontradoException, SQLException, CampoObrigatorioException{
		
		return this.repositorioRecibo.procurarId(id_aluno);
		
	}
        
        public Recibo procurarNome(String nome) throws  ReciboNaoEncontradoException, SQLException, CampoObrigatorioException{
		
		return this.repositorioRecibo.procurarNome(nome);
		
	}
	

	public void atualizar(Recibo recibo) throws ReciboNaoEncontradoException, SQLException,  CampoObrigatorioException{
		
		if(recibo.getNome().equals("") == true) throw new CampoObrigatorioException();
		
		this.repositorioRecibo.atualizar(recibo);
	}
        
        
       

	public ArrayList<Recibo> listar() throws SQLException{
		return this.repositorioRecibo.listar();
	}

}
