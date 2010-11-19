/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on 12/11/2010, 12:40:25 AM
 */

package analizadorlexico;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edison
 */
public class MainFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        analizadorLexico = new analizadorlexico.AnalizadorLexico();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Lexico");

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        txtEntrada.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtEntradaCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(txtEntrada);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 304, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 452, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane2, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEntradaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtEntradaCaretUpdate
        analizadorLexico.crearTokens(txtEntrada.getText());
        List<Lexico> lista =analizadorLexico.getLexicos();
        Object datos [][] = new Object[lista.size()][2];
        for (int i = 0; i < datos.length; i++) {
            datos[i][0]=lista.get(i).getToken();
            datos[i][1]=lista.get(i).getLexema();
        }
        tabla.setModel(new DefaultTableModel(
            datos,
            new String [] {
                "Tokens", "Lexema"
            }
        ));
    }//GEN-LAST:event_txtEntradaCaretUpdate

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private analizadorlexico.AnalizadorLexico analizadorLexico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtEntrada;
    // End of variables declaration//GEN-END:variables

}