-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 26-Maio-2019 às 14:23
-- Versão do servidor: 5.7.23
-- versão do PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `controledeprovas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

DROP TABLE IF EXISTS `disciplina`;
CREATE TABLE IF NOT EXISTS `disciplina` (
  `id_Disciplina` int(11) NOT NULL AUTO_INCREMENT,
  `nome_Disciplina` varchar(45) NOT NULL,
  `status_Disciplina` int(11) NOT NULL,
  PRIMARY KEY (`id_Disciplina`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`id_Disciplina`, `nome_Disciplina`, `status_Disciplina`) VALUES
(1, 'Matematica', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

DROP TABLE IF EXISTS `professor`;
CREATE TABLE IF NOT EXISTS `professor` (
  `id_Professor` int(11) NOT NULL AUTO_INCREMENT,
  `nome_Professor` varchar(45) NOT NULL,
  `status_Professor` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_Professor`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`id_Professor`, `nome_Professor`, `status_Professor`) VALUES
(1, 'Eduardo', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `prova`
--

DROP TABLE IF EXISTS `prova`;
CREATE TABLE IF NOT EXISTS `prova` (
  `id_Prova` int(11) NOT NULL AUTO_INCREMENT,
  `id_Turma` int(11) DEFAULT NULL,
  `data_Prova` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_Prova`),
  KEY `id_Turma_idx` (`id_Turma`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `prova`
--

INSERT INTO `prova` (`id_Prova`, `id_Turma`, `data_Prova`) VALUES
(1, 1, '05/12/2018'),
(2, 2, '05/12/2018'),
(3, 2, '06/12/2018');

-- --------------------------------------------------------

--
-- Estrutura da tabela `questoes`
--

DROP TABLE IF EXISTS `questoes`;
CREATE TABLE IF NOT EXISTS `questoes` (
  `id_Questao` int(11) NOT NULL AUTO_INCREMENT,
  `id_Disciplina` int(11) DEFAULT NULL,
  `descricao_Questao` varchar(100) NOT NULL,
  `dificuldade_Questao` int(11) NOT NULL,
  `resposta_Questao` char(1) NOT NULL,
  `status_Questao` int(11) DEFAULT NULL,
  `alternativaA` varchar(45) NOT NULL,
  `alternativaB` varchar(45) NOT NULL,
  `alternativaC` varchar(45) NOT NULL,
  `alternativaD` varchar(45) NOT NULL,
  `alternativa_e` varchar(100) NOT NULL,
  PRIMARY KEY (`id_Questao`),
  KEY `id_Disciplina_idx` (`id_Disciplina`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `questoes`
--

INSERT INTO `questoes` (`id_Questao`, `id_Disciplina`, `descricao_Questao`, `dificuldade_Questao`, `resposta_Questao`, `status_Questao`, `alternativaA`, `alternativaB`, `alternativaC`, `alternativaD`, `alternativa_e`) VALUES
(1, 1, 'Quanto é 2 + 8 x 4 - 2?', 1, 'B', 0, '24', '32', '38', '38', ''),
(2, 1, 'Quanto é o fatorial de 5?', 1, 'A', 0, '120', '100', '50', '50', ''),
(3, 1, 'Fulano comprou duas ameixas por R$ 2,00. Vendeu uma ameixa por R$ 2,00. Qual foi seu lucro?', 3, 'B', 0, '3', '0', '1', '2', ''),
(4, 1, 'Fulano tinha 4 amoras. Comeu uma e vendeu duas. Quantas amoras fulano vendeu ?', 1, 'B', 1, '1', '2', '3', '3', ''),
(5, 1, 'jhdsmn	', 1, 'E', 0, '1', '2', '3', '4', '5'),
(6, 1, 'Quntas respostas sao possiveis?		', 1, 'E', 0, '1', '2', '3', '4', '5');

-- --------------------------------------------------------

--
-- Estrutura da tabela `questoes_provas`
--

DROP TABLE IF EXISTS `questoes_provas`;
CREATE TABLE IF NOT EXISTS `questoes_provas` (
  `id_Questoes_Provas` int(11) NOT NULL AUTO_INCREMENT,
  `id_Prova` int(11) DEFAULT NULL,
  `id_Questao` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_Questoes_Provas`),
  KEY `id_Prova_idx` (`id_Prova`),
  KEY `id_Questao_idx` (`id_Questao`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `questoes_provas`
--

INSERT INTO `questoes_provas` (`id_Questoes_Provas`, `id_Prova`, `id_Questao`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 2, 2),
(4, 2, 1),
(5, 3, 3),
(6, 3, 4),
(7, 3, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `turmas`
--

DROP TABLE IF EXISTS `turmas`;
CREATE TABLE IF NOT EXISTS `turmas` (
  `id_Turmas` int(11) NOT NULL AUTO_INCREMENT,
  `id_Disciplina` int(11) NOT NULL,
  `id_Professor` int(11) NOT NULL,
  `semestre_Turma` varchar(45) NOT NULL,
  `status_Turma` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_Turmas`),
  KEY `id_Disciplina_idx` (`id_Disciplina`),
  KEY `id_Professor_idx` (`id_Professor`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `turmas`
--

INSERT INTO `turmas` (`id_Turmas`, `id_Disciplina`, `id_Professor`, `semestre_Turma`, `status_Turma`) VALUES
(1, 1, 1, 'Matutino', 0),
(2, 1, 1, 'Vespertino', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
