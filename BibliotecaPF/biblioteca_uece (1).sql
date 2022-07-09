-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 09/07/2022 às 14:19
-- Versão do servidor: 10.4.18-MariaDB
-- Versão do PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `biblioteca_uece`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `emprestimo`
--

CREATE TABLE `emprestimo` (
  `id_emprestimo` int(15) NOT NULL,
  `id` int(15) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `id_livro` int(15) NOT NULL,
  `nome_livro` varchar(150) NOT NULL,
  `data_emp` varchar(15) NOT NULL,
  `data_dev` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `emprestimo`
--

INSERT INTO `emprestimo` (`id_emprestimo`, `id`, `nome`, `id_livro`, `nome_livro`, `data_emp`, `data_dev`) VALUES
(9, 15, 'marcelo amaro', 3, 'O Rei de Roma', '20/11/2022', 'Uma semanal'),
(11, 16, 'italo siqueira', 3, 'O Rei de Roma', '23/12/2022', 'Dois dias');

-- --------------------------------------------------------

--
-- Estrutura para tabela `livro`
--

CREATE TABLE `livro` (
  `id_livro` int(15) NOT NULL,
  `nome_livro` varchar(150) NOT NULL,
  `autor` varchar(150) NOT NULL,
  `ano` varchar(15) NOT NULL,
  `genero` varchar(150) NOT NULL,
  `edicao` varchar(150) NOT NULL,
  `estoque` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `livro`
--

INSERT INTO `livro` (`id_livro`, `nome_livro`, `autor`, `ano`, `genero`, `edicao`, `estoque`) VALUES
(3, 'O Rei de Roma', 'marcelo amaro', '1992', 'Científico', 'primeira', 'sim'),
(4, 'Naruto', 'SKIHUNGF', '2014', 'Ficção', 'quinta', 'sim');

-- --------------------------------------------------------

--
-- Estrutura para tabela `pessoas`
--

CREATE TABLE `pessoas` (
  `id` int(150) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `curso` varchar(150) NOT NULL,
  `serie` varchar(15) NOT NULL,
  `matricula` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Despejando dados para a tabela `pessoas`
--

INSERT INTO `pessoas` (`id`, `nome`, `curso`, `serie`, `matricula`) VALUES
(15, 'marcelo amaro', 'computação', '3°Ano', '1210'),
(16, 'italo siqueira', 'agro', '2°Ano', '1212'),
(17, 'jonas lima', 'arte', '1°Ano', '1213'),
(18, 'erlano ee', 'computação', 'Professor', '1215');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `emprestimo`
--
ALTER TABLE `emprestimo`
  ADD PRIMARY KEY (`id_emprestimo`);

--
-- Índices de tabela `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`id_livro`);

--
-- Índices de tabela `pessoas`
--
ALTER TABLE `pessoas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `emprestimo`
--
ALTER TABLE `emprestimo`
  MODIFY `id_emprestimo` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `livro`
--
ALTER TABLE `livro`
  MODIFY `id_livro` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `pessoas`
--
ALTER TABLE `pessoas`
  MODIFY `id` int(150) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
