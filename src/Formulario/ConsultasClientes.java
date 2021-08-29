
package Formulario;

import claseConectar.conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Perez
 */
public class ConsultasClientes extends javax.swing.JInternalFrame {
 
    public ConsultasClientes() {
        initComponents();
        txtdni.setEnabled(false);
        Cargarlistaclientes();
    }
    void Cargarlistaclientes()          
    {
        DefaultTableModel modelo= new DefaultTableModel();
        String []Titulos = {"Codigo", "Nombre", "Apellido", "DNI", "Direccion", "Notas", "Tipo", "Telefono"};
        modelo.setColumnIdentifiers(Titulos);
         this.tbclientes.setModel(modelo);
        try {
            
            String ConsultaSQL="SELECT * FROM cliente";
        
            String []Registros= new String[8];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                Registros[0] = rs.getString("cod_cli");
                Registros[1] = rs.getString("nom_cli");
                Registros[2] = rs.getString("ape_cli");
                Registros[3] = rs.getString("dni_cli");
                Registros[4] = rs.getString("dir_cli");
                Registros[5] = rs.getString("not_cli");
                Registros[6] = rs.getString("tip_cli");
                Registros[7] = rs.getString("tel_cli");
                
                modelo.addRow(Registros);
                                
            }
            tbclientes.setModel(modelo);
            txtcant.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdgenero = new javax.swing.JRadioButton();
        rddni = new javax.swing.JRadioButton();
        rdtodo = new javax.swing.JRadioButton();
        txtdni = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        txtnom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de clientes");

        buttonGroup1.add(rdgenero);
        rdgenero.setSelected(true);
        rdgenero.setText("Mostrar clientes por nombres:");
        rdgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdgeneroActionPerformed(evt);
            }
        });

        buttonGroup1.add(rddni);
        rddni.setText("Buscar Clientes por DNI:");
        rddni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rddniActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdtodo);
        rdtodo.setText("Mostrar todos los clientes");
        rdtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdtodoActionPerformed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/set-1/search.gif"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rddni)
                        .addGap(24, 24, 24)
                        .addComponent(txtdni, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdtodo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdgenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnom)))
                .addGap(10, 10, 10)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdgenero)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rddni)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdtodo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnbuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbclientes);

        jLabel1.setText("Cantidad de Registros");

        txtcant.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void rdgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdgeneroActionPerformed
// TODO add your handling code here:
    if(rdgenero.isSelected()==true)
    {
        
       
        txtnom.setEnabled(true);
        txtdni.setEnabled(false);
        txtdni.setText("");
    }
}//GEN-LAST:event_rdgeneroActionPerformed

private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
// TODO add your handling code here:
   String nom= txtnom.getText();
   String dni=txtdni.getText();
   
   if(rdgenero.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"Codigo", "Nombre", "Apellido", "DNI", "Direccion", "Notas", "Tipo", "Telefono"};
       modelo.setColumnIdentifiers(Titulos);
       this.tbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM cliente WHERE nom_cli='"+nom+"'";
        
            String []Registros= new String[8];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                Registros[0] = rs.getString("cod_cli");
                Registros[1] = rs.getString("nom_cli");
                Registros[2] = rs.getString("ape_cli");
                Registros[3] = rs.getString("dni_cli");
                Registros[4] = rs.getString("dir_cli");
                Registros[5] = rs.getString("not_cli");
                Registros[6] = rs.getString("tip_cli");
                Registros[7] = rs.getString("tel_cli");
                
                modelo.addRow(Registros);
                                
            }
            tbclientes.setModel(modelo);
            txtcant.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   if(rddni.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"Codigo", "Nombre", "Apellido", "DNI", "Direccion", "Notas", "Tipo", "Telefono"};
       modelo.setColumnIdentifiers(Titulos);
       this.tbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM cliente WHERE dni_cli='"+dni+"'";
        
            String []Registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
               Registros[0] = rs.getString("cod_cli");
                Registros[1] = rs.getString("nom_cli");
                Registros[2] = rs.getString("ape_cli");
                Registros[3] = rs.getString("dni_cli");
                Registros[4] = rs.getString("dir_cli");
                Registros[5] = rs.getString("not_cli");
                Registros[6] = rs.getString("tip_cli");
                Registros[7] = rs.getString("tel_cli");
                modelo.addRow(Registros);
                                
            }
            tbclientes.setModel(modelo);
            txtcant.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
   }
   if(rdtodo.isSelected()==true)
   {
       Cargarlistaclientes();
   }
   
}//GEN-LAST:event_btnbuscarActionPerformed

private void rddniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rddniActionPerformed
// TODO add your handling code here:
    if(rddni.isSelected()==true)
    {
       txtnom.setEnabled(false);
        txtdni.setEnabled(true);
        txtdni.requestFocus();
    }
}//GEN-LAST:event_rddniActionPerformed

private void rdtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtodoActionPerformed
// TODO add your handling code here:
    Cargarlistaclientes();
    txtdni.setText("");
    txtdni.setEnabled(false);
}//GEN-LAST:event_rdtodoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rddni;
    private javax.swing.JRadioButton rdgenero;
    private javax.swing.JRadioButton rdtodo;
    private javax.swing.JTable tbclientes;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
conectar cc= new conectar();
Connection cn = cc.conexion();


}
