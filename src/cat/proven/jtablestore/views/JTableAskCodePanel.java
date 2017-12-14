/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.jtablestore.views;

import cat.proven.jtablestore.controllers.Controller;
import cat.proven.jtablestore.model.Store;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class JTableAskCodePanel extends JPanel {
    
    
    //askCodePanel = new JTableAskCodePanel(model);
    //pane.add(askCodePanel, BorderLayout.CENTER);
    
    
    private final Controller controller;
    
    private JLabel labelCode;
    
    private JTextField txtCode;
    
    private JButton sendButton;
    
    public JTableAskCodePanel(Controller controller) {
        this.controller = controller;
        initComponents();
    }
    
    
    private void initComponents() {
        
        txtCode = new JTextField(20);
        
        labelCode = new JLabel("Introduce code to search: ");
        
        setLayout(new GridLayout(3, 3));
        add(labelCode);add(txtCode);
    
    }
    
    
}
