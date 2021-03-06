/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author Saul Lamas
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SalirExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        RegistrarPago = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        BuscarPorCasa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");

        SalirExit.setText("Salir");
        SalirExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirExitActionPerformed(evt);
            }
        });
        jMenu1.add(SalirExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agregar");

        RegistrarPago.setText("Registrar Pago");
        RegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarPagoActionPerformed(evt);
            }
        });
        jMenu2.add(RegistrarPago);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Buscar");

        BuscarPorCasa.setText("Buscar por Casa");
        BuscarPorCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPorCasaActionPerformed(evt);
            }
        });
        jMenu3.add(BuscarPorCasa);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //metodo que cierra el programa
    private void SalirExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirExitActionPerformed

    //Metodo que abre el form pagos
    private void RegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarPagoActionPerformed
        PagosForm pf = new PagosForm();
        CentrarForm(pf);
    }//GEN-LAST:event_RegistrarPagoActionPerformed

    private void BuscarPorCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPorCasaActionPerformed
        BuscarCasaForm bf = new BuscarCasaForm();
        CentrarForm(bf);
    }//GEN-LAST:event_BuscarPorCasaActionPerformed

    void CentrarForm(JInternalFrame frame){
        VentanaPrincipal.add(frame);
        Dimension tam = VentanaPrincipal.getSize();
        Dimension tamFrame = frame.getSize();
        frame.setLocation((tam.width - tamFrame.width)/2,(tam.height - tamFrame.height)/2);
        frame.show();
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscarPorCasa;
    private javax.swing.JMenuItem RegistrarPago;
    private javax.swing.JMenuItem SalirExit;
    private javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
