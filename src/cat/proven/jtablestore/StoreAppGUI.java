/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.jtablestore;

import cat.proven.jtablestore.controllers.Controller;
import cat.proven.jtablestore.model.Store;


/**
 *
 * @author alumne
 */

public class StoreAppGUI {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Store model = new Store();
            Controller controller;
            controller = new Controller(model);
        });
    }  
    
}