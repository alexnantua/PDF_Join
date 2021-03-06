package Tela;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alexnantua
 */
public class Split extends javax.swing.JFrame {

    /**
     * Creates new form Split
     */
    public Split() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pdf1 = new javax.swing.JLabel();
        pdf1_Text = new javax.swing.JTextField();
        Procurar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PagInicial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PagFinal = new javax.swing.JTextField();
        DIVIDIR = new javax.swing.JButton();
        saida = new javax.swing.JLabel();
        saida_Text = new javax.swing.JTextField();
        Procurar_Saida = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        LIMPAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SPLIT - PDF EDITOR - V.1.0 - By. Alexandre Nântua");

        pdf1.setText("PDF");

        Procurar1.setText("PROCURAR");
        Procurar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Página Inicial:");

        jLabel2.setText("Página Final:");

        DIVIDIR.setText("DIVIDIR");
        DIVIDIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVIDIRActionPerformed(evt);
            }
        });

        saida.setText("SAÍDA");

        Procurar_Saida.setText("PROCURAR");
        Procurar_Saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar_SaidaActionPerformed(evt);
            }
        });

        LIMPAR.setText("LIMPAR");
        LIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LIMPAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DIVIDIR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saida_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procurar_Saida))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdf1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PagInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PagFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pdf1_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Procurar1)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf1)
                    .addComponent(pdf1_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PagInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(PagFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saida)
                    .addComponent(saida_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar_Saida))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIVIDIR)
                    .addComponent(LIMPAR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Procurar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar1ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser fc = getFileChooser();
        fc.setFileFilter(filter);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            setLastDir(fc.getSelectedFile());
            File arquivo = fc.getSelectedFile();
            pdf1_Text.setText(arquivo.getPath());
            
        } else {
            pdf1_Text.setText("");
        }
    }//GEN-LAST:event_Procurar1ActionPerformed

    private void DIVIDIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVIDIRActionPerformed
        
        String user = System.getProperty("user.name");
        String nameFile = "-split.pdf";
        OutputStream output = null;
        String saidaEmpty = "C:/Users/" + user + "/Documents/" + nameFile;
        
        if (pdf1_Text.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum arquivo adicionado.");
        } else {
            
            if (PagInicial.getText().isEmpty() || PagFinal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Número de páginas não inserido.");
            } else {
                
                if (Integer.parseInt(PagInicial.getText()) > Integer.parseInt(PagFinal.getText())) {
                    JOptionPane.showMessageDialog(null, "Números de páginas invertidos.");
                } else {
                    
                    try {
                        
                        if (pdf1_Text.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum arquivo foi selecionado.");
                        } else {
                            if (saida_Text.getText().isEmpty()) {
                                saida_Text.setText(saidaEmpty);
                            } else {
                                saida_Text.setText(saida_Text.getText() + nameFile);
                            }
                        }
                        
                        splitPdfFile(new FileInputStream(pdf1_Text.getText()), new FileOutputStream(saida_Text.getText()), Integer.parseInt(PagInicial.getText()), Integer.parseInt(PagFinal.getText()));
                        
                        JOptionPane.showMessageDialog(null, "PDF gerado com sucesso em " + saida_Text.getText());
                        java.awt.Desktop.getDesktop().open(new File(saida_Text.getText()));
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Split.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(Split.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_DIVIDIRActionPerformed
    private void Procurar_SaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar_SaidaActionPerformed
        JFileChooser fc = getFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            setLastDir(fc.getSelectedFile());
            File arquivo = fc.getSelectedFile();
            saida_Text.setText(arquivo.getPath());
            
        } else {
            saida_Text.setText("");
        }
    }//GEN-LAST:event_Procurar_SaidaActionPerformed

    private void LIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPARActionPerformed
        pdf1_Text.setText("");
        saida_Text.setText("");
        PagInicial.setText("");
        PagFinal.setText("");
    }//GEN-LAST:event_LIMPARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Split.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Split.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Split.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Split.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Split().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DIVIDIR;
    private javax.swing.JButton LIMPAR;
    private javax.swing.JTextField PagFinal;
    private javax.swing.JTextField PagInicial;
    private javax.swing.JButton Procurar1;
    private javax.swing.JButton Procurar_Saida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pdf1;
    private javax.swing.JTextField pdf1_Text;
    private javax.swing.JLabel saida;
    private javax.swing.JTextField saida_Text;
    // End of variables declaration//GEN-END:variables

    static void splitPdfFile(InputStream inputPdf, OutputStream outputStream, int startPage, int endPage) throws Exception {
        //Create document and pdfReader objects.
        Document document = new Document();
        PdfReader pdfReader = new PdfReader(inputPdf);

        //Get total no. of pages in the pdf file.
        int totalPages = pdfReader.getNumberOfPages();

        //Check the startPage should not be greater than the endPage
        //and endPage should not be greater than total no. of pages.
        if (startPage > endPage || endPage > totalPages) {
            JOptionPane.showMessageDialog(null, "Números invertidos");
        } else {
            // Create writer for the outputStream
            PdfWriter writer = PdfWriter.getInstance(document, outputStream);

            //Open document
            document.open();

            //Contain the pdf data.
            PdfContentByte pdfContentByte = writer.getDirectContent();
            PdfImportedPage page;
            
            while (startPage <= endPage) {
                document.newPage();
                page = writer.getImportedPage(pdfReader, startPage);
                pdfContentByte.addTemplate(page, 0, 0);
                startPage++;
            }

            //Close document and outputStream.
            outputStream.flush();
            document.close();
            outputStream.close();
        }
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pdf.png")));
    }
    
    private static String lastDir = null;
    
    public static JFileChooser getFileChooser() {
        if (lastDir != null) {
            JFileChooser fc = new JFileChooser(lastDir);
            return fc;
        } else {
            JFileChooser fc = new JFileChooser();
            return fc;
        }
    }
    
    public static void setLastDir(File file) {
        lastDir = file.getParent();
    }
}
