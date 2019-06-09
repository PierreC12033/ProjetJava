/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

/**
 * Remove empty rows in JTable :
 * https://stackoverflow.com/questions/41099957/how-to-remove-empty-rows-in-jtable-java
 */
import javafx.scene.paint.Color;
import ConnectionBDD.*;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import modele.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.*;

/**
 *
 * @author tomjo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    String mode1, mode2;
    ConnectMySQL bdd;

    public String getMode1() {
        return mode1;
    }

    public void setMode1(String mode1) {
        this.mode1 = mode1;
    }

    public String getMode2() {
        return mode2;
    }

    public void setMode2(String mode2) {
        this.mode2 = mode2;
    }

    public ConnectMySQL getBdd() {
        return bdd;
    }

    public void setBdd(ConnectMySQL bdd) {
        this.bdd = bdd;
        ArrayList<Object> list = bdd.rechercher("a", "a", "Personne");
        Iterator<Object> it = list.iterator();
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        column1.setHeaderValue("Id");
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        column2.setHeaderValue("Prénom");
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        column3.setHeaderValue("Nom");
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        column4.setHeaderValue("");
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        column5.setHeaderValue("");
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int taille = list.size();
        model.setNumRows(taille);
        while (it.hasNext()) {
            Personne o = (Personne) it.next();
            if (o.isType() == false) {
                int id = o.getId();
                String prenom = o.getPrenom();
                String nom = o.getNom();
                Object[] data = { id, prenom, nom };
                model.addRow(data);
            }

        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }

    public Menu() {
        mode1 = "Rechercher";
        mode2 = "Eleve";
        initComponents();
        Rechercher.setForeground(new java.awt.Color(0, 0, 0));
        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Statistiques.setForeground(new java.awt.Color(255, 255, 255));
        recherchePanel.setVisible(true);
        ajoutPanel.setVisible(false);
        supprimerPanel.setVisible(false);
        modifierModifierPanel.setVisible(false);
        rSupprimerButton.setVisible(false);
        rechercheButton.setText("Rechercher");
        eleve.setForeground(new java.awt.Color(0, 0, 0));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        resultatLabel.setText("");
        erreurLabel.setText("");
        supprimerResultLabel.setText("");
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Prénom");
        rechercheComboBox.addItem("Nom");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(true);
        ajout2Field.setVisible(true);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout6Label.setVisible(false);
        ajout6ComboBox.setVisible(false);
        ajout7Label.setVisible(false);
        ajout7ComboBox.setVisible(false);
        ajout8Label.setVisible(false);
        ajout8ComboBox.setVisible(false);
        ajout1Label.setText("Prénom : ");
        ajout2Label.setText("Nom : ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        ajoutPanel = new javax.swing.JPanel();
        ajouterButton = new javax.swing.JButton();
        erreurLabel = new javax.swing.JLabel();
        ajout5Label = new javax.swing.JLabel();
        ajout1Label = new javax.swing.JLabel();
        ajout2Label = new javax.swing.JLabel();
        ajout3Label = new javax.swing.JLabel();
        ajout4Label = new javax.swing.JLabel();
        ajout3Field = new javax.swing.JTextField();
        ajout1Field = new javax.swing.JTextField();
        ajout2Field = new javax.swing.JTextField();
        ajout5Field = new javax.swing.JTextField();
        ajout4Field = new javax.swing.JTextField();
        ajout6ComboBox = new javax.swing.JComboBox<>();
        ajout6Label = new javax.swing.JLabel();
        ajout7ComboBox = new javax.swing.JComboBox<>();
        ajout7Label = new javax.swing.JLabel();
        ajout8Label = new javax.swing.JLabel();
        ajout8ComboBox = new javax.swing.JComboBox<>();
        recherchePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rechercherTable = new javax.swing.JTable();
        resultatLabel = new javax.swing.JLabel();
        rechercheField = new javax.swing.JTextField();
        rechercheButton = new javax.swing.JButton();
        rechercheComboBox = new javax.swing.JComboBox<>();
        rSupprimerButton = new javax.swing.JButton();
        supprimerPanel = new javax.swing.JPanel();
        supprimerButton = new javax.swing.JButton();
        supprimerLabel = new javax.swing.JLabel();
        supprimerField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        supprimerList = new javax.swing.JList<>();
        supprimerResultLabel = new javax.swing.JLabel();
        modifierModifierPanel = new javax.swing.JPanel();
        modifier1Button = new javax.swing.JLabel();
        modifier2Button = new javax.swing.JLabel();
        modifier3Button = new javax.swing.JLabel();
        modifier4Button = new javax.swing.JLabel();
        modifier5Button = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valeur5Field = new javax.swing.JTextField();
        valeur1Field = new javax.swing.JTextField();
        valeur2Field = new javax.swing.JTextField();
        valeur3Field = new javax.swing.JTextField();
        valeur4Field = new javax.swing.JTextField();
        modifierValiderButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Ajouter = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        Deconnexion = new javax.swing.JButton();
        Rechercher = new javax.swing.JButton();
        Statistiques = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        annee = new javax.swing.JButton();
        eleve = new javax.swing.JButton();
        enseignant = new javax.swing.JButton();
        inscription = new javax.swing.JButton();
        classe = new javax.swing.JButton();
        niveau = new javax.swing.JButton();
        bulletin = new javax.swing.JButton();
        enseignement = new javax.swing.JButton();
        discipline = new javax.swing.JButton();
        bulletindetail = new javax.swing.JButton();
        evaluation = new javax.swing.JButton();
        trimestre = new javax.swing.JButton();
        ecole = new javax.swing.JButton();

        jLabel1.setText("Work in progress!");

        javax.swing.GroupLayout statsPanelLayout = new javax.swing.GroupLayout(statsPanel);
        statsPanel.setLayout(statsPanelLayout);
        statsPanelLayout
                .setHorizontalGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(statsPanelLayout.createSequentialGroup().addGap(308, 308, 308).addComponent(jLabel1)
                                .addContainerGap(448, Short.MAX_VALUE)));
        statsPanelLayout
                .setVerticalGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(statsPanelLayout.createSequentialGroup().addGap(166, 166, 166).addComponent(jLabel1)
                                .addContainerGap(492, Short.MAX_VALUE)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ajouterButton.setText("Ajouter");
        ajouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterButtonActionPerformed(evt);
            }
        });

        erreurLabel.setText("ERREUR");

        ajout5Label.setText("ajout5 :");

        ajout1Label.setText("ajout1 :");

        ajout2Label.setText("ajout2 :");

        ajout3Label.setText("ajout3 :");

        ajout4Label.setText("ajout4 :");

        ajout1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout1FieldActionPerformed(evt);
            }
        });

        ajout4Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout4FieldActionPerformed(evt);
            }
        });

        ajout6ComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ajout6ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajout6ComboBoxActionPerformed(evt);
            }
        });

        ajout6Label.setText("ajout6 :");

        ajout7ComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ajout7Label.setText("ajout7");

        ajout8Label.setText("ajout8");

        ajout8ComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout ajoutPanelLayout = new javax.swing.GroupLayout(ajoutPanel);
        ajoutPanel.setLayout(ajoutPanelLayout);
        ajoutPanelLayout.setHorizontalGroup(ajoutPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ajoutPanelLayout.createSequentialGroup().addContainerGap().addGroup(ajoutPanelLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ajoutPanelLayout.createSequentialGroup()
                                .addComponent(erreurLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(ajouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 379,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))
                        .addGroup(ajoutPanelLayout.createSequentialGroup().addGroup(ajoutPanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ajoutPanelLayout.createSequentialGroup().addComponent(ajout1Label)
                                        .addGap(18, 18, 18).addComponent(ajout1Field,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 688,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ajoutPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(ajoutPanelLayout.createSequentialGroup().addComponent(ajout2Label)
                                                .addGap(18, 18, 18).addComponent(ajout2Field,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 688,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ajoutPanelLayout.createSequentialGroup().addComponent(ajout3Label)
                                                .addGap(18, 18, 18).addComponent(ajout3Field)))
                                .addGroup(ajoutPanelLayout.createSequentialGroup().addComponent(ajout4Label)
                                        .addGap(18, 18, 18).addComponent(ajout4Field,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 688,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ajoutPanelLayout.createSequentialGroup().addGroup(
                                        ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ajout5Label).addComponent(ajout6Label)
                                                .addComponent(ajout7Label).addComponent(ajout8Label))
                                        .addGap(18, 18, 18)
                                        .addGroup(ajoutPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ajout5Field, javax.swing.GroupLayout.PREFERRED_SIZE, 700,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(ajoutPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(ajout6ComboBox,
                                                                javax.swing.GroupLayout.Alignment.LEADING, 0, 292,
                                                                Short.MAX_VALUE)
                                                        .addComponent(ajout7ComboBox,
                                                                javax.swing.GroupLayout.Alignment.LEADING, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ajout8ComboBox,
                                                                javax.swing.GroupLayout.Alignment.LEADING, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)))))
                                .addContainerGap(31, Short.MAX_VALUE)))));
        ajoutPanelLayout.setVerticalGroup(ajoutPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajoutPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ajout1Label).addComponent(ajout1Field,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ajout2Label).addComponent(ajout2Field,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ajout3Label).addComponent(ajout3Field,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ajout4Label).addComponent(ajout4Field,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ajout5Label).addComponent(ajout5Field,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ajout6ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ajout6Label))
                        .addGap(4, 4, 4)
                        .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ajout7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ajout7Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ajout8Label)
                                .addComponent(ajout8ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(erreurLabel).addComponent(ajouterButton,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap()));

        rechercherTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
                { null, null, null, null, null } },
                new String[] { "Title 1", "Title 2", "Title 3", "Title 4", "Title 5" }));
        jScrollPane3.setViewportView(rechercherTable);

        resultatLabel.setText("Résultats :");

        rechercheField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheFieldActionPerformed(evt);
            }
        });

        rechercheButton.setText("Rechercher");
        rechercheButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheButtonActionPerformed(evt);
            }
        });

        rechercheComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rSupprimerButton.setText("Supprimer");

        javax.swing.GroupLayout recherchePanelLayout = new javax.swing.GroupLayout(recherchePanel);
        recherchePanel.setLayout(recherchePanelLayout);
        recherchePanelLayout.setHorizontalGroup(recherchePanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(recherchePanelLayout.createSequentialGroup().addContainerGap().addGroup(recherchePanelLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(recherchePanelLayout.createSequentialGroup()
                                .addComponent(rechercheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rSupprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 329,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(recherchePanelLayout.createSequentialGroup()
                                .addGroup(recherchePanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(recherchePanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane3).addComponent(resultatLabel,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE))
                                        .addGroup(recherchePanelLayout.createSequentialGroup()
                                                .addComponent(rechercheComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54).addComponent(rechercheField,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 525,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        recherchePanelLayout.setVerticalGroup(recherchePanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(recherchePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rechercheField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rechercheComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rechercheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rSupprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18).addComponent(resultatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                javax.swing.GroupLayout.PREFERRED_SIZE)));

        supprimerButton.setText("Supprimer");

        supprimerLabel.setText("Identifiant :");

        supprimerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(supprimerList);

        supprimerResultLabel.setText("ERREUR");

        javax.swing.GroupLayout supprimerPanelLayout = new javax.swing.GroupLayout(supprimerPanel);
        supprimerPanel.setLayout(supprimerPanelLayout);
        supprimerPanelLayout.setHorizontalGroup(supprimerPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(supprimerPanelLayout.createSequentialGroup().addContainerGap()
                        .addGroup(supprimerPanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(supprimerResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addGroup(supprimerPanelLayout.createSequentialGroup().addComponent(supprimerLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(supprimerField, javax.swing.GroupLayout.DEFAULT_SIZE, 679,
                                                Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supprimerPanelLayout.createSequentialGroup()
                        .addGap(0, 245, Short.MAX_VALUE).addComponent(supprimerButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)));
        supprimerPanelLayout.setVerticalGroup(supprimerPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supprimerPanelLayout.createSequentialGroup()
                        .addGroup(supprimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(supprimerPanelLayout.createSequentialGroup().addGap(16, 16, 16).addComponent(
                                        supprimerField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        supprimerPanelLayout.createSequentialGroup().addContainerGap()
                                                .addComponent(supprimerLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(supprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41).addComponent(supprimerResultLabel).addContainerGap(301, Short.MAX_VALUE)));

        modifier1Button.setText("modifier 1:");

        modifier2Button.setText("modifier 2 :");

        modifier3Button.setText("modifier 3 :");

        modifier4Button.setText("modifier 4:");

        modifier5Button.setText("modifier 5 :");

        jLabel6.setText("ERREUR");

        valeur5Field.setText("valeur5");

        valeur1Field.setText("valeur1");

        valeur2Field.setText("valeur2");

        valeur3Field.setText("valeur3");

        valeur4Field.setText("valeur4");

        modifierValiderButton.setText("Valider la modification");
        modifierValiderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierValiderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modifierModifierPanelLayout = new javax.swing.GroupLayout(modifierModifierPanel);
        modifierModifierPanel.setLayout(modifierModifierPanelLayout);
        modifierModifierPanelLayout.setHorizontalGroup(modifierModifierPanelLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(modifierModifierPanelLayout.createSequentialGroup().addGroup(modifierModifierPanelLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 755,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(modifierModifierPanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(modifierModifierPanelLayout.createSequentialGroup().addGap(22, 22, 22)
                                        .addGroup(modifierModifierPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                                                        .addComponent(modifier5Button).addGap(18, 18, 18)
                                                        .addComponent(valeur5Field))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        modifierModifierPanelLayout.createSequentialGroup()
                                                                .addComponent(modifier4Button)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(valeur4Field))
                                                .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                                                        .addComponent(modifier3Button).addGap(18, 18, 18)
                                                        .addComponent(valeur3Field))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        modifierModifierPanelLayout.createSequentialGroup()
                                                                .addComponent(modifier2Button).addGap(18, 18, 18)
                                                                .addComponent(valeur2Field))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        modifierModifierPanelLayout.createSequentialGroup()
                                                                .addComponent(modifier1Button)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(valeur1Field,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 562,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(modifierModifierPanelLayout.createSequentialGroup().addGap(242, 242, 242)
                                        .addComponent(modifierValiderButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                429, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        modifierModifierPanelLayout.setVerticalGroup(
                modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                                .addGroup(modifierModifierPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                                                .addGroup(modifierModifierPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(modifier1Button).addComponent(valeur1Field,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(modifierModifierPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(modifier2Button).addComponent(valeur2Field,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(modifier3Button))
                                        .addComponent(valeur3Field, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(modifierModifierPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(modifier4Button).addComponent(valeur4Field,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(modifierModifierPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(modifier5Button).addComponent(valeur5Field,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modifierValiderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47).addComponent(jLabel6).addContainerGap(340, Short.MAX_VALUE)));

        jLayeredPane1.setLayer(ajoutPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(recherchePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(supprimerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(modifierModifierPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(jLayeredPane1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(recherchePanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        jLayeredPane1Layout.createSequentialGroup().addContainerGap(18, Short.MAX_VALUE)
                                .addComponent(supprimerPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
                .addGroup(jLayeredPane1Layout.createSequentialGroup().addContainerGap()
                        .addComponent(modifierModifierPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup().addContainerGap()
                                .addComponent(ajoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(100, Short.MAX_VALUE))));
        jLayeredPane1Layout
                .setVerticalGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(recherchePanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supprimerPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modifierModifierPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup().addContainerGap()
                                        .addComponent(ajoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(1436, Short.MAX_VALUE))));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Ajouter.setText("Ajouter");
        Ajouter.setContentAreaFilled(false);
        Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterActionPerformed(evt);
            }
        });

        Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setText("Supprimer");
        Supprimer.setContentAreaFilled(false);
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });

        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Modifier.setText("Modifier");
        Modifier.setContentAreaFilled(false);
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });

        Deconnexion.setBackground(new java.awt.Color(102, 102, 255));
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setText("Déconnexion");
        Deconnexion.setContentAreaFilled(false);
        Deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnexionActionPerformed(evt);
            }
        });

        Rechercher.setForeground(new java.awt.Color(255, 255, 255));
        Rechercher.setText("Rechercher");
        Rechercher.setContentAreaFilled(false);
        Rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercherActionPerformed(evt);
            }
        });

        Statistiques.setBackground(new java.awt.Color(102, 102, 255));
        Statistiques.setForeground(new java.awt.Color(255, 255, 255));
        Statistiques.setText("Statistiques");
        Statistiques.setContentAreaFilled(false);
        Statistiques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatistiquesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(Rechercher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(Ajouter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(Supprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(Modifier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(Statistiques)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(Deconnexion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Ajouter).addComponent(Supprimer).addComponent(Modifier)
                                .addComponent(Rechercher).addComponent(Deconnexion).addComponent(Statistiques))
                        .addContainerGap(45, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(51, 181, 255));

        annee.setForeground(new java.awt.Color(255, 255, 255));
        annee.setText("Année scolaire");
        annee.setContentAreaFilled(false);
        annee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anneeActionPerformed(evt);
            }
        });

        eleve.setForeground(new java.awt.Color(255, 255, 255));
        eleve.setText("Élève");
        eleve.setContentAreaFilled(false);
        eleve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleveActionPerformed(evt);
            }
        });

        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setText("Enseignant");
        enseignant.setContentAreaFilled(false);
        enseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enseignantActionPerformed(evt);
            }
        });

        inscription.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setText("Inscription");
        inscription.setContentAreaFilled(false);
        inscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscriptionActionPerformed(evt);
            }
        });

        classe.setForeground(new java.awt.Color(255, 255, 255));
        classe.setText("Classe");
        classe.setContentAreaFilled(false);
        classe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classeActionPerformed(evt);
            }
        });

        niveau.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setText("Niveau");
        niveau.setContentAreaFilled(false);
        niveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niveauActionPerformed(evt);
            }
        });

        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setText("Bulletin");
        bulletin.setContentAreaFilled(false);
        bulletin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulletinActionPerformed(evt);
            }
        });

        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setText("Enseignement");
        enseignement.setContentAreaFilled(false);
        enseignement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enseignementActionPerformed(evt);
            }
        });

        discipline.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setText("Discipline");
        discipline.setContentAreaFilled(false);
        discipline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplineActionPerformed(evt);
            }
        });

        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setText("Bulletin détaillé");
        bulletindetail.setContentAreaFilled(false);
        bulletindetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulletindetailActionPerformed(evt);
            }
        });

        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setText("Évaluation");
        evaluation.setContentAreaFilled(false);
        evaluation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluationActionPerformed(evt);
            }
        });

        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setText("Trimestre");
        trimestre.setContentAreaFilled(false);
        trimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trimestreActionPerformed(evt);
            }
        });

        ecole.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setText("École");
        ecole.setContentAreaFilled(false);
        ecole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup().addComponent(eleve)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(enseignant)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inscription)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(classe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(niveau))
                                .addGroup(jPanel3Layout.createSequentialGroup().addComponent(discipline)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bulletindetail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(evaluation)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ecole)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(annee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(trimestre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(bulletin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enseignement).addContainerGap(203, Short.MAX_VALUE)));
        jPanel3Layout
                .setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup().addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(eleve).addComponent(enseignant).addComponent(inscription)
                                        .addComponent(classe).addComponent(niveau).addComponent(annee)
                                        .addComponent(trimestre).addComponent(bulletin).addComponent(enseignement))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(discipline).addComponent(bulletindetail).addComponent(evaluation)
                                        .addComponent(ecole))
                                .addContainerGap(48, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(14, 14, 14).addComponent(jLayeredPane1,
                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajout4FieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ajout4FieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ajout4FieldActionPerformed

    private void RechercherActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RechercherActionPerformed
        Rechercher.setForeground(new java.awt.Color(0, 0, 0));
        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Statistiques.setForeground(new java.awt.Color(255, 255, 255));
        recherchePanel.setVisible(true);
        ajoutPanel.setVisible(false);
        supprimerPanel.setVisible(false);
        modifierModifierPanel.setVisible(false);
        jLayeredPane1.remove(statsPanel);
        statsPanel.setVisible(false);
        rSupprimerButton.setVisible(false);
        resultatLabel.setText("");
        erreurLabel.setText("");
        supprimerResultLabel.setText("");
        rechercheButton.setText("Rechercher");
        mode1 = "Rechercher";
        rechercherTable.removeAll();
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        ArrayList<Object> list;
        Iterator<Object> it;
        int taille;

        switch (mode2) {
        case "Eleve":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Prénom");
            rechercheComboBox.addItem("Nom");
            list = bdd.rechercher("a", "a", "Personne");
            it = list.iterator();
            column1.setHeaderValue("Id");
            column2.setHeaderValue("Prénom");
            column3.setHeaderValue("Nom");
            column4.setHeaderValue("");
            column5.setHeaderValue("");
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            taille = list.size();
            model.setNumRows(taille);
            while (it.hasNext()) {
                Personne o = (Personne) it.next();
                if (o.isType() == false) {
                    int id = o.getId();
                    String prenom = o.getPrenom();
                    String nom = o.getNom();
                    Object[] data = { id, prenom, nom };
                    model.addRow(data);
                }

            }
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                if (model.getValueAt(i, 0) == null) {
                    model.removeRow(i);
                }
            }
            rechercherTable.setModel(model);
            break;
        case "Enseignant":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Prénom");
            rechercheComboBox.addItem("Nom");
            ArrayList<Object> Enseignantlist = bdd.rechercher("a", "a", "Personne");
            Iterator<Object> Enseignantit = Enseignantlist.iterator();
            TableColumn Enseignantcolumn1 = rechercherTable.getColumnModel().getColumn(0);
            Enseignantcolumn1.setHeaderValue("Id");
            TableColumn Enseignantcolumn2 = rechercherTable.getColumnModel().getColumn(1);
            Enseignantcolumn2.setHeaderValue("Prénom");
            TableColumn Enseignantcolumn3 = rechercherTable.getColumnModel().getColumn(2);
            Enseignantcolumn3.setHeaderValue("Nom");
            TableColumn Enseignantcolumn4 = rechercherTable.getColumnModel().getColumn(3);
            Enseignantcolumn4.setHeaderValue("");
            TableColumn Enseignantcolumn5 = rechercherTable.getColumnModel().getColumn(4);
            Enseignantcolumn5.setHeaderValue("");
            DefaultTableModel Enseignantmodel = (DefaultTableModel) rechercherTable.getModel();
            for (int i = Enseignantmodel.getRowCount() - 1; i >= 0; i--) {
                Enseignantmodel.removeRow(i);
            }
            int Enseignanttaille = Enseignantlist.size();
            Enseignantmodel.setNumRows(Enseignanttaille);
            while (Enseignantit.hasNext()) {
                Personne o = (Personne) Enseignantit.next();
                if (o.isType() == true) {
                    int id = o.getId();
                    String prenom = o.getPrenom();
                    String nom = o.getNom();
                    Object[] data = { id, prenom, nom };
                    Enseignantmodel.addRow(data);
                }

            }
            for (int i = Enseignantmodel.getRowCount() - 1; i >= 0; i--) {
                if (Enseignantmodel.getValueAt(i, 0) == null) {
                    Enseignantmodel.removeRow(i);
                }
            }
            rechercherTable.setModel(Enseignantmodel);
            break;
        case "Inscription":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Nom de la classe");
            rechercheComboBox.addItem("Nom de l'élève");
            ArrayList<Object> Inscription_list = bdd.rechercher("a", "a", "Inscription");
            Iterator<Object> Inscription_it = Inscription_list.iterator();
            TableColumn Inscription_column1 = rechercherTable.getColumnModel().getColumn(0);
            Inscription_column1.setHeaderValue("Id");
            TableColumn Inscription_column2 = rechercherTable.getColumnModel().getColumn(1);
            Inscription_column2.setHeaderValue("Classe");
            TableColumn Inscription_column3 = rechercherTable.getColumnModel().getColumn(2);
            Inscription_column3.setHeaderValue("Eleve");
            TableColumn Inscription_column4 = rechercherTable.getColumnModel().getColumn(3);
            Inscription_column4.setHeaderValue("");
            TableColumn Inscription_column5 = rechercherTable.getColumnModel().getColumn(4);
            Inscription_column5.setHeaderValue("");
            DefaultTableModel Inscription_model = (DefaultTableModel) rechercherTable.getModel();
            for (int i = Inscription_model.getRowCount() - 1; i >= 0; i--) {
                Inscription_model.removeRow(i);
            }
            int Inscription_taille = Inscription_list.size();
            Inscription_model.setNumRows(Inscription_taille);
            while (Inscription_it.hasNext()) {
                Inscription o = (Inscription) Inscription_it.next();
                int id = o.getId();
                ArrayList<Object> idclasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()), "Classe");
                String classe = ((Classe) idclasse.get(0)).getNom();
                ArrayList<Object> idEleve = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
                String prenom = ((Personne) idEleve.get(0)).getPrenom();
                String nom = ((Personne) idEleve.get(0)).getNom();
                String eleve = prenom + " " + nom;
                Object[] data = { id, classe, eleve };
                Inscription_model.addRow(data);
            }
            for (int i = Inscription_model.getRowCount() - 1; i >= 0; i--) {
                if (Inscription_model.getValueAt(i, 0) == null) {
                    Inscription_model.removeRow(i);
                }
            }
            rechercherTable.setModel(Inscription_model);
            break;
        case "Classe":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Nom");
            rechercheComboBox.addItem("Nom de l'école");
            rechercheComboBox.addItem("Nom du niveau");
            rechercheComboBox.addItem("Début d'année scolaire");
            ArrayList<Object> Classe_list = bdd.rechercher("a", "a", "Classe");
            Iterator<Object> Classe_it = Classe_list.iterator();
            TableColumn Classe_column1 = rechercherTable.getColumnModel().getColumn(0);
            Classe_column1.setHeaderValue("Id");
            TableColumn Classe_column2 = rechercherTable.getColumnModel().getColumn(1);
            Classe_column2.setHeaderValue("Nom");
            TableColumn Classe_column3 = rechercherTable.getColumnModel().getColumn(2);
            Classe_column3.setHeaderValue("Ecole");
            TableColumn Classe_column4 = rechercherTable.getColumnModel().getColumn(3);
            Classe_column4.setHeaderValue("Niveau");
            TableColumn Classe_column5 = rechercherTable.getColumnModel().getColumn(4);
            Classe_column5.setHeaderValue("Annee scolaire");
            DefaultTableModel Classe_model = (DefaultTableModel) rechercherTable.getModel();
            for (int i = Classe_model.getRowCount() - 1; i >= 0; i--) {
                Classe_model.removeRow(i);
            }
            int Classe_taille = Classe_list.size();
            Classe_model.setNumRows(Classe_taille);
            while (Classe_it.hasNext()) {
                Classe o = (Classe) Classe_it.next();
                int id = o.getId();
                ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()),
                        "AnneeScolaire");
                String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                        + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(o.getIdEcole()), "Ecole");
                String ecole = ((Ecole) idEcole.get(0)).getNom();
                ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(o.getIdNiveau()), "Niveau");
                String niveau = ((Niveau) idNiveau.get(0)).getNom();
                String nom = o.getNom();
                Object[] data = { id, nom, ecole, niveau, annee };
                Classe_model.addRow(data);
            }
            for (int i = Classe_model.getRowCount() - 1; i >= 0; i--) {
                if (Classe_model.getValueAt(i, 0) == null) {
                    Classe_model.removeRow(i);
                }
            }
            rechercherTable.setModel(Classe_model);
            break;
        case "Niveau":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Nom");
            ArrayList<Object> Niveau_list = bdd.rechercher("a", "a", "Niveau");
            Iterator<Object> Niveau_it = Niveau_list.iterator();
            TableColumn Niveau_column1 = rechercherTable.getColumnModel().getColumn(0);
            Niveau_column1.setHeaderValue("Id");
            TableColumn Niveau_column2 = rechercherTable.getColumnModel().getColumn(1);
            Niveau_column2.setHeaderValue("Nom");
            TableColumn Niveau_column3 = rechercherTable.getColumnModel().getColumn(2);
            Niveau_column3.setHeaderValue("");
            TableColumn Niveau_column4 = rechercherTable.getColumnModel().getColumn(3);
            Niveau_column4.setHeaderValue("");
            TableColumn Niveau_column5 = rechercherTable.getColumnModel().getColumn(4);
            Niveau_column5.setHeaderValue("");
            DefaultTableModel Niveau_model = (DefaultTableModel) rechercherTable.getModel();
            for (int i = Niveau_model.getRowCount() - 1; i >= 0; i--) {
                Niveau_model.removeRow(i);
            }
            int Niveau_taille = Niveau_list.size();
            Niveau_model.setNumRows(Niveau_taille);
            while (Niveau_it.hasNext()) {
                Niveau o = (Niveau) Niveau_it.next();
                int id = o.getId();
                String nom = o.getNom();
                Object[] data = { id, nom };
                Niveau_model.addRow(data);
            }
            for (int i = Niveau_model.getRowCount() - 1; i >= 0; i--) {
                if (Niveau_model.getValueAt(i, 0) == null) {
                    Niveau_model.removeRow(i);
                }
            }
            rechercherTable.setModel(Niveau_model);
            break;
        case "Annee":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Début");
            rechercheComboBox.addItem("Fin");
            list = bdd.rechercher("a", "a", "AnneeScolaire");
            it = list.iterator();
            column1.setHeaderValue("Id");
            column2.setHeaderValue("Début");
            column3.setHeaderValue("Fin");
            column4.setHeaderValue("");
            column5.setHeaderValue("");
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            taille = list.size();
            model.setNumRows(taille);
            while (it.hasNext()) {
                AnneeScolaire o = (AnneeScolaire) it.next();
                int id = o.getId();
                int debut = o.getAnneeDebut();
                int fin = o.getAnneeFin();
                Object[] data = { id, debut, fin };
                model.addRow(data);
            }
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                if (model.getValueAt(i, 0) == null) {
                    model.removeRow(i);
                }
            }
            rechercherTable.setModel(model);
            break;
        case "Trimestre":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Numéro");
            rechercheComboBox.addItem("Début d'année scolaire");
            list = bdd.rechercher("a", "a", "Trimestre");
            it = list.iterator();
            column1.setHeaderValue("Id");
            column2.setHeaderValue("Numéro");
            column3.setHeaderValue("Début");
            column4.setHeaderValue("Fin");
            column5.setHeaderValue("Année scolaire");
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            taille = list.size();
            model.setNumRows(taille);
            while (it.hasNext()) {
                Trimestre o = (Trimestre) it.next();
                int id = o.getId();
                int numero = o.getNumero();
                String debut = o.getDebut().toString();
                String fin = o.getFin().toString();
                ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()),
                        "AnneeScolaire");
                String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                        + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                Object[] data = { id, numero, debut, fin, annee };
                model.addRow(data);
            }
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                if (model.getValueAt(i, 0) == null) {
                    model.removeRow(i);
                }
            }
            rechercherTable.setModel(model);
            break;
        case "Bulletin":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Début d'année scolaire");
            rechercheComboBox.addItem("Nom de la classe");
            rechercheComboBox.addItem("Nom de l'élève");
            list = bdd.rechercher("a", "a", "Bulletin");
            it = list.iterator();
            column1.setHeaderValue("Id");
            column2.setHeaderValue("Trimestre");
            column3.setHeaderValue("Inscription");
            column4.setHeaderValue("Appréciation");
            column5.setHeaderValue("");
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            taille = list.size();
            model.setNumRows(taille);
            while (it.hasNext()) {
                Bulletin o = (Bulletin) it.next();
                int id = o.getId();
                String appreciation = o.getAppreciation();
                ArrayList<Object> idTrimestre = bdd.rechercher("Id", String.valueOf(o.getIdTrimestre()), "Trimestre");
                String trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                        + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                ArrayList<Object> idInscription = bdd.rechercher("Id", String.valueOf(o.getIdInscription()),
                        "Inscription");
                ArrayList<Object> idclasse = bdd.rechercher("Id",
                        String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                String classe = ((Classe) idclasse.get(0)).getNom();
                ArrayList<Object> idEleve = bdd.rechercher("Id",
                        String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                String prenom = ((Personne) idEleve.get(0)).getPrenom();
                String nom = ((Personne) idEleve.get(0)).getNom();
                String inscription = classe + "-" + prenom + " " + nom;

                Object[] data = { id, trimestre, inscription, appreciation };
                model.addRow(data);
            }
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                if (model.getValueAt(i, 0) == null) {
                    model.removeRow(i);
                }
            }
            rechercherTable.setModel(model);
            break;
        case "Enseignement":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Nom de la classe");
            rechercheComboBox.addItem("Nom de la discipline");
            rechercheComboBox.addItem("Nom du professeur");
            list = bdd.rechercher("a", "a", "Enseignement");
            it = list.iterator();
            column1.setHeaderValue("Id");
            column2.setHeaderValue("Classe");
            column3.setHeaderValue("Discipline");
            column4.setHeaderValue("Professeur");
            column5.setHeaderValue("");
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            taille = list.size();
            model.setNumRows(taille);
            while (it.hasNext()) {
                Enseignement o = (Enseignement) it.next();
                int id = o.getId();
                ArrayList<Object> idClasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()), "Classe");
                ArrayList<Object> idEcole = bdd.rechercher("Id",
                        String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                ArrayList<Object> idNiveau = bdd.rechercher("Id",
                        String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                ArrayList<Object> idAnnee = bdd.rechercher("Id",
                        String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(o.getIdDiscipline()),
                        "Discipline");
                String classe_nom = ((Classe) idClasse.get(0)).getNom();
                String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                        + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                String classe = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
                String prenom = ((Personne) idProf.get(0)).getPrenom();
                String nom = ((Personne) idProf.get(0)).getNom();
                String professeur = prenom + " " + nom;
                Object[] data = { id, classe, discipline, professeur };
                model.addRow(data);
            }
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                if (model.getValueAt(i, 0) == null) {
                    model.removeRow(i);
                }
            }
            rechercherTable.setModel(model);
            break;
        case "Discipline":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Nom");
            list = bdd.rechercher("a", "a", "Discipline");
            it = list.iterator();
            column1.setHeaderValue("Id");
            column2.setHeaderValue("Nom");
            column3.setHeaderValue("");
            column4.setHeaderValue("");
            column5.setHeaderValue("");
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            taille = list.size();
            model.setNumRows(taille);
            while (it.hasNext()) {
                Discipline o = (Discipline) it.next();
                int id = o.getId();
                String nom = o.getNom();
                Object[] data = { id, nom };
                model.addRow(data);
            }
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                if (model.getValueAt(i, 0) == null) {
                    model.removeRow(i);
                }
            }
            rechercherTable.setModel(model);
            break;
        case "BulletinDetails":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Début d'année scolaire");
            rechercheComboBox.addItem("Nom de la classe");
            rechercheComboBox.addItem("Nom de l'élève");
            rechercheComboBox.addItem("Nom du professeur");
            rechercheComboBox.addItem("Nom de la discipline");
            list = bdd.rechercher("a", "a", "DetailBulletin");
            it = list.iterator();
            column1.setHeaderValue("Id");
            column2.setHeaderValue("Bulletin");
            column3.setHeaderValue("Enseignement");
            column4.setHeaderValue("Appreciation");
            column5.setHeaderValue("");
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            taille = list.size();
            model.setNumRows(taille);
            while (it.hasNext()) {
                DetailBulletin o = (DetailBulletin) it.next();
                int id = o.getId();
                String appreciation = o.getAppreciation();
                ArrayList<Object> idBulletin = bdd.rechercher("Id", String.valueOf(o.getIdBulletin()), "Bulletin");
                ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                String bulletin_trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                        + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                ArrayList<Object> idInscription = bdd.rechercher("Id",
                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()), "Inscription");
                ArrayList<Object> idclasse = bdd.rechercher("Id",
                        String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                String classe = ((Classe) idclasse.get(0)).getNom();
                ArrayList<Object> idEleve = bdd.rechercher("Id",
                        String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                String prenom = ((Personne) idEleve.get(0)).getPrenom();
                String nom = ((Personne) idEleve.get(0)).getNom();
                String bulletin_inscription = classe + "-" + prenom + " " + nom;
                String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                ArrayList<Object> idEnseignement = bdd.rechercher("Id", String.valueOf(o.getIdEnseignement()),
                        "Enseignement");
                ArrayList<Object> idClasse = bdd.rechercher("Id",
                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
                ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()), "Discipline");
                ArrayList<Object> idPersonne = bdd.rechercher("Id",
                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                String classe_nom = ((Classe) idClasse.get(0)).getNom();
                ArrayList<Object> idEcole = bdd.rechercher("Id",
                        String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                ArrayList<Object> idNiveau = bdd.rechercher("Id",
                        String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                ArrayList<Object> idAnnee = bdd.rechercher("Id",
                        String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                        + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                ArrayList<Object> idProf = bdd.rechercher("Id",
                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                String prof_nom = ((Personne) idProf.get(0)).getNom();
                String enseignement_professeur = prof_prenom + " " + prof_nom;
                String enseignement = discipline + " " + enseignement_professeur;
                Object[] data = { id, bulletin, enseignement, appreciation };
                model.addRow(data);
            }
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                if (model.getValueAt(i, 0) == null) {
                    model.removeRow(i);
                }
            }
            rechercherTable.setModel(model);
            break;
        case "Evaluation":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Début d'année scolaire");
            rechercheComboBox.addItem("Nom de la classe");
            rechercheComboBox.addItem("Nom de l'élève");
            rechercheComboBox.addItem("Nom du professeur");
            rechercheComboBox.addItem("Nom de la discipline");
            rechercheComboBox.addItem("Note");
            list = bdd.rechercher("a", "a", "Evaluation");
            it = list.iterator();
            column1.setHeaderValue("Id");
            column2.setHeaderValue("Bulletin détaillé");
            column3.setHeaderValue("Note");
            column4.setHeaderValue("Appréciation");
            column5.setHeaderValue("");
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            taille = list.size();
            model.setNumRows(taille);
            while (it.hasNext()) {
                Evaluation o = (Evaluation) it.next();
                int id = o.getId();
                String appreciation = o.getAppreciation();
                int note = o.getNote();
                ArrayList<Object> idBulletinDetails = bdd.rechercher("Id", String.valueOf(o.getIdDetailBulletin()),
                        "DetailBulletin");
                String bulletinDetails_appreciation = ((DetailBulletin) idBulletinDetails.get(0)).getAppreciation();
                ArrayList<Object> idBulletin = bdd.rechercher("Id",
                        String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdBulletin()), "Bulletin");
                ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                String bulletin_trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                        + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                ArrayList<Object> idInscription = bdd.rechercher("Id",
                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()), "Inscription");
                ArrayList<Object> idclasse = bdd.rechercher("Id",
                        String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                String classe = ((Classe) idclasse.get(0)).getNom();
                ArrayList<Object> idEleve = bdd.rechercher("Id",
                        String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                String prenom = ((Personne) idEleve.get(0)).getPrenom();
                String nom = ((Personne) idEleve.get(0)).getNom();
                String bulletin_inscription = classe + "-" + prenom + " " + nom;
                String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                        String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdEnseignement()),
                        "Enseignement");
                ArrayList<Object> idClasse = bdd.rechercher("Id",
                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
                ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()), "Discipline");
                ArrayList<Object> idPersonne = bdd.rechercher("Id",
                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                String classe_nom = ((Classe) idClasse.get(0)).getNom();
                ArrayList<Object> idEcole = bdd.rechercher("Id",
                        String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                ArrayList<Object> idNiveau = bdd.rechercher("Id",
                        String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                ArrayList<Object> idAnnee = bdd.rechercher("Id",
                        String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                        + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                ArrayList<Object> idProf = bdd.rechercher("Id",
                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                String prof_nom = ((Personne) idProf.get(0)).getNom();
                String enseignement_professeur = prof_prenom + " " + prof_nom;
                String enseignement = discipline + " " + enseignement_professeur;
                String bulletindetails = bulletin + " " + enseignement + " " + appreciation;
                Object[] data = { id, bulletindetails, note, appreciation };
                model.addRow(data);
            }
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                if (model.getValueAt(i, 0) == null) {
                    model.removeRow(i);
                }
            }
            rechercherTable.setModel(model);
            break;
        case "Ecole":
            rechercheComboBox.removeAllItems();
            rechercheComboBox.addItem("Id");
            rechercheComboBox.addItem("Nom");
            list = bdd.rechercher("a", "a", "Ecole");
            it = list.iterator();
            column1.setHeaderValue("Id");
            column2.setHeaderValue("Nom");
            column3.setHeaderValue("");
            column4.setHeaderValue("");
            column5.setHeaderValue("");
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            taille = list.size();
            model.setNumRows(taille);
            while (it.hasNext()) {
                Ecole o = (Ecole) it.next();
                int id = o.getId();
                String nom = o.getNom();
                Object[] data = { id, nom };
                model.addRow(data);
            }
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                if (model.getValueAt(i, 0) == null) {
                    model.removeRow(i);
                }
            }
            rechercherTable.setModel(model);
        default:
        }
        // TODO add your handling code here:
    }// GEN-LAST:event_RechercherActionPerformed

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AjouterActionPerformed
        Rechercher.setForeground(new java.awt.Color(255, 255, 255));
        Ajouter.setForeground(new java.awt.Color(0, 0, 0));
        Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Statistiques.setForeground(new java.awt.Color(255, 255, 255));
        recherchePanel.setVisible(false);
        ajoutPanel.setVisible(true);
        supprimerPanel.setVisible(false);
        modifierModifierPanel.setVisible(false);
        jLayeredPane1.remove(statsPanel);
        statsPanel.setVisible(false);
        rechercheButton.setText("Rechercher");
        mode1 = "Ajouter";
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        switch (mode2) {
        case "Eleve":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(true);
            ajout2Field.setVisible(true);

            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout6Label.setVisible(false);
            ajout6ComboBox.setVisible(false);
            ajout7Label.setVisible(false);
            ajout7ComboBox.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Prénom : ");
            ajout2Label.setText("Nom : ");
            break;
        case "Enseignant":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(true);
            ajout2Field.setVisible(true);

            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout6Label.setVisible(false);
            ajout6ComboBox.setVisible(false);
            ajout7Label.setVisible(false);
            ajout7ComboBox.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Prénom : ");
            ajout2Label.setText("Nom : ");
            break;
        case "Inscription":
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);
            ajout8Label.setVisible(true);
            ajout8ComboBox.setVisible(true);

            ajout1Label.setVisible(false);
            ajout1Field.setVisible(false);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);

            ajout6Label.setText("Niveau : ");
            ajout7Label.setText("Classe : ");
            ajout8Label.setText("Eleve : ");

            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            ajout8ComboBox.removeAllItems();

            break;
        case "Classe":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);
            ajout8Label.setVisible(true);
            ajout8ComboBox.setVisible(true);

            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout1Label.setText("Nom : ");
            ajout6Label.setText("Ecole : ");
            ajout7Label.setText("Niveau : ");
            ajout8Label.setText("Année Scolaire : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            ajout8ComboBox.removeAllItems();
            break;
        case "Niveau":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout6Label.setVisible(false);
            ajout6ComboBox.setVisible(false);
            ajout7Label.setVisible(false);
            ajout7ComboBox.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Nom : ");
            break;
        case "Annee":
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);

            ajout1Label.setVisible(false);
            ajout1Field.setVisible(false);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout6Label.setText("Début : ");
            ajout7Label.setText("Fin : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            break;
        case "Trimestre":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(true);
            ajout2Field.setVisible(true);
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);

            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Date de début : ");
            ajout2Label.setText("Date de fin : ");
            ajout6Label.setText("Année Scolaire : ");
            ajout7Label.setText("Numéro : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            break;
        case "Bulletin":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);

            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Appréciation : ");
            ajout6Label.setText("Trimestre");
            ajout7Label.setText("Nom : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            break;
        case "Enseignement":
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);
            ajout8Label.setVisible(true);
            ajout8ComboBox.setVisible(true);

            ajout1Label.setVisible(false);
            ajout1Field.setVisible(false);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout6Label.setText("Classe : ");
            ajout7Label.setText("Discipline : ");
            ajout8Label.setText("Professeur : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            ajout8ComboBox.removeAllItems();
            break;
        case "Discipline":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout6Label.setVisible(false);
            ajout6ComboBox.setVisible(false);
            ajout7Label.setVisible(false);
            ajout7ComboBox.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Nom : ");
            break;
        case "BulletinDetails":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);
            ajout8Label.setVisible(true);
            ajout8ComboBox.setVisible(true);

            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout1Label.setText("Appréciation : ");
            ajout6Label.setText("Trimestre: ");
            ajout7Label.setText("Eleve : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            ajout8ComboBox.removeAllItems();
            break;
        case "Evaluation":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(true);
            ajout2Field.setVisible(true);
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);
            ajout8Label.setVisible(true);
            ajout8ComboBox.setVisible(true);

            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout1Label.setText("Note : ");
            ajout2Label.setText("Appréciation : ");
            ajout6Label.setText("Trimestre: ");
            ajout7Label.setText("Eleve");
            ajout8Label.setText("Discipline : ");
            ajout6ComboBox.removeAll();
            ajout7ComboBox.removeAll();
            ajout8ComboBox.removeAll();
            break;
        case "Ecole":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Label.setVisible(false);
            ajout6Label.setVisible(false);
            ajout6ComboBox.setVisible(false);
            ajout7Label.setVisible(false);
            ajout7ComboBox.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Nom : ");
            break;
        default:
        }

    }// GEN-LAST:event_AjouterActionPerformed

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SupprimerActionPerformed
        Rechercher.setForeground(new java.awt.Color(255, 255, 255));
        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setForeground(new java.awt.Color(0, 0, 0));
        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Statistiques.setForeground(new java.awt.Color(255, 255, 255));
        recherchePanel.setVisible(true);
        ajoutPanel.setVisible(false);
        supprimerPanel.setVisible(false);
        modifierModifierPanel.setVisible(false);
        jLayeredPane1.remove(statsPanel);
        statsPanel.setVisible(false);
        rSupprimerButton.setVisible(true);
        rSupprimerButton.setText("Supprimer");
        rechercheButton.setText("Rechercher");
        supprimerResultLabel.setText("");
        mode1 = "Supprimer";
        erreurLabel.setText("");
        switch (mode2) {
        case "Eleve":
            supprimerLabel.setText("Clé de l'élève à supprimer : ");
            break;
        case "Enseignant":
            supprimerLabel.setText("Clé de l'enseignant à supprimer : ");
            break;
        case "Inscription":
            supprimerLabel.setText("Clé de l'inscription à supprimer : ");
            break;
        case "Classe":
            supprimerLabel.setText("Clé de la classe à supprimer : ");
            break;
        case "Niveau":
            supprimerLabel.setText("Clé du niveau à supprimer : ");
            break;
        case "Annee":
            supprimerLabel.setText("Clé de l'année à supprimer : ");
            break;
        case "Trimestre":
            supprimerLabel.setText("Clé du trimestre à supprimer : ");
            break;
        case "Bulletin":
            supprimerLabel.setText("Clé du bulletin à supprimer : ");
            break;
        case "Enseignement":
            supprimerLabel.setText("Clé de l'enseignement à supprimer : ");
            break;
        case "Discipline":
            supprimerLabel.setText("Clé de la discipline à supprimer : ");
            break;
        case "BulletinDetails":
            supprimerLabel.setText("Clé de du bulletin détaillé à supprimer : ");
            break;
        case "Evaluation":
            supprimerLabel.setText("Clé de l'évaluation à supprimer : ");
            break;
        case "Ecole":
            supprimerLabel.setText("Clé de l'école à supprimer : ");
            break;
        default:
        }
    }// GEN-LAST:event_SupprimerActionPerformed

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ModifierActionPerformed
        Rechercher.setForeground(new java.awt.Color(255, 255, 255));
        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        Modifier.setForeground(new java.awt.Color(0, 0, 0));
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Statistiques.setForeground(new java.awt.Color(255, 255, 255));

        recherchePanel.setVisible(true);
        ajoutPanel.setVisible(false);
        supprimerPanel.setVisible(false);
        jLayeredPane1.remove(statsPanel);
        statsPanel.setVisible(false);
        supprimerResultLabel.setText("");
        modifierModifierPanel.setVisible(false);
        erreurLabel.setText("");
        rSupprimerButton.setVisible(true);
        rSupprimerButton.setText("Modifier");
        mode1 = "Modifier";
        switch (mode2) {
        case "Eleve":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(true);
            ajout2Field.setVisible(true);

            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout6Label.setVisible(false);
            ajout6ComboBox.setVisible(false);
            ajout7Label.setVisible(false);
            ajout7ComboBox.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Prénom : ");
            ajout2Label.setText("Nom : ");
            break;
        case "Enseignant":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(true);
            ajout2Field.setVisible(true);

            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout6Label.setVisible(false);
            ajout6ComboBox.setVisible(false);
            ajout7Label.setVisible(false);
            ajout7ComboBox.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Prénom : ");
            ajout2Label.setText("Nom : ");
            break;
        case "Inscription":
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);
            ajout8Label.setVisible(true);
            ajout8ComboBox.setVisible(true);

            ajout1Label.setVisible(false);
            ajout1Field.setVisible(false);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);

            ajout6Label.setText("Niveau : ");
            ajout7Label.setText("Classe : ");
            ajout8Label.setText("Eleve : ");

            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            ajout8ComboBox.removeAllItems();

            break;
        case "Classe":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);
            ajout8Label.setVisible(true);
            ajout8ComboBox.setVisible(true);

            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout1Label.setText("Nom : ");
            ajout6Label.setText("Ecole : ");
            ajout7Label.setText("Niveau : ");
            ajout8Label.setText("Année Scolaire : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            ajout8ComboBox.removeAllItems();
            break;
        case "Niveau":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout6Label.setVisible(false);
            ajout6ComboBox.setVisible(false);
            ajout7Label.setVisible(false);
            ajout7ComboBox.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Nom : ");
            break;
        case "Annee":
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);

            ajout1Label.setVisible(false);
            ajout1Field.setVisible(false);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout6Label.setText("Début : ");
            ajout7Label.setText("Fin : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            break;
        case "Trimestre":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(true);
            ajout2Field.setVisible(true);
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);

            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Date de début : ");
            ajout2Label.setText("Date de fin : ");
            ajout6Label.setText("Année Scolaire : ");
            ajout7Label.setText("Numéro : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            break;
        case "Bulletin":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);

            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Appréciation : ");
            ajout6Label.setText("Trimestre");
            ajout7Label.setText("Nom : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            break;
        case "Enseignement":
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);
            ajout8Label.setVisible(true);
            ajout8ComboBox.setVisible(true);

            ajout1Label.setVisible(false);
            ajout1Field.setVisible(false);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout6Label.setText("Classe : ");
            ajout7Label.setText("Discipline : ");
            ajout8Label.setText("Professeur : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            ajout8ComboBox.removeAllItems();
            break;
        case "Discipline":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout6Label.setVisible(false);
            ajout6ComboBox.setVisible(false);
            ajout7Label.setVisible(false);
            ajout7ComboBox.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Nom : ");
            break;
        case "BulletinDetails":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);
            ajout8Label.setVisible(true);
            ajout8ComboBox.setVisible(true);

            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout1Label.setText("Appréciation : ");
            ajout6Label.setText("Trimestre: ");
            ajout7Label.setText("Eleve : ");
            ajout6ComboBox.removeAllItems();
            ajout7ComboBox.removeAllItems();
            ajout8ComboBox.removeAllItems();
            break;
        case "Evaluation":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(true);
            ajout2Field.setVisible(true);
            ajout6Label.setVisible(true);
            ajout6ComboBox.setVisible(true);
            ajout7Label.setVisible(true);
            ajout7ComboBox.setVisible(true);
            ajout8Label.setVisible(true);
            ajout8ComboBox.setVisible(true);

            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Field.setVisible(false);
            ajout1Label.setText("Note : ");
            ajout2Label.setText("Appréciation : ");
            ajout6Label.setText("Trimestre: ");
            ajout7Label.setText("Eleve");
            ajout8Label.setText("Discipline : ");
            ajout6ComboBox.removeAll();
            ajout7ComboBox.removeAll();
            ajout8ComboBox.removeAll();
            break;
        case "Ecole":
            ajout1Label.setVisible(true);
            ajout1Field.setVisible(true);
            ajout2Label.setVisible(false);
            ajout2Field.setVisible(false);
            ajout3Label.setVisible(false);
            ajout3Field.setVisible(false);
            ajout4Label.setVisible(false);
            ajout4Field.setVisible(false);
            ajout5Label.setVisible(false);
            ajout5Label.setVisible(false);
            ajout6Label.setVisible(false);
            ajout6ComboBox.setVisible(false);
            ajout7Label.setVisible(false);
            ajout7ComboBox.setVisible(false);
            ajout8Label.setVisible(false);
            ajout8ComboBox.setVisible(false);
            ajout1Label.setText("Nom : ");
            break;
        default:
        }
    }// GEN-LAST:event_ModifierActionPerformed

    private void DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DeconnexionActionPerformed
        jLayeredPane1.remove(statsPanel);
        statsPanel.setVisible(false);
        setVisible(false);
        mode1 = "Deconnexion";
        Accueil accueil = new Accueil();
        accueil.setVisible(true);
        dispose();
    }// GEN-LAST:event_DeconnexionActionPerformed

    private void eleveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_eleveActionPerformed
        eleve.setForeground(new java.awt.Color(0, 0, 0));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Prénom");
        rechercheComboBox.addItem("Nom");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Eleve";
        supprimerLabel.setText("Clé de l'élève à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(true);
        ajout2Field.setVisible(true);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout6Label.setVisible(false);
        ajout6ComboBox.setVisible(false);
        ajout7Label.setVisible(false);
        ajout7ComboBox.setVisible(false);
        ajout8Label.setVisible(false);
        ajout8ComboBox.setVisible(false);
        ajout1Label.setText("Prénom : ");
        ajout2Label.setText("Nom : ");
        ArrayList<Object> list = bdd.rechercher("a", "a", "Personne");
        Iterator<Object> it = list.iterator();
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        column1.setHeaderValue("Id");
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        column2.setHeaderValue("Prénom");
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        column3.setHeaderValue("Nom");
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        column4.setHeaderValue("");
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        column5.setHeaderValue("");
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int taille = list.size();
        model.setNumRows(taille);
        while (it.hasNext()) {
            Personne o = (Personne) it.next();
            if (o.isType() == false) {
                int id = o.getId();
                String prenom = o.getPrenom();
                String nom = o.getNom();
                Object[] data = { id, prenom, nom };
                model.addRow(data);
            }

        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }// GEN-LAST:event_eleveActionPerformed

    private void enseignantActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_enseignantActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(0, 0, 0));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Prénom");
        rechercheComboBox.addItem("Nom");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Enseignant";// TODO add your handling code here:
        supprimerLabel.setText("Clé de l'enseignant à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(true);
        ajout2Field.setVisible(true);

        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout6Label.setVisible(false);
        ajout6ComboBox.setVisible(false);
        ajout7Label.setVisible(false);
        ajout7ComboBox.setVisible(false);
        ajout8Label.setVisible(false);
        ajout8ComboBox.setVisible(false);
        ajout1Label.setText("Prénom : ");
        ajout2Label.setText("Nom : ");
        ArrayList<Object> Enseignantlist = bdd.rechercher("a", "a", "Personne");
        Iterator<Object> Enseignantit = Enseignantlist.iterator();
        TableColumn Enseignantcolumn1 = rechercherTable.getColumnModel().getColumn(0);
        Enseignantcolumn1.setHeaderValue("Id");
        TableColumn Enseignantcolumn2 = rechercherTable.getColumnModel().getColumn(1);
        Enseignantcolumn2.setHeaderValue("Prénom");
        TableColumn Enseignantcolumn3 = rechercherTable.getColumnModel().getColumn(2);
        Enseignantcolumn3.setHeaderValue("Nom");
        TableColumn Enseignantcolumn4 = rechercherTable.getColumnModel().getColumn(3);
        Enseignantcolumn4.setHeaderValue("");
        TableColumn Enseignantcolumn5 = rechercherTable.getColumnModel().getColumn(4);
        Enseignantcolumn5.setHeaderValue("");
        DefaultTableModel Enseignantmodel = (DefaultTableModel) rechercherTable.getModel();
        for (int i = Enseignantmodel.getRowCount() - 1; i >= 0; i--) {
            Enseignantmodel.removeRow(i);
        }
        int Enseignanttaille = Enseignantlist.size();
        Enseignantmodel.setNumRows(Enseignanttaille);
        while (Enseignantit.hasNext()) {
            Personne o = (Personne) Enseignantit.next();
            if (o.isType() == true) {
                int id = o.getId();
                String prenom = o.getPrenom();
                String nom = o.getNom();
                Object[] data = { id, prenom, nom };
                Enseignantmodel.addRow(data);
            }

        }
        for (int i = Enseignantmodel.getRowCount() - 1; i >= 0; i--) {
            if (Enseignantmodel.getValueAt(i, 0) == null) {
                Enseignantmodel.removeRow(i);
            }
        }
        rechercherTable.setModel(Enseignantmodel);
    }// GEN-LAST:event_enseignantActionPerformed

    private void inscriptionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inscriptionActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(0, 0, 0));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Nom de la classe");
        rechercheComboBox.addItem("Nom de l'élève");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Inscription";// TODO add your handling code here:
        supprimerLabel.setText("Clé de l'inscription à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");

        ajout6Label.setVisible(true);
        ajout6ComboBox.setVisible(true);
        ajout7Label.setVisible(true);
        ajout7ComboBox.setVisible(true);
        ajout8Label.setVisible(true);
        ajout8ComboBox.setVisible(true);

        ajout1Label.setVisible(false);
        ajout1Field.setVisible(false);
        ajout2Label.setVisible(false);
        ajout2Field.setVisible(false);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);

        ajout6Label.setText("Niveau : ");
        ajout7Label.setText("Classe : ");
        ajout8Label.setText("Eleve : ");

        ajout6ComboBox.removeAllItems();
        ajout7ComboBox.removeAllItems();
        ajout8ComboBox.removeAllItems();

        ajout6ComboBox.addItem("");
        ajout7ComboBox.addItem("");
        ajout8ComboBox.addItem("");

        ArrayList<Object> c = new ArrayList<>();
        c = bdd.rechercher("i", "i", "Niveau");
        String Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Niveau) c.get(i)).getNom();
                ajout6ComboBox.addItem(Nom_Item);
            }
        }

        c = bdd.rechercher("i", "i", "Classe");
        Nom_Item="";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Classe) c.get(i)).getNom();
                ajout7ComboBox.addItem(Nom_Item);
            }
        }

        c = bdd.rechercher("Type_P", "0", "Personne");
        Nom_Item="";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Personne) c.get(i)).getNom() + " " + ((Personne) c.get(i)).getPrenom();
                ajout8ComboBox.addItem(Nom_Item);
            }
        }

        ajout1Label.setText("idClasse : ");
        ajout2Label.setText("idPersonne : ");
        ArrayList<Object> Inscription_list = bdd.rechercher("a", "a", "Inscription");
        Iterator<Object> Inscription_it = Inscription_list.iterator();
        TableColumn Inscription_column1 = rechercherTable.getColumnModel().getColumn(0);
        Inscription_column1.setHeaderValue("Id");
        TableColumn Inscription_column2 = rechercherTable.getColumnModel().getColumn(1);
        Inscription_column2.setHeaderValue("Classe");
        TableColumn Inscription_column3 = rechercherTable.getColumnModel().getColumn(2);
        Inscription_column3.setHeaderValue("Eleve");
        TableColumn Inscription_column4 = rechercherTable.getColumnModel().getColumn(3);
        Inscription_column4.setHeaderValue("");
        TableColumn Inscription_column5 = rechercherTable.getColumnModel().getColumn(4);
        Inscription_column5.setHeaderValue("");
        DefaultTableModel Inscription_model = (DefaultTableModel) rechercherTable.getModel();
        for (int i = Inscription_model.getRowCount() - 1; i >= 0; i--) {
            Inscription_model.removeRow(i);
        }
        int Inscription_taille = Inscription_list.size();
        Inscription_model.setNumRows(Inscription_taille);
        while (Inscription_it.hasNext()) {
            Inscription o = (Inscription) Inscription_it.next();
            int id = o.getId();
            ArrayList<Object> idclasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()), "Classe");
            String classe = ((Classe) idclasse.get(0)).getNom();
            ArrayList<Object> idEleve = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
            String prenom = ((Personne) idEleve.get(0)).getPrenom();
            String nom = ((Personne) idEleve.get(0)).getNom();
            String eleve = prenom + " " + nom;
            Object[] data = { id, classe, eleve };
            Inscription_model.addRow(data);
        }
        for (int i = Inscription_model.getRowCount() - 1; i >= 0; i--) {
            if (Inscription_model.getValueAt(i, 0) == null) {
                Inscription_model.removeRow(i);
            }
        }
        rechercherTable.setModel(Inscription_model);
    }// GEN-LAST:event_inscriptionActionPerformed

    private void classeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_classeActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(0, 0, 0));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Nom");
        rechercheComboBox.addItem("Nom de l'école");
        rechercheComboBox.addItem("Nom du niveau");
        rechercheComboBox.addItem("Début d'année scolaire");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Classe";// TODO add your handling code here:
        supprimerLabel.setText("Clé de la classe à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout6Label.setVisible(true);
        ajout6ComboBox.setVisible(true);
        ajout7Label.setVisible(true);
        ajout7ComboBox.setVisible(true);
        ajout8Label.setVisible(true);
        ajout8ComboBox.setVisible(true);

        ajout2Label.setVisible(false);
        ajout2Field.setVisible(false);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout1Label.setText("Nom : ");
        ajout6Label.setText("Ecole : ");
        ajout7Label.setText("Niveau : ");
        ajout8Label.setText("Année Scolaire : ");
        ajout6ComboBox.removeAllItems();
        ajout7ComboBox.removeAllItems();
        ajout8ComboBox.removeAllItems();

        ajout6ComboBox.addItem("");
        ajout7ComboBox.addItem("");
        ajout8ComboBox.addItem("");

        ArrayList<Object> c = new ArrayList<>();
        c = bdd.rechercher("i", "i", "Ecole");
        String Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Ecole) c.get(i)).getNom();
                ajout6ComboBox.addItem(Nom_Item);
            }
        }

        c = bdd.rechercher("i", "i", "Niveau");
        Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Niveau) c.get(i)).getNom();
                ajout7ComboBox.addItem(Nom_Item);
            }
        }

        c = bdd.rechercher("i", "i", "AnneeScolaire");
        Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((AnneeScolaire) c.get(i)).getAnneeDebut() + "/" + ((AnneeScolaire) c.get(i)).getAnneeFin();
                ajout8ComboBox.addItem(Nom_Item);
            }
        }

        ajout2Label.setText("idEcole : ");
        ajout3Label.setText("idNiveau : ");
        ajout4Label.setText("idAnneeScolaire : ");
        ArrayList<Object> Classe_list = bdd.rechercher("a", "a", "Classe");
        Iterator<Object> Classe_it = Classe_list.iterator();
        TableColumn Classe_column1 = rechercherTable.getColumnModel().getColumn(0);
        Classe_column1.setHeaderValue("Id");
        TableColumn Classe_column2 = rechercherTable.getColumnModel().getColumn(1);
        Classe_column2.setHeaderValue("Nom");
        TableColumn Classe_column3 = rechercherTable.getColumnModel().getColumn(2);
        Classe_column3.setHeaderValue("Ecole");
        TableColumn Classe_column4 = rechercherTable.getColumnModel().getColumn(3);
        Classe_column4.setHeaderValue("Niveau");
        TableColumn Classe_column5 = rechercherTable.getColumnModel().getColumn(4);
        Classe_column5.setHeaderValue("Annee scolaire");
        DefaultTableModel Classe_model = (DefaultTableModel) rechercherTable.getModel();
        for (int i = Classe_model.getRowCount() - 1; i >= 0; i--) {
            Classe_model.removeRow(i);
        }
        int Classe_taille = Classe_list.size();
        Classe_model.setNumRows(Classe_taille);
        while (Classe_it.hasNext()) {
            Classe o = (Classe) Classe_it.next();
            int id = o.getId();
            ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()), "AnneeScolaire");
            String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                    + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
            ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(o.getIdEcole()), "Ecole");
            String ecole = ((Ecole) idEcole.get(0)).getNom();
            ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(o.getIdNiveau()), "Niveau");
            String niveau = ((Niveau) idNiveau.get(0)).getNom();
            String nom = o.getNom();
            Object[] data = { id, nom, ecole, niveau, annee };
            Classe_model.addRow(data);
        }
        for (int i = Classe_model.getRowCount() - 1; i >= 0; i--) {
            if (Classe_model.getValueAt(i, 0) == null) {
                Classe_model.removeRow(i);
            }
        }
        rechercherTable.setModel(Classe_model);
    }// GEN-LAST:event_classeActionPerformed

    private void niveauActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_niveauActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(0, 0, 0));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Nom");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Niveau";
        // TODO add your handling code here:
        supprimerLabel.setText("Clé du niveau à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(false);
        ajout2Field.setVisible(false);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout6Label.setVisible(false);
        ajout6ComboBox.setVisible(false);
        ajout7Label.setVisible(false);
        ajout7ComboBox.setVisible(false);
        ajout8Label.setVisible(false);
        ajout8ComboBox.setVisible(false);
        ajout1Label.setText("Nom : ");
        ArrayList<Object> Niveau_list = bdd.rechercher("a", "a", "Niveau");
        Iterator<Object> Niveau_it = Niveau_list.iterator();
        TableColumn Niveau_column1 = rechercherTable.getColumnModel().getColumn(0);
        Niveau_column1.setHeaderValue("Id");
        TableColumn Niveau_column2 = rechercherTable.getColumnModel().getColumn(1);
        Niveau_column2.setHeaderValue("Nom");
        TableColumn Niveau_column3 = rechercherTable.getColumnModel().getColumn(2);
        Niveau_column3.setHeaderValue("");
        TableColumn Niveau_column4 = rechercherTable.getColumnModel().getColumn(3);
        Niveau_column4.setHeaderValue("");
        TableColumn Niveau_column5 = rechercherTable.getColumnModel().getColumn(4);
        Niveau_column5.setHeaderValue("");
        DefaultTableModel Niveau_model = (DefaultTableModel) rechercherTable.getModel();
        for (int i = Niveau_model.getRowCount() - 1; i >= 0; i--) {
            Niveau_model.removeRow(i);
        }
        int Niveau_taille = Niveau_list.size();
        Niveau_model.setNumRows(Niveau_taille);
        while (Niveau_it.hasNext()) {
            Niveau o = (Niveau) Niveau_it.next();
            int id = o.getId();
            String nom = o.getNom();
            Object[] data = { id, nom };
            Niveau_model.addRow(data);
        }
        for (int i = Niveau_model.getRowCount() - 1; i >= 0; i--) {
            if (Niveau_model.getValueAt(i, 0) == null) {
                Niveau_model.removeRow(i);
            }
        }
        rechercherTable.setModel(Niveau_model);
    }// GEN-LAST:event_niveauActionPerformed

    private void anneeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_anneeActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(0, 0, 0));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Début");
        rechercheComboBox.addItem("Fin");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Annee";// TODO add your handling code here:
        supprimerLabel.setText("Clé de l'année à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");

        ajout6Label.setVisible(true);
        ajout6ComboBox.setVisible(true);
        ajout7Label.setVisible(true);
        ajout7ComboBox.setVisible(true);

        ajout1Label.setVisible(false);
        ajout1Field.setVisible(false);
        ajout2Label.setVisible(false);
        ajout2Field.setVisible(false);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout8Label.setVisible(false);
        ajout8ComboBox.setVisible(false);
        ajout6Label.setText("Début : ");
        ajout7Label.setText("Fin : ");
        ajout6ComboBox.removeAllItems();
        ajout7ComboBox.removeAllItems();

        ajout6ComboBox.addItem("");
        ajout7ComboBox.addItem("");

        for (int i = 2019; i < 2019 + 7; i++) {
            ajout6ComboBox.addItem(Integer.toString(i));
        }
        for (int i = 2020; i < 2019 + 7; i++) {
            ajout7ComboBox.addItem(Integer.toString(i));
        }
        
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        ArrayList<Object> list;
        Iterator<Object> it;
        int taille;
        list = bdd.rechercher("a", "a", "AnneeScolaire");
        it = list.iterator();
        column1.setHeaderValue("Id");
        column2.setHeaderValue("Début");
        column3.setHeaderValue("Fin");
        column4.setHeaderValue("");
        column5.setHeaderValue("");
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        taille = list.size();
        model.setNumRows(taille);
        while (it.hasNext()) {
            AnneeScolaire o = (AnneeScolaire) it.next();
            int id = o.getId();
            int debut = o.getAnneeDebut();
            int fin = o.getAnneeFin();
            Object[] data = { id, debut, fin };
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
        
        if(mode1 == "Modifier"){
            
            ArrayList c=new ArrayList<>();
            
            int ligneSelectionne = rechercherTable.getSelectedRow();
            
            int id_Select = ((AnneeScolaire)rechercherTable.getValueAt(ligneSelectionne, 0)).getId();
            c=bdd.rechercher("Id", Integer.toString(id_Select), "AnneeScolaire");
            
            if(!c.isEmpty()){
                int debut= ((AnneeScolaire)c.get(0)).getAnneeDebut() ;
                int fin= ((AnneeScolaire)c.get(0)).getAnneeFin();
               
                for (int i = 2019; i < 2019 + 7; i++) {
                    if(Integer.toString(debut) == ajout6ComboBox.getItemAt(i))
                        ajout6ComboBox.setSelectedIndex(i);
                }
                for (int i = 2020; i < 2019 + 7; i++) {
                    if(Integer.toString(fin) == ajout7ComboBox.getItemAt(i))
                        ajout7ComboBox.setSelectedIndex(i);
                }
               
            }
        }
        
    }// GEN-LAST:event_anneeActionPerformed

    private void trimestreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_trimestreActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(0, 0, 0));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Numéro");
        rechercheComboBox.addItem("Début d'année scolaire");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Trimestre";// TODO add your handling code here:
        supprimerLabel.setText("Clé du trimestre à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(true);
        ajout2Field.setVisible(true);
        ajout6Label.setVisible(true);
        ajout6ComboBox.setVisible(true);
        ajout7Label.setVisible(true);
        ajout7ComboBox.setVisible(true);

        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout8Label.setVisible(false);
        ajout8ComboBox.setVisible(false);
        ajout1Label.setText("Date de début : ");
        ajout2Label.setText("Date de fin : ");
        ajout6Label.setText("Année Scolaire : ");
        ajout7Label.setText("Numéro : ");
        ajout6ComboBox.removeAllItems();
        ajout7ComboBox.removeAllItems();

        ajout6ComboBox.addItem("");
        ajout7ComboBox.addItem("");

        ArrayList<Object> c = new ArrayList<>();
        c = bdd.rechercher("i", "i", "AnneeScolaire");
        String nom = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                nom = ((AnneeScolaire) c.get(i)).getAnneeDebut() + "/" + ((AnneeScolaire) c.get(i)).getAnneeFin();
                ajout6ComboBox.addItem(nom);
            }
        }

        for (int i = 1; i < 4; i++) {
            ajout7ComboBox.addItem(Integer.toString(i));
        }

        ajout1Label.setText("Numéro : ");
        ajout2Label.setText("Date de début : ");
        ajout3Label.setText("Date de fin : ");
        ajout4Label.setText("idAnneeScolaire : ");
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        ArrayList<Object> list;
        Iterator<Object> it;
        int taille;
        list = bdd.rechercher("a", "a", "Trimestre");
        it = list.iterator();
        column1.setHeaderValue("Id");
        column2.setHeaderValue("Numéro");
        column3.setHeaderValue("Début");
        column4.setHeaderValue("Fin");
        column5.setHeaderValue("Année scolaire");
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        taille = list.size();
        model.setNumRows(taille);
        while (it.hasNext()) {
            Trimestre o = (Trimestre) it.next();
            int id = o.getId();
            int numero = o.getNumero();
            String debut = o.getDebut().toString();
            String fin = o.getFin().toString();
            ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()), "AnneeScolaire");
            String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                    + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
            Object[] data = { id, numero, debut, fin, annee };
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }// GEN-LAST:event_trimestreActionPerformed

    private void bulletinActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bulletinActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(0, 0, 0));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Début d'année scolaire");
        rechercheComboBox.addItem("Nom de la classe");
        rechercheComboBox.addItem("Nom de l'élève");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Bulletin";// TODO add your handling code here:
        supprimerLabel.setText("Clé du bulletin à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");

        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout6Label.setVisible(true);
        ajout6ComboBox.setVisible(true);
        ajout7Label.setVisible(true);
        ajout7ComboBox.setVisible(true);

        ajout2Label.setVisible(false);
        ajout2Field.setVisible(false);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout8Label.setVisible(false);
        ajout8ComboBox.setVisible(false);
        ajout1Label.setText("Appréciation : ");
        ajout6Label.setText("Trimestre");
        ajout7Label.setText("Nom : ");
        ajout6ComboBox.removeAllItems();
        ajout7ComboBox.removeAllItems();

        ajout6ComboBox.addItem("");
        ajout7ComboBox.addItem("");

        ArrayList<Object> c = new ArrayList<>();
        ArrayList<Object> e = new ArrayList<>();

        c = bdd.rechercher("i", "i", "Trimestre");
        String Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Trimestre) c.get(i)).getDebut().toString() + " :: "
                        + ((Trimestre) c.get(i)).getFin().toString();
                ajout6ComboBox.addItem(Nom_Item);
            }
        }
        /*
         * //Trouve Les Trimestre des eleves c =
         * bdd.rechercher("Type_P","0","Personne");
         * 
         * if(!c.isEmpty()){
         * 
         * for(int k=0; k<c.size(); k++){ e = bdd.rechercher("IdPersonne",
         * Integer.toString(((Personne)c.get(k)).getId()), "Inscription"); nom="";
         * 
         * if(!e.isEmpty()){ d =
         * bdd.rechercher("IdInscription",Integer.toString(((Inscription)e.get(0)).getId
         * ()),"Bulletin"); if(!d.isEmpty()){ for (int i = 0; i < d.size(); i++) { f =
         * bdd.rechercher("Id",Integer.toString(((Bulletin)d.get(i)).getId()) ,
         * "Trimestre");
         * 
         * for(int j=0; j<f.size(); j++){ nom = ((Personne) c.get(k)).getNom() + " " +
         * ((Personne) c.get(k)).getPrenom() +" --- "+ ((Trimestre)
         * f.get(j)).getDebut()+" :: "+((Trimestre) f.get(j)).getFin();
         * ajout7ComboBox.addItem(nom); } } } } } }
         */

        c = bdd.rechercher("", "", "Inscription");

        if (!c.isEmpty()) {

            for (int k = 0; k < c.size(); k++) {
                e = bdd.rechercher("Id", Integer.toString(((Inscription) c.get(k)).getIdPersonne()), "Personne");
                Nom_Item = "";

                if (!e.isEmpty()) {

                    for (int j = 0; j < e.size(); j++) {
                        Nom_Item = ((Personne) e.get(j)).getNom() + " " + ((Personne) e.get(j)).getPrenom();
                        ajout7ComboBox.addItem(Nom_Item);
                    }

                }
            }
        }

        ajout1Label.setText("idTrimestre : ");
        ajout2Label.setText("idInscription : ");
        ajout3Label.setText("Appréciation : ");
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        ArrayList<Object> list;
        Iterator<Object> it;
        int taille;
        list = bdd.rechercher("a", "a", "Bulletin");
        it = list.iterator();
        column1.setHeaderValue("Id");
        column2.setHeaderValue("Trimestre");
        column3.setHeaderValue("Inscription");
        column4.setHeaderValue("Appréciation");
        column5.setHeaderValue("");
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        taille = list.size();
        model.setNumRows(taille);
        while (it.hasNext()) {
            Bulletin o = (Bulletin) it.next();
            int id = o.getId();
            String appreciation = o.getAppreciation();
            ArrayList<Object> idTrimestre = bdd.rechercher("Id", String.valueOf(o.getIdTrimestre()), "Trimestre");
            String trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                    + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
            ArrayList<Object> idInscription = bdd.rechercher("Id", String.valueOf(o.getIdInscription()), "Inscription");
            ArrayList<Object> idclasse = bdd.rechercher("Id",
                    String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
            String classe = ((Classe) idclasse.get(0)).getNom();
            ArrayList<Object> idEleve = bdd.rechercher("Id",
                    String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
            String prenom = ((Personne) idEleve.get(0)).getPrenom();
            String nom = ((Personne) idEleve.get(0)).getNom();
            String inscription = classe + "-" + prenom + " " + nom;
            Object[] data = { id, trimestre, inscription, appreciation };
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }// GEN-LAST:event_bulletinActionPerformed

    private void enseignementActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_enseignementActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(0, 0, 0));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Nom de la classe");
        rechercheComboBox.addItem("Nom de la discipline");
        rechercheComboBox.addItem("Nom du professeur");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Enseignement";// TODO add your handling code here:
        supprimerLabel.setText("Clé de l'enseignement à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");

        ajout6Label.setVisible(true);
        ajout6ComboBox.setVisible(true);
        ajout7Label.setVisible(true);
        ajout7ComboBox.setVisible(true);
        ajout8Label.setVisible(true);
        ajout8ComboBox.setVisible(true);

        ajout1Label.setVisible(false);
        ajout1Field.setVisible(false);
        ajout2Label.setVisible(false);
        ajout2Field.setVisible(false);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout6Label.setText("Classe : ");
        ajout7Label.setText("Discipline : ");
        ajout8Label.setText("Professeur : ");
        ajout6ComboBox.removeAllItems();
        ajout7ComboBox.removeAllItems();
        ajout8ComboBox.removeAllItems();

        ajout6ComboBox.addItem("");
        ajout7ComboBox.addItem("");
        ajout8ComboBox.addItem("");

        ArrayList<Object> c = new ArrayList<>();
        ArrayList<Object> d = new ArrayList<>();

        c = bdd.rechercher("i", "i", "Niveau");
        String Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                d = bdd.rechercher("IdNiveau", Integer.toString(((Niveau) c.get(i)).getId()), "Classe");
                if (!d.isEmpty()) {
                    for (int j = 0; j < d.size(); j++) {
                        Nom_Item = ((Niveau) c.get(i)).getNom() + " - " + ((Classe) d.get(j)).getNom();
                        ajout6ComboBox.addItem(Nom_Item);
                    }
                }
            }
        }

        c = bdd.rechercher("i", "i", "Discipline");
        Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Discipline) c.get(i)).getNom();
                ajout7ComboBox.addItem(Nom_Item);
            }
        }

        c = bdd.rechercher("Type_P", "1", "Personne");
        Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Personne) c.get(i)).getNom() + " " + ((Personne) c.get(i)).getPrenom();
                ajout8ComboBox.addItem(Nom_Item);
            }
        }

        ajout1Label.setText("idClasse : ");
        ajout2Label.setText("idDiscipline : ");
        ajout3Label.setText("idPersonne : ");
        rechercherTable.removeAll();
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        ArrayList<Object> list;
        Iterator<Object> it;
        int taille;
        list = bdd.rechercher("a", "a", "Enseignement");
        it = list.iterator();
        column1.setHeaderValue("Id");
        column2.setHeaderValue("Classe");
        column3.setHeaderValue("Discipline");
        column4.setHeaderValue("Professeur");
        column5.setHeaderValue("");
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        taille = list.size();
        model.setNumRows(taille);
        while (it.hasNext()) {
            Enseignement o = (Enseignement) it.next();
            int id = o.getId();
            ArrayList<Object> idClasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()), "Classe");
            ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdEcole()),
                    "Ecole");
            ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()),
                    "Niveau");
            ArrayList<Object> idAnnee = bdd.rechercher("Id",
                    String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
            ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(o.getIdDiscipline()), "Discipline");
            String classe_nom = ((Classe) idClasse.get(0)).getNom();
            String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
            String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
            String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                    + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
            String classe = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
            String discipline = ((Discipline) idDiscipline.get(0)).getNom();
            ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
            String prenom = ((Personne) idProf.get(0)).getPrenom();
            String nom = ((Personne) idProf.get(0)).getNom();
            String professeur = prenom + " " + nom;
            Object[] data = { id, classe, discipline, professeur };
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }// GEN-LAST:event_enseignementActionPerformed

    private void disciplineActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_disciplineActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(0, 0, 0));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Nom");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Discipline";// TODO add your handling code here:
        supprimerLabel.setText("Clé de la discipline à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(false);
        ajout2Field.setVisible(false);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout6Label.setVisible(false);
        ajout6ComboBox.setVisible(false);
        ajout7Label.setVisible(false);
        ajout7ComboBox.setVisible(false);
        ajout8Label.setVisible(false);
        ajout8ComboBox.setVisible(false);
        ajout1Label.setText("Nom : ");
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        ArrayList<Object> list;
        Iterator<Object> it;
        int taille;
        // rechercheLabel.setText("Clé de la discipline recherchée : ");
        list = bdd.rechercher("a", "a", "Discipline");
        it = list.iterator();
        column1.setHeaderValue("Id");
        column2.setHeaderValue("Nom");
        column3.setHeaderValue("");
        column4.setHeaderValue("");
        column5.setHeaderValue("");
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        taille = list.size();
        model.setNumRows(taille);
        while (it.hasNext()) {
            Discipline o = (Discipline) it.next();
            int id = o.getId();
            String nom = o.getNom();
            Object[] data = { id, nom };
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }// GEN-LAST:event_disciplineActionPerformed

    private void bulletindetailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bulletindetailActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(0, 0, 0));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Début d'année scolaire");
        rechercheComboBox.addItem("Nom de la classe");
        rechercheComboBox.addItem("Nom de l'élève");
        rechercheComboBox.addItem("Nom du professeur");
        rechercheComboBox.addItem("Nom de la discipline");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "BulletinDetails";// TODO add your handling code here:
        supprimerLabel.setText("Clé du bulletin détaillé à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout6Label.setVisible(true);
        ajout6ComboBox.setVisible(true);
        ajout7Label.setVisible(true);
        ajout7ComboBox.setVisible(true);
        ajout8Label.setVisible(true);
        ajout8ComboBox.setVisible(true);

        ajout2Label.setVisible(false);
        ajout2Field.setVisible(false);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout1Label.setText("Appréciation : ");
        ajout6Label.setText("Trimestre: ");
        ajout7Label.setText("Eleve : ");
        ajout6ComboBox.removeAllItems();
        ajout7ComboBox.removeAllItems();
        ajout8ComboBox.removeAllItems();

        ajout6ComboBox.addItem("");
        ajout7ComboBox.addItem("");
        ajout8ComboBox.addItem("");

        ArrayList<Object> c = new ArrayList<>();
        ArrayList<Object> e = new ArrayList<>();

        c = bdd.rechercher("i", "i", "Trimestre");
        String Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Trimestre) c.get(i)).getDebut().toString() + " :: "
                        + ((Trimestre) c.get(i)).getFin().toString();
                ajout6ComboBox.addItem(Nom_Item);
            }
        }

        c = bdd.rechercher("", "", "Inscription");

        if (!c.isEmpty()) {

            for (int k = 0; k < c.size(); k++) {
                e = bdd.rechercher("Id", Integer.toString(((Inscription) c.get(k)).getIdPersonne()), "Personne");
                Nom_Item = "";

                if (!e.isEmpty()) {

                    for (int j = 0; j < e.size(); j++) {
                        Nom_Item = ((Personne) e.get(j)).getNom() + " " + ((Personne) e.get(j)).getPrenom();
                        ajout7ComboBox.addItem(Nom_Item);
                    }

                }
            }
        }

        c = bdd.rechercher("i", "i", "Discipline");
        Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Discipline) c.get(i)).getNom();
                ajout8ComboBox.addItem(Nom_Item);
            }
        }

        ajout1Label.setText("idBulletin : ");
        ajout2Label.setText("idEnseignement : ");
        ajout3Label.setText("Appréciation : ");
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        ArrayList<Object> list;
        Iterator<Object> it;
        int taille;
        list = bdd.rechercher("a", "a", "DetailBulletin");
        it = list.iterator();
        column1.setHeaderValue("Id");
        column2.setHeaderValue("Bulletin");
        column3.setHeaderValue("Enseignement");
        column4.setHeaderValue("Appreciation");
        column5.setHeaderValue("");
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        taille = list.size();
        model.setNumRows(taille);
        while (it.hasNext()) {
            DetailBulletin o = (DetailBulletin) it.next();
            int id = o.getId();
            String appreciation = o.getAppreciation();
            ArrayList<Object> idBulletin = bdd.rechercher("Id", String.valueOf(o.getIdBulletin()), "Bulletin");
            ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                    String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
            String bulletin_trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                    + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
            ArrayList<Object> idInscription = bdd.rechercher("Id",
                    String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()), "Inscription");
            ArrayList<Object> idclasse = bdd.rechercher("Id",
                    String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
            String classe = ((Classe) idclasse.get(0)).getNom();
            ArrayList<Object> idEleve = bdd.rechercher("Id",
                    String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
            String prenom = ((Personne) idEleve.get(0)).getPrenom();
            String nom = ((Personne) idEleve.get(0)).getNom();
            String bulletin_inscription = classe + "-" + prenom + " " + nom;
            String bulletin = bulletin_trimestre + " " + bulletin_inscription;
            ArrayList<Object> idEnseignement = bdd.rechercher("Id", String.valueOf(o.getIdEnseignement()),
                    "Enseignement");
            ArrayList<Object> idClasse = bdd.rechercher("Id",
                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
            ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()), "Discipline");
            ArrayList<Object> idPersonne = bdd.rechercher("Id",
                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
            String classe_nom = ((Classe) idClasse.get(0)).getNom();
            ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdEcole()),
                    "Ecole");
            String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
            ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()),
                    "Niveau");
            String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
            ArrayList<Object> idAnnee = bdd.rechercher("Id",
                    String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
            String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                    + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
            String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
            String discipline = ((Discipline) idDiscipline.get(0)).getNom();
            ArrayList<Object> idProf = bdd.rechercher("Id",
                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
            String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
            String prof_nom = ((Personne) idProf.get(0)).getNom();
            String enseignement_professeur = prof_prenom + " " + prof_nom;
            String enseignement = discipline + " " + enseignement_professeur;
            Object[] data = { id, bulletin, enseignement, appreciation };
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }// GEN-LAST:event_bulletindetailActionPerformed

    private void evaluationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_evaluationActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(0, 0, 0));
        ecole.setForeground(new java.awt.Color(255, 255, 255));
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Début d'année scolaire");
        rechercheComboBox.addItem("Nom de la classe");
        rechercheComboBox.addItem("Nom de l'élève");
        rechercheComboBox.addItem("Nom du professeur");
        rechercheComboBox.addItem("Nom de la discipline");
        rechercheComboBox.addItem("Note");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        mode2 = "Evaluation";
        // TODO add your handling code here:
        supprimerLabel.setText("Clé de l'évaluation à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(true);
        ajout2Field.setVisible(true);
        ajout6Label.setVisible(true);
        ajout6ComboBox.setVisible(true);
        ajout7Label.setVisible(true);
        ajout7ComboBox.setVisible(true);
        ajout8Label.setVisible(true);
        ajout8ComboBox.setVisible(true);

        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout1Label.setText("Note : ");
        ajout2Label.setText("Appréciation : ");
        ajout6Label.setText("Trimestre: ");
        ajout7Label.setText("Eleve");
        ajout8Label.setText("Discipline : ");
        ajout6ComboBox.removeAllItems();
        ajout7ComboBox.removeAllItems();
        ajout8ComboBox.removeAllItems();

        ajout6ComboBox.addItem("");
        ajout7ComboBox.addItem("");
        ajout8ComboBox.addItem("");

        ArrayList<Object> c = new ArrayList<>();
        ArrayList<Object> d = new ArrayList<>();
        ArrayList<Object> e = new ArrayList<>();
        ArrayList<Object> f = new ArrayList<>();

        c = bdd.rechercher("i", "i", "Trimestre");
        String Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Trimestre) c.get(i)).getDebut().toString() + " :: "
                        + ((Trimestre) c.get(i)).getFin().toString();
                ajout6ComboBox.addItem(Nom_Item);
            }
        }

        c = bdd.rechercher("", "", "Inscription");

        if (!c.isEmpty()) {

            for (int k = 0; k < c.size(); k++) {
                e = bdd.rechercher("Id", Integer.toString(((Inscription) c.get(k)).getIdPersonne()), "Personne");
                Nom_Item = "";

                if (!e.isEmpty()) {

                    for (int j = 0; j < e.size(); j++) {
                        Nom_Item = ((Personne) e.get(j)).getNom() + " " + ((Personne) e.get(j)).getPrenom();
                        ajout7ComboBox.addItem(Nom_Item);
                    }

                }
            }
        }

        c = bdd.rechercher("i", "i", "Discipline");
        Nom_Item = "";

        if (!c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                Nom_Item = ((Discipline) c.get(i)).getNom();
                ajout8ComboBox.addItem(Nom_Item);
            }
        }

        ajout1Label.setText("idDetailsBulletin : ");
        ajout2Label.setText("Note : ");
        ajout3Label.setText("Appréciation : ");
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        ArrayList<Object> list;
        Iterator<Object> it;
        int taille;
        list = bdd.rechercher("a", "a", "Evaluation");
        it = list.iterator();
        column1.setHeaderValue("Id");
        column2.setHeaderValue("Bulletin détaillé");
        column3.setHeaderValue("Note");
        column4.setHeaderValue("Appréciation");
        column5.setHeaderValue("");
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        taille = list.size();
        model.setNumRows(taille);
        while (it.hasNext()) {
            Evaluation o = (Evaluation) it.next();
            int id = o.getId();
            String appreciation = o.getAppreciation();
            int note = o.getNote();
            ArrayList<Object> idBulletinDetails = bdd.rechercher("Id", String.valueOf(o.getIdDetailBulletin()),
                    "DetailBulletin");
            String bulletinDetails_appreciation = ((DetailBulletin) idBulletinDetails.get(0)).getAppreciation();
            ArrayList<Object> idBulletin = bdd.rechercher("Id",
                    String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdBulletin()), "Bulletin");
            ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                    String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
            String bulletin_trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                    + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
            ArrayList<Object> idInscription = bdd.rechercher("Id",
                    String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()), "Inscription");
            ArrayList<Object> idclasse = bdd.rechercher("Id",
                    String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
            String classe = ((Classe) idclasse.get(0)).getNom();
            ArrayList<Object> idEleve = bdd.rechercher("Id",
                    String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
            String prenom = ((Personne) idEleve.get(0)).getPrenom();
            String nom = ((Personne) idEleve.get(0)).getNom();
            String bulletin_inscription = classe + "-" + prenom + " " + nom;
            String bulletin = bulletin_trimestre + " " + bulletin_inscription;
            ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                    String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdEnseignement()), "Enseignement");
            ArrayList<Object> idClasse = bdd.rechercher("Id",
                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
            ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()), "Discipline");
            ArrayList<Object> idPersonne = bdd.rechercher("Id",
                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
            String classe_nom = ((Classe) idClasse.get(0)).getNom();
            ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdEcole()),
                    "Ecole");
            String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
            ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()),
                    "Niveau");
            String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
            ArrayList<Object> idAnnee = bdd.rechercher("Id",
                    String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
            String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                    + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
            String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
            String discipline = ((Discipline) idDiscipline.get(0)).getNom();
            ArrayList<Object> idProf = bdd.rechercher("Id",
                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
            String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
            String prof_nom = ((Personne) idProf.get(0)).getNom();
            String enseignement_professeur = prof_prenom + " " + prof_nom;
            String enseignement = discipline + " " + enseignement_professeur;
            String bulletindetails = bulletin + " " + enseignement + " " + appreciation;
            Object[] data = { id, bulletindetails, note, appreciation };
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }// GEN-LAST:event_evaluationActionPerformed

    private void ajout1FieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ajout1FieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ajout1FieldActionPerformed

    private void rechercheFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rechercheFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rechercheFieldActionPerformed

    private void modifierValiderButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_modifierValiderButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_modifierValiderButtonActionPerformed

    private void StatistiquesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_StatistiquesActionPerformed
        Rechercher.setForeground(new java.awt.Color(255, 255, 255));
        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Statistiques.setForeground(new java.awt.Color(0, 0, 0));
        recherchePanel.setVisible(false);
        ajoutPanel.setVisible(false);
        supprimerPanel.setVisible(false);
        modifierModifierPanel.setVisible(false);
        resultatLabel.setText("");
        erreurLabel.setText("");
        supprimerResultLabel.setText("");
        rechercheButton.setText("Rechercher");
        mode1 = "Statistiques";
        jLayeredPane1.add(statsPanel);
        statsPanel.setVisible(true);

    }// GEN-LAST:event_StatistiquesActionPerformed

    private void ecoleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ecoleActionPerformed
        eleve.setForeground(new java.awt.Color(255, 255, 255));
        enseignant.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        classe.setForeground(new java.awt.Color(255, 255, 255));
        niveau.setForeground(new java.awt.Color(255, 255, 255));
        annee.setForeground(new java.awt.Color(255, 255, 255));
        trimestre.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        bulletindetail.setForeground(new java.awt.Color(255, 255, 255));
        evaluation.setForeground(new java.awt.Color(255, 255, 255));
        ecole.setForeground(new java.awt.Color(0, 0, 0));
        mode2 = "Ecole";
        rechercheComboBox.removeAllItems();
        rechercheComboBox.addItem("Id");
        rechercheComboBox.addItem("Nom");
        resultatLabel.setText("");
        switch (mode1) {
        case "Rechercher":
            rSupprimerButton.setVisible(false);
            rSupprimerButton.setText("Supprimer");
            break;
        case "Modifier":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Modifier");
            break;
        case "Supprimer":
            rSupprimerButton.setVisible(true);
            rSupprimerButton.setText("Supprimer");
            break;
        }
        supprimerLabel.setText("Clé de l'école à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(false);
        ajout2Field.setVisible(false);
        ajout3Label.setVisible(false);
        ajout3Field.setVisible(false);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Label.setVisible(false);
        ajout6Label.setVisible(false);
        ajout6ComboBox.setVisible(false);
        ajout7Label.setVisible(false);
        ajout7ComboBox.setVisible(false);
        ajout8Label.setVisible(false);
        ajout8ComboBox.setVisible(false);
        TableColumn column1 = rechercherTable.getColumnModel().getColumn(0);
        TableColumn column2 = rechercherTable.getColumnModel().getColumn(1);
        TableColumn column3 = rechercherTable.getColumnModel().getColumn(2);
        TableColumn column4 = rechercherTable.getColumnModel().getColumn(3);
        TableColumn column5 = rechercherTable.getColumnModel().getColumn(4);
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        ArrayList<Object> list;
        Iterator<Object> it;
        int taille;
        ajout1Label.setText("Nom : ");
        list = bdd.rechercher("a", "a", "Ecole");
        it = list.iterator();
        column1.setHeaderValue("Id");
        column2.setHeaderValue("Nom");
        column3.setHeaderValue("");
        column4.setHeaderValue("");
        column5.setHeaderValue("");
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        taille = list.size();
        model.setNumRows(taille);
        while (it.hasNext()) {
            Ecole o = (Ecole) it.next();
            int id = o.getId();
            String nom = o.getNom();
            Object[] data = { id, nom };
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }// GEN-LAST:event_ecoleActionPerformed

    private void ajout6ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ajout6ComboBoxActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ajout6ComboBoxActionPerformed

    private void ajouterButtonActionPerformed(java.awt.event.ActionEvent evt) {

        if ("Ajouter".equals(mode1)) {
            switch (mode2) {
                case "Eleve":

                    if (!ajout1Field.getText().isEmpty() && !ajout2Field.getText().isEmpty()) {

                        Eleve e = new Eleve();
                        e.setNom(ajout2Field.getText());
                        e.setPrenom(ajout1Field.getText());

                        boolean dup = false;

                        ArrayList<Object> duplica = new ArrayList<>();
                        duplica = bdd.rechercher("Type_P", "0", "Personne");

                        if (!duplica.isEmpty()) {
                            for (int i = 0; i < duplica.size(); i++) {
                                if (e.getPrenom().equals(((Eleve) duplica.get(i)).getPrenom())) {
                                    if (e.getNom().equals(((Eleve) duplica.get(i)).getNom())) {
                                        dup = true;
                                    }
                                }
                            }

                            if (!dup) {
                                bdd.AjouterP(e);

                                ajout1Field.setText("");
                                ajout2Field.setText("");
                            } else {
                                System.out.println("Cet element existe deja");
                            }
                        }

                    }

                    break;
                case "Enseignant":

                    if (!ajout1Field.getText().isEmpty() && !ajout2Field.getText().isEmpty()) {

                        Enseignant e = new Enseignant();
                        e.setNom(ajout2Field.getText());
                        e.setPrenom(ajout1Field.getText());

                        boolean dup = false;

                        ArrayList<Object> duplica = new ArrayList<>();
                        duplica = bdd.rechercher("Type_P", "1", "Personne");

                        if (!duplica.isEmpty()) {
                            for (int i = 0; i < duplica.size(); i++) {
                                if (e.getNom().equals(((Enseignant) duplica.get(i)).getNom())) {
                                    if (e.getPrenom().equals(((Enseignant) duplica.get(i)).getPrenom())) {
                                        dup = true;
                                    }
                                }
                            }

                            if (!dup) {
                                bdd.AjouterP(e);

                                ajout1Field.setText("");
                                ajout2Field.setText("");
                            } else {
                                System.out.println("Cet element existe deja");
                            }
                        }
                    }

                    break;
                case "Inscription":

                    if (!ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout8ComboBox.getSelectedItem().toString().isEmpty()) {

                        ArrayList<Object> d = new ArrayList<>();
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> eleve = new ArrayList<>();

                        d = bdd.rechercher("Nom", ajout6ComboBox.getSelectedItem().toString(), "Niveau");

                        if (!d.isEmpty()) {
                            int id_Niveau = ((Niveau) d.get(0)).getId();
                            int id_Classe = 0;
                            int id_Eleve = 0;
                            boolean dup = false;
                            e = bdd.rechercher("IdNiveau", Integer.toString(id_Niveau), "Classe");

                            String newStr = ajout8ComboBox.getSelectedItem().toString().substring(0, ajout8ComboBox.getSelectedItem().toString().indexOf(" "));
                            eleve = bdd.rechercher("Nom", newStr, "Personne");

                            if (!e.isEmpty() && !eleve.isEmpty()) {
                                for (int i = 0; i < e.size(); i++) {
                                    if (((Classe) e.get(i)).getNom().equals(ajout7ComboBox.getSelectedItem().toString())) {
                                        id_Classe = ((Classe) e.get(i)).getId();
                                    }
                                }

                                for (int i = 0; i < eleve.size(); i++) {
                                    String test = newStr + " " + ((Personne) eleve.get(i)).getPrenom();

                                    if (test.equals(ajout8ComboBox.getSelectedItem().toString())) {
                                        id_Eleve = ((Personne) eleve.get(i)).getId();
                                    }
                                }

                                if (id_Classe != 0 && id_Eleve != 0) {
                                    Inscription ins = new Inscription();
                                    ins.setIdPersonne(id_Eleve);
                                    ins.setIdClasse(id_Classe);

                                    ArrayList<Object> duplica = new ArrayList<>();

                                    duplica = bdd.rechercher("d", "d", "Inscription");

                                    if (!duplica.isEmpty()) {
                                        for (int i = 0; i < duplica.size(); i++) {
                                            if (ins.getIdClasse() == ((Inscription) duplica.get(i)).getIdClasse()
                                                    && ins.getIdPersonne() == ((Inscription) duplica.get(i)).getIdPersonne()) {
                                                dup = true;
                                            }
                                        }
                                        if (!dup) {
                                            bdd.AjouterP(ins);
                                            ajout6ComboBox.setSelectedIndex(0);
                                            ajout7ComboBox.setSelectedIndex(0);
                                            ajout8ComboBox.setSelectedIndex(0);
                                        } else {
                                            System.out.println("Cet element existe deja");
                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;
                case "Classe":
                    if (!ajout1Field.getText().isEmpty()
                            && !ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout8ComboBox.getSelectedItem().toString().isEmpty()) {

                        ArrayList<Object> d = new ArrayList<>();
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> f = new ArrayList<>();

                        String AnneeDebut = ajout8ComboBox.getSelectedItem().toString().substring(0, ajout8ComboBox.getSelectedItem().toString().indexOf("/"));

                        d = bdd.rechercher("Nom", ajout6ComboBox.getSelectedItem().toString(), "Ecole");
                        e = bdd.rechercher("Nom", ajout7ComboBox.getSelectedItem().toString(), "Niveau");
                        f = bdd.rechercher("AnneeDebut", AnneeDebut, "AnneeScolaire");

                        if (!d.isEmpty() && !e.isEmpty() && !f.isEmpty()) {

                            int id_Ecole = ((Ecole) d.get(0)).getId();
                            int id_Niveau = ((Niveau) e.get(0)).getId();
                            int id_Annee = ((AnneeScolaire) f.get(0)).getId();
                            String AnneeDF = Integer.toString(((AnneeScolaire) f.get(0)).getAnneeDebut()) + "/"
                                    + Integer.toString(((AnneeScolaire) f.get(0)).getAnneeFin());
                            boolean dup = false;

                            if (AnneeDF.equals(ajout8ComboBox.getSelectedItem().toString())) {
                                if (id_Ecole != 0 && id_Niveau != 0 && id_Annee != 0) {
                                    Classe c = new Classe();
                                    c.setIdEcole(id_Ecole);
                                    c.setIdNiveau(id_Niveau);
                                    c.setIdAnneeScolaire(id_Annee);
                                    c.setNom(ajout1Field.getText());

                                    ArrayList<Object> duplica = new ArrayList<>();

                                    duplica = bdd.rechercher("d", "d", "Classe");

                                    if (!duplica.isEmpty()) {
                                        for (int i = 0; i < duplica.size(); i++) {
                                            if (c.getIdEcole() == ((Classe) duplica.get(i)).getIdEcole()
                                                    && c.getIdNiveau() == ((Classe) duplica.get(i)).getIdNiveau()
                                                    && c.getIdAnneeScolaire() == ((Classe) duplica.get(i)).getIdAnneeScolaire()
                                                    && c.getNom().equals(((Classe) duplica.get(i)).getNom())) {
                                                dup = true;
                                            }
                                        }
                                        if (!dup) {
                                            bdd.AjouterP(c);

                                            ajout1Field.setText("");
                                            ajout6ComboBox.setSelectedIndex(0);
                                            ajout7ComboBox.setSelectedIndex(0);
                                            ajout8ComboBox.setSelectedIndex(0);
                                        } else {
                                            System.out.println("Cet element existe deja");
                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;
                case "Niveau":
                    if (!ajout1Field.getText().isEmpty()) {
                        Niveau n = new Niveau();
                        n.setNom(ajout1Field.getText());

                        boolean dup = false;

                        ArrayList<Object> duplica = new ArrayList<>();
                        duplica = bdd.rechercher("", "", "Niveau");

                        if (!duplica.isEmpty()) {
                            for (int i = 0; i < duplica.size(); i++) {
                                if (n.getNom().equals(((Niveau) duplica.get(i)).getNom())) {
                                    dup = true;
                                }
                            }

                            if (!dup) {
                                bdd.AjouterP(n);

                                ajout1Field.setText("");
                            } else {
                                System.out.println("Cet element existe deja");
                            }
                        }

                    }
                    break;
                case "Annee":

                    if (!ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()) {

                        int AnneeDebut = Integer.valueOf(ajout6ComboBox.getSelectedItem().toString());
                        int AnneeFin = Integer.valueOf(ajout7ComboBox.getSelectedItem().toString());

                        if (AnneeDebut == AnneeFin + 1) {

                            ArrayList<Object> duplica = new ArrayList<>();

                            duplica = bdd.rechercher("", "", "AnneeScolaire");

                            if (!duplica.isEmpty()) {

                                boolean dup = false;

                                for (int i = 0; i < duplica.size(); i++) {
                                    if (((AnneeScolaire) duplica.get(i)).getAnneeDebut() == AnneeDebut
                                            && ((AnneeScolaire) duplica.get(i)).getAnneeFin() == AnneeFin) {
                                        dup = true;
                                    }
                                }

                                if (!dup) {
                                    AnneeScolaire a = new AnneeScolaire();
                                    a.setAnneeDebut(AnneeDebut);
                                    a.setAnneeFin(AnneeFin);
                                    bdd.AjouterP(a);

                                    ajout6ComboBox.setSelectedIndex(0);
                                    ajout7ComboBox.setSelectedIndex(0);

                                } else {
                                    System.out.println("Cet element existe deja");
                                }

                            }

                        }
                    }

                    break;
                case "Trimestre":

                    if (!ajout1Field.getText().isEmpty()
                            && !ajout2Field.getText().isEmpty()
                            && !ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()) {

                        ArrayList<Object> d = new ArrayList<>();

                        modele.Date DateD = null;
                        modele.Date DateF = null;

                        String[] Annee = ajout6ComboBox.getSelectedItem().toString().split("/");

                        String[] JDepart = ajout1Field.getText().split("/");
                        String[] JFin = ajout2Field.getText().split("/");

                        if (JDepart.length == 3 && JFin.length == 3) {
                            if (Integer.valueOf(JDepart[0]) > 0 && Integer.valueOf(JDepart[0]) < 32
                                    && Integer.valueOf(JDepart[1]) > 0 && Integer.valueOf(JDepart[1]) < 13
                                    && Integer.valueOf(JDepart[2]) > 1990 && Integer.valueOf(JDepart[2]) < 2025
                                    && Integer.valueOf(JFin[0]) > 0 && Integer.valueOf(JFin[0]) < 32
                                    && Integer.valueOf(JFin[1]) > 0 && Integer.valueOf(JFin[1]) < 13
                                    && Integer.valueOf(JFin[2]) > 1990 && Integer.valueOf(JFin[2]) < 2025) {

                                DateD = new modele.Date();
                                DateD.setJour(Integer.valueOf(JDepart[0]));
                                DateD.setMois(Integer.valueOf(JDepart[1]));
                                DateD.setAnnee(Integer.valueOf(JDepart[2]));

                                DateF = new modele.Date();
                                DateF.setJour(Integer.valueOf(JFin[0]));
                                DateF.setMois(Integer.valueOf(JFin[1]));
                                DateF.setAnnee(Integer.valueOf(JFin[2]));

                            } else {
                                System.out.println("Probleme dans le format de vos informations");
                            }
                        }

                        if (DateD != null && DateF != null) {

                            d = bdd.rechercher("AnneeDebut", Annee[0], "AnneeScolaire");

                            if (!d.isEmpty()) {

                                int id_Annee = 0;
                                id_Annee = ((AnneeScolaire) d.get(0)).getId();

                                boolean dup = false;

                                if (id_Annee != 0) {
                                    Trimestre t = new Trimestre();
                                    t.setIdAnneeScolaire(id_Annee);
                                    t.setNumero(Integer.valueOf(ajout7ComboBox.getSelectedItem().toString()));
                                    t.setDebut(DateD);
                                    t.setFin(DateF);

                                    ArrayList<Object> duplica = new ArrayList<>();

                                    duplica = bdd.rechercher("d", "d", "Trimestre");

                                    if (!duplica.isEmpty()) {
                                        for (int i = 0; i < duplica.size(); i++) {
                                            if (t.getIdAnneeScolaire() == ((Trimestre) duplica.get(i)).getIdAnneeScolaire()
                                                    && t.getDebut() == ((Trimestre) duplica.get(i)).getDebut()
                                                    && t.getFin() == ((Trimestre) duplica.get(i)).getFin()
                                                    && t.getNumero() == ((Trimestre) duplica.get(i)).getNumero()) {

                                                dup = true;
                                            }
                                        }
                                        if (!dup) {
                                            bdd.AjouterP(t);

                                            ajout1Field.setText("");
                                            ajout2Field.setText("");
                                            ajout6ComboBox.setSelectedIndex(0);
                                            ajout7ComboBox.setSelectedIndex(0);
                                        } else {
                                            System.out.println("Cet element existe deja");
                                        }
                                    }

                                }
                            }
                        }
                    }

                    break;
                case "Bulletin":

                    if (!ajout1Field.getText().isEmpty() && !ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()) {

                        ArrayList<Object> d = new ArrayList<>();
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> f = new ArrayList<>();

                        String[] Date = ajout6ComboBox.getSelectedItem().toString().split(" :: ");

                        String[] NomPrenom = ajout7ComboBox.getSelectedItem().toString().split(" ");
                        String[] JDepart = Date[0].split("/");
                        String[] JFin = Date[1].split("/");

                        modele.Date DateD = null;
                        modele.Date DateF = null;

                        if (JDepart.length == 3 && JFin.length == 3) {
                            if (Integer.valueOf(JDepart[0]) > 0 && Integer.valueOf(JDepart[0]) < 32
                                    && Integer.valueOf(JDepart[1]) > 0 && Integer.valueOf(JDepart[1]) < 13
                                    && Integer.valueOf(JDepart[2]) > 1990 && Integer.valueOf(JDepart[2]) < 2025
                                    && Integer.valueOf(JFin[0]) > 0 && Integer.valueOf(JFin[0]) < 32
                                    && Integer.valueOf(JFin[1]) > 0 && Integer.valueOf(JFin[1]) < 13
                                    && Integer.valueOf(JFin[2]) > 1990 && Integer.valueOf(JFin[2]) < 2025) {

                                DateD = new modele.Date();
                                DateD.setJour(Integer.valueOf(JDepart[0]));
                                DateD.setMois(Integer.valueOf(JDepart[1]));
                                DateD.setAnnee(Integer.valueOf(JDepart[2]));

                                DateF = new modele.Date();
                                DateF.setJour(Integer.valueOf(JFin[0]));
                                DateF.setMois(Integer.valueOf(JFin[1]));
                                DateF.setAnnee(Integer.valueOf(JFin[2]));

                            } else {
                                System.out.println("Probleme dans le format de vos informations");
                            }
                        }

                        if (DateD != null && DateF != null) {

                            String DateRechercheDebut = DateD.getAnnee() + "-" + DateD.getMois() + "-" + DateD.getJour();

                            d = bdd.rechercher("Debut", DateRechercheDebut, "Trimestre");
                            e = bdd.rechercher("Nom", NomPrenom[0], "Personne");

                            int id_Eleve = 0;
                            int id_Inscription = 0;
                            int id_Trimestre = 0;

                            if (!d.isEmpty() && !e.isEmpty()) {

                                for (int i = 0; i < e.size(); i++) {
                                    if (((Personne) e.get(i)).getPrenom().equals(NomPrenom[1])) {
                                        id_Eleve = ((Personne) e.get(i)).getId();
                                    }
                                }

                                f = bdd.rechercher("IdPersonne", Integer.toString(id_Eleve), "Inscription");

                                if (!f.isEmpty()) {
                                    id_Inscription = ((Inscription) f.get(0)).getId();
                                }

                                for (int i = 0; i < d.size(); i++) {
                                    if (((Trimestre) d.get(i)).getFin().toString().equals(DateF.toString())) {
                                        id_Trimestre = ((Trimestre) d.get(i)).getId();
                                    }
                                }

                                if (id_Inscription != 0 && id_Trimestre != 0) {

                                    boolean dup = false;

                                    Bulletin b = new Bulletin();
                                    b.setIdInscription(id_Inscription);
                                    b.setIdTrimestre(id_Trimestre);
                                    b.setAppreciation(ajout1Field.getText());

                                    ArrayList<Object> duplica = new ArrayList<>();

                                    duplica = bdd.rechercher("d", "d", "Bulletin");

                                    if (!duplica.isEmpty()) {
                                        for (int i = 0; i < duplica.size(); i++) {
                                            if (b.getIdInscription() == ((Bulletin) duplica.get(i)).getIdInscription()
                                                    && b.getIdTrimestre() == ((Bulletin) duplica.get(i)).getIdTrimestre()
                                                    && b.getAppreciation().equals(((Bulletin) duplica.get(i)).getAppreciation())) {

                                                dup = true;
                                            }
                                        }
                                        if (!dup) {
                                            bdd.AjouterP(b);

                                            ajout1Field.setText("");
                                            ajout6ComboBox.setSelectedIndex(0);
                                            ajout7ComboBox.setSelectedIndex(0);
                                        } else {
                                            System.out.println("Cet element existe deja");
                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;
                case "Enseignement":

                    if (!ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout8ComboBox.getSelectedItem().toString().isEmpty()) {

                        String NomNiveauClasse = ajout6ComboBox.getSelectedItem().toString();
                        String NomDiscipline = ajout7ComboBox.getSelectedItem().toString();
                        String NomProf = ajout8ComboBox.getSelectedItem().toString();

                        String[] CN = NomNiveauClasse.split(" - ");
                        String[] NP = NomProf.split(" ");

                        ArrayList<Object> c = new ArrayList<>();
                        ArrayList<Object> d = new ArrayList<>();
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> f = new ArrayList<>();

                        c = bdd.rechercher("Nom", CN[0], "Niveau");
                        d = bdd.rechercher("Nom", CN[1], "Classe");
                        e = bdd.rechercher("Nom", NomDiscipline, "Discipline");
                        f = bdd.rechercher("Nom", NP[0], "Personne");

                        if (!c.isEmpty() && !d.isEmpty() && !e.isEmpty() && !f.isEmpty()) {

                            int id_Classe = 0;
                            int id_Discipline = ((Discipline) e.get(0)).getId();
                            int id_Prof = 0;

                            for (int i = 0; i < d.size(); i++) {
                                if (((Classe) d.get(i)).getIdNiveau() == ((Niveau) c.get(0)).getId()) {
                                    id_Classe = ((Classe) d.get(i)).getId();
                                }
                            }

                            for (int i = 0; i < f.size(); i++) {
                                if (((Personne) f.get(i)).getPrenom().equals(NP[1])) {
                                    id_Prof = ((Personne) f.get(i)).getId();
                                }
                            }

                            if (id_Classe != 0 && id_Discipline != 0 && id_Prof != 0) {

                                boolean dup = false;

                                ArrayList<Object> duplica = new ArrayList<>();
                                duplica = bdd.rechercher("s", "s", "Enseignement");

                                Enseignement ens = new Enseignement();
                                ens.setIdClasse(id_Classe);
                                ens.setIdDiscipline(id_Discipline);
                                ens.setIdPersonne(id_Prof);

                                if (!duplica.isEmpty()) {
                                    for (int i = 0; i < duplica.size(); i++) {
                                        if (ens.getIdClasse() == ((Enseignement) duplica.get(i)).getIdClasse()
                                                && ens.getIdDiscipline() == ((Enseignement) duplica.get(i)).getIdDiscipline()
                                                && ens.getIdPersonne() == ((Enseignement) duplica.get(i)).getIdPersonne()) {
                                            dup = true;
                                        }
                                    }

                                    if (!dup) {
                                        bdd.AjouterP(ens);

                                        ajout6ComboBox.setSelectedIndex(0);
                                        ajout7ComboBox.setSelectedIndex(0);
                                        ajout8ComboBox.setSelectedIndex(0);
                                    } else {
                                        System.out.println("Cet element existe deja");
                                    }
                                }

                            }

                        }

                    }

                    break;
                case "Discipline":

                    if (!ajout1Field.getText().isEmpty()) {
                        Discipline d = new Discipline();
                        d.setNom(ajout1Field.getText());

                        boolean dup = false;

                        ArrayList<Object> duplica = new ArrayList<>();
                        duplica = bdd.rechercher("s", "s", "Discipline");

                        if (!duplica.isEmpty()) {
                            for (int i = 0; i < duplica.size(); i++) {
                                if (d.getNom().equals(((Discipline) duplica.get(i)).getNom())) {
                                    dup = true;
                                }
                            }

                            if (!dup) {
                                bdd.AjouterP(d);

                                ajout1Field.setText("");
                            } else {
                                System.out.println("Cet element existe deja");
                            }
                        }

                    }

                    break;
                case "BulletinDetails":

                    if (!ajout1Field.getText().isEmpty()
                            && !ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout8ComboBox.getSelectedItem().toString().isEmpty()) {

                        String App = ajout1Field.getText();

                        //Recherche Id Discipline
                        ArrayList<Object> d = new ArrayList<>();
                        String Discipline = ajout8ComboBox.getSelectedItem().toString();
                        int id_Discipline = 0;

                        d = bdd.rechercher("Nom", Discipline, "Discipline");

                        if (!d.isEmpty()) {
                            id_Discipline = ((Discipline) d.get(0)).getId();
                        }

                        //Recherche Id Eleve
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> f = new ArrayList<>();
                        ArrayList<Object> g = new ArrayList<>();
                        String NomPrenom = ajout7ComboBox.getSelectedItem().toString();
                        String[] NP = NomPrenom.split(" ");
                        int id_Eleve = 0;
                        int id_Inscription = 0;
                        int id_Classe = 0;
                        int id_Enseignement = 0;
                        int id_Trimestre = 0;
                        int id_Bulletin = 0;

                        e = bdd.rechercher("Nom", NP[0], "Personne");

                        if (!e.isEmpty()) {
                            for (int i = 0; i < e.size(); i++) {
                                if (((Personne) e.get(i)).getPrenom().equals(NP[1])) {
                                    id_Eleve = ((Personne) e.get(i)).getId();
                                }
                            }

                            f = bdd.rechercher("IdPersonne", Integer.toString(id_Eleve), "Inscription");

                            if (!f.isEmpty()) {
                                id_Inscription = ((Inscription) f.get(0)).getId();
                                id_Classe = ((Inscription) f.get(0)).getIdClasse();
                            }
                        }

                        if (id_Classe != 0 && id_Discipline != 0) {
                            g = bdd.rechercher("IdClasse", Integer.toString(id_Classe), "Enseignement");

                            if (!g.isEmpty()) {
                                for (int i = 0; i < g.size(); i++) {
                                    if (((Enseignement) g.get(i)).getIdDiscipline() == id_Discipline) {
                                        id_Enseignement = ((Enseignement) g.get(i)).getId();
                                    }
                                }
                            }
                        }

                        //Recherche Id Bulletin
                        ArrayList<Object> h = new ArrayList<>();
                        ArrayList<Object> c = new ArrayList<>();
                        ArrayList<Object> q = new ArrayList<>();

                        String[] Date = ajout6ComboBox.getSelectedItem().toString().split(" :: ");

                        String[] JDepart = Date[0].split("/");
                        String[] JFin = Date[1].split("/");

                        modele.Date DateD = null;
                        modele.Date DateF = null;

                        if (JDepart.length == 3 && JFin.length == 3) {
                            if (Integer.valueOf(JDepart[0]) > 0 && Integer.valueOf(JDepart[0]) < 32
                                    && Integer.valueOf(JDepart[1]) > 0 && Integer.valueOf(JDepart[1]) < 13
                                    && Integer.valueOf(JDepart[2]) > 1990 && Integer.valueOf(JDepart[2]) < 2025
                                    && Integer.valueOf(JFin[0]) > 0 && Integer.valueOf(JFin[0]) < 32
                                    && Integer.valueOf(JFin[1]) > 0 && Integer.valueOf(JFin[1]) < 13
                                    && Integer.valueOf(JFin[2]) > 1990 && Integer.valueOf(JFin[2]) < 2025) {

                                DateD = new modele.Date();
                                DateD.setJour(Integer.valueOf(JDepart[0]));
                                DateD.setMois(Integer.valueOf(JDepart[1]));
                                DateD.setAnnee(Integer.valueOf(JDepart[2]));

                                DateF = new modele.Date();
                                DateF.setJour(Integer.valueOf(JFin[0]));
                                DateF.setMois(Integer.valueOf(JFin[1]));
                                DateF.setAnnee(Integer.valueOf(JFin[2]));

                            } else {
                                System.out.println("Probleme dans le format de vos informations");
                            }
                        }

                        if (DateD != null && DateF != null) {

                            String DateRechercheDebut = DateD.getAnnee() + "-" + DateD.getMois() + "-" + DateD.getJour();

                            h = bdd.rechercher("Debut", DateRechercheDebut, "Trimestre");

                            if (!h.isEmpty()) {

                                for (int i = 0; i < h.size(); i++) {
                                    if (((Trimestre) h.get(i)).getFin().toString().equals(DateF.toString())) {
                                        id_Trimestre = ((Trimestre) h.get(i)).getId();
                                    }
                                }
                            }

                            if (id_Trimestre != 0 && id_Inscription != 0) {
                                c = bdd.rechercher("IdTrimestre", Integer.toString(id_Trimestre), "Bulletin");

                                if (!c.isEmpty()) {

                                    for (int i = 0; i < c.size(); i++) {
                                        if (((Bulletin) c.get(i)).getIdInscription() == id_Inscription) {
                                            id_Bulletin = ((Bulletin) c.get(i)).getId();
                                        }
                                    }
                                }
                            }

                            if (id_Enseignement != 0 && id_Bulletin != 0) {

                                DetailBulletin Db = new DetailBulletin();
                                Db.setAppreciation(App);
                                Db.setIdBulletin(id_Bulletin);
                                Db.setIdEnseignement(id_Enseignement);

                                boolean dup = false;

                                ArrayList<Object> duplica = new ArrayList<>();
                                duplica = bdd.rechercher("s", "s", "DetailBulletin");

                                if (!duplica.isEmpty()) {
                                    for (int i = 0; i < duplica.size(); i++) {
                                        if (Db.getAppreciation().equals(((DetailBulletin) duplica.get(i)).getAppreciation())
                                                && Db.getIdBulletin() == ((DetailBulletin) duplica.get(i)).getIdBulletin()
                                                && Db.getIdEnseignement() == ((DetailBulletin) duplica.get(i)).getIdEnseignement()) {
                                            dup = true;
                                        }
                                    }

                                    if (!dup) {
                                        bdd.AjouterP(Db);

                                        ajout1Field.setText("");
                                        ajout6ComboBox.setSelectedIndex(0);
                                        ajout7ComboBox.setSelectedIndex(0);
                                        ajout8ComboBox.setSelectedIndex(0);

                                    } else {
                                        System.out.println("Cet element existe deja");
                                    }
                                }
                            }
                        }

                    }

                    break;
                case "Evaluation":
                    if (!ajout1Field.getText().isEmpty()
                            && !ajout2Field.getText().isEmpty()
                            && !ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout8ComboBox.getSelectedItem().toString().isEmpty()) {

                        String Note = ajout1Field.getText();
                        String App = ajout2Field.getText();

                        //Recherche Id Discipline
                        ArrayList<Object> d = new ArrayList<>();
                        String Discipline = ajout8ComboBox.getSelectedItem().toString();
                        int id_Discipline = 0;

                        d = bdd.rechercher("Nom", Discipline, "Discipline");

                        if (!d.isEmpty()) {
                            id_Discipline = ((Discipline) d.get(0)).getId();
                        }

                        //Recherche Id Eleve
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> f = new ArrayList<>();
                        ArrayList<Object> g = new ArrayList<>();
                        String NomPrenom = ajout7ComboBox.getSelectedItem().toString();
                        String[] NP = NomPrenom.split(" ");
                        int id_Eleve = 0;
                        int id_Inscription = 0;
                        int id_Classe = 0;
                        int id_Enseignement = 0;
                        int id_Trimestre = 0;
                        int id_Bulletin = 0;
                        int id_DetailBulletin = 0;

                        e = bdd.rechercher("Nom", NP[0], "Personne");

                        if (!e.isEmpty()) {
                            for (int i = 0; i < e.size(); i++) {
                                if (((Personne) e.get(i)).getPrenom().equals(NP[1])) {
                                    id_Eleve = ((Personne) e.get(i)).getId();
                                }
                            }

                            f = bdd.rechercher("IdPersonne", Integer.toString(id_Eleve), "Inscription");

                            if (!f.isEmpty()) {
                                id_Inscription = ((Inscription) f.get(0)).getId();
                                id_Classe = ((Inscription) f.get(0)).getIdClasse();
                            }
                        }

                        if (id_Classe != 0 && id_Discipline != 0) {
                            g = bdd.rechercher("IdClasse", Integer.toString(id_Classe), "Enseignement");

                            if (!g.isEmpty()) {
                                for (int i = 0; i < g.size(); i++) {
                                    if (((Enseignement) g.get(i)).getIdDiscipline() == id_Discipline) {
                                        id_Enseignement = ((Enseignement) g.get(i)).getId();
                                    }
                                }
                            }
                        }

                        //Recherche Id Bulletin
                        ArrayList<Object> h = new ArrayList<>();
                        ArrayList<Object> c = new ArrayList<>();
                        ArrayList<Object> q = new ArrayList<>();

                        String[] Date = ajout6ComboBox.getSelectedItem().toString().split(" :: ");

                        String[] JDepart = Date[0].split("/");
                        String[] JFin = Date[1].split("/");

                        modele.Date DateD = null;
                        modele.Date DateF = null;

                        if (JDepart.length == 3 && JFin.length == 3) {
                            if (Integer.valueOf(JDepart[0]) > 0 && Integer.valueOf(JDepart[0]) < 32
                                    && Integer.valueOf(JDepart[1]) > 0 && Integer.valueOf(JDepart[1]) < 13
                                    && Integer.valueOf(JDepart[2]) > 1990 && Integer.valueOf(JDepart[2]) < 2025
                                    && Integer.valueOf(JFin[0]) > 0 && Integer.valueOf(JFin[0]) < 32
                                    && Integer.valueOf(JFin[1]) > 0 && Integer.valueOf(JFin[1]) < 13
                                    && Integer.valueOf(JFin[2]) > 1990 && Integer.valueOf(JFin[2]) < 2025) {

                                DateD = new modele.Date();
                                DateD.setJour(Integer.valueOf(JDepart[0]));
                                DateD.setMois(Integer.valueOf(JDepart[1]));
                                DateD.setAnnee(Integer.valueOf(JDepart[2]));

                                DateF = new modele.Date();
                                DateF.setJour(Integer.valueOf(JFin[0]));
                                DateF.setMois(Integer.valueOf(JFin[1]));
                                DateF.setAnnee(Integer.valueOf(JFin[2]));

                            } else {
                                System.out.println("Probleme dans le format de vos informations");
                            }
                        }

                        if (DateD != null && DateF != null) {

                            String DateRechercheDebut = DateD.getAnnee() + "-" + DateD.getMois() + "-" + DateD.getJour();

                            h = bdd.rechercher("Debut", DateRechercheDebut, "Trimestre");

                            if (!h.isEmpty()) {

                                for (int i = 0; i < h.size(); i++) {
                                    if (((Trimestre) h.get(i)).getFin().toString().equals(DateF.toString())) {
                                        id_Trimestre = ((Trimestre) h.get(i)).getId();
                                    }
                                }

                                if (id_Trimestre != 0 && id_Inscription != 0) {
                                    c = bdd.rechercher("IdTrimestre", Integer.toString(id_Trimestre), "Bulletin");

                                    if (!c.isEmpty()) {

                                        for (int i = 0; i < c.size(); i++) {
                                            if (((Bulletin) c.get(i)).getIdInscription() == id_Inscription) {
                                                id_Bulletin = ((Bulletin) c.get(i)).getId();
                                            }
                                        }

                                        if (id_Enseignement != 0 && id_Bulletin != 0) {
                                            q = bdd.rechercher("IdEnseignement", Integer.toString(id_Enseignement), "DetailBulletin");

                                            if (!q.isEmpty()) {

                                                for (int i = 0; i < q.size(); i++) {
                                                    if (((DetailBulletin) q.get(i)).getIdBulletin() == id_Bulletin) {
                                                        id_DetailBulletin = ((DetailBulletin) q.get(i)).getId();
                                                    }
                                                }
                                            }

                                        }

                                        if (id_DetailBulletin != 0) {

                                            Evaluation ev = new Evaluation();
                                            ev.setAppreciation(App);
                                            ev.setIdDetailBulletin(id_DetailBulletin);
                                            ev.setNote(Integer.valueOf(Note));

                                            bdd.AjouterP(ev);
                                            ajout1Field.setText("");
                                            ajout2Field.setText("");

                                            ajout6ComboBox.setSelectedIndex(0);
                                            ajout7ComboBox.setSelectedIndex(0);
                                            ajout8ComboBox.setSelectedIndex(0);

                                        }
                                    }
                                }
                            }
                        }

                    }

                    break;
                case "Ecole":
                    if (!ajout1Field.getText().isEmpty()) {
                        Ecole e = new Ecole();
                        e.setNom(ajout1Field.getText());

                        boolean dup = false;

                        ArrayList<Object> duplica = new ArrayList<>();
                        duplica = bdd.rechercher("s", "s", "Ecole");

                        if (!duplica.isEmpty()) {
                            for (int i = 0; i < duplica.size(); i++) {
                                if (e.getNom().equals(((Discipline) duplica.get(i)).getNom())) {
                                    dup = true;
                                }
                            }

                            if (!dup) {
                                bdd.AjouterP(e);

                                ajout1Field.setText("");
                            } else {
                                System.out.println("Cet element existe deja");
                            }
                        }

                    }
                    break;
                default:
                    System.out.println("Erreur Valider, Choix Menu 2");
            }
        }
        
        if ("Modifer".equals(mode1)) {
            switch (mode2) {
                case "Eleve":

                    if (!ajout1Field.getText().isEmpty() && !ajout2Field.getText().isEmpty()) {

                        Eleve e = new Eleve();
                        e.setNom(ajout2Field.getText());
                        e.setPrenom(ajout1Field.getText());

                        boolean dup = false;

                        ArrayList<Object> duplica = new ArrayList<>();
                        duplica = bdd.rechercher("Type_P", "0", "Personne");

                        if (!duplica.isEmpty()) {
                            for (int i = 0; i < duplica.size(); i++) {
                                if (e.getPrenom().equals(((Eleve) duplica.get(i)).getPrenom())) {
                                    if (e.getNom().equals(((Eleve) duplica.get(i)).getNom())) {
                                        dup = true;
                                    }
                                }
                            }

                            if (!dup) {
                                bdd.AjouterP(e);

                                ajout1Field.setText("");
                                ajout2Field.setText("");
                            } else {
                                System.out.println("Cet element existe deja");
                            }
                        }

                    }

                    break;
                case "Enseignant":

                    if (!ajout1Field.getText().isEmpty() && !ajout2Field.getText().isEmpty()) {

                        Enseignant e = new Enseignant();
                        e.setNom(ajout2Field.getText());
                        e.setPrenom(ajout1Field.getText());

                        boolean dup = false;

                        ArrayList<Object> duplica = new ArrayList<>();
                        duplica = bdd.rechercher("Type_P", "1", "Personne");

                        if (!duplica.isEmpty()) {
                            for (int i = 0; i < duplica.size(); i++) {
                                if (e.getNom().equals(((Enseignant) duplica.get(i)).getNom())) {
                                    if (e.getPrenom().equals(((Enseignant) duplica.get(i)).getPrenom())) {
                                        dup = true;
                                    }
                                }
                            }

                            if (!dup) {
                                bdd.AjouterP(e);

                                ajout1Field.setText("");
                                ajout2Field.setText("");
                            } else {
                                System.out.println("Cet element existe deja");
                            }
                        }
                    }

                    break;
                case "Inscription":

                    if (!ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout8ComboBox.getSelectedItem().toString().isEmpty()) {

                        ArrayList<Object> d = new ArrayList<>();
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> eleve = new ArrayList<>();

                        d = bdd.rechercher("Nom", ajout6ComboBox.getSelectedItem().toString(), "Niveau");

                        if (!d.isEmpty()) {
                            int id_Niveau = ((Niveau) d.get(0)).getId();
                            int id_Classe = 0;
                            int id_Eleve = 0;
                            boolean dup = false;
                            e = bdd.rechercher("IdNiveau", Integer.toString(id_Niveau), "Classe");

                            String newStr = ajout8ComboBox.getSelectedItem().toString().substring(0, ajout8ComboBox.getSelectedItem().toString().indexOf(" "));
                            eleve = bdd.rechercher("Nom", newStr, "Personne");

                            if (!e.isEmpty() && !eleve.isEmpty()) {
                                for (int i = 0; i < e.size(); i++) {
                                    if (((Classe) e.get(i)).getNom().equals(ajout7ComboBox.getSelectedItem().toString())) {
                                        id_Classe = ((Classe) e.get(i)).getId();
                                    }
                                }

                                for (int i = 0; i < eleve.size(); i++) {
                                    String test = newStr + " " + ((Personne) eleve.get(i)).getPrenom();

                                    if (test.equals(ajout8ComboBox.getSelectedItem().toString())) {
                                        id_Eleve = ((Personne) eleve.get(i)).getId();
                                    }
                                }

                                if (id_Classe != 0 && id_Eleve != 0) {
                                    Inscription ins = new Inscription();
                                    ins.setIdPersonne(id_Eleve);
                                    ins.setIdClasse(id_Classe);

                                    ArrayList<Object> duplica = new ArrayList<>();

                                    duplica = bdd.rechercher("d", "d", "Inscription");

                                    if (!duplica.isEmpty()) {
                                        for (int i = 0; i < duplica.size(); i++) {
                                            if (ins.getIdClasse() == ((Inscription) duplica.get(i)).getIdClasse()
                                                    && ins.getIdPersonne() == ((Inscription) duplica.get(i)).getIdPersonne()) {
                                                dup = true;
                                            }
                                        }
                                        if (!dup) {
                                            bdd.AjouterP(ins);
                                            ajout6ComboBox.setSelectedIndex(0);
                                            ajout7ComboBox.setSelectedIndex(0);
                                            ajout8ComboBox.setSelectedIndex(0);
                                        } else {
                                            System.out.println("Cet element existe deja");
                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;
                case "Classe":
                    if (!ajout1Field.getText().isEmpty()
                            && !ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout8ComboBox.getSelectedItem().toString().isEmpty()) {

                        ArrayList<Object> d = new ArrayList<>();
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> f = new ArrayList<>();

                        String AnneeDebut = ajout8ComboBox.getSelectedItem().toString().substring(0, ajout8ComboBox.getSelectedItem().toString().indexOf("/"));

                        d = bdd.rechercher("Nom", ajout6ComboBox.getSelectedItem().toString(), "Ecole");
                        e = bdd.rechercher("Nom", ajout7ComboBox.getSelectedItem().toString(), "Niveau");
                        f = bdd.rechercher("AnneeDebut", AnneeDebut, "AnneeScolaire");

                        if (!d.isEmpty() && !e.isEmpty() && !f.isEmpty()) {

                            int id_Ecole = ((Ecole) d.get(0)).getId();
                            int id_Niveau = ((Niveau) e.get(0)).getId();
                            int id_Annee = ((AnneeScolaire) f.get(0)).getId();
                            String AnneeDF = Integer.toString(((AnneeScolaire) f.get(0)).getAnneeDebut()) + "/"
                                    + Integer.toString(((AnneeScolaire) f.get(0)).getAnneeFin());
                            boolean dup = false;

                            if (AnneeDF.equals(ajout8ComboBox.getSelectedItem().toString())) {
                                if (id_Ecole != 0 && id_Niveau != 0 && id_Annee != 0) {
                                    Classe c = new Classe();
                                    c.setIdEcole(id_Ecole);
                                    c.setIdNiveau(id_Niveau);
                                    c.setIdAnneeScolaire(id_Annee);
                                    c.setNom(ajout1Field.getText());

                                    ArrayList<Object> duplica = new ArrayList<>();

                                    duplica = bdd.rechercher("d", "d", "Classe");

                                    if (!duplica.isEmpty()) {
                                        for (int i = 0; i < duplica.size(); i++) {
                                            if (c.getIdEcole() == ((Classe) duplica.get(i)).getIdEcole()
                                                    && c.getIdNiveau() == ((Classe) duplica.get(i)).getIdNiveau()
                                                    && c.getIdAnneeScolaire() == ((Classe) duplica.get(i)).getIdAnneeScolaire()
                                                    && c.getNom().equals(((Classe) duplica.get(i)).getNom())) {
                                                dup = true;
                                            }
                                        }
                                        if (!dup) {
                                            bdd.AjouterP(c);

                                            ajout1Field.setText("");
                                            ajout6ComboBox.setSelectedIndex(0);
                                            ajout7ComboBox.setSelectedIndex(0);
                                            ajout8ComboBox.setSelectedIndex(0);
                                        } else {
                                            System.out.println("Cet element existe deja");
                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;
                case "Niveau":
                    if (!ajout1Field.getText().isEmpty()) {
                        Niveau n = new Niveau();
                        n.setNom(ajout1Field.getText());

                        boolean dup = false;

                        ArrayList<Object> duplica = new ArrayList<>();
                        duplica = bdd.rechercher("", "", "Niveau");

                        if (!duplica.isEmpty()) {
                            for (int i = 0; i < duplica.size(); i++) {
                                if (n.getNom().equals(((Niveau) duplica.get(i)).getNom())) {
                                    dup = true;
                                }
                            }

                            if (!dup) {
                                bdd.AjouterP(n);

                                ajout1Field.setText("");
                            } else {
                                System.out.println("Cet element existe deja");
                            }
                        }

                    }
                    break;
                case "Annee":

                    if (!ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()) {

                        int AnneeDebut = Integer.valueOf(ajout6ComboBox.getSelectedItem().toString());
                        int AnneeFin = Integer.valueOf(ajout7ComboBox.getSelectedItem().toString());

                        if (AnneeDebut == AnneeFin + 1) {

                            ArrayList<Object> duplica = new ArrayList<>();

                            duplica = bdd.rechercher("", "", "AnneeScolaire");

                            if (!duplica.isEmpty()) {

                                boolean dup = false;

                                for (int i = 0; i < duplica.size(); i++) {
                                    if (((AnneeScolaire) duplica.get(i)).getAnneeDebut() == AnneeDebut
                                            && ((AnneeScolaire) duplica.get(i)).getAnneeFin() == AnneeFin) {
                                        dup = true;
                                    }
                                }

                                if (!dup) {
                                    AnneeScolaire a = new AnneeScolaire();
                                    a.setAnneeDebut(AnneeDebut);
                                    a.setAnneeFin(AnneeFin);
                                    bdd.AjouterP(a);

                                    ajout6ComboBox.setSelectedIndex(0);
                                    ajout7ComboBox.setSelectedIndex(0);

                                } else {
                                    System.out.println("Cet element existe deja");
                                }

                            }

                        }
                    }

                    break;
                case "Trimestre":

                    if (!ajout1Field.getText().isEmpty()
                            && !ajout2Field.getText().isEmpty()
                            && !ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()) {

                        ArrayList<Object> d = new ArrayList<>();

                        modele.Date DateD = null;
                        modele.Date DateF = null;

                        String[] Annee = ajout6ComboBox.getSelectedItem().toString().split("/");

                        String[] JDepart = ajout1Field.getText().split("/");
                        String[] JFin = ajout2Field.getText().split("/");

                        if (JDepart.length == 3 && JFin.length == 3) {
                            if (Integer.valueOf(JDepart[0]) > 0 && Integer.valueOf(JDepart[0]) < 32
                                    && Integer.valueOf(JDepart[1]) > 0 && Integer.valueOf(JDepart[1]) < 13
                                    && Integer.valueOf(JDepart[2]) > 1990 && Integer.valueOf(JDepart[2]) < 2025
                                    && Integer.valueOf(JFin[0]) > 0 && Integer.valueOf(JFin[0]) < 32
                                    && Integer.valueOf(JFin[1]) > 0 && Integer.valueOf(JFin[1]) < 13
                                    && Integer.valueOf(JFin[2]) > 1990 && Integer.valueOf(JFin[2]) < 2025) {

                                DateD = new modele.Date();
                                DateD.setJour(Integer.valueOf(JDepart[0]));
                                DateD.setMois(Integer.valueOf(JDepart[1]));
                                DateD.setAnnee(Integer.valueOf(JDepart[2]));

                                DateF = new modele.Date();
                                DateF.setJour(Integer.valueOf(JFin[0]));
                                DateF.setMois(Integer.valueOf(JFin[1]));
                                DateF.setAnnee(Integer.valueOf(JFin[2]));

                            } else {
                                System.out.println("Probleme dans le format de vos informations");
                            }
                        }

                        if (DateD != null && DateF != null) {

                            d = bdd.rechercher("AnneeDebut", Annee[0], "AnneeScolaire");

                            if (!d.isEmpty()) {

                                int id_Annee = 0;
                                id_Annee = ((AnneeScolaire) d.get(0)).getId();

                                boolean dup = false;

                                if (id_Annee != 0) {
                                    Trimestre t = new Trimestre();
                                    t.setIdAnneeScolaire(id_Annee);
                                    t.setNumero(Integer.valueOf(ajout7ComboBox.getSelectedItem().toString()));
                                    t.setDebut(DateD);
                                    t.setFin(DateF);

                                    ArrayList<Object> duplica = new ArrayList<>();

                                    duplica = bdd.rechercher("d", "d", "Trimestre");

                                    if (!duplica.isEmpty()) {
                                        for (int i = 0; i < duplica.size(); i++) {
                                            if (t.getIdAnneeScolaire() == ((Trimestre) duplica.get(i)).getIdAnneeScolaire()
                                                    && t.getDebut() == ((Trimestre) duplica.get(i)).getDebut()
                                                    && t.getFin() == ((Trimestre) duplica.get(i)).getFin()
                                                    && t.getNumero() == ((Trimestre) duplica.get(i)).getNumero()) {

                                                dup = true;
                                            }
                                        }
                                        if (!dup) {
                                            bdd.AjouterP(t);

                                            ajout1Field.setText("");
                                            ajout2Field.setText("");
                                            ajout6ComboBox.setSelectedIndex(0);
                                            ajout7ComboBox.setSelectedIndex(0);
                                        } else {
                                            System.out.println("Cet element existe deja");
                                        }
                                    }

                                }
                            }
                        }
                    }

                    break;
                case "Bulletin":

                    if (!ajout1Field.getText().isEmpty() && !ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()) {

                        ArrayList<Object> d = new ArrayList<>();
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> f = new ArrayList<>();

                        String[] Date = ajout6ComboBox.getSelectedItem().toString().split(" :: ");

                        String[] NomPrenom = ajout7ComboBox.getSelectedItem().toString().split(" ");
                        String[] JDepart = Date[0].split("/");
                        String[] JFin = Date[1].split("/");

                        modele.Date DateD = null;
                        modele.Date DateF = null;

                        if (JDepart.length == 3 && JFin.length == 3) {
                            if (Integer.valueOf(JDepart[0]) > 0 && Integer.valueOf(JDepart[0]) < 32
                                    && Integer.valueOf(JDepart[1]) > 0 && Integer.valueOf(JDepart[1]) < 13
                                    && Integer.valueOf(JDepart[2]) > 1990 && Integer.valueOf(JDepart[2]) < 2025
                                    && Integer.valueOf(JFin[0]) > 0 && Integer.valueOf(JFin[0]) < 32
                                    && Integer.valueOf(JFin[1]) > 0 && Integer.valueOf(JFin[1]) < 13
                                    && Integer.valueOf(JFin[2]) > 1990 && Integer.valueOf(JFin[2]) < 2025) {

                                DateD = new modele.Date();
                                DateD.setJour(Integer.valueOf(JDepart[0]));
                                DateD.setMois(Integer.valueOf(JDepart[1]));
                                DateD.setAnnee(Integer.valueOf(JDepart[2]));

                                DateF = new modele.Date();
                                DateF.setJour(Integer.valueOf(JFin[0]));
                                DateF.setMois(Integer.valueOf(JFin[1]));
                                DateF.setAnnee(Integer.valueOf(JFin[2]));

                            } else {
                                System.out.println("Probleme dans le format de vos informations");
                            }
                        }

                        if (DateD != null && DateF != null) {

                            String DateRechercheDebut = DateD.getAnnee() + "-" + DateD.getMois() + "-" + DateD.getJour();

                            d = bdd.rechercher("Debut", DateRechercheDebut, "Trimestre");
                            e = bdd.rechercher("Nom", NomPrenom[0], "Personne");

                            int id_Eleve = 0;
                            int id_Inscription = 0;
                            int id_Trimestre = 0;

                            if (!d.isEmpty() && !e.isEmpty()) {

                                for (int i = 0; i < e.size(); i++) {
                                    if (((Personne) e.get(i)).getPrenom().equals(NomPrenom[1])) {
                                        id_Eleve = ((Personne) e.get(i)).getId();
                                    }
                                }

                                f = bdd.rechercher("IdPersonne", Integer.toString(id_Eleve), "Inscription");

                                if (!f.isEmpty()) {
                                    id_Inscription = ((Inscription) f.get(0)).getId();
                                }

                                for (int i = 0; i < d.size(); i++) {
                                    if (((Trimestre) d.get(i)).getFin().toString().equals(DateF.toString())) {
                                        id_Trimestre = ((Trimestre) d.get(i)).getId();
                                    }
                                }

                                if (id_Inscription != 0 && id_Trimestre != 0) {

                                    boolean dup = false;

                                    Bulletin b = new Bulletin();
                                    b.setIdInscription(id_Inscription);
                                    b.setIdTrimestre(id_Trimestre);
                                    b.setAppreciation(ajout1Field.getText());

                                    ArrayList<Object> duplica = new ArrayList<>();

                                    duplica = bdd.rechercher("d", "d", "Bulletin");

                                    if (!duplica.isEmpty()) {
                                        for (int i = 0; i < duplica.size(); i++) {
                                            if (b.getIdInscription() == ((Bulletin) duplica.get(i)).getIdInscription()
                                                    && b.getIdTrimestre() == ((Bulletin) duplica.get(i)).getIdTrimestre()
                                                    && b.getAppreciation().equals(((Bulletin) duplica.get(i)).getAppreciation())) {

                                                dup = true;
                                            }
                                        }
                                        if (!dup) {
                                            bdd.AjouterP(b);

                                            ajout1Field.setText("");
                                            ajout6ComboBox.setSelectedIndex(0);
                                            ajout7ComboBox.setSelectedIndex(0);
                                        } else {
                                            System.out.println("Cet element existe deja");
                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;
                case "Enseignement":

                    if (!ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout8ComboBox.getSelectedItem().toString().isEmpty()) {

                        String NomNiveauClasse = ajout6ComboBox.getSelectedItem().toString();
                        String NomDiscipline = ajout7ComboBox.getSelectedItem().toString();
                        String NomProf = ajout8ComboBox.getSelectedItem().toString();

                        String[] CN = NomNiveauClasse.split(" - ");
                        String[] NP = NomProf.split(" ");

                        ArrayList<Object> c = new ArrayList<>();
                        ArrayList<Object> d = new ArrayList<>();
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> f = new ArrayList<>();

                        c = bdd.rechercher("Nom", CN[0], "Niveau");
                        d = bdd.rechercher("Nom", CN[1], "Classe");
                        e = bdd.rechercher("Nom", NomDiscipline, "Discipline");
                        f = bdd.rechercher("Nom", NP[0], "Personne");

                        if (!c.isEmpty() && !d.isEmpty() && !e.isEmpty() && !f.isEmpty()) {

                            int id_Classe = 0;
                            int id_Discipline = ((Discipline) e.get(0)).getId();
                            int id_Prof = 0;

                            for (int i = 0; i < d.size(); i++) {
                                if (((Classe) d.get(i)).getIdNiveau() == ((Niveau) c.get(0)).getId()) {
                                    id_Classe = ((Classe) d.get(i)).getId();
                                }
                            }

                            for (int i = 0; i < f.size(); i++) {
                                if (((Personne) f.get(i)).getPrenom().equals(NP[1])) {
                                    id_Prof = ((Personne) f.get(i)).getId();
                                }
                            }

                            if (id_Classe != 0 && id_Discipline != 0 && id_Prof != 0) {

                                boolean dup = false;

                                ArrayList<Object> duplica = new ArrayList<>();
                                duplica = bdd.rechercher("s", "s", "Enseignement");

                                Enseignement ens = new Enseignement();
                                ens.setIdClasse(id_Classe);
                                ens.setIdDiscipline(id_Discipline);
                                ens.setIdPersonne(id_Prof);

                                if (!duplica.isEmpty()) {
                                    for (int i = 0; i < duplica.size(); i++) {
                                        if (ens.getIdClasse() == ((Enseignement) duplica.get(i)).getIdClasse()
                                                && ens.getIdDiscipline() == ((Enseignement) duplica.get(i)).getIdDiscipline()
                                                && ens.getIdPersonne() == ((Enseignement) duplica.get(i)).getIdPersonne()) {
                                            dup = true;
                                        }
                                    }

                                    if (!dup) {
                                        bdd.AjouterP(ens);

                                        ajout6ComboBox.setSelectedIndex(0);
                                        ajout7ComboBox.setSelectedIndex(0);
                                        ajout8ComboBox.setSelectedIndex(0);
                                    } else {
                                        System.out.println("Cet element existe deja");
                                    }
                                }

                            }

                        }

                    }

                    break;
                case "Discipline":

                    if (!ajout1Field.getText().isEmpty()) {
                        Discipline d = new Discipline();
                        d.setNom(ajout1Field.getText());

                        boolean dup = false;

                        ArrayList<Object> duplica = new ArrayList<>();
                        duplica = bdd.rechercher("s", "s", "Discipline");

                        if (!duplica.isEmpty()) {
                            for (int i = 0; i < duplica.size(); i++) {
                                if (d.getNom().equals(((Discipline) duplica.get(i)).getNom())) {
                                    dup = true;
                                }
                            }

                            if (!dup) {
                                bdd.AjouterP(d);

                                ajout1Field.setText("");
                            } else {
                                System.out.println("Cet element existe deja");
                            }
                        }

                    }

                    break;
                case "BulletinDetails":

                    if (!ajout1Field.getText().isEmpty()
                            && !ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout8ComboBox.getSelectedItem().toString().isEmpty()) {

                        String App = ajout1Field.getText();

                        //Recherche Id Discipline
                        ArrayList<Object> d = new ArrayList<>();
                        String Discipline = ajout8ComboBox.getSelectedItem().toString();
                        int id_Discipline = 0;

                        d = bdd.rechercher("Nom", Discipline, "Discipline");

                        if (!d.isEmpty()) {
                            id_Discipline = ((Discipline) d.get(0)).getId();
                        }

                        //Recherche Id Eleve
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> f = new ArrayList<>();
                        ArrayList<Object> g = new ArrayList<>();
                        String NomPrenom = ajout7ComboBox.getSelectedItem().toString();
                        String[] NP = NomPrenom.split(" ");
                        int id_Eleve = 0;
                        int id_Inscription = 0;
                        int id_Classe = 0;
                        int id_Enseignement = 0;
                        int id_Trimestre = 0;
                        int id_Bulletin = 0;

                        e = bdd.rechercher("Nom", NP[0], "Personne");

                        if (!e.isEmpty()) {
                            for (int i = 0; i < e.size(); i++) {
                                if (((Personne) e.get(i)).getPrenom().equals(NP[1])) {
                                    id_Eleve = ((Personne) e.get(i)).getId();
                                }
                            }

                            f = bdd.rechercher("IdPersonne", Integer.toString(id_Eleve), "Inscription");

                            if (!f.isEmpty()) {
                                id_Inscription = ((Inscription) f.get(0)).getId();
                                id_Classe = ((Inscription) f.get(0)).getIdClasse();
                            }
                        }

                        if (id_Classe != 0 && id_Discipline != 0) {
                            g = bdd.rechercher("IdClasse", Integer.toString(id_Classe), "Enseignement");

                            if (!g.isEmpty()) {
                                for (int i = 0; i < g.size(); i++) {
                                    if (((Enseignement) g.get(i)).getIdDiscipline() == id_Discipline) {
                                        id_Enseignement = ((Enseignement) g.get(i)).getId();
                                    }
                                }
                            }
                        }

                        //Recherche Id Bulletin
                        ArrayList<Object> h = new ArrayList<>();
                        ArrayList<Object> c = new ArrayList<>();
                        ArrayList<Object> q = new ArrayList<>();

                        String[] Date = ajout6ComboBox.getSelectedItem().toString().split(" :: ");

                        String[] JDepart = Date[0].split("/");
                        String[] JFin = Date[1].split("/");

                        modele.Date DateD = null;
                        modele.Date DateF = null;

                        if (JDepart.length == 3 && JFin.length == 3) {
                            if (Integer.valueOf(JDepart[0]) > 0 && Integer.valueOf(JDepart[0]) < 32
                                    && Integer.valueOf(JDepart[1]) > 0 && Integer.valueOf(JDepart[1]) < 13
                                    && Integer.valueOf(JDepart[2]) > 1990 && Integer.valueOf(JDepart[2]) < 2025
                                    && Integer.valueOf(JFin[0]) > 0 && Integer.valueOf(JFin[0]) < 32
                                    && Integer.valueOf(JFin[1]) > 0 && Integer.valueOf(JFin[1]) < 13
                                    && Integer.valueOf(JFin[2]) > 1990 && Integer.valueOf(JFin[2]) < 2025) {

                                DateD = new modele.Date();
                                DateD.setJour(Integer.valueOf(JDepart[0]));
                                DateD.setMois(Integer.valueOf(JDepart[1]));
                                DateD.setAnnee(Integer.valueOf(JDepart[2]));

                                DateF = new modele.Date();
                                DateF.setJour(Integer.valueOf(JFin[0]));
                                DateF.setMois(Integer.valueOf(JFin[1]));
                                DateF.setAnnee(Integer.valueOf(JFin[2]));

                            } else {
                                System.out.println("Probleme dans le format de vos informations");
                            }
                        }

                        if (DateD != null && DateF != null) {

                            String DateRechercheDebut = DateD.getAnnee() + "-" + DateD.getMois() + "-" + DateD.getJour();

                            h = bdd.rechercher("Debut", DateRechercheDebut, "Trimestre");

                            if (!h.isEmpty()) {

                                for (int i = 0; i < h.size(); i++) {
                                    if (((Trimestre) h.get(i)).getFin().toString().equals(DateF.toString())) {
                                        id_Trimestre = ((Trimestre) h.get(i)).getId();
                                    }
                                }
                            }

                            if (id_Trimestre != 0 && id_Inscription != 0) {
                                c = bdd.rechercher("IdTrimestre", Integer.toString(id_Trimestre), "Bulletin");

                                if (!c.isEmpty()) {

                                    for (int i = 0; i < c.size(); i++) {
                                        if (((Bulletin) c.get(i)).getIdInscription() == id_Inscription) {
                                            id_Bulletin = ((Bulletin) c.get(i)).getId();
                                        }
                                    }
                                }
                            }

                            if (id_Enseignement != 0 && id_Bulletin != 0) {

                                DetailBulletin Db = new DetailBulletin();
                                Db.setAppreciation(App);
                                Db.setIdBulletin(id_Bulletin);
                                Db.setIdEnseignement(id_Enseignement);

                                boolean dup = false;

                                ArrayList<Object> duplica = new ArrayList<>();
                                duplica = bdd.rechercher("s", "s", "DetailBulletin");

                                if (!duplica.isEmpty()) {
                                    for (int i = 0; i < duplica.size(); i++) {
                                        if (Db.getAppreciation().equals(((DetailBulletin) duplica.get(i)).getAppreciation())
                                                && Db.getIdBulletin() == ((DetailBulletin) duplica.get(i)).getIdBulletin()
                                                && Db.getIdEnseignement() == ((DetailBulletin) duplica.get(i)).getIdEnseignement()) {
                                            dup = true;
                                        }
                                    }

                                    if (!dup) {
                                        bdd.AjouterP(Db);

                                        ajout1Field.setText("");
                                        ajout6ComboBox.setSelectedIndex(0);
                                        ajout7ComboBox.setSelectedIndex(0);
                                        ajout8ComboBox.setSelectedIndex(0);

                                    } else {
                                        System.out.println("Cet element existe deja");
                                    }
                                }
                            }
                        }

                    }

                    break;
                case "Evaluation":
                    if (!ajout1Field.getText().isEmpty()
                            && !ajout2Field.getText().isEmpty()
                            && !ajout6ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout7ComboBox.getSelectedItem().toString().isEmpty()
                            && !ajout8ComboBox.getSelectedItem().toString().isEmpty()) {

                        String Note = ajout1Field.getText();
                        String App = ajout2Field.getText();

                        //Recherche Id Discipline
                        ArrayList<Object> d = new ArrayList<>();
                        String Discipline = ajout8ComboBox.getSelectedItem().toString();
                        int id_Discipline = 0;

                        d = bdd.rechercher("Nom", Discipline, "Discipline");

                        if (!d.isEmpty()) {
                            id_Discipline = ((Discipline) d.get(0)).getId();
                        }

                        //Recherche Id Eleve
                        ArrayList<Object> e = new ArrayList<>();
                        ArrayList<Object> f = new ArrayList<>();
                        ArrayList<Object> g = new ArrayList<>();
                        String NomPrenom = ajout7ComboBox.getSelectedItem().toString();
                        String[] NP = NomPrenom.split(" ");
                        int id_Eleve = 0;
                        int id_Inscription = 0;
                        int id_Classe = 0;
                        int id_Enseignement = 0;
                        int id_Trimestre = 0;
                        int id_Bulletin = 0;
                        int id_DetailBulletin = 0;

                        e = bdd.rechercher("Nom", NP[0], "Personne");

                        if (!e.isEmpty()) {
                            for (int i = 0; i < e.size(); i++) {
                                if (((Personne) e.get(i)).getPrenom().equals(NP[1])) {
                                    id_Eleve = ((Personne) e.get(i)).getId();
                                }
                            }

                            f = bdd.rechercher("IdPersonne", Integer.toString(id_Eleve), "Inscription");

                            if (!f.isEmpty()) {
                                id_Inscription = ((Inscription) f.get(0)).getId();
                                id_Classe = ((Inscription) f.get(0)).getIdClasse();
                            }
                        }

                        if (id_Classe != 0 && id_Discipline != 0) {
                            g = bdd.rechercher("IdClasse", Integer.toString(id_Classe), "Enseignement");

                            if (!g.isEmpty()) {
                                for (int i = 0; i < g.size(); i++) {
                                    if (((Enseignement) g.get(i)).getIdDiscipline() == id_Discipline) {
                                        id_Enseignement = ((Enseignement) g.get(i)).getId();
                                    }
                                }
                            }
                        }

                        //Recherche Id Bulletin
                        ArrayList<Object> h = new ArrayList<>();
                        ArrayList<Object> c = new ArrayList<>();
                        ArrayList<Object> q = new ArrayList<>();

                        String[] Date = ajout6ComboBox.getSelectedItem().toString().split(" :: ");

                        String[] JDepart = Date[0].split("/");
                        String[] JFin = Date[1].split("/");

                        modele.Date DateD = null;
                        modele.Date DateF = null;

                        if (JDepart.length == 3 && JFin.length == 3) {
                            if (Integer.valueOf(JDepart[0]) > 0 && Integer.valueOf(JDepart[0]) < 32
                                    && Integer.valueOf(JDepart[1]) > 0 && Integer.valueOf(JDepart[1]) < 13
                                    && Integer.valueOf(JDepart[2]) > 1990 && Integer.valueOf(JDepart[2]) < 2025
                                    && Integer.valueOf(JFin[0]) > 0 && Integer.valueOf(JFin[0]) < 32
                                    && Integer.valueOf(JFin[1]) > 0 && Integer.valueOf(JFin[1]) < 13
                                    && Integer.valueOf(JFin[2]) > 1990 && Integer.valueOf(JFin[2]) < 2025) {

                                DateD = new modele.Date();
                                DateD.setJour(Integer.valueOf(JDepart[0]));
                                DateD.setMois(Integer.valueOf(JDepart[1]));
                                DateD.setAnnee(Integer.valueOf(JDepart[2]));

                                DateF = new modele.Date();
                                DateF.setJour(Integer.valueOf(JFin[0]));
                                DateF.setMois(Integer.valueOf(JFin[1]));
                                DateF.setAnnee(Integer.valueOf(JFin[2]));

                            } else {
                                System.out.println("Probleme dans le format de vos informations");
                            }
                        }

                        if (DateD != null && DateF != null) {

                            String DateRechercheDebut = DateD.getAnnee() + "-" + DateD.getMois() + "-" + DateD.getJour();

                            h = bdd.rechercher("Debut", DateRechercheDebut, "Trimestre");

                            if (!h.isEmpty()) {

                                for (int i = 0; i < h.size(); i++) {
                                    if (((Trimestre) h.get(i)).getFin().toString().equals(DateF.toString())) {
                                        id_Trimestre = ((Trimestre) h.get(i)).getId();
                                    }
                                }

                                if (id_Trimestre != 0 && id_Inscription != 0) {
                                    c = bdd.rechercher("IdTrimestre", Integer.toString(id_Trimestre), "Bulletin");

                                    if (!c.isEmpty()) {

                                        for (int i = 0; i < c.size(); i++) {
                                            if (((Bulletin) c.get(i)).getIdInscription() == id_Inscription) {
                                                id_Bulletin = ((Bulletin) c.get(i)).getId();
                                            }
                                        }

                                        if (id_Enseignement != 0 && id_Bulletin != 0) {
                                            q = bdd.rechercher("IdEnseignement", Integer.toString(id_Enseignement), "DetailBulletin");

                                            if (!q.isEmpty()) {

                                                for (int i = 0; i < q.size(); i++) {
                                                    if (((DetailBulletin) q.get(i)).getIdBulletin() == id_Bulletin) {
                                                        id_DetailBulletin = ((DetailBulletin) q.get(i)).getId();
                                                    }
                                                }
                                            }

                                        }

                                        if (id_DetailBulletin != 0) {

                                            Evaluation ev = new Evaluation();
                                            ev.setAppreciation(App);
                                            ev.setIdDetailBulletin(id_DetailBulletin);
                                            ev.setNote(Integer.valueOf(Note));

                                            bdd.AjouterP(ev);
                                            ajout1Field.setText("");
                                            ajout2Field.setText("");

                                            ajout6ComboBox.setSelectedIndex(0);
                                            ajout7ComboBox.setSelectedIndex(0);
                                            ajout8ComboBox.setSelectedIndex(0);

                                        }
                                    }
                                }
                            }
                        }

                    }

                    break;
                case "Ecole":
                    if (!ajout1Field.getText().isEmpty()) {
                        Ecole e = new Ecole();
                        e.setNom(ajout1Field.getText());

                        boolean dup = false;

                        ArrayList<Object> duplica = new ArrayList<>();
                        duplica = bdd.rechercher("s", "s", "Ecole");

                        if (!duplica.isEmpty()) {
                            for (int i = 0; i < duplica.size(); i++) {
                                if (e.getNom().equals(((Discipline) duplica.get(i)).getNom())) {
                                    dup = true;
                                }
                            }

                            if (!dup) {
                                bdd.AjouterP(e);

                                ajout1Field.setText("");
                            } else {
                                System.out.println("Cet element existe deja");
                            }
                        }

                    }
                    break;
                default:
                    System.out.println("Erreur Valider, Choix Menu 2");
            }
        }

    }// GEN-LAST:event_ajouterButtonActionPerformed

    private void rechercheButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rechercheButtonActionPerformed
        String type = (String) rechercheComboBox.getSelectedItem();
        String value = String.valueOf(rechercheField.getText());
        DefaultTableModel model = (DefaultTableModel) rechercherTable.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ArrayList<Object> list;
        switch (mode2) {
        case "Eleve":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Personne");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Personne p = (Personne) list.get(i);
                    if (!p.isType()) {
                        int id = p.getId();
                        String nom = p.getNom();
                        String prenom = p.getPrenom();
                        Object[] data = { id, prenom, nom };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Prénom":
                list = bdd.rechercher("Prenom", value, "Personne");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Personne p = (Personne) list.get(i);
                    if (!p.isType()) {
                        int id = p.getId();
                        String nom = p.getNom();
                        String prenom = p.getPrenom();
                        Object[] data = { id, prenom, nom };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom":
                list = bdd.rechercher("Nom", value, "Personne");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Personne p = (Personne) list.get(i);
                    if (!p.isType()) {
                        int id = p.getId();
                        String nom = p.getNom();
                        String prenom = p.getPrenom();
                        Object[] data = { id, prenom, nom };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "Enseignant":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Personne");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Personne p = (Personne) list.get(i);
                    if (p.isType()) {
                        int id = p.getId();
                        String nom = p.getNom();
                        String prenom = p.getPrenom();
                        Object[] data = { id, prenom, nom };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Prénom":
                list = bdd.rechercher("Prenom", value, "Personne");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Personne p = (Personne) list.get(i);
                    if (p.isType()) {
                        int id = p.getId();
                        String nom = p.getNom();
                        String prenom = p.getPrenom();
                        Object[] data = { id, prenom, nom };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom":
                list = bdd.rechercher("Nom", value, "Personne");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Personne p = (Personne) list.get(i);
                    if (p.isType()) {
                        int id = p.getId();
                        String nom = p.getNom();
                        String prenom = p.getPrenom();
                        Object[] data = { id, prenom, nom };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "Inscription":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Inscription");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Inscription o = (Inscription) list.get(i);
                    int id = o.getId();
                    ArrayList<Object> idclasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()), "Classe");
                    String classe = ((Classe) idclasse.get(0)).getNom();
                    ArrayList<Object> idEleve = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                    String nom = ((Personne) idEleve.get(0)).getNom();
                    String eleve = prenom + " " + nom;
                    Object[] data = { id, classe, eleve };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de la classe":
                ArrayList<Object> idClasse = bdd.rechercher("Nom", value, "Classe");
                for (int i = 0; i < idClasse.size(); i++) {
                    list = bdd.rechercher("IdClasse", String.valueOf(((Classe) idClasse.get(i)).getId()),
                            "Inscription");
                    model.setNumRows(list.size());
                    for (int j = 0; i < list.size(); i++) {
                        Inscription o = (Inscription) list.get(j);
                        int id = o.getId();
                        ArrayList<Object> idclasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()), "Classe");
                        String classe = ((Classe) idclasse.get(0)).getNom();
                        ArrayList<Object> idEleve = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
                        String prenom = ((Personne) idEleve.get(0)).getPrenom();
                        String nom = ((Personne) idEleve.get(0)).getNom();
                        String eleve = prenom + " " + nom;
                        Object[] data = { id, classe, eleve };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de l'élève":
                ArrayList<Object> idEleves = bdd.rechercher("Nom", value, "Personne");
                for (int i = 0; i < idEleves.size(); i++) {
                    if (!((Personne) idEleves.get(i)).isType()) {
                        list = bdd.rechercher("IdPersonne", String.valueOf(((Personne) idEleves.get(i)).getId()),
                                "Inscription");
                        model.setNumRows(list.size());
                        for (int j = 0; j < list.size(); j++) {
                            Inscription o = (Inscription) list.get(j);
                            int id = o.getId();
                            ArrayList<Object> idclasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()),
                                    "Classe");
                            String classe = ((Classe) idclasse.get(0)).getNom();
                            ArrayList<Object> idEleve = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()),
                                    "Personne");
                            String prenom = ((Personne) idEleve.get(0)).getPrenom();
                            String nom = ((Personne) idEleve.get(0)).getNom();
                            String eleve = prenom + " " + nom;
                            Object[] data = { id, classe, eleve };
                            model.addRow(data);
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "Classe":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Classe");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Classe o = (Classe) list.get(i);
                    int id = o.getId();
                    ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()),
                            "AnneeScolaire");
                    String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(o.getIdEcole()), "Ecole");
                    String ecole = ((Ecole) idEcole.get(0)).getNom();
                    ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(o.getIdNiveau()), "Niveau");
                    String niveau = ((Niveau) idNiveau.get(0)).getNom();
                    String nom = o.getNom();
                    Object[] data = { id, nom, ecole, niveau, annee };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom":
                list = bdd.rechercher("Nom", value, "Classe");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Classe o = (Classe) list.get(i);
                    int id = o.getId();
                    ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()),
                            "AnneeScolaire");
                    String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(o.getIdEcole()), "Ecole");
                    String ecole = ((Ecole) idEcole.get(0)).getNom();
                    ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(o.getIdNiveau()), "Niveau");
                    String niveau = ((Niveau) idNiveau.get(0)).getNom();
                    String nom = o.getNom();
                    Object[] data = { id, nom, ecole, niveau, annee };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de l'école":
                ArrayList<Object> idecole = bdd.rechercher("Nom", value, "Ecole");
                for (int i = 0; i < idecole.size(); i++) {
                    list = bdd.rechercher("IdEcole", String.valueOf(((Ecole) idecole.get(i)).getId()), "Classe");
                    model.setNumRows(list.size());
                    for (int j = 0; j < list.size(); j++) {
                        Classe o = (Classe) list.get(j);
                        int id = o.getId();
                        ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()),
                                "AnneeScolaire");
                        String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                        ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(o.getIdEcole()), "Ecole");
                        String ecole = ((Ecole) idEcole.get(0)).getNom();
                        ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(o.getIdNiveau()), "Niveau");
                        String niveau = ((Niveau) idNiveau.get(0)).getNom();
                        String nom = o.getNom();
                        Object[] data = { id, nom, ecole, niveau, annee };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom du niveau":
                ArrayList<Object> idniveau = bdd.rechercher("Nom", value, "Niveau");
                for (int i = 0; i < idniveau.size(); i++) {
                    list = bdd.rechercher("IdNiveau", String.valueOf(((Niveau) idniveau.get(i)).getId()), "Classe");
                    model.setNumRows(list.size());
                    for (int j = 0; j < list.size(); j++) {
                        Classe o = (Classe) list.get(j);
                        int id = o.getId();
                        ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()),
                                "AnneeScolaire");
                        String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                        ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(o.getIdEcole()), "Ecole");
                        String ecole = ((Ecole) idEcole.get(0)).getNom();
                        ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(o.getIdNiveau()), "Niveau");
                        String niveau = ((Niveau) idNiveau.get(0)).getNom();
                        String nom = o.getNom();
                        Object[] data = { id, nom, ecole, niveau, annee };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Début d'année scolaire":
                ArrayList<Object> idannee = bdd.rechercher("AnneeDebut", value, "AnneeScolaire");
                for (int i = 0; i < idannee.size(); i++) {
                    list = bdd.rechercher("IdAnneeScolaire", String.valueOf(((AnneeScolaire) idannee.get(i)).getId()),
                            "Classe");
                    model.setNumRows(list.size());
                    for (int j = 0; j < list.size(); j++) {
                        Classe o = (Classe) list.get(j);
                        int id = o.getId();
                        ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()),
                                "AnneeScolaire");
                        String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                        ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(o.getIdEcole()), "Ecole");
                        String ecole = ((Ecole) idEcole.get(0)).getNom();
                        ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(o.getIdNiveau()), "Niveau");
                        String niveau = ((Niveau) idNiveau.get(0)).getNom();
                        String nom = o.getNom();
                        Object[] data = { id, nom, ecole, niveau, annee };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "Niveau":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Niveau");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Niveau p = (Niveau) list.get(i);
                    int id = p.getId();
                    String nom = p.getNom();
                    Object[] data = { id, nom };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom":
                list = bdd.rechercher("Nom", value, "Niveau");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Niveau p = (Niveau) list.get(i);
                    int id = p.getId();
                    String nom = p.getNom();
                    Object[] data = { id, nom };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "Annee":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "AnneeScolaire");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    AnneeScolaire o = (AnneeScolaire) list.get(i);
                    int id = o.getId();
                    int debut = o.getAnneeDebut();
                    int fin = o.getAnneeFin();
                    Object[] data = { id, debut, fin };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Début":
                list = bdd.rechercher("AnneeDebut", value, "AnneeScolaire");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    AnneeScolaire o = (AnneeScolaire) list.get(i);
                    int id = o.getId();
                    int debut = o.getAnneeDebut();
                    int fin = o.getAnneeFin();
                    Object[] data = { id, debut, fin };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Fin":
                list = bdd.rechercher("AnneeFin", value, "AnneeScolaire");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    AnneeScolaire o = (AnneeScolaire) list.get(i);
                    int id = o.getId();
                    int debut = o.getAnneeDebut();
                    int fin = o.getAnneeFin();
                    Object[] data = { id, debut, fin };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "Trimestre":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Trimestre");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Trimestre o = (Trimestre) list.get(i);
                    int id = o.getId();
                    int numero = o.getNumero();
                    String debut = o.getDebut().toString();
                    String fin = o.getFin().toString();
                    ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()),
                            "AnneeScolaire");
                    String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    Object[] data = { id, numero, debut, fin, annee };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Numéro":
                list = bdd.rechercher("Numero", value, "Trimestre");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Trimestre o = (Trimestre) list.get(i);
                    int id = o.getId();
                    int numero = o.getNumero();
                    String debut = o.getDebut().toString();
                    String fin = o.getFin().toString();
                    ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()),
                            "AnneeScolaire");
                    String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    Object[] data = { id, numero, debut, fin, annee };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Début d'année scolaire":
                ArrayList<Object> idannee = bdd.rechercher("AnneeDebut", value, "AnneeScolaire");
                for (int i = 0; i < idannee.size(); i++) {
                    list = bdd.rechercher("idAnneeScolaire", String.valueOf(((AnneeScolaire) idannee.get(i)).getId()),
                            "Trimestre");
                    model.setNumRows(list.size());
                    for (int j = 0; j < list.size(); j++) {
                        Trimestre o = (Trimestre) list.get(j);
                        int id = o.getId();
                        int numero = o.getNumero();
                        String debut = o.getDebut().toString();
                        String fin = o.getFin().toString();
                        ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(o.getIdAnneeScolaire()),
                                "AnneeScolaire");
                        String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                        Object[] data = { id, numero, debut, fin, annee };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "Bulletin":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Bulletin");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Bulletin o = (Bulletin) list.get(i);
                    int id = o.getId();
                    String appreciation = o.getAppreciation();
                    ArrayList<Object> idTrimestre = bdd.rechercher("Id", String.valueOf(o.getIdTrimestre()),
                            "Trimestre");
                    String trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                            + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                    ArrayList<Object> idInscription = bdd.rechercher("Id", String.valueOf(o.getIdInscription()),
                            "Inscription");
                    ArrayList<Object> idclasse = bdd.rechercher("Id",
                            String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                    String classe = ((Classe) idclasse.get(0)).getNom();
                    ArrayList<Object> idEleve = bdd.rechercher("Id",
                            String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                    String nom = ((Personne) idEleve.get(0)).getNom();
                    String inscription = classe + "-" + prenom + " " + nom;
                    Object[] data = { id, trimestre, inscription, appreciation };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Début d'année scolaire":
                ArrayList<Object> idannee = bdd.rechercher("AnneeDebut", value, "AnneeScolaire");
                for (int i = 0; i < idannee.size(); i++) {
                    ArrayList<Object> idtrimestre = bdd.rechercher("idAnneeScolaire",
                            String.valueOf(((AnneeScolaire) idannee.get(i)).getId()), "Trimestre");
                    for (int k = 0; k < idtrimestre.size(); k++) {
                        list = bdd.rechercher("IdTrimestre", String.valueOf(((Trimestre) idtrimestre.get(k)).getId()),
                                "Bulletin");
                        // model.setNumRows(list.size());
                        for (int j = 0; j < list.size(); j++) {
                            Bulletin o = (Bulletin) list.get(j);
                            int id = o.getId();
                            String appreciation = o.getAppreciation();
                            ArrayList<Object> idTrimestre = bdd.rechercher("Id", String.valueOf(o.getIdTrimestre()),
                                    "Trimestre");
                            String trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString())
                                    + "-" + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                            ArrayList<Object> idInscription = bdd.rechercher("Id", String.valueOf(o.getIdInscription()),
                                    "Inscription");
                            ArrayList<Object> idclasse = bdd.rechercher("Id",
                                    String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                            String classe = ((Classe) idclasse.get(0)).getNom();
                            ArrayList<Object> idEleve = bdd.rechercher("Id",
                                    String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                            String prenom = ((Personne) idEleve.get(0)).getPrenom();
                            String nom = ((Personne) idEleve.get(0)).getNom();
                            String inscription = classe + "-" + prenom + " " + nom;
                            Object[] data = { id, trimestre, inscription, appreciation };
                            model.addRow(data);
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de la classe":
                ArrayList<Object> idclasse = bdd.rechercher("Nom", value, "Classe");
                for (int i = 0; i < idclasse.size(); i++) {
                    ArrayList<Object> idinscription = bdd.rechercher("idClasse",
                            String.valueOf(((Classe) idclasse.get(i)).getId()), "Inscription");
                    for (int k = 0; k < idinscription.size(); k++) {
                        list = bdd.rechercher("IdInscription",
                                String.valueOf(((Inscription) idinscription.get(k)).getId()), "Bulletin");
                        // model.setNumRows(list.size());
                        for (int j = 0; j < list.size(); j++) {
                            Bulletin o = (Bulletin) list.get(j);
                            int id = o.getId();
                            String appreciation = o.getAppreciation();
                            ArrayList<Object> idTrimestre = bdd.rechercher("Id", String.valueOf(o.getIdTrimestre()),
                                    "Trimestre");
                            String trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString())
                                    + "-" + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                            ArrayList<Object> idInscription = bdd.rechercher("Id", String.valueOf(o.getIdInscription()),
                                    "Inscription");
                            ArrayList<Object> idClasse = bdd.rechercher("Id",
                                    String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                            String classe = ((Classe) idClasse.get(0)).getNom();
                            ArrayList<Object> idEleve = bdd.rechercher("Id",
                                    String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                            String prenom = ((Personne) idEleve.get(0)).getPrenom();
                            String nom = ((Personne) idEleve.get(0)).getNom();
                            String inscription = classe + "-" + prenom + " " + nom;
                            Object[] data = { id, trimestre, inscription, appreciation };
                            model.addRow(data);
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de l'élève":
                ArrayList<Object> ideleve = bdd.rechercher("Nom", value, "Personne");
                for (int i = 0; i < ideleve.size(); i++) {
                    if (!((Personne) ideleve.get(i)).isType()) {
                        ArrayList<Object> idinscription = bdd.rechercher("idPersonne",
                                String.valueOf(((Personne) ideleve.get(i)).getId()), "Inscription");
                        for (int k = 0; k < idinscription.size(); k++) {
                            list = bdd.rechercher("IdInscription",
                                    String.valueOf(((Inscription) idinscription.get(k)).getId()), "Bulletin");
                            // model.setNumRows(list.size());
                            for (int j = 0; j < list.size(); j++) {
                                Bulletin o = (Bulletin) list.get(j);
                                int id = o.getId();
                                String appreciation = o.getAppreciation();
                                ArrayList<Object> idTrimestre = bdd.rechercher("Id", String.valueOf(o.getIdTrimestre()),
                                        "Trimestre");
                                String trimestre = String
                                        .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                        + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                                ArrayList<Object> idInscription = bdd.rechercher("Id",
                                        String.valueOf(o.getIdInscription()), "Inscription");
                                ArrayList<Object> idClasse = bdd.rechercher("Id",
                                        String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                                String classe = ((Classe) idClasse.get(0)).getNom();
                                ArrayList<Object> idEleve = bdd.rechercher("Id",
                                        String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()),
                                        "Personne");
                                String prenom = ((Personne) idEleve.get(0)).getPrenom();
                                String nom = ((Personne) idEleve.get(0)).getNom();
                                String inscription = classe + "-" + prenom + " " + nom;
                                Object[] data = { id, trimestre, inscription, appreciation };
                                model.addRow(data);
                            }
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "Enseignement":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Enseignement");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Enseignement o = (Enseignement) list.get(i);
                    int id = o.getId();
                    ArrayList<Object> idClasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()), "Classe");
                    ArrayList<Object> idEcole = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                    ArrayList<Object> idNiveau = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                    ArrayList<Object> idAnnee = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                    ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(o.getIdDiscipline()),
                            "Discipline");
                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                    String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    String classe = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                    ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
                    String prenom = ((Personne) idProf.get(0)).getPrenom();
                    String nom = ((Personne) idProf.get(0)).getNom();
                    String professeur = prenom + " " + nom;
                    Object[] data = { id, classe, discipline, professeur };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de la classe":
                ArrayList<Object> idclasse = bdd.rechercher("Nom", value, "Classe");
                for (int i = 0; i < idclasse.size(); i++) {
                    list = bdd.rechercher("IdClasse", String.valueOf(((Classe) idclasse.get(i)).getId()),
                            "Enseignement");
                    model.setNumRows(list.size());
                    for (int j = 0; j < list.size(); j++) {
                        Enseignement o = (Enseignement) list.get(j);
                        int id = o.getId();
                        ArrayList<Object> idClasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()), "Classe");
                        ArrayList<Object> idEcole = bdd.rechercher("Id",
                                String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                        ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                        ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                        ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(o.getIdDiscipline()),
                                "Discipline");
                        String classe_nom = ((Classe) idClasse.get(0)).getNom();
                        String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                        String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                        String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                        String classe = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                        String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                        ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
                        String prenom = ((Personne) idProf.get(0)).getPrenom();
                        String nom = ((Personne) idProf.get(0)).getNom();
                        String professeur = prenom + " " + nom;
                        Object[] data = { id, classe, discipline, professeur };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de la discipline":
                ArrayList<Object> iddiscipline = bdd.rechercher("Nom", value, "Discipline");
                for (int i = 0; i < iddiscipline.size(); i++) {
                    list = bdd.rechercher("IdDiscipline", String.valueOf(((Discipline) iddiscipline.get(i)).getId()),
                            "Enseignement");
                    model.setNumRows(list.size());
                    for (int j = 0; j < list.size(); j++) {
                        Enseignement o = (Enseignement) list.get(j);
                        int id = o.getId();
                        ArrayList<Object> idClasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()), "Classe");
                        ArrayList<Object> idEcole = bdd.rechercher("Id",
                                String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                        ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                        ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                        ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(o.getIdDiscipline()),
                                "Discipline");
                        String classe_nom = ((Classe) idClasse.get(0)).getNom();
                        String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                        String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                        String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                        String classe = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                        String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                        ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
                        String prenom = ((Personne) idProf.get(0)).getPrenom();
                        String nom = ((Personne) idProf.get(0)).getNom();
                        String professeur = prenom + " " + nom;
                        Object[] data = { id, classe, discipline, professeur };
                        model.addRow(data);
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom du professeur":
                ArrayList<Object> idprof = bdd.rechercher("Nom", value, "Personne");
                for (int i = 0; i < idprof.size(); i++) {
                    if (((Personne) idprof.get(i)).isType()) {
                        list = bdd.rechercher("IdPersonne", String.valueOf(((Personne) idprof.get(i)).getId()),
                                "Enseignement");
                        model.setNumRows(list.size());
                        for (int j = 0; j < list.size(); j++) {
                            Enseignement o = (Enseignement) list.get(j);
                            int id = o.getId();
                            ArrayList<Object> idClasse = bdd.rechercher("Id", String.valueOf(o.getIdClasse()),
                                    "Classe");
                            ArrayList<Object> idEcole = bdd.rechercher("Id",
                                    String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                            ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                    String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                            ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                    String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                            ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(o.getIdDiscipline()),
                                    "Discipline");
                            String classe_nom = ((Classe) idClasse.get(0)).getNom();
                            String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                            String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                            String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                    + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                            String classe = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                            String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                            ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()),
                                    "Personne");
                            String prenom = ((Personne) idProf.get(0)).getPrenom();
                            String nom = ((Personne) idProf.get(0)).getNom();
                            String professeur = prenom + " " + nom;
                            Object[] data = { id, classe, discipline, professeur };
                            model.addRow(data);
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "Discipline":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Discipline");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Discipline p = (Discipline) list.get(i);
                    int id = p.getId();
                    String nom = p.getNom();
                    Object[] data = { id, nom };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom":
                list = bdd.rechercher("Nom", value, "Discipline");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Discipline p = (Discipline) list.get(i);
                    int id = p.getId();
                    String nom = p.getNom();
                    Object[] data = { id, nom };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "BulletinDetails":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "DetailBulletin");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    DetailBulletin o = (DetailBulletin) list.get(i);
                    int id = o.getId();
                    String appreciation = o.getAppreciation();
                    ArrayList<Object> idBulletin = bdd.rechercher("Id", String.valueOf(o.getIdBulletin()), "Bulletin");
                    ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                    String bulletin_trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString())
                            + "-" + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                    ArrayList<Object> idInscription = bdd.rechercher("Id",
                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()), "Inscription");
                    ArrayList<Object> idclasse = bdd.rechercher("Id",
                            String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                    String classe = ((Classe) idclasse.get(0)).getNom();
                    ArrayList<Object> idEleve = bdd.rechercher("Id",
                            String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                    String nom = ((Personne) idEleve.get(0)).getNom();
                    String bulletin_inscription = classe + "-" + prenom + " " + nom;
                    String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                    ArrayList<Object> idEnseignement = bdd.rechercher("Id", String.valueOf(o.getIdEnseignement()),
                            "Enseignement");
                    ArrayList<Object> idClasse = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
                    ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()), "Discipline");
                    ArrayList<Object> idPersonne = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                    ArrayList<Object> idEcole = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                    ArrayList<Object> idNiveau = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                    ArrayList<Object> idAnnee = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                    String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                    ArrayList<Object> idProf = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                    String prof_nom = ((Personne) idProf.get(0)).getNom();
                    String enseignement_professeur = prof_prenom + " " + prof_nom;
                    String enseignement = discipline + " " + enseignement_professeur;
                    Object[] data = { id, bulletin, enseignement, appreciation };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Début d'année scolaire":
                ArrayList<Object> idannee = bdd.rechercher("AnneeDebut", value, "AnneeScolaire");
                for (int i = 0; i < idannee.size(); i++) {
                    ArrayList<Object> idtrimestre = bdd.rechercher("idAnneeScolaire",
                            String.valueOf(((AnneeScolaire) idannee.get(i)).getId()), "Trimestre");
                    for (int k = 0; k < idtrimestre.size(); k++) {
                        ArrayList<Object> idbulletin = bdd.rechercher("idTrimestre",
                                String.valueOf(((Trimestre) idtrimestre.get(k)).getId()), "Bulletin");
                        for (int h = 0; h < idbulletin.size(); h++) {
                            list = bdd.rechercher("idBulletin", String.valueOf(((Bulletin) idbulletin.get(h)).getId()),
                                    "DetailBulletin");
                            // model.setNumRows(list.size());
                            for (int j = 0; j < list.size(); j++) {
                                DetailBulletin o = (DetailBulletin) list.get(j);
                                int id = o.getId();
                                String appreciation = o.getAppreciation();
                                ArrayList<Object> idBulletin = bdd.rechercher("Id", String.valueOf(o.getIdBulletin()),
                                        "Bulletin");
                                ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                                String bulletin_trimestre = String
                                        .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                        + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                                ArrayList<Object> idInscription = bdd.rechercher("Id",
                                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()),
                                        "Inscription");
                                ArrayList<Object> idclasse = bdd.rechercher("Id",
                                        String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                                String classe = ((Classe) idclasse.get(0)).getNom();
                                ArrayList<Object> idEleve = bdd.rechercher("Id",
                                        String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()),
                                        "Personne");
                                String prenom = ((Personne) idEleve.get(0)).getPrenom();
                                String nom = ((Personne) idEleve.get(0)).getNom();
                                String bulletin_inscription = classe + "-" + prenom + " " + nom;
                                String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                                ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                                        String.valueOf(o.getIdEnseignement()), "Enseignement");
                                ArrayList<Object> idClasse = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
                                ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()),
                                        "Discipline");
                                ArrayList<Object> idPersonne = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                        "Personne");
                                String classe_nom = ((Classe) idClasse.get(0)).getNom();
                                ArrayList<Object> idEcole = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                                String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                                ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                                String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                                ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()),
                                        "AnneeScolaire");
                                String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut())
                                        + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                                String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " "
                                        + classe_annee;
                                String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                                ArrayList<Object> idProf = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                        "Personne");
                                String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                                String prof_nom = ((Personne) idProf.get(0)).getNom();
                                String enseignement_professeur = prof_prenom + " " + prof_nom;
                                String enseignement = discipline + " " + enseignement_professeur;
                                Object[] data = { id, bulletin, enseignement, appreciation };
                                model.addRow(data);
                            }
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de la classe":
                ArrayList<Object> idclasse = bdd.rechercher("Nom", value, "Classe");
                for (int i = 0; i < idclasse.size(); i++) {
                    ArrayList<Object> idinscription = bdd.rechercher("idClasse",
                            String.valueOf(((Classe) idclasse.get(i)).getId()), "Inscription");
                    for (int k = 0; k < idinscription.size(); k++) {
                        ArrayList<Object> idbulletin = bdd.rechercher("idInscription",
                                String.valueOf(((Inscription) idinscription.get(k)).getId()), "Bulletin");
                        for (int h = 0; h < idbulletin.size(); h++) {
                            list = bdd.rechercher("idBulletin", String.valueOf(((Bulletin) idbulletin.get(h)).getId()),
                                    "DetailBulletin");
                            // model.setNumRows(list.size());
                            for (int j = 0; j < list.size(); j++) {
                                DetailBulletin o = (DetailBulletin) list.get(j);
                                int id = o.getId();
                                String appreciation = o.getAppreciation();
                                ArrayList<Object> idBulletin = bdd.rechercher("Id", String.valueOf(o.getIdBulletin()),
                                        "Bulletin");
                                ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                                String bulletin_trimestre = String
                                        .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                        + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                                ArrayList<Object> idInscription = bdd.rechercher("Id",
                                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()),
                                        "Inscription");
                                ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                                        String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                                String classe = ((Classe) idclasse_2.get(0)).getNom();
                                ArrayList<Object> idEleve = bdd.rechercher("Id",
                                        String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()),
                                        "Personne");
                                String prenom = ((Personne) idEleve.get(0)).getPrenom();
                                String nom = ((Personne) idEleve.get(0)).getNom();
                                String bulletin_inscription = classe + "-" + prenom + " " + nom;
                                String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                                ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                                        String.valueOf(o.getIdEnseignement()), "Enseignement");
                                ArrayList<Object> idClasse = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
                                ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()),
                                        "Discipline");
                                ArrayList<Object> idPersonne = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                        "Personne");
                                String classe_nom = ((Classe) idClasse.get(0)).getNom();
                                ArrayList<Object> idEcole = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                                String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                                ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                                String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                                ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()),
                                        "AnneeScolaire");
                                String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut())
                                        + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                                String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " "
                                        + classe_annee;
                                String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                                ArrayList<Object> idProf = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                        "Personne");
                                String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                                String prof_nom = ((Personne) idProf.get(0)).getNom();
                                String enseignement_professeur = prof_prenom + " " + prof_nom;
                                String enseignement = discipline + " " + enseignement_professeur;
                                Object[] data = { id, bulletin, enseignement, appreciation };
                                model.addRow(data);
                            }
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de l'élève":
                ArrayList<Object> ideleve = bdd.rechercher("Nom", value, "Personne");
                for (int i = 0; i < ideleve.size(); i++) {
                    if (!((Personne) ideleve.get(i)).isType()) {
                        ArrayList<Object> idinscription = bdd.rechercher("idClasse",
                                String.valueOf(((Personne) ideleve.get(i)).getId()), "Inscription");
                        for (int k = 0; k < idinscription.size(); k++) {
                            ArrayList<Object> idbulletin = bdd.rechercher("idInscription",
                                    String.valueOf(((Inscription) idinscription.get(k)).getId()), "Bulletin");
                            for (int h = 0; h < idbulletin.size(); h++) {
                                list = bdd.rechercher("idBulletin",
                                        String.valueOf(((Bulletin) idbulletin.get(h)).getId()), "DetailBulletin");
                                // model.setNumRows(list.size());
                                for (int j = 0; j < list.size(); j++) {
                                    DetailBulletin o = (DetailBulletin) list.get(j);
                                    int id = o.getId();
                                    String appreciation = o.getAppreciation();
                                    ArrayList<Object> idBulletin = bdd.rechercher("Id",
                                            String.valueOf(o.getIdBulletin()), "Bulletin");
                                    ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()),
                                            "Trimestre");
                                    String bulletin_trimestre = String
                                            .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                            + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                                    ArrayList<Object> idInscription = bdd.rechercher("Id",
                                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()),
                                            "Inscription");
                                    ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                                            String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()),
                                            "Classe");
                                    String classe = ((Classe) idclasse_2.get(0)).getNom();
                                    ArrayList<Object> idEleve = bdd.rechercher("Id",
                                            String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()),
                                            "Personne");
                                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                                    String nom = ((Personne) idEleve.get(0)).getNom();
                                    String bulletin_inscription = classe + "-" + prenom + " " + nom;
                                    String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                                    ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                                            String.valueOf(o.getIdEnseignement()), "Enseignement");
                                    ArrayList<Object> idClasse = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()),
                                            "Classe");
                                    ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()),
                                            "Discipline");
                                    ArrayList<Object> idPersonne = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                            "Personne");
                                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                                    ArrayList<Object> idEcole = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                                    ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                                    ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()),
                                            "AnneeScolaire");
                                    String classe_annee = String
                                            .valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                                    String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " "
                                            + classe_annee;
                                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                                    ArrayList<Object> idProf = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                            "Personne");
                                    String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                                    String prof_nom = ((Personne) idProf.get(0)).getNom();
                                    String enseignement_professeur = prof_prenom + " " + prof_nom;
                                    String enseignement = discipline + " " + enseignement_professeur;
                                    Object[] data = { id, bulletin, enseignement, appreciation };
                                    model.addRow(data);
                                }
                            }
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom du professeur":
                ArrayList<Object> idprof = bdd.rechercher("Nom", value, "Personne");
                for (int i = 0; i < idprof.size(); i++) {
                    if (((Personne) idprof.get(i)).isType()) {
                        ArrayList<Object> idenseignement = bdd.rechercher("idPersonne",
                                String.valueOf(((Personne) idprof.get(i)).getId()), "Enseignement");
                        for (int k = 0; k < idenseignement.size(); k++) {
                            list = bdd.rechercher("idEnseignement",
                                    String.valueOf(((Enseignement) idenseignement.get(k)).getId()), "DetailBulletin");
                            // model.setNumRows(list.size());
                            for (int j = 0; j < list.size(); j++) {
                                DetailBulletin o = (DetailBulletin) list.get(j);
                                int id = o.getId();
                                String appreciation = o.getAppreciation();
                                ArrayList<Object> idBulletin = bdd.rechercher("Id", String.valueOf(o.getIdBulletin()),
                                        "Bulletin");
                                ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                                String bulletin_trimestre = String
                                        .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                        + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                                ArrayList<Object> idInscription = bdd.rechercher("Id",
                                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()),
                                        "Inscription");
                                ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                                        String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                                String classe = ((Classe) idclasse_2.get(0)).getNom();
                                ArrayList<Object> idEleve = bdd.rechercher("Id",
                                        String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()),
                                        "Personne");
                                String prenom = ((Personne) idEleve.get(0)).getPrenom();
                                String nom = ((Personne) idEleve.get(0)).getNom();
                                String bulletin_inscription = classe + "-" + prenom + " " + nom;
                                String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                                ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                                        String.valueOf(o.getIdEnseignement()), "Enseignement");
                                ArrayList<Object> idClasse = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
                                ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()),
                                        "Discipline");
                                ArrayList<Object> idPersonne = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                        "Personne");
                                String classe_nom = ((Classe) idClasse.get(0)).getNom();
                                ArrayList<Object> idEcole = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                                String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                                ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                                String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                                ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()),
                                        "AnneeScolaire");
                                String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut())
                                        + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                                String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " "
                                        + classe_annee;
                                String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                                ArrayList<Object> idProf = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                        "Personne");
                                String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                                String prof_nom = ((Personne) idProf.get(0)).getNom();
                                String enseignement_professeur = prof_prenom + " " + prof_nom;
                                String enseignement = discipline + " " + enseignement_professeur;
                                Object[] data = { id, bulletin, enseignement, appreciation };
                                model.addRow(data);
                            }

                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de la discipline":
                ArrayList<Object> iddiscipline = bdd.rechercher("Nom", value, "Discipline");
                for (int i = 0; i < iddiscipline.size(); i++) {
                    ArrayList<Object> idenseignement = bdd.rechercher("idDiscipline",
                            String.valueOf(((Discipline) iddiscipline.get(i)).getId()), "Enseignement");
                    for (int k = 0; k < idenseignement.size(); k++) {
                        list = bdd.rechercher("idEnseignement",
                                String.valueOf(((Enseignement) idenseignement.get(k)).getId()), "DetailBulletin");
                        // model.setNumRows(list.size());
                        for (int j = 0; j < list.size(); j++) {
                            DetailBulletin o = (DetailBulletin) list.get(j);
                            int id = o.getId();
                            String appreciation = o.getAppreciation();
                            ArrayList<Object> idBulletin = bdd.rechercher("Id", String.valueOf(o.getIdBulletin()),
                                    "Bulletin");
                            ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                                    String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                            String bulletin_trimestre = String
                                    .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                    + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                            ArrayList<Object> idInscription = bdd.rechercher("Id",
                                    String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()), "Inscription");
                            ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                                    String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                            String classe = ((Classe) idclasse_2.get(0)).getNom();
                            ArrayList<Object> idEleve = bdd.rechercher("Id",
                                    String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                            String prenom = ((Personne) idEleve.get(0)).getPrenom();
                            String nom = ((Personne) idEleve.get(0)).getNom();
                            String bulletin_inscription = classe + "-" + prenom + " " + nom;
                            String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                            ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                                    String.valueOf(o.getIdEnseignement()), "Enseignement");
                            ArrayList<Object> idClasse = bdd.rechercher("Id",
                                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
                            ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()),
                                    "Discipline");
                            ArrayList<Object> idPersonne = bdd.rechercher("Id",
                                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                            String classe_nom = ((Classe) idClasse.get(0)).getNom();
                            ArrayList<Object> idEcole = bdd.rechercher("Id",
                                    String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                            String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                            ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                    String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                            String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                            ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                    String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                            String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                    + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                            String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                            String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                            ArrayList<Object> idProf = bdd.rechercher("Id",
                                    String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                            String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                            String prof_nom = ((Personne) idProf.get(0)).getNom();
                            String enseignement_professeur = prof_prenom + " " + prof_nom;
                            String enseignement = discipline + " " + enseignement_professeur;
                            Object[] data = { id, bulletin, enseignement, appreciation };
                            model.addRow(data);
                        }

                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        case "Evaluation":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Evaluation");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Evaluation o = (Evaluation) list.get(i);
                    int id = o.getId();
                    String appreciation = o.getAppreciation();
                    int note = o.getNote();
                    ArrayList<Object> idBulletinDetails = bdd.rechercher("Id", String.valueOf(o.getIdDetailBulletin()),
                            "DetailBulletin");
                    String bulletinDetails_appreciation = ((DetailBulletin) idBulletinDetails.get(0)).getAppreciation();
                    ArrayList<Object> idBulletin = bdd.rechercher("Id",
                            String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdBulletin()), "Bulletin");
                    ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                    String bulletin_trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString())
                            + "-" + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                    ArrayList<Object> idInscription = bdd.rechercher("Id",
                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()), "Inscription");
                    ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                            String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                    String classe = ((Classe) idclasse_2.get(0)).getNom();
                    ArrayList<Object> idEleve = bdd.rechercher("Id",
                            String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                    String nom = ((Personne) idEleve.get(0)).getNom();
                    String bulletin_inscription = classe + "-" + prenom + " " + nom;
                    String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                    ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                            String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdEnseignement()),
                            "Enseignement");
                    ArrayList<Object> idClasse = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
                    ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()), "Discipline");
                    ArrayList<Object> idPersonne = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                    ArrayList<Object> idEcole = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                    ArrayList<Object> idNiveau = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                    ArrayList<Object> idAnnee = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                    String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                    ArrayList<Object> idProf = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                    String prof_nom = ((Personne) idProf.get(0)).getNom();
                    String enseignement_professeur = prof_prenom + " " + prof_nom;
                    String enseignement = discipline + " " + enseignement_professeur;
                    String bulletindetails = bulletin + " " + enseignement + " " + appreciation;
                    Object[] data = { id, bulletindetails, note, appreciation };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Note":
                list = bdd.rechercher("Note", value, "Evaluation");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Evaluation o = (Evaluation) list.get(i);
                    int id = o.getId();
                    String appreciation = o.getAppreciation();
                    int note = o.getNote();
                    ArrayList<Object> idBulletinDetails = bdd.rechercher("Id", String.valueOf(o.getIdDetailBulletin()),
                            "DetailBulletin");
                    String bulletinDetails_appreciation = ((DetailBulletin) idBulletinDetails.get(0)).getAppreciation();
                    ArrayList<Object> idBulletin = bdd.rechercher("Id",
                            String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdBulletin()), "Bulletin");
                    ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                    String bulletin_trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString())
                            + "-" + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                    ArrayList<Object> idInscription = bdd.rechercher("Id",
                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()), "Inscription");
                    ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                            String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                    String classe = ((Classe) idclasse_2.get(0)).getNom();
                    ArrayList<Object> idEleve = bdd.rechercher("Id",
                            String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                    String nom = ((Personne) idEleve.get(0)).getNom();
                    String bulletin_inscription = classe + "-" + prenom + " " + nom;
                    String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                    ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                            String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdEnseignement()),
                            "Enseignement");
                    ArrayList<Object> idClasse = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
                    ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()), "Discipline");
                    ArrayList<Object> idPersonne = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                    ArrayList<Object> idEcole = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                    ArrayList<Object> idNiveau = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                    ArrayList<Object> idAnnee = bdd.rechercher("Id",
                            String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                    String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                    ArrayList<Object> idProf = bdd.rechercher("Id",
                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                    String prof_nom = ((Personne) idProf.get(0)).getNom();
                    String enseignement_professeur = prof_prenom + " " + prof_nom;
                    String enseignement = discipline + " " + enseignement_professeur;
                    String bulletindetails = bulletin + " " + enseignement + " " + appreciation;
                    Object[] data = { id, bulletindetails, note, appreciation };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;

            case "Nom de la classe":
                ArrayList<Object> idclasse = bdd.rechercher("Nom", value, "Classe");
                for (int i = 0; i < idclasse.size(); i++) {
                    ArrayList<Object> idinscription = bdd.rechercher("idClasse",
                            String.valueOf(((Classe) idclasse.get(i)).getId()), "Inscription");
                    for (int k = 0; k < idinscription.size(); k++) {
                        ArrayList<Object> idbulletin = bdd.rechercher("idInscription",
                                String.valueOf(((Inscription) idinscription.get(k)).getId()), "Bulletin");
                        for (int h = 0; h < idbulletin.size(); h++) {
                            ArrayList<Object> iddetailbulletin = bdd.rechercher("idBulletin",
                                    String.valueOf(((Bulletin) idbulletin.get(h)).getId()), "DetailBulletin");
                            for (int l = 0; l < iddetailbulletin.size(); l++) {
                                list = bdd.rechercher("idDetailBulletin",
                                        String.valueOf(((DetailBulletin) iddetailbulletin.get(h)).getId()),
                                        "Evaluation");
                                // model.setNumRows(list.size());
                                for (int j = 0; j < list.size(); j++) {
                                    Evaluation o = (Evaluation) list.get(j);
                                    int id = o.getId();
                                    String appreciation = o.getAppreciation();
                                    int note = o.getNote();
                                    ArrayList<Object> idBulletinDetails = bdd.rechercher("Id",
                                            String.valueOf(o.getIdDetailBulletin()), "DetailBulletin");
                                    String bulletinDetails_appreciation = ((DetailBulletin) idBulletinDetails.get(0))
                                            .getAppreciation();
                                    ArrayList<Object> idBulletin = bdd.rechercher("Id",
                                            String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdBulletin()),
                                            "Bulletin");
                                    ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()),
                                            "Trimestre");
                                    String bulletin_trimestre = String
                                            .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                            + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                                    ArrayList<Object> idInscription = bdd.rechercher("Id",
                                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()),
                                            "Inscription");
                                    ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                                            String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()),
                                            "Classe");
                                    String classe = ((Classe) idclasse_2.get(0)).getNom();
                                    ArrayList<Object> idEleve = bdd.rechercher("Id",
                                            String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()),
                                            "Personne");
                                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                                    String nom = ((Personne) idEleve.get(0)).getNom();
                                    String bulletin_inscription = classe + "-" + prenom + " " + nom;
                                    String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                                    ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                                            String.valueOf(
                                                    ((DetailBulletin) idBulletinDetails.get(0)).getIdEnseignement()),
                                            "Enseignement");
                                    ArrayList<Object> idClasse = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()),
                                            "Classe");
                                    ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()),
                                            "Discipline");
                                    ArrayList<Object> idPersonne = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                            "Personne");
                                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                                    ArrayList<Object> idEcole = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                                    ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                                    ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()),
                                            "AnneeScolaire");
                                    String classe_annee = String
                                            .valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                                    String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " "
                                            + classe_annee;
                                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                                    ArrayList<Object> idProf = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                            "Personne");
                                    String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                                    String prof_nom = ((Personne) idProf.get(0)).getNom();
                                    String enseignement_professeur = prof_prenom + " " + prof_nom;
                                    String enseignement = discipline + " " + enseignement_professeur;
                                    String bulletindetails = bulletin + " " + enseignement + " " + appreciation;
                                    Object[] data = { id, bulletindetails, note, appreciation };
                                    model.addRow(data);
                                }
                            }
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Début d'année scolaire":
                ArrayList<Object> idannee = bdd.rechercher("AnneeDebut", value, "AnneeScolaire");
                for (int i = 0; i < idannee.size(); i++) {
                    ArrayList<Object> idtrimestre = bdd.rechercher("idAnneeScolaire",
                            String.valueOf(((AnneeScolaire) idannee.get(i)).getId()), "Trimestre");
                    for (int k = 0; k < idtrimestre.size(); k++) {
                        ArrayList<Object> idbulletin = bdd.rechercher("idTrimestre",
                                String.valueOf(((Trimestre) idtrimestre.get(k)).getId()), "Bulletin");
                        for (int h = 0; h < idbulletin.size(); h++) {
                            ArrayList<Object> iddetailbulletin = bdd.rechercher("idBulletin",
                                    String.valueOf(((Bulletin) idbulletin.get(h)).getId()), "DetailBulletin");
                            for (int l = 0; l < iddetailbulletin.size(); l++) {
                                list = bdd.rechercher("idDetailBulletin",
                                        String.valueOf(((DetailBulletin) iddetailbulletin.get(h)).getId()),
                                        "Evaluation");
                                // model.setNumRows(list.size());
                                for (int j = 0; j < list.size(); j++) {
                                    Evaluation o = (Evaluation) list.get(j);
                                    int id = o.getId();
                                    String appreciation = o.getAppreciation();
                                    int note = o.getNote();
                                    ArrayList<Object> idBulletinDetails = bdd.rechercher("Id",
                                            String.valueOf(o.getIdDetailBulletin()), "DetailBulletin");
                                    String bulletinDetails_appreciation = ((DetailBulletin) idBulletinDetails.get(0))
                                            .getAppreciation();
                                    ArrayList<Object> idBulletin = bdd.rechercher("Id",
                                            String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdBulletin()),
                                            "Bulletin");
                                    ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()),
                                            "Trimestre");
                                    String bulletin_trimestre = String
                                            .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                            + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                                    ArrayList<Object> idInscription = bdd.rechercher("Id",
                                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()),
                                            "Inscription");
                                    ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                                            String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()),
                                            "Classe");
                                    String classe = ((Classe) idclasse_2.get(0)).getNom();
                                    ArrayList<Object> idEleve = bdd.rechercher("Id",
                                            String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()),
                                            "Personne");
                                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                                    String nom = ((Personne) idEleve.get(0)).getNom();
                                    String bulletin_inscription = classe + "-" + prenom + " " + nom;
                                    String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                                    ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                                            String.valueOf(
                                                    ((DetailBulletin) idBulletinDetails.get(0)).getIdEnseignement()),
                                            "Enseignement");
                                    ArrayList<Object> idClasse = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()),
                                            "Classe");
                                    ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()),
                                            "Discipline");
                                    ArrayList<Object> idPersonne = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                            "Personne");
                                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                                    ArrayList<Object> idEcole = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                                    ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                                    ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()),
                                            "AnneeScolaire");
                                    String classe_annee = String
                                            .valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                                    String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " "
                                            + classe_annee;
                                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                                    ArrayList<Object> idProf = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                            "Personne");
                                    String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                                    String prof_nom = ((Personne) idProf.get(0)).getNom();
                                    String enseignement_professeur = prof_prenom + " " + prof_nom;
                                    String enseignement = discipline + " " + enseignement_professeur;
                                    String bulletindetails = bulletin + " " + enseignement + " " + appreciation;
                                    Object[] data = { id, bulletindetails, note, appreciation };
                                    model.addRow(data);
                                }
                            }
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de l'élève":
                ArrayList<Object> ideleve = bdd.rechercher("Nom", value, "Personne");
                for (int i = 0; i < ideleve.size(); i++) {
                    if (!((Personne) ideleve.get(i)).isType()) {
                        ArrayList<Object> idinscription = bdd.rechercher("idPersonne",
                                String.valueOf(((Personne) ideleve.get(i)).getId()), "Inscription");
                        for (int k = 0; k < idinscription.size(); k++) {
                            ArrayList<Object> idbulletin = bdd.rechercher("idInscription",
                                    String.valueOf(((Inscription) idinscription.get(k)).getId()), "Bulletin");
                            for (int h = 0; h < idbulletin.size(); h++) {
                                ArrayList<Object> iddetailbulletin = bdd.rechercher("idBulletin",
                                        String.valueOf(((Bulletin) idbulletin.get(h)).getId()), "DetailBulletin");
                                for (int l = 0; l < iddetailbulletin.size(); l++) {
                                    list = bdd.rechercher("idDetailBulletin",
                                            String.valueOf(((DetailBulletin) iddetailbulletin.get(l)).getId()),
                                            "Evaluation");
                                    // model.setNumRows(list.size());
                                    for (int j = 0; j < list.size(); j++) {
                                        Evaluation o = (Evaluation) list.get(j);
                                        int id = o.getId();
                                        String appreciation = o.getAppreciation();
                                        int note = o.getNote();
                                        ArrayList<Object> idBulletinDetails = bdd.rechercher("Id",
                                                String.valueOf(o.getIdDetailBulletin()), "DetailBulletin");
                                        String bulletinDetails_appreciation = ((DetailBulletin) idBulletinDetails
                                                .get(0)).getAppreciation();
                                        ArrayList<Object> idBulletin = bdd.rechercher("Id",
                                                String.valueOf(
                                                        ((DetailBulletin) idBulletinDetails.get(0)).getIdBulletin()),
                                                "Bulletin");
                                        ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                                                String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()),
                                                "Trimestre");
                                        String bulletin_trimestre = String
                                                .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                                + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                                        ArrayList<Object> idInscription = bdd.rechercher("Id",
                                                String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()),
                                                "Inscription");
                                        ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                                                String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()),
                                                "Classe");
                                        String classe = ((Classe) idclasse_2.get(0)).getNom();
                                        ArrayList<Object> idEleve = bdd.rechercher("Id",
                                                String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()),
                                                "Personne");
                                        String prenom = ((Personne) idEleve.get(0)).getPrenom();
                                        String nom = ((Personne) idEleve.get(0)).getNom();
                                        String bulletin_inscription = classe + "-" + prenom + " " + nom;
                                        String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                                        ArrayList<Object> idEnseignement = bdd.rechercher("Id", String.valueOf(
                                                ((DetailBulletin) idBulletinDetails.get(0)).getIdEnseignement()),
                                                "Enseignement");
                                        ArrayList<Object> idClasse = bdd.rechercher("Id",
                                                String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()),
                                                "Classe");
                                        ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                                                String.valueOf(
                                                        ((Enseignement) idEnseignement.get(0)).getIdDiscipline()),
                                                "Discipline");
                                        ArrayList<Object> idPersonne = bdd.rechercher("Id",
                                                String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                                "Personne");
                                        String classe_nom = ((Classe) idClasse.get(0)).getNom();
                                        ArrayList<Object> idEcole = bdd.rechercher("Id",
                                                String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                                        String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                                        ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                                String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                                        String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                                        ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                                String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()),
                                                "AnneeScolaire");
                                        String classe_annee = String
                                                .valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                                + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                                        String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " "
                                                + classe_annee;
                                        String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                                        ArrayList<Object> idProf = bdd.rechercher("Id",
                                                String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                                "Personne");
                                        String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                                        String prof_nom = ((Personne) idProf.get(0)).getNom();
                                        String enseignement_professeur = prof_prenom + " " + prof_nom;
                                        String enseignement = discipline + " " + enseignement_professeur;
                                        String bulletindetails = bulletin + " " + enseignement + " " + appreciation;
                                        Object[] data = { id, bulletindetails, note, appreciation };
                                        model.addRow(data);
                                    }
                                }
                            }
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom du professeur":
                ArrayList<Object> idprof = bdd.rechercher("Nom", value, "Personne");
                for (int i = 0; i < idprof.size(); i++) {
                    if (((Personne) idprof.get(i)).isType()) {
                        ArrayList<Object> idenseignement = bdd.rechercher("idPersonne",
                                String.valueOf(((Personne) idprof.get(i)).getId()), "Enseignement");
                        for (int k = 0; k < idenseignement.size(); k++) {
                            ArrayList<Object> iddetailbulletin = bdd.rechercher("idEnseignement",
                                    String.valueOf(((Enseignement) idenseignement.get(k)).getId()), "DetailBulletin");
                            for (int l = 0; l < iddetailbulletin.size(); l++) {
                                list = bdd.rechercher("idDetailBulletin",
                                        String.valueOf(((DetailBulletin) iddetailbulletin.get(l)).getId()),
                                        "Evaluation");
                                // model.setNumRows(list.size());
                                for (int j = 0; j < list.size(); j++) {
                                    Evaluation o = (Evaluation) list.get(j);
                                    int id = o.getId();
                                    String appreciation = o.getAppreciation();
                                    int note = o.getNote();
                                    ArrayList<Object> idBulletinDetails = bdd.rechercher("Id",
                                            String.valueOf(o.getIdDetailBulletin()), "DetailBulletin");
                                    String bulletinDetails_appreciation = ((DetailBulletin) idBulletinDetails.get(0))
                                            .getAppreciation();
                                    ArrayList<Object> idBulletin = bdd.rechercher("Id",
                                            String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdBulletin()),
                                            "Bulletin");
                                    ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()),
                                            "Trimestre");
                                    String bulletin_trimestre = String
                                            .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                            + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                                    ArrayList<Object> idInscription = bdd.rechercher("Id",
                                            String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()),
                                            "Inscription");
                                    ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                                            String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()),
                                            "Classe");
                                    String classe = ((Classe) idclasse_2.get(0)).getNom();
                                    ArrayList<Object> idEleve = bdd.rechercher("Id",
                                            String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()),
                                            "Personne");
                                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                                    String nom = ((Personne) idEleve.get(0)).getNom();
                                    String bulletin_inscription = classe + "-" + prenom + " " + nom;
                                    String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                                    ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                                            String.valueOf(
                                                    ((DetailBulletin) idBulletinDetails.get(0)).getIdEnseignement()),
                                            "Enseignement");
                                    ArrayList<Object> idClasse = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()),
                                            "Classe");
                                    ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()),
                                            "Discipline");
                                    ArrayList<Object> idPersonne = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                            "Personne");
                                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                                    ArrayList<Object> idEcole = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                                    ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                                    ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                            String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()),
                                            "AnneeScolaire");
                                    String classe_annee = String
                                            .valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-"
                                            + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                                    String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " "
                                            + classe_annee;
                                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                                    ArrayList<Object> idProf = bdd.rechercher("Id",
                                            String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                            "Personne");
                                    String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                                    String prof_nom = ((Personne) idProf.get(0)).getNom();
                                    String enseignement_professeur = prof_prenom + " " + prof_nom;
                                    String enseignement = discipline + " " + enseignement_professeur;
                                    String bulletindetails = bulletin + " " + enseignement + " " + appreciation;
                                    Object[] data = { id, bulletindetails, note, appreciation };
                                    model.addRow(data);
                                }
                            }
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom de la discipline":
                ArrayList<Object> iddiscipline = bdd.rechercher("Nom", value, "Discipline");
                for (int i = 0; i < iddiscipline.size(); i++) {
                    ArrayList<Object> idenseignement = bdd.rechercher("idDiscipline",
                            String.valueOf(((Discipline) iddiscipline.get(i)).getId()), "Enseignement");
                    for (int k = 0; k < idenseignement.size(); k++) {
                        ArrayList<Object> iddetailbulletin = bdd.rechercher("idEnseignement",
                                String.valueOf(((Enseignement) idenseignement.get(k)).getId()), "DetailBulletin");
                        for (int l = 0; l < iddetailbulletin.size(); l++) {
                            list = bdd.rechercher("idDetailBulletin",
                                    String.valueOf(((DetailBulletin) iddetailbulletin.get(l)).getId()), "Evaluation");
                            // model.setNumRows(list.size());
                            for (int j = 0; j < list.size(); j++) {
                                Evaluation o = (Evaluation) list.get(j);
                                int id = o.getId();
                                String appreciation = o.getAppreciation();
                                int note = o.getNote();
                                ArrayList<Object> idBulletinDetails = bdd.rechercher("Id",
                                        String.valueOf(o.getIdDetailBulletin()), "DetailBulletin");
                                String bulletinDetails_appreciation = ((DetailBulletin) idBulletinDetails.get(0))
                                        .getAppreciation();
                                ArrayList<Object> idBulletin = bdd.rechercher("Id",
                                        String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdBulletin()),
                                        "Bulletin");
                                ArrayList<Object> idTrimestre = bdd.rechercher("Id",
                                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                                String bulletin_trimestre = String
                                        .valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-"
                                        + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                                ArrayList<Object> idInscription = bdd.rechercher("Id",
                                        String.valueOf(((Bulletin) idBulletin.get(0)).getIdInscription()),
                                        "Inscription");
                                ArrayList<Object> idclasse_2 = bdd.rechercher("Id",
                                        String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                                String classe = ((Classe) idclasse_2.get(0)).getNom();
                                ArrayList<Object> idEleve = bdd.rechercher("Id",
                                        String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()),
                                        "Personne");
                                String prenom = ((Personne) idEleve.get(0)).getPrenom();
                                String nom = ((Personne) idEleve.get(0)).getNom();
                                String bulletin_inscription = classe + "-" + prenom + " " + nom;
                                String bulletin = bulletin_trimestre + " " + bulletin_inscription;
                                ArrayList<Object> idEnseignement = bdd.rechercher("Id",
                                        String.valueOf(((DetailBulletin) idBulletinDetails.get(0)).getIdEnseignement()),
                                        "Enseignement");
                                ArrayList<Object> idClasse = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdClasse()), "Classe");
                                ArrayList<Object> idDiscipline = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdDiscipline()),
                                        "Discipline");
                                ArrayList<Object> idPersonne = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                        "Personne");
                                String classe_nom = ((Classe) idClasse.get(0)).getNom();
                                ArrayList<Object> idEcole = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                                String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                                ArrayList<Object> idNiveau = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                                String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                                ArrayList<Object> idAnnee = bdd.rechercher("Id",
                                        String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()),
                                        "AnneeScolaire");
                                String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut())
                                        + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                                String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " "
                                        + classe_annee;
                                String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                                ArrayList<Object> idProf = bdd.rechercher("Id",
                                        String.valueOf(((Enseignement) idEnseignement.get(0)).getIdPersonne()),
                                        "Personne");
                                String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                                String prof_nom = ((Personne) idProf.get(0)).getNom();
                                String enseignement_professeur = prof_prenom + " " + prof_nom;
                                String enseignement = discipline + " " + enseignement_professeur;
                                String bulletindetails = bulletin + " " + enseignement + " " + appreciation;
                                Object[] data = { id, bulletindetails, note, appreciation };
                                model.addRow(data);
                            }
                        }
                    }
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;

        case "Ecole":
            switch (type) {
            case "Id":
                list = bdd.rechercher("Id", value, "Ecole");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Ecole p = (Ecole) list.get(i);
                    int id = p.getId();
                    String nom = p.getNom();
                    Object[] data = { id, nom };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;
            case "Nom":
                list = bdd.rechercher("Nom", value, "Ecole");
                model.setNumRows(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Ecole p = (Ecole) list.get(i);
                    int id = p.getId();
                    String nom = p.getNom();
                    Object[] data = { id, nom };
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
                break;

            default:
                resultatLabel.setText("Erreur de sélection de variable");
            }
            break;
        default:

        }
    }// GEN-LAST:event_rechercheButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton Deconnexion;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Rechercher;
    private javax.swing.JButton Statistiques;
    private javax.swing.JButton Supprimer;
    private javax.swing.JTextField ajout1Field;
    private javax.swing.JLabel ajout1Label;
    private javax.swing.JTextField ajout2Field;
    private javax.swing.JLabel ajout2Label;
    private javax.swing.JTextField ajout3Field;
    private javax.swing.JLabel ajout3Label;
    private javax.swing.JTextField ajout4Field;
    private javax.swing.JLabel ajout4Label;
    private javax.swing.JTextField ajout5Field;
    private javax.swing.JLabel ajout5Label;
    private javax.swing.JComboBox<String> ajout6ComboBox;
    private javax.swing.JLabel ajout6Label;
    private javax.swing.JComboBox<String> ajout7ComboBox;
    private javax.swing.JLabel ajout7Label;
    private javax.swing.JComboBox<String> ajout8ComboBox;
    private javax.swing.JLabel ajout8Label;
    private javax.swing.JPanel ajoutPanel;
    private javax.swing.JButton ajouterButton;
    private javax.swing.JButton annee;
    private javax.swing.JButton bulletin;
    private javax.swing.JButton bulletindetail;
    private javax.swing.JButton classe;
    private javax.swing.JButton discipline;
    private javax.swing.JButton ecole;
    private javax.swing.JButton eleve;
    private javax.swing.JButton enseignant;
    private javax.swing.JButton enseignement;
    private javax.swing.JLabel erreurLabel;
    private javax.swing.JButton evaluation;
    private javax.swing.JButton inscription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel modifier1Button;
    private javax.swing.JLabel modifier2Button;
    private javax.swing.JLabel modifier3Button;
    private javax.swing.JLabel modifier4Button;
    private javax.swing.JLabel modifier5Button;
    private javax.swing.JPanel modifierModifierPanel;
    private javax.swing.JButton modifierValiderButton;
    private javax.swing.JButton niveau;
    private javax.swing.JButton rSupprimerButton;
    private javax.swing.JButton rechercheButton;
    private javax.swing.JComboBox<String> rechercheComboBox;
    private javax.swing.JTextField rechercheField;
    private javax.swing.JPanel recherchePanel;
    private javax.swing.JTable rechercherTable;
    private javax.swing.JLabel resultatLabel;
    private javax.swing.JPanel statsPanel;
    private javax.swing.JButton supprimerButton;
    private javax.swing.JTextField supprimerField;
    private javax.swing.JLabel supprimerLabel;
    private javax.swing.JList<String> supprimerList;
    private javax.swing.JPanel supprimerPanel;
    private javax.swing.JLabel supprimerResultLabel;
    private javax.swing.JButton trimestre;
    private javax.swing.JTextField valeur1Field;
    private javax.swing.JTextField valeur2Field;
    private javax.swing.JTextField valeur3Field;
    private javax.swing.JTextField valeur4Field;
    private javax.swing.JTextField valeur5Field;
    // End of variables declaration//GEN-END:variables
}
