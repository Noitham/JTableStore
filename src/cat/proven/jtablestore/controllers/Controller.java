/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.jtablestore.controllers;

import cat.proven.jtablestore.model.Product;
import cat.proven.jtablestore.model.Store;
import cat.proven.jtablestore.views.JTableStoreMainFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alumne
 */

public class Controller {

    int i = 0;

    private final Store model;
    private JTableStoreMainFrame view;

    public Controller(Store model) {
        this.model = model;
        Controller controller = this;
        javax.swing.SwingUtilities.invokeLater(() -> {
            controller.view = new JTableStoreMainFrame(controller, model);
        });

    }

    public void loadData() {
        model.clearData();
        model.loadData();

    }

    public void clear() {
        model.clearData();
    }

    public void listAll() {

        loadData();

        if (model.getProducts() != null) {
            view.displayProductTable(model.getProducts());
        } else {
            view.displayMessage("Error retrieving data");
        }

        /**
         if (model.getProducts() != null) {
         if (model.getProducts().size() <= 0) {
         model.loadData();
         i++;
         } else {
         view.displayMessage("Products already listed");
         }
         view.displayProductTable(model.getProducts());
         } else {
         view.displayMessage("Error retrieving data");
         }
         */

    }

    public void searchByCode() {

        clear();

        String code = "aaa";

        if (code != null) {
            model.searchByCode(code);

            if (model.getProducts().size() > 0) {
                view.displayProductTable(model.getProducts());
            } else {//Product is null
                System.out.println("product not found");
            }
        } else {
            System.out.println("errror readingcode");
        }

    }


}
