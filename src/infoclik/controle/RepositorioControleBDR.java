package infoclik.controle;

import infoclik.util.Conexao;
import infoclik.util.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */
public class RepositorioControleBDR  implements IRepositorioControle{

	
private Connection conectar = null;
	
	
	
	public RepositorioControleBDR() throws Exception {

		this.conectar = Conexao.getConnection(Database.POSTGRESQL);
	}
	
	
	@Override
	public void Cadastrar(Controle controle)
			throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql;
		if(controle != null){
			try{
				sql = "insert into controle(nome_aluno, curso, apostila, data_entre, media, frequencia, data_desistencia, motivo, id_aluno) " +
						"values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
				stmt = this.conectar.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				stmt.setString(1, controle.getNome_aluno());
				stmt.setString(2, controle.getCurso());
				stmt.setString(3, controle.getApostila());
				stmt.setString(4, controle.getData_entre());
				stmt.setString(5, controle.getMedia());
				stmt.setString(6, controle.getFrequencia());
				stmt.setString(7, controle.getData_desistencia());
				stmt.setString(8, controle.getMotivo());;
				stmt.setInt(9, controle.getId_aluno());
			
				rs = stmt.getGeneratedKeys();
				stmt.execute();
				int pagamentoId = 0;
				while(rs.next()){
					controle.getId_controle();
				}
				
			}finally{
				stmt.close();
				rs.close();
			}
                }
		}
                
     @Override
	public Controle procurarId(int id_aluno) throws ControleNaoEncontradoException, SQLException, CampoObrigatorioException {
		Controle controle = null;
		String complemento = " and controle.id_aluno = " + id_aluno;
		ArrayList<Controle> Controle = this.listar(complemento);
		if(Controle.isEmpty()){
			throw new ControleNaoEncontradoException();
		}
		return Controle.get(0);
	}
        
        
        
       @Override
	public Controle procurarNome(String nome)
			throws ControleNaoEncontradoException, SQLException {
		Controle controle = null;
		String complemento = " and controle.nome_aluno like '%" + nome + "%'";
		ArrayList<Controle> Controle = this.listar(complemento);
		if(Controle.isEmpty()){
			throw new ControleNaoEncontradoException();
		}
		return Controle.get(0);
	} 
        

     @Override
	public void removerId(int id_aluno) throws ControleNaoEncontradoException,
			SQLException {
			PreparedStatement stmt = null;
			try{
				String sql ="delete from controle where id_aluno = ?" ;
				stmt = this.conectar.prepareStatement(sql);
				stmt.setInt(1, id_aluno);
				stmt.execute();
			}finally{
				stmt.close();
			}
		
	}
        
        
        
        @Override
	public ArrayList<Controle> listar(String complemento) throws SQLException {
		PreparedStatement stmt = null;
		ArrayList<Controle> controle = new ArrayList<Controle>();
		String sql = "";
		ResultSet rs = null;
		try{
			sql += "select * from controle";
			sql += " where id_controle is not null";
			sql += complemento;
			stmt = this.conectar.prepareStatement(sql);
			rs = stmt.executeQuery();

			while(rs.next()){
				Controle controles = new Controle(rs.getInt("id_controle"), rs.getString("nome_aluno"), rs.getString("curso"), rs.getString("apostila"), rs.getString("data_entre"), rs.getString("media"), rs.getString("frequencia"), rs.getString("data_desistencia"), rs.getString("motivo"), rs.getInt("id_aluno"));
				
				
				
				
				
				controle.add(controles);
				
            
			}
		}finally{
			stmt.close();
			rs.close();
		}
		
		return controle;

}
        
        
         @Override
	public ArrayList<Controle> listar() throws SQLException {
		PreparedStatement stmt = null;
		ArrayList<Controle> controle = new ArrayList<Controle>();
		String sql = "";
		ResultSet rs = null;
		try{
			sql += "select * from controle";
			sql += " where id_controle is not null";
			stmt = this.conectar.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()){
				Controle controles = new Controle(rs.getInt("id_controle"), rs.getString("nome_aluno"), rs.getString("curso"), rs.getString("apostila"), rs.getString("data_entre"), rs.getString("media"), rs.getString("frequencia"), rs.getString("data_desistencia"), rs.getString("motivo"), rs.getInt("id_aluno"));

				
				
				
				
				
				
		         controle.add(controles);
				
            
			}
		}finally{
			stmt.close();
			rs.close();
		}
		
		return controle;
	}

         @Override
	public void atualizar(Controle controle)
			throws ControleNaoEncontradoException, SQLException {
		PreparedStatement stmt = null;
		try{
			if(controle != null){
				String sql = "update controle set nome_aluno = ?, curso = ?, apostila = ?, "
						+ "data_entre = ?, media = ?,  frequencia = ?, data_desistencia = ?, motivo = ?";
						
				sql += " where id_aluno = ?";
				stmt = this.conectar.prepareStatement(sql);
				stmt.setString(1, controle.getNome_aluno());
				stmt.setString(2, controle.getCurso());
				stmt.setString(3, controle.getApostila());
				stmt.setString(4, controle.getData_entre());
				stmt.setString(5, controle.getMedia());
				stmt.setString(6, controle.getFrequencia());
				stmt.setString(7, controle.getData_desistencia());
				stmt.setString(8, controle.getMotivo());
				stmt.setInt(9, controle.getId_aluno());
				;
				Integer resultado = stmt.executeUpdate();
				
				if(resultado == 0){
					throw new ControleNaoEncontradoException();
				}
			}
			
		}finally{
			stmt.close();
		}
		
	}
	
}
