/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lr7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Properties;
import javaapplication1.NewJFrame;
import javaapplication1.Person;

/**
 *
 * @author North_PC
 */
public class NewJFrame1 extends javax.swing.JFrame {

    private final String PATH_FILE_SOURCE = System.getProperty("user.dir").concat("\\files\\data.txt");
    List<String> content;
    List<Person> lstPerson;
    Map<String, Integer> mapIndexes;
    private final String FILE_PATH_INDEX_SURNAME = "index.txt";
    private final String FILE_PATH_INDEX_TXT = "data.txt";
    NewJFrame main;

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1(NewJFrame n) {
        main = n;
        initComponents();
        winOpen();
        setLocationFrame();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabelStatusBar = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jLabelDedcr = new javax.swing.JLabel();
        jTextFieldIndex = new javax.swing.JTextField();
        jLabelAnswer = new javax.swing.JLabel();
        jButtonCreateInsex = new javax.swing.JButton();
        jLabelDedcr1 = new javax.swing.JLabel();
        jTextFieldIndexSurname = new javax.swing.JTextField();
        jButtonSearchSurname = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("����� �� �������");
        setResizable(false);

        jToolBar1.setFloatable(false);
        jToolBar1.add(jLabelStatusBar);

        jButtonSearch.setText("������");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabelDedcr.setText("������� �������� ��������� ���� ");
        jLabelDedcr.setAutoscrolls(true);
        jLabelDedcr.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jLabelDedcr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextFieldIndex.setPreferredSize(new java.awt.Dimension(40, 28));

        jLabelAnswer.setPreferredSize(new java.awt.Dimension(352, 20));

        jButtonCreateInsex.setText("������� ������");
        jButtonCreateInsex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateInsexActionPerformed(evt);
            }
        });

        jLabelDedcr1.setText("�������");
        jLabelDedcr1.setAutoscrolls(true);
        jLabelDedcr1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jLabelDedcr1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextFieldIndexSurname.setPreferredSize(new java.awt.Dimension(40, 28));

        jButtonSearchSurname.setText("������");
        jButtonSearchSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchSurnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelDedcr1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCreateInsex, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldIndexSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jButtonSearchSurname))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDedcr, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSearch)))))
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDedcr)
                    .addComponent(jTextFieldIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDedcr1)
                    .addComponent(jTextFieldIndexSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchSurname))
                .addGap(51, 51, 51)
                .addComponent(jButtonCreateInsex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed

        String str = jTextFieldIndex.getText().toUpperCase();
        if (!str.isEmpty()) {
            if (mapIndexes.containsKey(str)) {
                showLabel(Integer.toString(mapIndexes.get(str)));
            } else {
                jLabelAnswer.setText("������ �� �������!");
            }
        } else {
            jLabelStatusBar.setText("������� ������!");
        }

    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void showLabel(String str) {
        jLabelAnswer.setText(new StringBuilder().
                append("������ � ").
                append(str).
                toString());
    }
    private void jButtonCreateInsexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateInsexActionPerformed
        // TODO add your handling code here:
        try {
            lstPerson = new ArrayList();
            Properties prop = new Properties();//����� ���� ����� ��� ini �����
            content = Files.readAllLines(Paths.get(PATH_FILE_SOURCE), Charset.forName("cp1251"));
            String s = content.get(0);
            for (int i = 0, j = 1; i < s.length(); i += 128, j++) {
                Person p = new Person(
                        s.substring(i, i + 30).trim(),
                        s.substring(i + 30, i + 50).trim(),
                        s.substring(i + 50, i + 70).trim(),
                        s.substring(i + 70, i + 78).trim(),
                        s.substring(i + 78).trim(), j);
                lstPerson.add(p);
            }

            for (Person person : lstPerson) {
                prop.put(person.getSurname().toUpperCase(), Integer.toString(person.getID()));
            }
            prop.storeToXML(new FileOutputStream(FILE_PATH_INDEX_SURNAME), "LIB");//����� � ��� xml
            jLabelStatusBar.setForeground(Color.magenta);
            jLabelStatusBar.setText("��������� ���� ������!");
            jLabelStatusBar.setForeground(Color.BLACK);

        } catch (IOException ex) {
            jLabelStatusBar.setForeground(Color.red);
            jLabelStatusBar.setText("��������� ���� �� ������!");
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCreateInsexActionPerformed

    private void jButtonSearchSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchSurnameActionPerformed
        try {
            // TODO add your handling code here:
            Properties prop = new Properties();
            prop.loadFromXML(new FileInputStream(FILE_PATH_INDEX_SURNAME));
            String s = jTextFieldIndexSurname.getText().toUpperCase().trim();
            if (!s.isEmpty()) {
                String sprop = prop.getProperty(s);
                showLabel(sprop);
                main.setRecord(Integer.parseInt(sprop));

            } else {
                jLabelStatusBar.setText("������� �������!");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonSearchSurnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateInsex;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearchSurname;
    private javax.swing.JLabel jLabelAnswer;
    private javax.swing.JLabel jLabelDedcr;
    private javax.swing.JLabel jLabelDedcr1;
    private javax.swing.JLabel jLabelStatusBar;
    private javax.swing.JTextField jTextFieldIndex;
    private javax.swing.JTextField jTextFieldIndexSurname;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private void winOpen() {
        try {
            content = Files.readAllLines(Paths.get(FILE_PATH_INDEX_TXT), Charset.forName("cp1251"));
            String[] Str = content.get(0).split(";");
            mapIndexes = new HashMap();
            int i = 0;
            for (String string : Str) {
                mapIndexes.put(string, ++i);
            }
            setLocation(main.getLocation().x + main.getWidth(), main.getLocation().y + this.getHeight() - 10);
        } catch (IOException ex) {
            JOptionPane.showOptionDialog(this, "������", "�� ������ ��������� ����!", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE, null, null, null);
        }

    }

    public void setLocationFrame() {
        //��� ����������� ���������������� ������������ ����
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int sizeScreen = dim.width;
        int widht = main.getLocation().x + main.getWidth();
        int hieght = main.getLocation().y;

        if (widht + this.getWidth() >= sizeScreen) {
            //���� �������� ���� ������� �� ������� ������, �� ���������� ��� � ������ �������
            int d = main.getLocation().x;
            widht = d - main.getHeight() + this.getHeight();
        }

        this.setLocation(widht, hieght);
    }

    class PersonUtil {

        public PersonUtil(String name, Integer key) {
            this.key = name;
            this.rec = key;
        }

        public PersonUtil(String name) {
            this.key = name;
        }

        String key;
        Integer rec;

        public String getName() {
            return key;
        }

        public Integer getNumber() {
            return rec;
        }

    }

    class MComporator implements Comparator<PersonUtil> {

        @Override
        public int compare(PersonUtil o1, PersonUtil o2) {
            if (o1 == null) {
                if (o2 == null) {
                    return 0;
                }
            } else {
                if (o2 == null) {
                    return 1;
                }
            }
            return o1.key.compareTo(o2.key);

        }

    }
}
