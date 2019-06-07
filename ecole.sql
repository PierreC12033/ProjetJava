-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 31 mai 2019 à 01:50
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `Ecole`
--

-- --------------------------------------------------------

--
-- Structure de la table `anneescolaire`
--

DROP TABLE IF EXISTS `anneescolaire`;
CREATE TABLE IF NOT EXISTS `anneescolaire` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `AnneeDebut` int(4) NOT NULL,
  `AnneeFin` int(4) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=203 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `anneescolaire`
--

INSERT INTO `anneescolaire` (`Id`, `AnneeDebut`, `AnneeFin`) VALUES
(201, 2018, 2019),
(202, 2017, 2018);

-- --------------------------------------------------------

--
-- Structure de la table `bulletin`
--

DROP TABLE IF EXISTS `bulletin`;
CREATE TABLE IF NOT EXISTS `bulletin` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `IdTrimestre` int(8) NOT NULL,
  `IdInscription` int(8) NOT NULL,
  `Appreciation` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdTrimestre` (`IdTrimestre`),
  KEY `IdInscription` (`IdInscription`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `bulletin`
--

INSERT INTO `bulletin` (`Id`, `IdTrimestre`, `IdInscription`, `Appreciation`) VALUES
(1, 3, 1, 'Trimestre satisfaisant');

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

DROP TABLE IF EXISTS `classe`;
CREATE TABLE IF NOT EXISTS `classe` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(255) NOT NULL,
  `IdEcole` int(8) NOT NULL,
  `IdNiveau` int(8) NOT NULL,
  `IdAnneeScolaire` int(8) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdEcole` (`IdEcole`),
  KEY `IdNiveau` (`IdNiveau`),
  KEY `IdAnneeScolaire` (`IdAnneeScolaire`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `classe`
--

INSERT INTO `classe` (`Id`, `Nom`, `IdEcole`, `IdNiveau`, `IdAnneeScolaire`) VALUES
(1, 'TD 06', 1, 3, 201),
(2, 'TD 9', 1, 3, 201);

-- --------------------------------------------------------

--
-- Structure de la table `detailbulletin`
--

DROP TABLE IF EXISTS `detailbulletin`;
CREATE TABLE IF NOT EXISTS `detailbulletin` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `IdBulletin` int(8) NOT NULL,
  `IdEnseignement` int(8) NOT NULL,
  `Appreciation` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdBulletin` (`IdBulletin`),
  KEY `IdEnseignement` (`IdEnseignement`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `detailbulletin`
--

INSERT INTO `detailbulletin` (`Id`, `IdBulletin`, `IdEnseignement`, `Appreciation`) VALUES
(1, 1, 2, 'A de forte capacité en analyse mathématiques. '),
(2, 1, 1, 'Possède certaine lacune en expression orale. ');

-- --------------------------------------------------------

--
-- Structure de la table `discipline`
--

DROP TABLE IF EXISTS `discipline`;
CREATE TABLE IF NOT EXISTS `discipline` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `discipline`
--

INSERT INTO `discipline` (`Id`, `Nom`) VALUES
(1, 'Coréen'),
(2, 'Statistiques');

-- --------------------------------------------------------

--
-- Structure de la table `ecole`
--

DROP TABLE IF EXISTS `ecole`;
CREATE TABLE IF NOT EXISTS `ecole` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ecole`
--

INSERT INTO `ecole` (`Id`, `Nom`) VALUES
(1, 'ECE-PARIS'),
(2, 'ESILV');

-- --------------------------------------------------------

--
-- Structure de la table `enseignement`
--

DROP TABLE IF EXISTS `enseignement`;
CREATE TABLE IF NOT EXISTS `enseignement` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `IdClasse` int(8) NOT NULL,
  `IdDiscipline` int(8) NOT NULL,
  `IdPersonne` int(8) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdClasse` (`IdClasse`),
  KEY `IdDiscipline` (`IdDiscipline`),
  KEY `IdPersonne` (`IdPersonne`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `enseignement`
--

INSERT INTO `enseignement` (`Id`, `IdClasse`, `IdDiscipline`, `IdPersonne`) VALUES
(1, 1, 1, 10),
(2, 1, 2, 7);

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

DROP TABLE IF EXISTS `evaluation`;
CREATE TABLE IF NOT EXISTS `evaluation` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `IdDetailBulletin` int(8) NOT NULL,
  `Note` int(8) NOT NULL,
  `Appreciation` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdDetailBulletin` (`IdDetailBulletin`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `evaluation`
--

INSERT INTO `evaluation` (`Id`, `IdDetailBulletin`, `Note`, `Appreciation`) VALUES
(1, 1, 18, 'Note de suivie'),
(2, 1, 14, 'DS 1'),
(3, 2, 12, 'Interrogation écrite'),
(4, 2, 8, 'Oral de fin de semestre');

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

DROP TABLE IF EXISTS `inscription`;
CREATE TABLE IF NOT EXISTS `inscription` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `IdClasse` int(8) NOT NULL,
  `IdPersonne` int(8) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdClasse` (`IdClasse`),
  KEY `IdPersonne` (`IdPersonne`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `inscription`
--

INSERT INTO `inscription` (`Id`, `IdClasse`, `IdPersonne`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 1, 3),
(4, 2, 9);

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

DROP TABLE IF EXISTS `niveau`;
CREATE TABLE IF NOT EXISTS `niveau` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `niveau`
--

INSERT INTO `niveau` (`Id`, `Nom`) VALUES
(1, 'Ing 1'),
(2, 'Ing 2'),
(3, 'Ing 3'),
(4, 'Ing 4'),
(5, 'Ing 5');

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(255) NOT NULL,
  `Prenom` varchar(255) NOT NULL,
  `Type_P` tinyint(1) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`Id`, `Nom`, `Prenom`, `Type_P`) VALUES
(1, 'CAMUGLI', 'Pierre', 0),
(2, 'JOUVET', 'Tom', 0),
(3, 'ARAS', 'Elias', 0),
(4, 'ARASH', 'MOKHBER', 1),
(5, 'SEGADO', ' JEAN-PIERRE', 1),
(6, 'MOUHALI', 'WALEED', 1),
(7, 'LE COR', 'LUC', 1),
(8, 'CRAMBES', 'Christine', 1),
(9, 'VEAU', 'Adrien', 0),
(10, 'KITO', 'Yuka', 1);

-- --------------------------------------------------------

--
-- Structure de la table `trimestre`
--

DROP TABLE IF EXISTS `trimestre`;
CREATE TABLE IF NOT EXISTS `trimestre` (
  `Id` int(8) NOT NULL AUTO_INCREMENT,
  `Numero` int(8) NOT NULL,
  `Debut` date NOT NULL,
  `Fin` date NOT NULL,
  `IdAnneeScolaire` int(8) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `IdAnneeScolaire` (`IdAnneeScolaire`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `trimestre`
--

INSERT INTO `trimestre` (`Id`, `Numero`, `Debut`, `Fin`, `IdAnneeScolaire`) VALUES
(1, 1, '2018-09-01', '2018-11-30', 201),
(2, 2, '2018-12-01', '2019-02-28', 201),
(3, 3, '2019-03-01', '2019-06-30', 201),
(4, 1, '2017-09-01', '2017-11-30', 202),
(5, 2, '2017-12-01', '2017-02-28', 202),
(6, 3, '2018-03-01', '2017-06-30', 202);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
