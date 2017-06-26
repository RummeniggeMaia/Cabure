package com.rjsoft.cabure.gui;

import com.rjsoft.cabure.controle.EmprestimoCtrl;
import com.rjsoft.cabure.modelo.Emprestimo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jrpmaia
 */
public class HomePanel extends javax.swing.JPanel {

    private EmprestimoCtrl ctrl;
    private String[] colunas;

    /**
     * Creates new form Home
     */
    public HomePanel(EmprestimoCtrl ctrl) {
        initComponents();
        this.ctrl = ctrl;
        colunas = new String[]{
            "Matrícula",
            "Nome",
            "Livro",
            "Quantidade",
            "Data de entrega",
            "Dias em atraso"
        };
//        DefaultTableCellRenderer dcr = new DefaultTableCellRenderer();
//        dcr.setHorizontalAlignment(SwingConstants.CENTER);
//        tabelaAtrasos.getColumnModel().getColumn(3).setCellRenderer(dcr);
//        tabelaAtrasos.getColumnModel().getColumn(4).setCellRenderer(dcr);
//        tabelaAtrasos.getColumnModel().getColumn(5).setCellRenderer(dcr);
    }

    public void carregarEmprestimosAtrasados() {
        List<Emprestimo> atrasados = ctrl.pesquisarAtrasados();
        Object[][] data = new Object[atrasados.size()][colunas.length];
        for (int i = 0; i < atrasados.size(); i++) {
            Emprestimo e = atrasados.get(i);
            data[i][0] = e.getAluno().getMatricula();
            data[i][1] = e.getAluno().getNome();
            data[i][2] = e.getLivro().getTitulo();
            data[i][3] = e.getQuantidade();
            Date prazo = e.getPrazo();
            data[i][4] = new SimpleDateFormat("dd/MM/yyyy").format(prazo);
            long mils = new Date().getTime() - prazo.getTime();
            data[i][5] = mils / 1000 / 60 / 60 / 24;
        }
        DefaultTableModel dtm = new DefaultTableModel(data, colunas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tabelaAtrasos.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAtrasos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        tabelaAtrasos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Livro", "Quantidade", "Data de entrega", "Dias em atraso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAtrasos.setToolTipText("");
        jScrollPane1.setViewportView(tabelaAtrasos);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de pessoas em atraso na entrega de Livros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAtrasos;
    // End of variables declaration//GEN-END:variables
}
