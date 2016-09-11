/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoclik.controle;

import infoclik.fachada.Fachada;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Cledson
 */
public class TelaProcurarControleId extends javax.swing.JFrame {

    public JFrame frmBuscarControle;

    Fachada fachada;
    Controle controle;

    /**
     * Creates new form TelaCadastroControle
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaProcurarControleId frame = new TelaProcurarControleId();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TelaProcurarControleId() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCurso = new javax.swing.JLabel();
        jTextFieldCurso = new javax.swing.JTextField();
        jLabelApostila = new javax.swing.JLabel();
        jTextFieldApostila = new javax.swing.JTextField();
        jLabelData_entre = new javax.swing.JLabel();
        jTextFieldData_entre = new javax.swing.JTextField();
        jLabelMedia = new javax.swing.JLabel();
        jTextFieldMedia = new javax.swing.JTextField();
        jLabelFrequencia = new javax.swing.JLabel();
        jTextFieldFrequencia = new javax.swing.JTextField();
        jLabelData_desistencia = new javax.swing.JLabel();
        jTextFieldData_desistencia = new javax.swing.JTextField();
        jLabelMotivo = new javax.swing.JLabel();
        jTextFieldMotivo = new javax.swing.JTextField();
        jLabelId_aluno = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jLabelId_aluno1 = new javax.swing.JLabel();
        jTextFieldId_Aluno = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procurar Controle por código");

        jLabelNome.setText("Nome:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelCurso.setText("Curso:");

        jLabelApostila.setText("Apostila:");

        jLabelData_entre.setText("Data Entrega:");

        jLabelMedia.setText("Média:");

        jLabelFrequencia.setText("Frequência:");

        jLabelData_desistencia.setText("Data Desistência:");

        jTextFieldData_desistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldData_desistenciaActionPerformed(evt);
            }
        });

        jLabelMotivo.setText("Motivo:");

        jTextFieldMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMotivoActionPerformed(evt);
            }
        });

        jLabelId_aluno.setText("Código do aluno:");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabelId_aluno1.setText("Código do aluno:");

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFrequencia)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelId_aluno1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelData_entre)
                                    .addComponent(jLabelCurso)
                                    .addComponent(jLabelNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldData_entre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelApostila)
                                                    .addComponent(jLabelMedia))
                                                .addGap(60, 60, 60)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldApostila, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelData_desistencia)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldData_desistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMotivo)
                        .addGap(39, 39, 39)
                        .addComponent(jTextFieldMotivo)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelId_aluno)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldId_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtualizar)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId_aluno1)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApostila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApostila)
                    .addComponent(jLabelCurso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData_entre)
                    .addComponent(jTextFieldData_entre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMedia)
                    .addComponent(jTextFieldMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFrequencia)
                    .addComponent(jTextFieldFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelData_desistencia)
                    .addComponent(jTextFieldData_desistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMotivo)
                    .addComponent(jTextFieldMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId_aluno)
                    .addComponent(jTextFieldId_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAtualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldData_desistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldData_desistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldData_desistenciaActionPerformed

    private void jTextFieldMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMotivoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed

        try {

            String nome = jTextFieldNome.getText();
            Fachada fachada = Fachada.getInstance();
            Controle controle = fachada.controleProcurarNome(nome);

            controle.setNome_aluno(jTextFieldNome.getText());
            controle.setCurso(jTextFieldCurso.getText());
            controle.setApostila(jTextFieldApostila.getText());
            controle.setData_entre(jTextFieldData_entre.getText());
            controle.setMedia(jTextFieldMedia.getText());
            controle.setFrequencia(jTextFieldFrequencia.getText());
            controle.setData_desistencia(jTextFieldData_desistencia.getText());
            controle.setMotivo(jTextFieldMotivo.getText());

            fachada.controleAtualizar(controle);

        } catch (ControleNaoEncontradoException e1) {
            JOptionPane.showMessageDialog(frmBuscarControle, e1.getMessage(), " ERRO ", JOptionPane.ERROR_MESSAGE);
        } catch (infoclik.controle.CampoObrigatorioException e1) {
            JOptionPane.showMessageDialog(frmBuscarControle, e1.getMessage(), " ERRO ", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            Logger.getLogger(TelaProcurarControleId.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        String id_aluno = jTextFieldCodigo.getText();

        try {

            Fachada.getInstance().controleProcurarId(Integer.parseInt(id_aluno));
            Fachada fachada = Fachada.getInstance();
            Controle temp = fachada.controleProcurarId(Integer.parseInt(id_aluno));

            jTextFieldNome.setText(temp.getNome_aluno());
            jTextFieldCurso.setText(temp.getCurso());
            jTextFieldApostila.setText(temp.getApostila());
            jTextFieldData_entre.setText(temp.getData_entre());
            jTextFieldMedia.setText(temp.getMedia());
            jTextFieldFrequencia.setText(temp.getFrequencia());
            jTextFieldData_desistencia.setText(temp.getData_desistencia());
            jTextFieldMotivo.setText(temp.getMotivo());
            jTextFieldId_Aluno.setText(Integer.toString(temp.getId_aluno()));

        } catch (ControleNaoEncontradoException | infoclik.controle.CampoObrigatorioException e1) {
            JOptionPane.showMessageDialog(frmBuscarControle, e1.getMessage(), " ERRO ", JOptionPane.ERROR_MESSAGE);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
    }//GEN-LAST:event_jButtonPesquisarActionPerformed
    }
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
         int resultado = JOptionPane.showConfirmDialog(frmBuscarControle, "Deseja Excluir?\n" +jTextFieldCodigo.getText(),"Excluir",JOptionPane.YES_NO_CANCEL_OPTION);
				if(resultado == JOptionPane.YES_OPTION){
					try {
						String id_aluno = jTextFieldCodigo.getText();
						Fachada.getInstance().controleRemoverId(Integer.parseInt(id_aluno));
						Fachada fachada = Fachada.getInstance();
						JOptionPane.showMessageDialog(frmBuscarControle, "Removido com Sucesso!");
			
						
					
					} catch (ControleNaoEncontradoException e1){
						JOptionPane.showMessageDialog(frmBuscarControle, e1.getMessage(), " ERRO ", JOptionPane.ERROR_MESSAGE);
					} catch (infoclik.controle.CampoObrigatorioException e1) {
						JOptionPane.showMessageDialog(frmBuscarControle, e1.getMessage(), " ERRO " , JOptionPane.ERROR_MESSAGE);
					}catch (Exception e1){
						JOptionPane.showMessageDialog(frmBuscarControle, e1.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
					} 
                                
				}

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelApostila;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelData_desistencia;
    private javax.swing.JLabel jLabelData_entre;
    private javax.swing.JLabel jLabelFrequencia;
    private javax.swing.JLabel jLabelId_aluno;
    private javax.swing.JLabel jLabelId_aluno1;
    private javax.swing.JLabel jLabelMedia;
    private javax.swing.JLabel jLabelMotivo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JTextField jTextFieldApostila;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldData_desistencia;
    private javax.swing.JTextField jTextFieldData_entre;
    private javax.swing.JTextField jTextFieldFrequencia;
    private javax.swing.JTextField jTextFieldId_Aluno;
    private javax.swing.JTextField jTextFieldMedia;
    private javax.swing.JTextField jTextFieldMotivo;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
 jTextFieldNome.setText("");
 jTextFieldCurso.setText("");
 jTextFieldApostila.setText("");
 jTextFieldData_entre.setText("");
 jTextFieldMedia.setText("");
 jTextFieldFrequencia.setText("");
 jTextFieldData_desistencia.setText("");
 jTextFieldMotivo.setText("");
 jTextFieldId_Aluno.setText("");
 jTextFieldCodigo.setText("");
    }
}