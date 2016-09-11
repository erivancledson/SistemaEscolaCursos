/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoclik.recibo;

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
public class RepositorioReciboBDR implements IRepositorioRecibo{

	
private Connection conectar = null;
	
	
	
	public RepositorioReciboBDR() throws Exception {

		this.conectar = Conexao.getConnection(Database.POSTGRESQL);
	}
	
	
	@Override
	public void Cadastrar(Recibo recibo)
			throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql;
		if(recibo != null){
			try{
				sql = "insert into recibo(valor, nome, importancia, referente, data, id_aluno)" +
						"values (?, ?, ?, ?, ?, ?)";
				stmt = this.conectar.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				
				stmt.setString(1, recibo.getValor());
				stmt.setString(2, recibo.getNome());
				stmt.setString(3, recibo.getImportancia());
				stmt.setString(4, recibo.getReferente());
				stmt.setString(5, recibo.getData());
			        stmt.setInt(6, recibo.getId_aluno());
			
				rs = stmt.getGeneratedKeys();
				stmt.execute();
				int reciboId = 0;
				while(rs.next()){
					recibo.getId_recibo();
				}
				
			}finally{
				stmt.close();
				rs.close();
			}
                }
		}
                
         @Override
	public Recibo procurarId(int id_aluno) throws ReciboNaoEncontradoException, SQLException, CampoObrigatorioException {
		Recibo recibo = null;
		String complemento = " and recibo.id_aluno = " + id_aluno;
		ArrayList<Recibo> Recibo = this.listar(complemento);
		if(Recibo.isEmpty()){
			throw new ReciboNaoEncontradoException();
		}
		return Recibo.get(0);
	}
        
        
        
       @Override
	public Recibo procurarNome(String nome)
			throws ReciboNaoEncontradoException, SQLException {
		Recibo recibo = null;
		String complemento = " and recibo.nome like '%" + nome + "%'";
		ArrayList<Recibo> Recibo = this.listar(complemento);
		if(Recibo.isEmpty()){
			throw new ReciboNaoEncontradoException();
		}
		return Recibo.get(0);
	}
        
        
        
     @Override
	public void removerId(int id_aluno) throws ReciboNaoEncontradoException,
			SQLException {
			PreparedStatement stmt = null;
			try{
				String sql ="delete from recibo where id_aluno = ?" ;
				stmt = this.conectar.prepareStatement(sql);
				stmt.setInt(1, id_aluno);
				stmt.execute();
			}finally{
				stmt.close();
			}
		
	}
        
        
                @Override
	public ArrayList<Recibo> listar(String complemento) throws SQLException {
		PreparedStatement stmt = null;
		ArrayList<Recibo> recibo = new ArrayList<Recibo>();
		String sql = "";
		ResultSet rs = null;
		try{
			sql += "select * from recibo";
			sql += " where id_recibo is not null";
			sql += complemento;
			stmt = this.conectar.prepareStatement(sql);
			rs = stmt.executeQuery();

			while(rs.next()){
				Recibo recibos = new Recibo(rs.getInt("id_recibo"), rs.getInt("id_aluno"), rs.getString("valor"), rs.getString("nome"), rs.getString("importancia"), rs.getString("referente"), rs.getString("data"));
				
				
				
				
				
				recibo.add(recibos);
				
            
			}
		}finally{
			stmt.close();
			rs.close();
		}
		
		return recibo;

}
  @Override
	public ArrayList<Recibo> listar() throws SQLException {
		PreparedStatement stmt = null;
		ArrayList<Recibo> recibo = new ArrayList<Recibo>();
		String sql = "";
		ResultSet rs = null;
		try{
			sql += "select * from recibo";
			sql += " where id_recibo is not null";
			stmt = this.conectar.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()){
				Recibo recibos = new Recibo(rs.getInt("id_recibo"), rs.getInt("id_aluno"), rs.getString("valor"), rs.getString("nome"), rs.getString("importancia"), rs.getString("referente"), rs.getString("data"));
				
				
				
				
				
				recibo.add(recibos);
				
            
			}
		}finally{
			stmt.close();
			rs.close();
		}
		
		return recibo;

}

         @Override
	public void atualizar(Recibo recibo)
			throws ReciboNaoEncontradoException, SQLException {
		PreparedStatement stmt = null;
		try{
			if(recibo != null){
				String sql = "update recibo set valor = ?, nome = ?, importancia = ?, "
						+ "referente = ?, data = ?";
						
				sql += " where id_aluno = ?";
				stmt = this.conectar.prepareStatement(sql);
				
				stmt.setString(1, recibo.getValor());
				stmt.setString(2, recibo.getNome());
				stmt.setString(3, recibo.getImportancia());
				stmt.setString(4, recibo.getReferente());
				stmt.setString(5, recibo.getData());
				stmt.setInt(6, recibo.getId_aluno());
				
				Integer resultado = stmt.executeUpdate();
				
				if(resultado == 0){
					throw new ReciboNaoEncontradoException();
				}
			}
			
		}finally{
			stmt.close();
		}
		
	}

}
