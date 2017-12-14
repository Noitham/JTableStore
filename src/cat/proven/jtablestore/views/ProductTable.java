/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.jtablestore.views;

import cat.proven.jtablestore.model.ProductTableModel;
import cat.proven.jtablestore.model.Store;
import javax.swing.JTable;

/**
 *
 * @author Daniel
 */
public class ProductTable extends JTable {

        public ProductTable(Store model) {
            setModel(new ProductTableModel(model));
            setAutoCreateRowSorter(true);       
            setFillsViewportHeight(true); 
            setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
        }
    }
