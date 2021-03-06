/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rajur
 */
public class Personne extends javax.swing.JFrame {
    Connecter cnx = new Connecter ();
    Statement stmt;
    ResultSet rset;
    DefaultTableModel model = new DefaultTableModel ();
    /**
     * Creates new form Personne
     */
    public Personne() {
        initComponents();
        
    model.addColumn("personneID");
    model.addColumn("nom");
    model.addColumn("prenom");
    model.addColumn("type");
    try{
        stmt=cnx.obtenirconnexion().createStatement();
        ResultSet Rs=stmt.executeQuery("");
        while(Rs.next()){
            model.addRow(new Object[]{Rs.getString("personneID"),Rs.getString("nom"),Rs.getString("prenom"),
            Rs.getString("type")});
        }
        
    }catch(Exception e){System.err.println(e);}
    
    table.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtpr = new javax.swing.JTextField();
        txttype = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtrech = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("personneID  : ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 40, 90, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("nom  :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 100, 70, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("prenom :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 50, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("type : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 220, 60, 30);

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid);
        txtid.setBounds(130, 40, 70, 30);
        jPanel1.add(txtnom);
        txtnom.setBounds(130, 100, 70, 30);
        jPanel1.add(txtpr);
        txtpr.setBounds(130, 160, 70, 30);

        txttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Etudiant ", "Enseignant" }));
        jPanel1.add(txttype);
        txttype.setBounds(130, 210, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(81, 48, 290, 300);

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(47, 360, 90, 30);

        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(187, 360, 90, 30);

        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(327, 360, 100, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Modifier/ Ajouter / Supprimer les informations d'une Personne");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(157, 0, 502, 40);

        jButton4.setText("Rechercher (nom)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(347, 80, 170, 30);
        getContentPane().add(txtrech);
        txtrech.setBounds(577, 80, 90, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(417, 170, 390, 90);

        quitter.setText("Quitter");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        getContentPane().add(quitter);
        quitter.setBounds(697, 370, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void deplace (int i){
    try{
      txtid.setText(model.getValueAt(i,0).toString());  
      txtnom.setText(model.getValueAt(i,1).toString()); 
      txtpr.setText(model.getValueAt(i,2).toString()); 
      txttype.setSelectedItem(model.getValueAt(i,3).toString()); 
    }catch (Exception e){System.err.println(e);
    JOptionPane.showMessageDialog(null, "erreur de deplacement"+e.getLocalizedMessage());}
}
    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String personneID=txtid.getText();
        String nom=txtnom.getText();
        String prenom=txtpr.getText();
        String type=txttype.getSelectedItem().toString();
        
        /*String requete = "INSERT INTO trimestre(ID_tri,numero,debut,fin,id)+ VALUES('"
        +id_tri+"','"+numero+"','"+debut+"','"+fin+"','"+id+"')"; */
        try{
            stmt.executeUpdate("INSERT INTO personne(personneID,nom,prenom,type)VALUES('"+
                personneID+"','"+nom+"','"+prenom+"','"+type+"');");
            JOptionPane.showMessageDialog(null,"La personne a bien été ajoutée");
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            if(txtid.getText().length() != 0){
                stmt.executeUpdate("Delete From personne where personneID ="+txtid.getText());
                JOptionPane.showMessageDialog(null,"La personne a bien été supprimée");
            }
            else{JOptionPane.showMessageDialog(null,"Veuillez remplir le champ : ");}
        }catch(Exception e){JOptionPane.showMessageDialog(null,"erreur dans la suppression");}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            stmt.executeUpdate("UPDATE personne SET nom='"+txtnom.getText()+"',"
                + "prenom='"+txtpr.getText()+"',type='"+txttype.getSelectedItem().toString()+"',"
                + "id='"+txtid.getText()+"' WHERE personneID= "+txtid.getText());
            JOptionPane.showMessageDialog(null,"La personne a bien été modifiée");

        }catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de modification");
            System.err.println(e);}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            model.setRowCount(0);
            {
                rset = stmt.executeQuery("Select * From personne WHERE nom = '"+txtrech.getText()+"'");
            }while(rset.next()){
                Object[] personne = {rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4)};
                model.addRow(personne);
            }

            if (model.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Il n'y a pas de personne correspondant a votre recherche");
            }

        }catch(Exception e){JOptionPane.showMessageDialog(null,"erreur de recherche");}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try{
            int i =table.getSelectedRow();
            deplace(i);

        } catch(Exception e){JOptionPane.showMessageDialog(null,"erreur avec le tableau");}
    }//GEN-LAST:event_tableMouseClicked

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        if(evt.getSource()==quitter)
        {
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_quitterActionPerformed

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
            java.util.logging.Logger.getLogger(Personne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton quitter;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpr;
    private javax.swing.JTextField txtrech;
    private javax.swing.JComboBox<String> txttype;
    // End of variables declaration//GEN-END:variables
}
