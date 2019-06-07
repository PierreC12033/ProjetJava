/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import javafx.scene.paint.Color;
import ConnectionBDD.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
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
    }

    public JButton getAjouter() {
        return Ajouter;
    }

    public void setAjouter(JButton Ajouter) {
        this.Ajouter = Ajouter;
    }

    public JButton getDeconnexion() {
        return Deconnexion;
    }

    public void setDeconnexion(JButton Deconnexion) {
        this.Deconnexion = Deconnexion;
    }

    public JButton getModifier() {
        return Modifier;
    }

    public void setModifier(JButton Modifier) {
        this.Modifier = Modifier;
    }

    public JButton getRechercher() {
        return Rechercher;
    }

    public void setRechercher(JButton Rechercher) {
        this.Rechercher = Rechercher;
    }

    public JButton getStatistiques() {
        return Statistiques;
    }

    public void setStatistiques(JButton Statistiques) {
        this.Statistiques = Statistiques;
    }

    public JButton getSupprimer() {
        return Supprimer;
    }

    public void setSupprimer(JButton Supprimer) {
        this.Supprimer = Supprimer;
    }

    public JTextField getAjout1Field() {
        return ajout1Field;
    }

    public void setAjout1Field(JTextField ajout1Field) {
        this.ajout1Field = ajout1Field;
    }

    public JLabel getAjout1Label() {
        return ajout1Label;
    }

    public void setAjout1Label(JLabel ajout1Label) {
        this.ajout1Label = ajout1Label;
    }

    public JTextField getAjout2Field() {
        return ajout2Field;
    }

    public void setAjout2Field(JTextField ajout2Field) {
        this.ajout2Field = ajout2Field;
    }

    public JLabel getAjout2Label() {
        return ajout2Label;
    }

    public void setAjout2Label(JLabel ajout2Label) {
        this.ajout2Label = ajout2Label;
    }

    public JTextField getAjout3Field() {
        return ajout3Field;
    }

    public void setAjout3Field(JTextField ajout3Field) {
        this.ajout3Field = ajout3Field;
    }

    public JLabel getAjout3Label() {
        return ajout3Label;
    }

    public void setAjout3Label(JLabel ajout3Label) {
        this.ajout3Label = ajout3Label;
    }

    public JTextField getAjout4Field() {
        return ajout4Field;
    }

    public void setAjout4Field(JTextField ajout4Field) {
        this.ajout4Field = ajout4Field;
    }

    public JLabel getAjout4Label() {
        return ajout4Label;
    }

    public void setAjout4Label(JLabel ajout4Label) {
        this.ajout4Label = ajout4Label;
    }

    public JTextField getAjout5Field() {
        return ajout5Field;
    }

    public void setAjout5Field(JTextField ajout5Field) {
        this.ajout5Field = ajout5Field;
    }

    public JLabel getAjout5Label() {
        return ajout5Label;
    }

    public void setAjout5Label(JLabel ajout5Label) {
        this.ajout5Label = ajout5Label;
    }

    public JPanel getAjoutPanel() {
        return ajoutPanel;
    }

    public void setAjoutPanel(JPanel ajoutPanel) {
        this.ajoutPanel = ajoutPanel;
    }

    public JButton getAjouterButton() {
        return ajouterButton;
    }

    public void setAjouterButton(JButton ajouterButton) {
        this.ajouterButton = ajouterButton;
    }

    public JButton getAnnee() {
        return annee;
    }

    public void setAnnee(JButton annee) {
        this.annee = annee;
    }

    public JList<String> getBddListe() {
        return bddListe;
    }

    public void setBddListe(JList<String> bddListe) {
        this.bddListe = bddListe;
    }

    public JButton getBulletin() {
        return bulletin;
    }

    public void setBulletin(JButton bulletin) {
        this.bulletin = bulletin;
    }

    public JButton getBulletindetail() {
        return bulletindetail;
    }

    public void setBulletindetail(JButton bulletindetail) {
        this.bulletindetail = bulletindetail;
    }

    public JButton getClasse() {
        return classe;
    }

    public void setClasse(JButton classe) {
        this.classe = classe;
    }

    public JButton getDiscipline() {
        return discipline;
    }

    public void setDiscipline(JButton discipline) {
        this.discipline = discipline;
    }

    public JButton getEcole() {
        return ecole;
    }

    public void setEcole(JButton ecole) {
        this.ecole = ecole;
    }

    public JButton getEleve() {
        return eleve;
    }

    public void setEleve(JButton eleve) {
        this.eleve = eleve;
    }

    public JButton getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(JButton enseignant) {
        this.enseignant = enseignant;
    }

    public JButton getEnseignement() {
        return enseignement;
    }

    public void setEnseignement(JButton enseignement) {
        this.enseignement = enseignement;
    }

    public JLabel getErreurLabel() {
        return erreurLabel;
    }

    public void setErreurLabel(JLabel erreurLabel) {
        this.erreurLabel = erreurLabel;
    }

    public JButton getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(JButton evaluation) {
        this.evaluation = evaluation;
    }

    public JButton getInscription() {
        return inscription;
    }

    public void setInscription(JButton inscription) {
        this.inscription = inscription;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLayeredPane getjLayeredPane1() {
        return jLayeredPane1;
    }

    public void setjLayeredPane1(JLayeredPane jLayeredPane1) {
        this.jLayeredPane1 = jLayeredPane1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JLabel getModifier1Button() {
        return modifier1Button;
    }

    public void setModifier1Button(JLabel modifier1Button) {
        this.modifier1Button = modifier1Button;
    }

    public JLabel getModifier2Button() {
        return modifier2Button;
    }

    public void setModifier2Button(JLabel modifier2Button) {
        this.modifier2Button = modifier2Button;
    }

    public JLabel getModifier3Button() {
        return modifier3Button;
    }

    public void setModifier3Button(JLabel modifier3Button) {
        this.modifier3Button = modifier3Button;
    }

    public JLabel getModifier4Button() {
        return modifier4Button;
    }

    public void setModifier4Button(JLabel modifier4Button) {
        this.modifier4Button = modifier4Button;
    }

    public JLabel getModifier5Button() {
        return modifier5Button;
    }

    public void setModifier5Button(JLabel modifier5Button) {
        this.modifier5Button = modifier5Button;
    }

    public JPanel getModifierModifierPanel() {
        return modifierModifierPanel;
    }

    public void setModifierModifierPanel(JPanel modifierModifierPanel) {
        this.modifierModifierPanel = modifierModifierPanel;
    }

    public JButton getModifierValiderButton() {
        return modifierValiderButton;
    }

    public void setModifierValiderButton(JButton modifierValiderButton) {
        this.modifierValiderButton = modifierValiderButton;
    }

    public JButton getNiveau() {
        return niveau;
    }

    public void setNiveau(JButton niveau) {
        this.niveau = niveau;
    }

    public JButton getRechercheButton() {
        return rechercheButton;
    }

    public void setRechercheButton(JButton rechercheButton) {
        this.rechercheButton = rechercheButton;
    }

    public JTextField getRechercheField() {
        return rechercheField;
    }

    public void setRechercheField(JTextField rechercheField) {
        this.rechercheField = rechercheField;
    }

    public JLabel getRechercheLabel() {
        return rechercheLabel;
    }

    public void setRechercheLabel(JLabel rechercheLabel) {
        this.rechercheLabel = rechercheLabel;
    }

    public JPanel getRecherchePanel() {
        return recherchePanel;
    }

    public void setRecherchePanel(JPanel recherchePanel) {
        this.recherchePanel = recherchePanel;
    }

    public JLabel getResultatLabel() {
        return resultatLabel;
    }

    public void setResultatLabel(JLabel resultatLabel) {
        this.resultatLabel = resultatLabel;
    }

    public JPanel getStatsPanel() {
        return statsPanel;
    }

    public void setStatsPanel(JPanel statsPanel) {
        this.statsPanel = statsPanel;
    }

    public JButton getSupprimerButton() {
        return supprimerButton;
    }

    public void setSupprimerButton(JButton supprimerButton) {
        this.supprimerButton = supprimerButton;
    }

    public JTextField getSupprimerField() {
        return supprimerField;
    }

    public void setSupprimerField(JTextField supprimerField) {
        this.supprimerField = supprimerField;
    }

    public JLabel getSupprimerLabel() {
        return supprimerLabel;
    }

    public void setSupprimerLabel(JLabel supprimerLabel) {
        this.supprimerLabel = supprimerLabel;
    }

    public JList<String> getSupprimerList() {
        return supprimerList;
    }

    public void setSupprimerList(JList<String> supprimerList) {
        this.supprimerList = supprimerList;
    }

    public JPanel getSupprimerPanel() {
        return supprimerPanel;
    }

    public void setSupprimerPanel(JPanel supprimerPanel) {
        this.supprimerPanel = supprimerPanel;
    }

    public JLabel getSupprimerResultLabel() {
        return supprimerResultLabel;
    }

    public void setSupprimerResultLabel(JLabel supprimerResultLabel) {
        this.supprimerResultLabel = supprimerResultLabel;
    }

    public JButton getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(JButton trimestre) {
        this.trimestre = trimestre;
    }

    public JTextField getValeur1Field() {
        return valeur1Field;
    }

    public void setValeur1Field(JTextField valeur1Field) {
        this.valeur1Field = valeur1Field;
    }

    public JTextField getValeur2Field() {
        return valeur2Field;
    }

    public void setValeur2Field(JTextField valeur2Field) {
        this.valeur2Field = valeur2Field;
    }

    public JTextField getValeur3Field() {
        return valeur3Field;
    }

    public void setValeur3Field(JTextField valeur3Field) {
        this.valeur3Field = valeur3Field;
    }

    public JTextField getValeur4Field() {
        return valeur4Field;
    }

    public void setValeur4Field(JTextField valeur4Field) {
        this.valeur4Field = valeur4Field;
    }

    public JTextField getValeur5Field() {
        return valeur5Field;
    }

    public void setValeur5Field(JTextField valeur5Field) {
        this.valeur5Field = valeur5Field;
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
        bddListe = new javax.swing.JList<>();
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

        bddListe.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(bddListe);

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
                            .addGroup(recherchePanelLayout.createSequentialGroup()
                                .addComponent(rechercheLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rechercheField, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)
                            .addComponent(resultatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)))
                    .addGroup(recherchePanelLayout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(rechercheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        recherchePanelLayout.setVerticalGroup(
            recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recherchePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(recherchePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rechercheLabel)
                    .addComponent(rechercheField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        switch (mode2) {
            case "Eleve":
                rechercheLabel.setText("Clé de l'élève recherché : ");
                break;
            case "Enseignant":
                rechercheLabel.setText("Clé de l'enseignant recherché: ");
                break;
            case "Inscription":
                rechercheLabel.setText("Clé de l'inscription recherchée : ");
                break;
            case "Classe":
                rechercheLabel.setText("Clé de la classe recherchée : ");
                break;
            case "Niveau":
                rechercheLabel.setText("Clé du niveau recherché : ");
                break;
            case "Annee":
                rechercheLabel.setText("Clé de l'année recherchée : ");
                break;
            case "Trimestre":
                rechercheLabel.setText("Clé du trimestre recherché : ");
                break;
            case "Bulletin":
                rechercheLabel.setText("Clé du bulletin recherché : ");
                break;
            case "Enseignement":
                rechercheLabel.setText("Clé de l'enseignement recherché : ");
                break;
            case "Discipline":
                rechercheLabel.setText("Clé de la discipline recherchée : ");
                break;
            case "BulletinDetails":
                rechercheLabel.setText("Clé de du bulletin détaillé recherché : ");
                break;
            case "Evaluation":
                rechercheLabel.setText("Clé de l'évaluation recherchée : ");
                break;
            case "Ecole":
                 rechercheLabel.setText("Clé de l'écolé recherchée : ");
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
        /* Rechercher.setForeground(new java.awt.Color(255, 255, 255));
        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setForeground(new java.awt.Color(0, 0, 0));
        recherchePanel.setVisible(false);
        ajoutPanel.setVisible(false);
        supprimerPanel.setVisible(false);
        modifierModifierPanel.setVisible(false);
        modifierValiderButton.setVisible(false);
        rechercheButton.setText("Rechercher");
        mode1 = "Déconnexion";
        supprimerResultLabel.setText("");
         */
         jLayeredPane1.remove(statsPanel);
        statsPanel.setVisible(false);
        setVisible(false);
        dispose();
        // TODO add your handling code here:
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
            rechercheLabel.setText("Clé de l'enseignant recherché : ");
            resultatLabel.setText("");
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
        mode2="Ecole";
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
        ajout1Label.setText("Nom : ");
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
    private javax.swing.JList<String> bddListe;
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
