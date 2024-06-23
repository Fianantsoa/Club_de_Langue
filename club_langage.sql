-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 29 mai 2023 à 08:47
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `club_langage`
--

-- --------------------------------------------------------

--
-- Structure de la table `activity`
--

CREATE TABLE `activity` (
  `ID` int(10) UNSIGNED NOT NULL,
  `nom` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `horaire` time NOT NULL,
  `lieu` varchar(100) NOT NULL,
  `status` varchar(50) NOT NULL,
  `club` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `activity`
--

INSERT INTO `activity` (`ID`, `nom`, `description`, `date`, `horaire`, `lieu`, `status`, `club`) VALUES
(5, 'Mizara', 'Partage', '2000-12-31', '21:21:34', 'Isotry', 'passé', 'Malagache'),
(26, 'Ny tontolo', 'Partage', '2023-07-10', '10:00:41', 'Parc Analamanga', '42j 0h:-13', 'Français'),
(27, 'Kanto', 'Poésie', '2023-06-10', '16:30:41', 'Théatrale Ambositra', '12j -6h:-43', 'Anglais'),
(28, 'Vaky boky', 'Lire des livres en groupe', '2023-05-31', '14:30:05', 'Bibliothéque ISM', '2j -4h:-43', 'Français');

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE `administrateur` (
  `id` int(100) UNSIGNED NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `administrateur`
--

INSERT INTO `administrateur` (`id`, `name`, `password`) VALUES
(1, 'Fernando_admin', 'withoutpassword');

-- --------------------------------------------------------

--
-- Structure de la table `leaderclub`
--

CREATE TABLE `leaderclub` (
  `nom` varchar(100) NOT NULL,
  `prenoms` varchar(100) NOT NULL,
  `date_de_naissance` date NOT NULL,
  `adresse` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telephone` varchar(100) NOT NULL,
  `club` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `leaderclub`
--

INSERT INTO `leaderclub` (`nom`, `prenoms`, `date_de_naissance`, `adresse`, `email`, `telephone`, `club`) VALUES
('NOMENTSOA', 'Fianantsoa Fernando', '2000-12-31', 'Tanjombato', 'fernando@gmail.com', '0346285372', 'Malagache'),
('David', 'Alex', '2000-08-31', 'rue de Lion', 'davidalex@gmail.com', '3963820376', 'Français'),
('WILL', 'Cleamb', '1993-03-27', 'Analakely', 'willcleamb@gmail.com', '0326393522', 'Anglais');

-- --------------------------------------------------------

--
-- Structure de la table `member`
--

CREATE TABLE `member` (
  `matricule` int(10) UNSIGNED NOT NULL,
  `nom` varchar(100) NOT NULL,
  `prénoms` varchar(100) NOT NULL,
  `date_de_naissance` date NOT NULL,
  `adresse` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `club` varchar(30) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `member`
--

INSERT INTO `member` (`matricule`, `nom`, `prénoms`, `date_de_naissance`, `adresse`, `email`, `telephone`, `club`, `status`) VALUES
(7, 'RAFANOMEZANTSOA', 'Nançia', '2004-11-04', 'IVR 25 street Beller', 'nancia@gmail.com', '233628653', 'Malagache', 'membre'),
(9, 'RAFANOMENZANTSOA', 'Michel', '2007-06-26', 'rue alexander', 'michel@gmail.com', '0346278352', 'Anglais', 'membre'),
(17, 'NOMENTSOA', 'F Fernando', '2003-07-17', 'Lot 67 Ha', 'fernando@gmail.com', '0342573652', 'Français', 'membre'),
(20, 'GERARD', 'Piqué', '1999-10-11', 'Lot Analakely', 'piqué@gmail.com', '0332573845', 'Anglais', 'supprimer'),
(21, 'SALAH', 'Mohamed', '1980-04-24', 'Diego', 'salah@gmail.com', '0325730979', 'Anglais', 'membre'),
(23, 'Nomentsoa', 'Fernando', '2003-02-23', 'Analakely', 'nando@gmail.com', '0346283527', 'Malagache', 'membre'),
(25, 'RAZAKA', 'Anthony', '2001-03-21', 'Isotry', 'anthonyrazaka@gmail.com', '0325683528', 'Français', 'membre'),
(26, 'BENJAMIN', 'Arnauld', '2001-12-21', 'Ampasika', 'arnauld2@gmail.com', '0342735276', 'Français', 'membre'),
(27, 'RAKOTO', 'Vladmir', '1999-11-01', 'Ivato', 'vladmirrakoto@gmail.com', '0325749321', 'Anglais', 'membre'),
(28, '', '', '2000-02-20', '', '', '', 'Anglais', 'supprimer');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `activity`
--
ALTER TABLE `activity`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `administrateur`
--
ALTER TABLE `administrateur`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`matricule`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `activity`
--
ALTER TABLE `activity`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT pour la table `administrateur`
--
ALTER TABLE `administrateur`
  MODIFY `id` int(100) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `member`
--
ALTER TABLE `member`
  MODIFY `matricule` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
