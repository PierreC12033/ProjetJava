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
                Object[] data = {id, prenom, nom};
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
        rechercheLabel.setText("Clé de l'élève recherché : ");
        resultatLabel.setText("");
        erreurLabel.setText("");
        supprimerResultLabel.setText("");
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
        ajout1Label.setText("Prenom : ");
        ajout2Label.setText("Nom : ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        recherchePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rechercherTable = new javax.swing.JTable();
        resultatLabel = new javax.swing.JLabel();
        rechercheLabel = new javax.swing.JLabel();
        rechercheField = new javax.swing.JTextField();
        rechercheButton = new javax.swing.JButton();
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
        statsPanelLayout.setHorizontalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        statsPanelLayout.setVerticalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(492, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ajouterButton.setText("Ajouter");

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

        javax.swing.GroupLayout ajoutPanelLayout = new javax.swing.GroupLayout(ajoutPanel);
        ajoutPanel.setLayout(ajoutPanelLayout);
        ajoutPanelLayout.setHorizontalGroup(
            ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(erreurLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ajoutPanelLayout.createSequentialGroup()
                        .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ajoutPanelLayout.createSequentialGroup()
                                .addComponent(ajout1Label)
                                .addGap(18, 18, 18)
                                .addComponent(ajout1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(ajoutPanelLayout.createSequentialGroup()
                                    .addComponent(ajout2Label)
                                    .addGap(18, 18, 18)
                                    .addComponent(ajout2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ajoutPanelLayout.createSequentialGroup()
                                    .addComponent(ajout3Label)
                                    .addGap(18, 18, 18)
                                    .addComponent(ajout3Field)))
                            .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(ajoutPanelLayout.createSequentialGroup()
                                    .addComponent(ajout4Label)
                                    .addGap(18, 18, 18)
                                    .addComponent(ajout4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ajoutPanelLayout.createSequentialGroup()
                                    .addComponent(ajout5Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ajout5Field))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(ajoutPanelLayout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(ajouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ajoutPanelLayout.setVerticalGroup(
            ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajoutPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajout1Label)
                    .addComponent(ajout1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajout2Label)
                    .addComponent(ajout2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajout3Label)
                    .addComponent(ajout3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajout4Label)
                    .addComponent(ajout4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ajoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajout5Label)
                    .addComponent(ajout5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ajouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(erreurLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rechercherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane3.setViewportView(rechercherTable);

        resultatLabel.setText("Résultats :");

        rechercheLabel.setText("Identifiant :");

        rechercheField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheFieldActionPerformed(evt);
            }
        });

        rechercheButton.setText("Rechercher");

        javax.swing.GroupLayout recherchePanelLayout = new javax.swing.GroupLayout(recherchePanel);
        recherchePanel.setLayout(recherchePanelLayout);
        recherchePanelLayout.setHorizontalGroup(
            recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recherchePanelLayout.createSequentialGroup()
                .addGroup(recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recherchePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(resultatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)))
                    .addGroup(recherchePanelLayout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(rechercheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(recherchePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rechercheLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rechercheField, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        recherchePanelLayout.setVerticalGroup(
            recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recherchePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechercheLabel)
                    .addComponent(rechercheField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rechercheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(resultatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        supprimerButton.setText("Supprimer");

        supprimerLabel.setText("Identifiant :");

        supprimerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(supprimerList);

        supprimerResultLabel.setText("ERREUR");

        javax.swing.GroupLayout supprimerPanelLayout = new javax.swing.GroupLayout(supprimerPanel);
        supprimerPanel.setLayout(supprimerPanelLayout);
        supprimerPanelLayout.setHorizontalGroup(
            supprimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supprimerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(supprimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(supprimerResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(supprimerPanelLayout.createSequentialGroup()
                        .addComponent(supprimerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(supprimerField, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supprimerPanelLayout.createSequentialGroup()
                .addGap(0, 245, Short.MAX_VALUE)
                .addComponent(supprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        supprimerPanelLayout.setVerticalGroup(
            supprimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supprimerPanelLayout.createSequentialGroup()
                .addGroup(supprimerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(supprimerPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(supprimerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supprimerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(supprimerLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(supprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(supprimerResultLabel)
                .addContainerGap(58, Short.MAX_VALUE))
        );

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
        modifierModifierPanelLayout.setHorizontalGroup(
            modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                .addGroup(modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                                    .addComponent(modifier5Button)
                                    .addGap(18, 18, 18)
                                    .addComponent(valeur5Field))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifierModifierPanelLayout.createSequentialGroup()
                                    .addComponent(modifier4Button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(valeur4Field))
                                .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                                    .addComponent(modifier3Button)
                                    .addGap(18, 18, 18)
                                    .addComponent(valeur3Field))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifierModifierPanelLayout.createSequentialGroup()
                                    .addComponent(modifier2Button)
                                    .addGap(18, 18, 18)
                                    .addComponent(valeur2Field))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifierModifierPanelLayout.createSequentialGroup()
                                    .addComponent(modifier1Button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(valeur1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                            .addGap(242, 242, 242)
                            .addComponent(modifierValiderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modifierModifierPanelLayout.setVerticalGroup(
            modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                .addGroup(modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(modifierModifierPanelLayout.createSequentialGroup()
                        .addGroup(modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modifier1Button)
                            .addComponent(valeur1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modifier2Button)
                            .addComponent(valeur2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifier3Button))
                    .addComponent(valeur3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifier4Button)
                    .addComponent(valeur4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modifierModifierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifier5Button)
                    .addComponent(valeur5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifierValiderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(ajoutPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(recherchePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(supprimerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(modifierModifierPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(recherchePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supprimerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modifierModifierPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ajoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(recherchePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supprimerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifierModifierPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ajoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1436, Short.MAX_VALUE)))
        );

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
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Rechercher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ajouter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Supprimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modifier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Statistiques)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Deconnexion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ajouter)
                    .addComponent(Supprimer)
                    .addComponent(Modifier)
                    .addComponent(Rechercher)
                    .addComponent(Deconnexion)
                    .addComponent(Statistiques))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(eleve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enseignant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inscription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(niveau))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(discipline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bulletindetail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(evaluation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ecole)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trimestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bulletin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enseignement)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eleve)
                    .addComponent(enseignant)
                    .addComponent(inscription)
                    .addComponent(classe)
                    .addComponent(niveau)
                    .addComponent(annee)
                    .addComponent(trimestre)
                    .addComponent(bulletin)
                    .addComponent(enseignement))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discipline)
                    .addComponent(bulletindetail)
                    .addComponent(evaluation)
                    .addComponent(ecole))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajout4FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout4FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout4FieldActionPerformed

    private void RechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherActionPerformed
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
                rechercheLabel.setText("Clé de l'élève recherché : ");
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
                        Object[] data = {id, prenom, nom};
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
                rechercheLabel.setText("Clé de l'enseignant recherché: ");
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
                        Object[] data = {id, prenom, nom};
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
                rechercheLabel.setText("Clé de l'inscription recherchée : ");
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
                    Object[] data = {id, classe, eleve};
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
                rechercheLabel.setText("Clé de la classe recherchée : ");
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
                    String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(o.getIdEcole()), "Ecole");
                    String ecole = ((Ecole) idEcole.get(0)).getNom();
                    ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(o.getIdNiveau()), "Niveau");
                    String niveau = ((Niveau) idNiveau.get(0)).getNom();
                    String nom = o.getNom();
                    Object[] data = {id, nom, ecole, niveau, annee};
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
                rechercheLabel.setText("Clé du niveau recherché : ");
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
                    Object[] data = {id, nom};
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
                rechercheLabel.setText("Clé de l'année recherchée : ");
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
                    Object[] data = {id, debut, fin};
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
                rechercheLabel.setText("Clé du trimestre recherché : ");
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
                    String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    Object[] data = {id, numero, debut, fin, annee};
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
                rechercheLabel.setText("Clé du bulletin recherché : ");
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
                    String trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-" + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                    ArrayList<Object> idInscription = bdd.rechercher("Id", String.valueOf(o.getIdInscription()), "Inscription");
                    ArrayList<Object> idclasse = bdd.rechercher("Id", String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                    String classe = ((Classe) idclasse.get(0)).getNom();
                    ArrayList<Object> idEleve = bdd.rechercher("Id", String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                    String nom = ((Personne) idEleve.get(0)).getNom();
                    String inscription = classe + "-" + prenom + " " + nom;

                    Object[] data = {id, trimestre, inscription, appreciation};
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
                rechercheLabel.setText("Clé de l'enseignement recherché : ");
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
                    ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
                    ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
                    ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                    ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(o.getIdDiscipline()), "Discipline");
                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                    String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    String classe = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                    ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
                    String prenom = ((Personne) idProf.get(0)).getPrenom();
                    String nom = ((Personne) idProf.get(0)).getNom();
                    String professeur = prenom + " " + nom;
                    Object[] data = {id, classe, discipline, professeur};
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
                rechercheLabel.setText("Clé de la discipline recherchée : ");
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
                    Object[] data = {id, nom};
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
                rechercheLabel.setText("Clé de du bulletin détaillé recherché : ");
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
                    ArrayList<Object> idTrimestre = bdd.rechercher("Id", String.valueOf(((Bulletin)idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                    String bulletin_trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-" + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                    ArrayList<Object> idInscription = bdd.rechercher("Id", String.valueOf(((Bulletin)idBulletin.get(0)).getIdInscription()), "Inscription");
                    ArrayList<Object> idclasse = bdd.rechercher("Id", String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                    String classe = ((Classe) idclasse.get(0)).getNom();
                    ArrayList<Object> idEleve = bdd.rechercher("Id", String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                    String nom = ((Personne) idEleve.get(0)).getNom();
                    String bulletin_inscription = classe + "-" + prenom + " " + nom;
                    String bulletin = bulletin_trimestre+" "+bulletin_inscription;
                    ArrayList<Object> idEnseignement = bdd.rechercher("Id", String.valueOf(o.getIdEnseignement()), "Enseignement");
                    ArrayList<Object> idClasse = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdClasse()), "Classe");
                    ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdDiscipline()), "Discipline");
                    ArrayList<Object> idPersonne = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                    ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(((Classe)idClasse.get(0)).getIdEcole()), "Ecole");
                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                    ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(((Classe)idClasse.get(0)).getIdNiveau()), "Niveau");
                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                    ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(((Classe)idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                    String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                    ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                    String prof_nom = ((Personne) idProf.get(0)).getNom();
                    String enseignement_professeur = prof_prenom + " " + prof_nom;
                    String enseignement=discipline+" "+enseignement_professeur;
                    Object[] data = {id, bulletin, enseignement, appreciation};
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
                rechercheLabel.setText("Clé de l'évaluation recherchée : ");
                list = bdd.rechercher("a", "a", "DetailBulletin");
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
                    ArrayList<Object> idBulletinDetails = bdd.rechercher("Id", String.valueOf(o.getIdDetailBulletin()), "DetailBulletin");
                    String appreciation = idBulletinDetails.get(0)).getAppreciation();
                    ArrayList<Object> idBulletin = bdd.rechercher("Id", String.valueOf(o.getIdBulletin()), "Bulletin");
                    ArrayList<Object> idTrimestre = bdd.rechercher("Id", String.valueOf(((Bulletin)idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                    String bulletin_trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-" + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                    ArrayList<Object> idInscription = bdd.rechercher("Id", String.valueOf(((Bulletin)idBulletin.get(0)).getIdInscription()), "Inscription");
                    ArrayList<Object> idclasse = bdd.rechercher("Id", String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                    String classe = ((Classe) idclasse.get(0)).getNom();
                    ArrayList<Object> idEleve = bdd.rechercher("Id", String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                    String nom = ((Personne) idEleve.get(0)).getNom();
                    String bulletin_inscription = classe + "-" + prenom + " " + nom;
                    String bulletin = bulletin_trimestre+" "+bulletin_inscription;
                    ArrayList<Object> idEnseignement = bdd.rechercher("Id", String.valueOf(o.getIdEnseignement()), "Enseignement");
                    ArrayList<Object> idClasse = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdClasse()), "Classe");
                    ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdDiscipline()), "Discipline");
                    ArrayList<Object> idPersonne = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                    ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(((Classe)idClasse.get(0)).getIdEcole()), "Ecole");
                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                    ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(((Classe)idClasse.get(0)).getIdNiveau()), "Niveau");
                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                    ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(((Classe)idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                    String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                    ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                    String prof_nom = ((Personne) idProf.get(0)).getNom();
                    String enseignement_professeur = prof_prenom + " " + prof_nom;
                    String enseignement=discipline+" "+enseignement_professeur;
                    Object[] data = {id};
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
                rechercheLabel.setText("Clé de l'écolé recherchée : ");
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
                    Discipline o = (Discipline) it.next();
                    int id = o.getId();
                    String nom = o.getNom();
                    Object[] data = {id, nom};
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
    }//GEN-LAST:event_RechercherActionPerformed

    private void AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterActionPerformed
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
                ajout1Label.setText("Prénom : ");
                ajout2Label.setText("Nom : ");
                break;
            case "Inscription":
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
                ajout1Label.setText("idClasse : ");
                ajout2Label.setText("idPersonne : ");
                break;
            case "Classe":
                ajout1Label.setVisible(true);
                ajout1Field.setVisible(true);
                ajout2Label.setVisible(true);
                ajout2Field.setVisible(true);
                ajout3Label.setVisible(true);
                ajout3Field.setVisible(true);
                ajout4Label.setVisible(true);
                ajout4Field.setVisible(true);
                ajout5Label.setVisible(false);
                ajout5Field.setVisible(false);
                ajout1Label.setText("Nom : ");
                ajout2Label.setText("idEcole : ");
                ajout3Label.setText("idNiveau : ");
                ajout4Label.setText("idAnneeScolaire : ");
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
                ajout1Label.setText("Nom : ");
                break;
            case "Annee":
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
                ajout1Label.setText("Début : ");
                ajout2Label.setText("Fin : ");
                break;
            case "Trimestre":
                ajout1Label.setVisible(true);
                ajout1Field.setVisible(true);
                ajout2Label.setVisible(true);
                ajout2Field.setVisible(true);
                ajout3Label.setVisible(true);
                ajout3Field.setVisible(true);
                ajout4Label.setVisible(true);
                ajout4Field.setVisible(true);
                ajout5Label.setVisible(false);
                ajout5Field.setVisible(false);
                ajout1Label.setText("Numéro : ");
                ajout2Label.setText("Date de début : ");
                ajout3Label.setText("Date de fin : ");
                ajout4Label.setText("idAnneeScolaire : ");
                break;
            case "Bulletin":
                ajout1Label.setVisible(true);
                ajout1Field.setVisible(true);
                ajout2Label.setVisible(true);
                ajout2Field.setVisible(true);
                ajout3Label.setVisible(true);
                ajout3Field.setVisible(true);
                ajout4Label.setVisible(false);
                ajout4Field.setVisible(false);
                ajout5Label.setVisible(false);
                ajout5Field.setVisible(false);
                ajout1Label.setText("idTrimestre : ");
                ajout2Label.setText("idInscription : ");
                ajout3Label.setText("Appréciation : ");
                break;
            case "Enseignement":
                ajout1Label.setVisible(true);
                ajout1Field.setVisible(true);
                ajout2Label.setVisible(true);
                ajout2Field.setVisible(true);
                ajout3Label.setVisible(true);
                ajout3Field.setVisible(true);
                ajout4Label.setVisible(false);
                ajout4Field.setVisible(false);
                ajout5Label.setVisible(false);
                ajout5Field.setVisible(false);
                ajout1Label.setText("idClasse : ");
                ajout2Label.setText("idDiscipline : ");
                ajout3Label.setText("idPersonne : ");
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
                ajout1Label.setText("Nom : ");
                break;
            case "BulletinDetails":
                ajout1Label.setVisible(true);
                ajout1Field.setVisible(true);
                ajout2Label.setVisible(true);
                ajout2Field.setVisible(true);
                ajout3Label.setVisible(true);
                ajout3Field.setVisible(true);
                ajout4Label.setVisible(false);
                ajout4Field.setVisible(false);
                ajout5Label.setVisible(false);
                ajout5Field.setVisible(false);
                ajout1Label.setText("idBulletin : ");
                ajout2Label.setText("idEnseignement : ");
                ajout3Label.setText("Appréciation : ");
                break;
            case "Evaluation":
                ajout1Label.setVisible(true);
                ajout1Field.setVisible(true);
                ajout2Label.setVisible(true);
                ajout2Field.setVisible(true);
                ajout3Label.setVisible(true);
                ajout3Field.setVisible(true);
                ajout4Label.setVisible(false);
                ajout4Field.setVisible(false);
                ajout5Label.setVisible(false);
                ajout5Field.setVisible(false);
                ajout1Label.setText("idDetailsBulletin : ");
                ajout2Label.setText("Note : ");
                ajout3Label.setText("Appréciation : ");
                break;
            default:
        }

    }//GEN-LAST:event_AjouterActionPerformed

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        Rechercher.setForeground(new java.awt.Color(255, 255, 255));
        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setForeground(new java.awt.Color(0, 0, 0));
        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Statistiques.setForeground(new java.awt.Color(255, 255, 255));
        recherchePanel.setVisible(false);
        ajoutPanel.setVisible(false);
        supprimerPanel.setVisible(true);
        modifierModifierPanel.setVisible(false);
        jLayeredPane1.remove(statsPanel);
        statsPanel.setVisible(false);
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
    }//GEN-LAST:event_SupprimerActionPerformed

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
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
        rechercheButton.setText("Modifier");
        supprimerResultLabel.setText("");
        modifierModifierPanel.setVisible(false);
        erreurLabel.setText("");
        mode1 = "Modifier";
        switch (mode2) {
            case "Eleve":
                rechercheLabel.setText("Clé de l'élève à modifier : ");
                break;
            case "Enseignant":
                rechercheLabel.setText("Clé de l'enseignant à modifier : ");
                break;
            case "Inscription":
                rechercheLabel.setText("Clé de l'inscription à modifier : ");
                break;
            case "Classe":
                rechercheLabel.setText("Clé de la classe à modifier : ");
                break;
            case "Niveau":
                rechercheLabel.setText("Clé du niveau à modifier : ");
                break;
            case "Annee":
                rechercheLabel.setText("Clé de l'année à modifier : ");
                break;
            case "Trimestre":
                rechercheLabel.setText("Clé du trimestre à modifier : ");
                break;
            case "Bulletin":
                rechercheLabel.setText("Clé du bulletin à modifier : ");
                break;
            case "Enseignement":
                rechercheLabel.setText("Clé de l'enseignement à modifier : ");
                break;
            case "Discipline":
                rechercheLabel.setText("Clé de la discipline à modifier : ");
                break;
            case "BulletinDetails":
                rechercheLabel.setText("Clé de du bulletin détaillé à modifier : ");
                break;
            case "Evaluation":
                rechercheLabel.setText("Clé de l'évaluation à modifier : ");
                break;
            case "Ecole":
                rechercheLabel.setText("Clé de l'école à modifier : ");
                break;
            default:
        }
    }//GEN-LAST:event_ModifierActionPerformed

    private void DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnexionActionPerformed
        jLayeredPane1.remove(statsPanel);
        statsPanel.setVisible(false);
        setVisible(false);
        mode1 = "Deconnexion";
        Accueil accueil = new Accueil();
        accueil.setVisible(true);
        dispose();
    }//GEN-LAST:event_DeconnexionActionPerformed

    private void eleveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleveActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé de l'élève recherché : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé de l'élève à modifier : ");
            resultatLabel.setText("");
        }// TODO add your handling code here:
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
                Object[] data = {id, prenom, nom};
                model.addRow(data);
            }

        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }//GEN-LAST:event_eleveActionPerformed

    private void enseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enseignantActionPerformed
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
        if (mode1 == "Rechercher") {
            resultatLabel.setText("");
            rechercheLabel.setText("Clé de l'enseignant recherché: ");

        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé de l'enseignant à modifier : ");
            resultatLabel.setText("");
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
                Object[] data = {id, prenom, nom};
                Enseignantmodel.addRow(data);
            }

        }
        for (int i = Enseignantmodel.getRowCount() - 1; i >= 0; i--) {
            if (Enseignantmodel.getValueAt(i, 0) == null) {
                Enseignantmodel.removeRow(i);
            }
        }
        rechercherTable.setModel(Enseignantmodel);
    }//GEN-LAST:event_enseignantActionPerformed

    private void inscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscriptionActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé de l'inscription recherchée : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé de l'inscription à modifier : ");
            resultatLabel.setText("");
        }
        mode2 = "Inscription";// TODO add your handling code here:
        supprimerLabel.setText("Clé de l'inscription à supprimer : ");
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
            Object[] data = {id, classe, eleve};
            Inscription_model.addRow(data);
        }
        for (int i = Inscription_model.getRowCount() - 1; i >= 0; i--) {
            if (Inscription_model.getValueAt(i, 0) == null) {
                Inscription_model.removeRow(i);
            }
        }
        rechercherTable.setModel(Inscription_model);
    }//GEN-LAST:event_inscriptionActionPerformed

    private void classeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classeActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé de la classe recherchée : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé de la classe à modifier : ");
            resultatLabel.setText("");
        }
        mode2 = "Classe";// TODO add your handling code here:
        supprimerLabel.setText("Clé de la classe à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(true);
        ajout2Field.setVisible(true);
        ajout3Label.setVisible(true);
        ajout3Field.setVisible(true);
        ajout4Label.setVisible(true);
        ajout4Field.setVisible(true);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
        ajout1Label.setText("Nom : ");
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
            String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
            ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(o.getIdEcole()), "Ecole");
            String ecole = ((Ecole) idEcole.get(0)).getNom();
            ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(o.getIdNiveau()), "Niveau");
            String niveau = ((Niveau) idNiveau.get(0)).getNom();
            String nom = o.getNom();
            Object[] data = {id, nom, ecole, niveau, annee};
            Classe_model.addRow(data);
        }
        for (int i = Classe_model.getRowCount() - 1; i >= 0; i--) {
            if (Classe_model.getValueAt(i, 0) == null) {
                Classe_model.removeRow(i);
            }
        }
        rechercherTable.setModel(Classe_model);
    }//GEN-LAST:event_classeActionPerformed

    private void niveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niveauActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé du niveau recherché : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé du niveau à modifier : ");
            resultatLabel.setText("");
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
            Object[] data = {id, nom};
            Niveau_model.addRow(data);
        }
        for (int i = Niveau_model.getRowCount() - 1; i >= 0; i--) {
            if (Niveau_model.getValueAt(i, 0) == null) {
                Niveau_model.removeRow(i);
            }
        }
        rechercherTable.setModel(Niveau_model);
    }//GEN-LAST:event_niveauActionPerformed

    private void anneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anneeActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé de l'année recherchée : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé de l'année à modifier : ");
            resultatLabel.setText("");
        }
        mode2 = "Annee";// TODO add your handling code here:
        supprimerLabel.setText("Clé de l'année à supprimer : ");
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
        ajout1Label.setText("Début : ");
        ajout2Label.setText("Fin : ");
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
            Object[] data = {id, debut, fin};
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }//GEN-LAST:event_anneeActionPerformed

    private void trimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trimestreActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé du trimestre recherché : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé du trimestre à modifier : ");
            resultatLabel.setText("");
        }
        mode2 = "Trimestre";// TODO add your handling code here:
        supprimerLabel.setText("Clé du trimestre à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(true);
        ajout2Field.setVisible(true);
        ajout3Label.setVisible(true);
        ajout3Field.setVisible(true);
        ajout4Label.setVisible(true);
        ajout4Field.setVisible(true);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
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
            String annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
            Object[] data = {id, numero, debut, fin, annee};
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }//GEN-LAST:event_trimestreActionPerformed

    private void bulletinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulletinActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé du bulletin recherché : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé du bulletin à modifier : ");
            resultatLabel.setText("");
        }
        mode2 = "Bulletin";// TODO add your handling code here:
        supprimerLabel.setText("Clé du bulletin à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(true);
        ajout2Field.setVisible(true);
        ajout3Label.setVisible(true);
        ajout3Field.setVisible(true);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
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
            String trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-" + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
            ArrayList<Object> idInscription = bdd.rechercher("Id", String.valueOf(o.getIdInscription()), "Inscription");
            ArrayList<Object> idclasse = bdd.rechercher("Id", String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
            String classe = ((Classe) idclasse.get(0)).getNom();
            ArrayList<Object> idEleve = bdd.rechercher("Id", String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
            String prenom = ((Personne) idEleve.get(0)).getPrenom();
            String nom = ((Personne) idEleve.get(0)).getNom();
            String inscription = classe + "-" + prenom + " " + nom;

            Object[] data = {id, trimestre, inscription, appreciation};
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }//GEN-LAST:event_bulletinActionPerformed

    private void enseignementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enseignementActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé de l'enseignement recherché : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé de l'enseignement à modifier : ");
            resultatLabel.setText("");
        }
        mode2 = "Enseignement";// TODO add your handling code here:
        supprimerLabel.setText("Clé de l'enseignement à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(true);
        ajout2Field.setVisible(true);
        ajout3Label.setVisible(true);
        ajout3Field.setVisible(true);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
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
            ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdEcole()), "Ecole");
            ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdNiveau()), "Niveau");
            ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(((Classe) idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
            ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(o.getIdDiscipline()), "Discipline");
            String classe_nom = ((Classe) idClasse.get(0)).getNom();
            String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
            String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
            String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
            String classe = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
            String discipline = ((Discipline) idDiscipline.get(0)).getNom();
            ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(o.getIdPersonne()), "Personne");
            String prenom = ((Personne) idProf.get(0)).getPrenom();
            String nom = ((Personne) idProf.get(0)).getNom();
            String professeur = prenom + " " + nom;
            Object[] data = {id, classe, discipline, professeur};
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }//GEN-LAST:event_enseignementActionPerformed

    private void disciplineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplineActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé de la discipline recherchée : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé de la discipline à modifier : ");
            resultatLabel.setText("");
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
        rechercheLabel.setText("Clé de la discipline recherchée : ");
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
            Object[] data = {id, nom};
            model.addRow(data);
        }
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0) == null) {
                model.removeRow(i);
            }
        }
        rechercherTable.setModel(model);
    }//GEN-LAST:event_disciplineActionPerformed

    private void bulletindetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulletindetailActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé du bulletin détaillé recherché : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé du bulletin détaillé à modifier : ");
            resultatLabel.setText("");
        }
        mode2 = "BulletinDetails";// TODO add your handling code here:
        supprimerLabel.setText("Clé du bulletin détaillé à supprimer : ");
        supprimerResultLabel.setText("");
        erreurLabel.setText("");
        ajout1Label.setVisible(true);
        ajout1Field.setVisible(true);
        ajout2Label.setVisible(true);
        ajout2Field.setVisible(true);
        ajout3Label.setVisible(true);
        ajout3Field.setVisible(true);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
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
                    ArrayList<Object> idTrimestre = bdd.rechercher("Id", String.valueOf(((Bulletin)idBulletin.get(0)).getIdTrimestre()), "Trimestre");
                    String bulletin_trimestre = String.valueOf(((Trimestre) idTrimestre.get(0)).getDebut().toString()) + "-" + String.valueOf(((Trimestre) idTrimestre.get(0)).getFin().toString());
                    ArrayList<Object> idInscription = bdd.rechercher("Id", String.valueOf(((Bulletin)idBulletin.get(0)).getIdInscription()), "Inscription");
                    ArrayList<Object> idclasse = bdd.rechercher("Id", String.valueOf(((Inscription) idInscription.get(0)).getIdClasse()), "Classe");
                    String classe = ((Classe) idclasse.get(0)).getNom();
                    ArrayList<Object> idEleve = bdd.rechercher("Id", String.valueOf(((Inscription) idInscription.get(0)).getIdPersonne()), "Personne");
                    String prenom = ((Personne) idEleve.get(0)).getPrenom();
                    String nom = ((Personne) idEleve.get(0)).getNom();
                    String bulletin_inscription = classe + "-" + prenom + " " + nom;
                    String bulletin = bulletin_trimestre+" "+bulletin_inscription;
                    ArrayList<Object> idEnseignement = bdd.rechercher("Id", String.valueOf(o.getIdEnseignement()), "Enseignement");
                    ArrayList<Object> idClasse = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdClasse()), "Classe");
                    ArrayList<Object> idDiscipline = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdDiscipline()), "Discipline");
                    ArrayList<Object> idPersonne = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String classe_nom = ((Classe) idClasse.get(0)).getNom();
                    ArrayList<Object> idEcole = bdd.rechercher("Id", String.valueOf(((Classe)idClasse.get(0)).getIdEcole()), "Ecole");
                    String classe_ecole = ((Ecole) idEcole.get(0)).getNom();
                    ArrayList<Object> idNiveau = bdd.rechercher("Id", String.valueOf(((Classe)idClasse.get(0)).getIdNiveau()), "Niveau");
                    String classe_niveau = ((Niveau) idNiveau.get(0)).getNom();
                    ArrayList<Object> idAnnee = bdd.rechercher("Id", String.valueOf(((Classe)idClasse.get(0)).getIdAnneeScolaire()), "AnneeScolaire");
                    String classe_annee = String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeDebut()) + "-" + String.valueOf(((AnneeScolaire) idAnnee.get(0)).getAnneeFin());
                    String classe2 = classe_nom + " " + classe_ecole + " " + classe_niveau + " " + classe_annee;
                    String discipline = ((Discipline) idDiscipline.get(0)).getNom();
                    ArrayList<Object> idProf = bdd.rechercher("Id", String.valueOf(((Enseignement)idEnseignement.get(0)).getIdPersonne()), "Personne");
                    String prof_prenom = ((Personne) idProf.get(0)).getPrenom();
                    String prof_nom = ((Personne) idProf.get(0)).getNom();
                    String enseignement_professeur = prof_prenom + " " + prof_nom;
                    String enseignement=discipline+" "+enseignement_professeur;
                    Object[] data = {id, bulletin, enseignement, appreciation};
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
    }//GEN-LAST:event_bulletindetailActionPerformed

    private void evaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluationActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé de l'évaluation recherchée : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé de l'évaluation à modifier : ");
            resultatLabel.setText("");
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
        ajout3Label.setVisible(true);
        ajout3Field.setVisible(true);
        ajout4Label.setVisible(false);
        ajout4Field.setVisible(false);
        ajout5Label.setVisible(false);
        ajout5Field.setVisible(false);
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
    }//GEN-LAST:event_evaluationActionPerformed

    private void ajout1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajout1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajout1FieldActionPerformed

    private void rechercheFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechercheFieldActionPerformed

    private void modifierValiderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierValiderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifierValiderButtonActionPerformed

    private void StatistiquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatistiquesActionPerformed
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
        
    }//GEN-LAST:event_StatistiquesActionPerformed

    private void ecoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoleActionPerformed
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
        if (mode1 == "Rechercher") {
            rechercheLabel.setText("Clé de l'écolé recherchée : ");
            resultatLabel.setText("");
        } else if (mode1 == "Modifier") {
            rechercheLabel.setText("Clé de l'école à modifier : ");
            resultatLabel.setText("");
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
                    Discipline o = (Discipline) it.next();
                    int id = o.getId();
                    String nom = o.getNom();
                    Object[] data = {id, nom};
                    model.addRow(data);
                }
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    if (model.getValueAt(i, 0) == null) {
                        model.removeRow(i);
                    }
                }
                rechercherTable.setModel(model);
    }//GEN-LAST:event_ecoleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
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
        //</editor-fold>
        //</editor-fold>

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
    private javax.swing.JButton rechercheButton;
    private javax.swing.JTextField rechercheField;
    private javax.swing.JLabel rechercheLabel;
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
