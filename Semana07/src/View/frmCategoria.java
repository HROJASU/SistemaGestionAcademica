package View;

import Controller.CtrCategoria;
import Model.Categoria;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ListSelectionModel;

public class frmCategoria extends javax.swing.JInternalFrame {

    private int idCategoria = 0;

    public frmCategoria() {
        initComponents();

        this.listarCategoria();

        tabla_categoria.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        btn_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int seleccionarFila = tabla_categoria.getSelectedRow();
                if (seleccionarFila != -1) {
                    Object id = tabla_categoria.getValueAt(seleccionarFila, 0);
                    Object descripcion = tabla_categoria.getValueAt(seleccionarFila, 1);
                    Object estado = tabla_categoria.getValueAt(seleccionarFila, 2);
                    JOptionPane.showMessageDialog(null, "Seleccionar Row Data:\nID: "
                            + id + "\nDescripcion: " + descripcion
                            + "\nEstado: " + estado);
                    txtDescripcion.setText(descripcion.toString());
                    idCategoria = Integer.parseInt(id.toString());

                } else {
                    JOptionPane.showMessageDialog(null, "No Se Selecciono row .");
                }
            }

        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CtrCategoria ctrCat = new CtrCategoria();
                int seleccionarFila = tabla_categoria.getSelectedRow();
                if (seleccionarFila != -1) {
                    Object id = tabla_categoria.getValueAt(seleccionarFila, 0);
                    boolean res = ctrCat.Eliminar(Integer.parseInt(id.toString()));
                    if (res) {
                        listarCategoria();
                        JOptionPane.showMessageDialog(null, "Categoria Eliminado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Eliminar");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No Se Selecciono row .");
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_categoria = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Descripcion:");

        jLabel2.setText("Estado:");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");

        btnEliminar.setText("Eliminar");

        tabla_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_categoria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jRadioButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizar)))
                .addGap(12, 12, 12)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Categoria cat = new Categoria();
        CtrCategoria ctrCat = new CtrCategoria();
        if (txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Descripcion");
            txtDescripcion.requestFocus();
        } else {
            cat.setDescripcion(txtDescripcion.getText().trim().toString());
            cat.setEstado(0);

            //Actualizar
            if (idCategoria > 0) {
                cat.setId_categoria(idCategoria);
                if (ctrCat.Actualizar(cat)) {
                    txtDescripcion.setText("");
                    idCategoria = 0;
                    JOptionPane.showMessageDialog(null, "Se Actualizo Categoria.");
                    this.listarCategoria();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Actualizar.");
                }
            } else {
                if (ctrCat.Guardar(cat)) {
                    txtDescripcion.setText("");
                    JOptionPane.showMessageDialog(null, "Se Guardado Categoria.");
                    this.listarCategoria();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar.");
                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_categoria;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables

    //psvm
    public void listarCategoria() {
        CtrCategoria ctrCat = new CtrCategoria();
        List<Categoria> cat = ctrCat.listarCategoria();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Descripcion");
        model.addColumn("Estado");

        for (Categoria categoria : cat) {
            System.out.println("Lista: " + categoria.getDescripcion());
            Object[] rowData = {
                categoria.getId_categoria(),
                categoria.getDescripcion(),
                categoria.getEstado()
            };
            model.addRow(rowData);
        }

        tabla_categoria.setModel(model);
    }

}
