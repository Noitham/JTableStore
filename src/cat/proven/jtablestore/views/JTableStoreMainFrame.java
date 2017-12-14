/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.jtablestore.views;

import cat.proven.jtablestore.controllers.Controller;
import cat.proven.jtablestore.model.Product;
import cat.proven.jtablestore.model.Store;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * @author alumne
 */
public class JTableStoreMainFrame extends JFrame implements ActionListener {

    private final Store model;
    private final Controller controller;
    
    private JTableDetailsPanel detailsPanel;
    private WelcomePanel welcomePanel;
    private JTableAskCodePanel askCodePanel;
    private JTableProductTablePanel productPanel;

    private final String aboutMessage;


    public JTableStoreMainFrame(Controller controller, Store model) {
        this.controller = controller;
        this.model = model;
        aboutMessage = "<html><p>Store GUI Application</p><p>(c) DanielSoft 2017</p></html>";
        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("JTable Store");

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                exitApplication();
            }
        });

        //getContentPane().add( new JTableStoreTablePanel(data) );+


        JMenuBar menuBar = buildMenuBar();
        setJMenuBar(menuBar);

        Container pane = this.getContentPane();
        pane.setLayout(new BorderLayout());
        //welcomePanel = new WelcomePanel(this);
        //pane.add(welcomePanel, BorderLayout.CENTER);
        detailsPanel = new JTableDetailsPanel(model);
        pane.add(detailsPanel, BorderLayout.CENTER);

        //productPanel = new JTableProductTablePanel(model, controller);
        //pane.add(productPanel, BorderLayout.CENTER);


        this.setLocationRelativeTo(null);
        setSize(400, 300);
        setVisible(true);
    }

    private JMenuBar buildMenuBar() {

        JMenuBar menuBar = new JMenuBar();
        JMenu menu;
        JMenuItem item;

        menu = new JMenu("File");
        item = new JMenuItem("Exit");
        item.setActionCommand("exit");
        item.addActionListener(this);
        menu.add(item);
        menuBar.add(menu);

        menu = new JMenu("Edit");
        item = new JMenuItem("List all products");
        item.setActionCommand("listall");
        item.addActionListener(this);
        menu.add(item);
        item = new JMenuItem("Search by code");
        item.setActionCommand("searchbycode");
        item.addActionListener(this);
        menu.add(item);
        item = new JMenuItem("Search by price");
        item.setActionCommand("searchbyprice");
        item.addActionListener(this);
        menu.add(item);
        item = new JMenuItem("Add new product");
        item.setActionCommand("add");
        item.addActionListener(this);
        menu.add(item);
        item = new JMenuItem("Modify product");
        item.setActionCommand("modify");
        item.addActionListener(this);
        menu.add(item);
        item = new JMenuItem("Delete product");
        item.setActionCommand("delete");
        item.addActionListener(this);
        menu.add(item);
        menuBar.add(menu);
        item = new JMenuItem("Clear table");
        item.setActionCommand("clear");
        item.addActionListener(this);
        menu.add(item);
        menuBar.add(menu);

        menu = new JMenu("Help");
        item = new JMenuItem("About");
        item.setActionCommand("about");
        item.addActionListener(this);
        menu.add(item);
        menuBar.add(menu);


        return menuBar;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        //TODO
        processAction(action);
        System.out.println("Executting action: " + action);
    }

    private void processAction(String action) {
        if (action != null) {
            switch (action) {
                case "exit":
                    // Exit
                    exitApplication();
                    break;
                case "clearconpanel":
                    // Neteja
                    //view.clearConPanel();
                    break;
                case "clearvaluespanel":
                    // Neteja
                    //view.clearValuesPanel();
                    break;
                case "launchapp":
                    // Shows values panel
                    setTablePanel();
                    break;
                case "setvaluespanel":
                    // Shows values panel
                    //view.setValuesPanel();
                    break;
                case "conpanel":
                    // Shows converter panel
                    //view.setConPanel();
                    break;
                case "calc":
                    // Calculate
                    //Convert();
                    break;
                case "about":
                    // About
                    aboutDialogue();
                    break;
                case "set":
                    break;
                case "listall":
                    controller.listAll();
                    break;
                case "clear":
                    controller.clear();
                    break;
                case "searchbycode":
                    controller.searchByCode();
                    break;
                default:
                    break;
            }
            System.out.println("Execution action: " + action);
        }
    }

    /**
     * Asks for confirmation and exits application
     */
    public void exitApplication() {
        int choice = JOptionPane.showConfirmDialog(this, "Would you like to close the application");
        if (choice == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else if (choice == JOptionPane.OK_CANCEL_OPTION) {

        }
        System.out.println("Exitting app");
    }


    /**
     * Shows aboutDialogue
     */
    public void aboutDialogue() {

        JOptionPane.showMessageDialog(this, aboutMessage);

    }


    public void setTablePanel() {

        Container pane = this.getContentPane();
        pane.setLayout(new BorderLayout());
        productPanel = new JTableProductTablePanel(model, controller);
        pane.add(productPanel, BorderLayout.CENTER);

        this.setContentPane(productPanel);
        this.validate();
    }


    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void displayInputDialog(String message) {
        JOptionPane.showInputDialog(this, message);
    }

    public void displayProductTable(List<Product> data){
        for (Product product: data)
        {
            System.out.println(product.toString());
        }
        System.out.println(data.size() + " products found");

    }


}
