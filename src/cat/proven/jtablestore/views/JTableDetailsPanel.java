/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.jtablestore.views;

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
public class JTableDetailsPanel extends JPanel {
    
    
    private final Store model;
    
    private JLabel labelCode;
    private JLabel labelName;
    private JLabel labelPrice;
    
    private JTextField txtCode;
    private JTextField txtName;
    private JTextField txtPrice;
    
    private JButton sendButton;
    
    public JTableDetailsPanel(Store model) {
        this.model = model;
        initComponents();
    }
    
    
    private void initComponents() {
        
        txtCode = new JTextField(20);
        txtName = new JTextField(20);
        txtPrice = new JTextField(20);
        
        labelCode = new JLabel("Code: ");
        labelName = new JLabel("Name: ");
        labelPrice = new JLabel("Price: ");
        
        sendButton = new JButton("Aceptar");
        
        setLayout(new GridLayout(4, 2));
        add(labelCode);add(txtCode);
        add(labelName);add(txtName);
        add(labelPrice);add(txtPrice);
        add(new JLabel(""));add(sendButton);
    
    }
    
    
}
