-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 26/10/2023 às 16:54
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `proyectosm`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `afinidad`
--

CREATE TABLE `afinidad` (
  `idAfinidad` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL DEFAULT 0,
  `personaje` int(11) NOT NULL,
  `jugador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `afinidad`
--

INSERT INTO `afinidad` (`idAfinidad`, `cantidad`, `personaje`, `jugador`) VALUES
(1, 1, 3, 1),
(2, 3, 4, 1),
(3, 4, 5, 1),
(4, 2, 6, 1),
(5, 3, 3, 2),
(6, 3, 4, 2),
(7, 4, 5, 2),
(8, 4, 6, 2),
(9, 0, 11, 1),
(10, 0, 12, 1),
(11, 0, 13, 1),
(12, 0, 14, 1),
(13, 0, 11, 2),
(14, 0, 12, 2),
(15, 0, 13, 2),
(16, 0, 14, 2);

-- --------------------------------------------------------

--
-- Estrutura para tabela `condicion`
--

CREATE TABLE `condicion` (
  `idCondicion` int(11) NOT NULL,
  `nomCondicion` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `condicion`
--

INSERT INTO `condicion` (`idCondicion`, `nomCondicion`) VALUES
(1, 'Aliado'),
(2, 'Enemigo'),
(3, 'Curado'),
(4, 'Derrotado');

-- --------------------------------------------------------

--
-- Estrutura para tabela `genero`
--

CREATE TABLE `genero` (
  `idGenero` int(11) NOT NULL,
  `nomGenero` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `genero`
--

INSERT INTO `genero` (`idGenero`, `nomGenero`) VALUES
(1, 'Chico'),
(2, 'Chica');

-- --------------------------------------------------------

--
-- Estrutura para tabela `jugador`
--

CREATE TABLE `jugador` (
  `idJugador` int(11) NOT NULL,
  `nomJugador` varchar(20) DEFAULT NULL,
  `karma` int(11) NOT NULL DEFAULT 0,
  `genero` int(11) NOT NULL,
  `progreso` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `jugador`
--

INSERT INTO `jugador` (`idJugador`, `nomJugador`, `karma`, `genero`, `progreso`) VALUES
(1, 'Tester', 1, 2, 2),
(2, 'Shingo', 1, 1, 5);

-- --------------------------------------------------------

--
-- Estrutura para tabela `personaje`
--

CREATE TABLE `personaje` (
  `idPersonaje` int(11) NOT NULL,
  `nomPers` varchar(20) NOT NULL,
  `planeta` varchar(20) NOT NULL,
  `bio` text NOT NULL,
  `salud` int(11) DEFAULT NULL,
  `condicion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `personaje`
--

INSERT INTO `personaje` (`idPersonaje`, `nomPers`, `planeta`, `bio`, `salud`, `condicion`) VALUES
(1, 'Naru', 'Earth', 'Este es un personaje ficticio creado para este juego. Despierta como Sailor Earth, el guerrero del planeta Tierra (🜨). Tiene el poder de controlar flores y plantas, y también puede provocar ráfagas de viento y temblores. Tiene una fuerte relación con Nyx, algo que viene de un pasado lejano.', NULL, NULL),
(2, 'Usagi', 'Moon', 'Usagi Tsukino es una persona amable y gentil, aunque un poco torpe, pero que tiene un fuerte sentido de la justicia y hace todo lo posible para proteger sus ideales y a las personas que ama.\r\n\r\nEs la guerrera de la Luna (☽), Sailor Moon, y reencarnación de la princesa Serenity. Sus poderes pueden expulsar el mal y curar a las personas.', NULL, 1),
(3, 'Ami', 'Mercury', 'Ami Mizuno es una chica tímida, introvertida y tranquila a la que le cuesta hacer amigos y es muy inteligente; no obstante, ella prefiere estar sola con sus libros.\r\n\r\nEs la guerrera de Mercurio (☿), Sailor Mercury. Sus poderes están relacionados con el elemento agua y tiene la capacidad de analizar enemigos.', NULL, 1),
(4, 'Rei', 'Mars', 'Rei Hino es tenaz, un poco mandona pero bien intencionada, quien aspira a ser una \"idol\", asi como tener novio.\r\n\r\nEs la guerrera de Marte (♂), Sailor Mars y sus poderes están relacionados con el elemento fuego.\r\n\r\nRei tiene varios poderes fuera de su condición de Sailor, que ella utiliza en sus deberes como sacerdotisa, cómo leer las llamas y usar el Ofuda como un arma.', NULL, 1),
(5, 'Mako', 'Jupiter', 'Makoto Kino consta de ser agresiva, impulsiva y varonil, pero bastante amigable. Ella se caracteriza por ser la extraña enamoradiza, que siempre anda recordando a un chico que le gustaba.\r\n\r\nEs la guerrera de Júpiter (♃), Sailor Jupiter. Sus poderes están relacionados con la electricidad y tiene la capacidad de paralizar a los enemigos.', NULL, 1),
(6, 'Mina', 'Venus', 'Minako Aino es muy dedicada a sus amigas y a sus deberes, aunque sea una alumna de bajo rendimiento académico. Ella es muy atlética, especialmente cuando se trata de voleibol.\r\n\r\nComo Sailor Venus (♀), Minako muestra una faceta bastante seria al contrario de la imagen irresponsable y vaga que muestra en su faceta civil.\r\n\r\nSus poderes están relacionados con el control de la luz y tiene una corriente que sirve para restringir el mal.', NULL, 1),
(7, 'Haruka', 'Uranus', 'Haruka Tenou es una corredora rápida, así como piloto de vehículos de carreras. A simple vista, es un chico. Compite en un fórmula 1, en motociclismo y todos la toman por un chico.\r\n\r\nSu planeta protector es Urano (♅). Como Sailor Uranus, sus poderes están asociados con la tierra y el viento. Tiene una espada como talismán, tan afilada que puede cortar incluso lo incorpóreo.', NULL, 1),
(8, 'Michiru', 'Neptune', 'Michiru Kaiou es madura, serena y tranquila, y es difícil decir exactamente lo que esta pensando. Es también una violinista con talento.\r\n\r\nSu planeta protector es Neptuno (♆). Como Sailor Neptune, tiene el poder de conjurar agua y hielo. También tiene un espejo como talismán, que le permite reflejar la verdadera naturaleza de los seres.', NULL, 1),
(9, 'Hotaru', 'Saturn', 'Hotaru Tomoe es una niña lógica, inteligente y de buena educación. Su popularidad entre sus compañeros de clase es mala ya que todos le tienen verdadero terror debido a que sufre de un trastorno de personalidad que la hace volverse de una joven calmada y amable a una joven sumamente agresiva y violenta, así como también posee poderes sobrenaturales.\r\n\r\nSu planeta protector es Saturno (♄) y se la considera la Sailor de la Destrucción. Tiene el poder de distorsionar la oscuridad y provocar silencio. Lleva una hoz como talismán que le permite juzgar y destruir todo lo que la rodea.', NULL, 1),
(10, 'Setsuna', 'Pluto', 'Setsuna Meiou es una mujer elegante, analítica, educada, seria y discreta. Siempre está investigando lo necesario para derrotar al mal, actúa con propiedad y su mayor sueño es convertirse en una gran diseñadora de modas. \r\n\r\nSu planeta protector es Plutón (♇) y es la guardiana de la Puerta del Tiempo. Como Sailor Pluto, tiene el poder de manipular el tiempo y lleva consigo el Garnet Orb, un talismán que amplifica la energía y el poder de sus aliados.', NULL, 1),
(11, 'Sailor Ceres', 'Ceres', 'Sailor del planeta enano Ceres, tiene la capacidad de controlar la gravedad y controlar la formación de tierra y rocas. Nyx la atrajo con la promesa de algo divertido que hacer. Ceres no se toma las cosas en serio y simplemente acepta luchar contra las Sailor Scouts como una forma de divertirse y acabar con el aburrimiento.', 2, 2),
(12, 'Sailor Eris', 'Eris', 'Sailor del planeta enano Eris. Fue engañada y maldecida por Nyx, quien la corrompió con oscuridad, haciéndola vengativa. Ahora Sailor Eris busca vengarse de las otras Sailor Scouts por nunca haber sido reconocidas como guerrera.\r\n\r\nTiene el poder de congelación. Puede crear estalactitas de hielo y evocar ventiscas, además de construir paredes de hielo tan resistentes como diamantes.', 2, 2),
(13, 'Sailor Haumea', 'Haumea', 'Es la Sailor del planeta enano Humea y la mano derecha de Nyx. Ella la reclutó para ser parte de su grupo de guardianes. Engañada por Nyx, Haumea cree que las demás Sailors la ven débil y, por tanto, quiere demostrar su valía.\r\n\r\nSu poder es fantasmal. Puede controlar la dimensión, moviéndose por el aire sin ser vista. De esta forma ataca sin que nadie se dé cuenta de su presencia.', 3, 2),
(14, 'Nyx', 'Dark Moon', 'Nyx es la primeira reina de la Luna, también conocida como Dark Moon Queen, cuando este todavía era un planeta.\r\n\r\nHace muchos años, Nyx intentó apoderarse del planeta Tierra, pero huyó al no poder derrotar a la princesa de la Tierra. Luego su planeta fue tomado y transformado en lo que se convirtió en la luna de la Tierra.\r\n\r\nEncerrada en la oscuridad, Nyx esperó el fenómeno del eclipse anular para poder regresar y tomar su trono.', 4, 2);

-- --------------------------------------------------------

--
-- Estrutura para tabela `seccion`
--

CREATE TABLE `seccion` (
  `idSeccion` int(11) NOT NULL,
  `tituloEscena` varchar(100) NOT NULL,
  `textoEscena` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `seccion`
--

INSERT INTO `seccion` (`idSeccion`, `tituloEscena`, `textoEscena`) VALUES
(1, 'Llegada al Parque Yoyogi', 'Hoy es un día muy emocionante para todos: el rarísimo eclipse anular está a punto de ocurrir.\r\n\r\nAl igual que vos, muchos se están reuniendo en el Parque Yoyogi para presenciar el fenómeno.\r\n\r\nEn el camino, alguien acaba chocándote.'),
(2, 'Mina se presenta\r\n', 'Mina: Mucho gusto. Yo soy Minako, pero puedes llamarme Mina. Esta es Makoto.'),
(3, 'Llegada de Nyx', 'El día comienza a convertirse en noche mientras observas la luna ponerse frente al sol.\r\n\r\nPoco a poco, el sol se va convirtiendo en un anillo de fuego.\r\n\r\nSe escucha a la gente sorprendida, pero pronto las exclamaciones se convierten en bostezo.\r\n\r\nNotas que la gente a tu alrededor se desmaya.'),
(4, 'Surge Tuxedo Mask', 'Tuxedo Mask: La gente duerme para tener buenos sueños, ¡pero tú los convertiste en pesadillas! ¡Sailor Moon, ahora!'),
(5, 'Batalla Tutorial', 'Luna: Elige una Sailor Guerrera para enfrentar a Nyx contigo. Cada una tiene sus propios ataques. Elige la mejor opción para enfrentarte a cada enemigo.'),
(6, 'Fin acto 0', 'En ese momento, Sailor Moon se desmaya frente a todos, causando preocupación. Tuxedo Mask la toma en sus brazos y se da cuenta de que todavía está viva, pero su cuerpo está frío como la noche.');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `afinidad`
--
ALTER TABLE `afinidad`
  ADD PRIMARY KEY (`idAfinidad`),
  ADD KEY `personaje_afinidad` (`personaje`),
  ADD KEY `jugador_afinidad` (`jugador`);

--
-- Índices de tabela `condicion`
--
ALTER TABLE `condicion`
  ADD PRIMARY KEY (`idCondicion`);

--
-- Índices de tabela `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`idGenero`);

--
-- Índices de tabela `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`idJugador`),
  ADD KEY `jugador_genero` (`genero`),
  ADD KEY `progreso_seccion` (`progreso`);

--
-- Índices de tabela `personaje`
--
ALTER TABLE `personaje`
  ADD PRIMARY KEY (`idPersonaje`),
  ADD KEY `condicion` (`condicion`);

--
-- Índices de tabela `seccion`
--
ALTER TABLE `seccion`
  ADD PRIMARY KEY (`idSeccion`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `afinidad`
--
ALTER TABLE `afinidad`
  MODIFY `idAfinidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de tabela `condicion`
--
ALTER TABLE `condicion`
  MODIFY `idCondicion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `genero`
--
ALTER TABLE `genero`
  MODIFY `idGenero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `jugador`
--
ALTER TABLE `jugador`
  MODIFY `idJugador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `personaje`
--
ALTER TABLE `personaje`
  MODIFY `idPersonaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de tabela `seccion`
--
ALTER TABLE `seccion`
  MODIFY `idSeccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `afinidad`
--
ALTER TABLE `afinidad`
  ADD CONSTRAINT `jugador_afinidad` FOREIGN KEY (`jugador`) REFERENCES `jugador` (`idJugador`),
  ADD CONSTRAINT `personaje_afinidad` FOREIGN KEY (`personaje`) REFERENCES `personaje` (`idPersonaje`);

--
-- Restrições para tabelas `jugador`
--
ALTER TABLE `jugador`
  ADD CONSTRAINT `jugador_genero` FOREIGN KEY (`genero`) REFERENCES `genero` (`idGenero`),
  ADD CONSTRAINT `progreso_seccion` FOREIGN KEY (`progreso`) REFERENCES `seccion` (`idSeccion`);

--
-- Restrições para tabelas `personaje`
--
ALTER TABLE `personaje`
  ADD CONSTRAINT `condicion` FOREIGN KEY (`condicion`) REFERENCES `condicion` (`idCondicion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
