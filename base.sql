CREATE TABLE Ecole (
    Id int(8) NOT NULL PRIMARY KEY,
    Nom varchar(255) NOT NULL,

);

CREATE TABLE AnneeScolaire(
    Id int(8) NOT NULL PRIMARY KEY,
    AnneeDebut int(4) NOT NULL,
    AnneeFin int(4) NOT NULL,
);

CREATE TABLE Trimestre(
    Id int(8) NOT NULL PRIMARY KEY,
    Numero int(8) NOT NULL,
    Debut DATE NOT NULL,
    Fin DATE NOT NULL,
    IdAnneeScolaire int (8) NOT NULL,

    FOREIGN KEY (IdAnneeScolaire) REFERENCES AnneeScolaire(Id)
);

CREATE TABLE Niveau(
    Id int(8) NOT NULL PRIMARY KEY,
    Nom varchar(255) NOT NULL,
);

CREATE TABLE Classe(
    Id int(8) NOT NULL PRIMARY KEY,
    Nom varchar(255) NOT NULL,
    IdEcole int(8) NOT NULL,
    IdNiveau int(8) NOT NULL,
    IdAnneeScolaire int(8) NOT NULL,

    FOREIGN KEY (IdEcole) REFERENCES Ecole(Id),
    FOREIGN KEY (IdNiveau) REFERENCES Niveau(Id),
    FOREIGN KEY (IdAnneeScolaire) REFERENCES AnneeScolaire(Id)
);

CREATE TABLE Discipline(
    Id int(8) NOT NULL PRIMARY KEY,
    Nom varchar(255) NOT NULL,
);

CREATE TABLE Personne(
    Id int(8) NOT NULL PRIMARY KEY,
    Nom varchar(255) NOT NULL,
    Prenom varchar(255) NOT NULL,
    Type_P boolean NOT NULL,
);
/*
CREATE TABLE Eleve(
    Id int(8) NOT NULL PRIMARY KEY,
    Nom varchar(255) NOT NULL,
    Prenom varchar(255) NOT NULL,

    FOREIGN KEY (IdEcole) REFERENCES Ecole(Id),
    FOREIGN KEY (IdNiveau) REFERENCES Niveau(Id),
    FOREIGN KEY (IdAnneeScolaire) REFERENCES AnneeScolaire(Id)
);

CREATE TABLE Professeur(
    Id int(8) NOT NULL PRIMARY KEY,
    Nom varchar(255) NOT NULL,
    Prenom varchar(255) NOT NULL,
    
    FOREIGN KEY (IdEcole) REFERENCES Ecole(Id),
    FOREIGN KEY (IdNiveau) REFERENCES Niveau(Id),
    FOREIGN KEY (IdAnneeScolaire) REFERENCES AnneeScolaire(Id)
);
*/
CREATE TABLE Enseignement(
    Id int(8) NOT NULL PRIMARY KEY,
    IdClasse int(8) NOT NULL,
    IdDiscipline int(8) NOT NULL,
    IdPersonne int(8) NOT NULL,
    

    FOREIGN KEY (IdClasse) REFERENCES Classe(Id),
    FOREIGN KEY (IdDiscipline) REFERENCES Discipline(Id),
    FOREIGN KEY (IdPersonne) REFERENCES Personne(Id)
);

CREATE TABLE Insciption(
    Id int(8) NOT NULL PRIMARY KEY,
    IdClasse int(8) NOT NULL,
    IdPersonne int(8) NOT NULL,
    
    FOREIGN KEY (IdClasse) REFERENCES Classe(Id),
    FOREIGN KEY (IdPersonne) REFERENCES Personne(Id)
);

CREATE TABLE Bulletin(
    Id int(8) NOT NULL PRIMARY KEY,
    IdTrimestre int(8) NOT NULL,
    IdInscription int(8) NOT NULL,
    Appreciation varchar(255) NOT NULL,
    
    FOREIGN KEY (IdTrimestre) REFERENCES Trimestre(Id),
    FOREIGN KEY (IdInscription) REFERENCES Insciption(Id)
);

CREATE TABLE DetailBulletin(
    Id int(8) NOT NULL PRIMARY KEY,
    IdBulletin int(8) NOT NULL,
    IdEnseignement int(8) NOT NULL,
    Appreciation varchar(255) NOT NULL,
    
    FOREIGN KEY (IdBulletin) REFERENCES Bulletin(Id),
    FOREIGN KEY (IdEnseignement) REFERENCES Enseignement(Id)
);

CREATE TABLE Evaluation(
    Id int(8) NOT NULL PRIMARY KEY,
    IdDetailBulletin int(8) NOT NULL,
    Note int(8) NOT NULL,
    Appreciation varchar(255) NOT NULL,
    
    FOREIGN KEY (IdDetailBulletin) REFERENCES DetailBulletin(Id),
);