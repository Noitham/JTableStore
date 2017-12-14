/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.jtablestore.views;

import cat.proven.jtablestore.controllers.Controller;
import cat.proven.jtablestore.model.Store;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumne
 */
public class JTableProductTablePanel extends JPanel {
    
    private final Store model;
    private final Controller controller;
    private JTable table;

    public JTableProductTablePanel(Store model, Controller controller) {
        this.model = model;
        this.controller = controller;
        //model.loadData();
        initComponents();
    }  
    
    private void initComponents() {
        setLayout(new BorderLayout());
        table = new ProductTable(model);
        JScrollPane scrollPane = new JScrollPane(table);     
        add(scrollPane, BorderLayout.CENTER);
    }
    
}
   
