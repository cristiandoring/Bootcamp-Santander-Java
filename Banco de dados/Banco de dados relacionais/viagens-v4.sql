
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `viagens`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `destinos`
--

CREATE TABLE `destinos` (
  `id` int(11) DEFAULT NULL,
  `nome` varchar(200) NOT NULL COMMENT 'Nome do destino',
  `descricao` varchar(255) NOT NULL COMMENT 'Descrição do destino'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

--
-- Extraindo dados da tabela `destinos`
--

INSERT INTO `destinos` (`id`, `nome`, `descricao`) VALUES
(1, 'Gramado', 'Cidade Turística'),
(1, 'Praia das Tartarugas', 'Uma bela praia com areias brancas e mar cristalino'),
(2, 'Cachoeira do Vale Verde', 'Uma cachoeira exuberante cercada por natureza'),
(3, 'Cidade Histórica de Pedra Alta', 'Uma cidade rica em história e arquitetura');

-- --------------------------------------------------------

--
-- Estrutura da tabela `reservas`
--

CREATE TABLE `reservas` (
  `id` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL COMMENT 'Referência ao ID do usuário que faz a reserva',
  `id_destino` int(11) DEFAULT NULL COMMENT 'Referência ao ID do destino de reserva',
  `data` date DEFAULT NULL COMMENT 'Data da reserva',
  `status` varchar(255) DEFAULT 'pendente' COMMENT 'Status da reserva (confirmada, pendente, cancelada, etc)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

--
-- Extraindo dados da tabela `reservas`
--

INSERT INTO `reservas` (`id`, `id_usuario`, `id_destino`, `data`, `status`) VALUES
(1, 1, 1, '2024-11-11', 'Reservado'),
(2, 3, 3, '2024-08-10', 'Confirmada'),
(1, 1, 2, '2023-07-10', 'confirmada'),
(2, 2, 1, '2023-08-05', 'pendente'),
(3, 3, 3, '2023-09-20', 'cancelada');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) DEFAULT NULL,
  `nome` varchar(200) NOT NULL COMMENT 'Nome do usuário',
  `email` varchar(100) NOT NULL COMMENT 'Email do usuário',
  `endereco` varchar(50) NOT NULL COMMENT 'Endereço do usuário',
  `data_nascimento` date NOT NULL COMMENT 'Data de aniversário do usuário'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;

--
-- Extraindo dados da tabela `usuarios`
--
INSERT INTO usuarios_novos (id, nome, email, endereco, data_nascimento)

SELECT id, nome, email, endereco, data_nascimento FROM usuarios;

DROP TABLE usuarios;