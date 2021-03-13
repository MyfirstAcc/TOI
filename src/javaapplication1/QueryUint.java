/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author North_PC
 */
public class QueryUint extends JFrame {

    private JSplitPane splitPane;
    JList listBox;
    private final NewJFrame frmMain;

    public QueryUint(String name, NewJFrame frmMain) {
        super(name);
        this.frmMain = frmMain;
    }

    public JList getListBox() {
        return listBox;
    }

    public void setListBox(DefaultListModel model) {
        
        this.listBox = new JList(model);  
        this.listBox.setPreferredSize(new Dimension(300,300));
        add(new JScrollPane(listBox));     
        
        listBox.addListSelectionListener(new ListSelectionListener() {
            int R = 0, fbytes;

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (listBox.getSelectedIndex() > -1) {
                    R = listBox.getSelectedIndex();
                }              
                Person ps = (Person) model.getElementAt(R);
                try {
                    frmMain.freader.seek(ps.getPosition());
                    fbytes = frmMain.freader.read(frmMain.buff);
                    frmMain.showRecord();

                } catch (IOException ex) {
                    Logger.getLogger(QueryUint.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        this.pack();
        setVisible(true);        
        setLocationRelativeTo(null);

    }
}
