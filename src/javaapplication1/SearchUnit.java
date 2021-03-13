/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author North_PC
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class SearchUnit extends JFrame {

    private final JLabel labelName;
    private final JLabel labelSurname;
    private final JButton searchButton;
    private final JButton closeButton;
    private final JPanel mainPanel;
    private final JPanel searchPanel;
    private final JPanel navigationPanel;
    private final JPanel buttonPanel;
    private final JTextField txtBoxName;
    private final JTextField txtBoxSurname;
    private int fStartRecord;
    private NewJFrame main;

    public SearchUnit(NewJFrame mainfrm, String name) {
        super(name);
        this.main = mainfrm;
        this.fStartRecord = 0;
        this.txtBoxSurname = new JTextField(20);
        this.labelSurname = new JLabel("Фамилия");
        this.labelName = new JLabel("Имя");
        this.searchButton = new JButton("Искать");
        this.closeButton = new JButton("Закрыть");
        this.buttonPanel = new JPanel(new BorderLayout());
        this.mainPanel = new JPanel(new GridLayout(2, 3));
        this.searchPanel = new JPanel(new GridLayout(2, 2));
        this.navigationPanel = new JPanel(new BorderLayout());
        this.txtBoxName = new JTextField(20);
        add(mainPanel);
        this.setSize(350, 150);
        mainPanel.add(searchPanel);
        mainPanel.add(buttonPanel, BorderLayout.LINE_END);
        mainPanel.add(navigationPanel);

        searchPanel.add(labelSurname);
        searchPanel.add(txtBoxSurname);

        searchPanel.add(labelName);
        searchPanel.add(txtBoxName);

        buttonPanel.add(searchButton);

        navigationPanel.add(closeButton, BorderLayout.AFTER_LAST_LINE);

        closeButton.addActionListener(e -> {
            dispose();
        });
        txtBoxName.getDocument().addDocumentListener(new Changetxt());
        txtBoxSurname.getDocument().addDocumentListener(new Changetxt());

        searchButton.addActionListener(new ActionListener() {
            private int fBytes;

            @Override
            public void actionPerformed(ActionEvent e) {
                String S = new String(txtBoxName.getText());
                String S2 = new String(txtBoxSurname.getText());
                if (S.isEmpty()) {
                    showMessageDialog(null, "Условия для поиска не задано. Поиск не производиться");
                } else {
                    try {
                        if (main.freader.getFilePointer() != main.freader.length()) {
                            main.freader.seek(fStartRecord);
                            fBytes = main.freader.read(main.buff);
                            fStartRecord = fStartRecord + fBytes;

                            if (fBytes == 0) {
                                showMessageDialog(null, "Достигнут конец файла");
                            } else {
                                if (main.isDeleted()) {
                                    actionPerformed(e);
                                } else {
                                    String t = new String(main.buff, "cp1251");
                                    if (S.equals(t.substring(30, 30 + 20).trim()) && S2.equals(t.substring(0, 29).trim())) {
                                        main.showRecord();
                                    } else {
                                        actionPerformed(e);
                                    }
                                }
                            }
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(SearchUnit.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        });
        setLocationFrame();
        setVisible(true);
    }

    public void setLocationFrame() {
        //для правильного позиционирования немодального окна
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int sizeScreen = dim.width;
        int widht = main.getLocation().x + main.getWidth();
        int hieght = main.getLocation().y;

        if (widht + this.getWidth() >= sizeScreen) {
            //если дочернее окно выходит за пределы экрана, то перемещаем его в другую сторону
            int d = main.getLocation().x;
            widht = d - main.getHeight() + this.getHeight();
        }

        this.setLocation(widht, hieght);
    }

    class Changetxt implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            fStartRecord = 0;
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
    // <editor-fold defaultstate="collapsed" desc="not">  

    public class JModelComponent implements ComponentListener {

        @Override
        public void componentResized(ComponentEvent e) {
            System.out.println(e.getComponent().getX());
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void componentMoved(ComponentEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void componentShown(ComponentEvent e) {
            System.out.println(e.getComponent().getX());
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void componentHidden(ComponentEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
    // </editor-fold>  
}
