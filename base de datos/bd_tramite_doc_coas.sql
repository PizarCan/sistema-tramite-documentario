-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 26-01-2012 a las 16:42:41
-- Versión del servidor: 5.5.16
-- Versión de PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bd_tramite_doc_coas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area`
--

CREATE TABLE IF NOT EXISTS `area` (
  `codAre` int(11) NOT NULL AUTO_INCREMENT,
  `nombreAre` char(30) DEFAULT NULL,
  PRIMARY KEY (`codAre`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `area`
--

INSERT INTO `area` (`codAre`, `nombreAre`) VALUES
(1, 'CENTRO DOCUMENTACION'),
(2, 'GENRENCIA'),
(3, 'ASESORIA LEGAL'),
(4, 'OPERACION'),
(5, 'CONTABILIDAD'),
(6, 'PLATAFORMA'),
(7, 'CAJA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documento`
--

CREATE TABLE IF NOT EXISTS `documento` (
  `codDoc` int(11) NOT NULL AUTO_INCREMENT,
  `asuntoDoc` char(50) DEFAULT NULL,
  `remitenteDoc` char(50) DEFAULT NULL,
  `fecInDoc` char(10) DEFAULT NULL,
  `destinoDoc` char(50) DEFAULT NULL,
  `codTipDoc` int(11) NOT NULL,
  `descripcionDoc` char(100) DEFAULT NULL,
  PRIMARY KEY (`codDoc`),
  KEY `codTipDoc` (`codTipDoc`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=31 ;

--
-- Volcado de datos para la tabla `documento`
--

INSERT INTO `documento` (`codDoc`, `asuntoDoc`, `remitenteDoc`, `fecInDoc`, `destinoDoc`, `codTipDoc`, `descripcionDoc`) VALUES
(1, 'curso de capacitacion', 'JORGE LOAYZA', '26-1-2012', 'CENTRO DOCUMENTACION', 5, 'Se invita al curso de capacitaion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE IF NOT EXISTS `estado` (
  `codEst` int(11) NOT NULL AUTO_INCREMENT,
  `nombreEst` char(25) DEFAULT NULL,
  PRIMARY KEY (`codEst`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`codEst`, `nombreEst`) VALUES
(1, 'activo'),
(2, 'inactivo'),
(3, 'en proceso'),
(4, 'pendiente'),
(5, 'finalizado'),
(6, 'iniciado'),
(7, 'archivado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `privilegios`
--

CREATE TABLE IF NOT EXISTS `privilegios` (
  `codPri` int(11) NOT NULL AUTO_INCREMENT,
  `nombrePri` char(25) DEFAULT NULL,
  PRIMARY KEY (`codPri`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Volcado de datos para la tabla `privilegios`
--

INSERT INTO `privilegios` (`codPri`, `nombrePri`) VALUES
(1, 'ingresar al sistema'),
(2, 'confirmar documento'),
(3, 'visualizar documento'),
(4, 'generar documento'),
(5, 'modificar documento'),
(6, 'archivar documento'),
(7, 'consultar documento'),
(8, 'administrar privilegios'),
(9, 'gestionar estado'),
(10, 'crear usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recepcion`
--

CREATE TABLE IF NOT EXISTS `recepcion` (
  `codRec` int(11) NOT NULL AUTO_INCREMENT,
  `nombreRec` char(20) DEFAULT NULL,
  PRIMARY KEY (`codRec`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `recepcion`
--

INSERT INTO `recepcion` (`codRec`, `nombreRec`) VALUES
(1, 'no leido'),
(2, 'leido');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_documento`
--

CREATE TABLE IF NOT EXISTS `tipo_documento` (
  `codTipDoc` int(11) NOT NULL AUTO_INCREMENT,
  `nombreTipDoc` char(30) DEFAULT NULL,
  `descripTipDoc` char(80) DEFAULT NULL,
  PRIMARY KEY (`codTipDoc`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `tipo_documento`
--

INSERT INTO `tipo_documento` (`codTipDoc`, `nombreTipDoc`, `descripTipDoc`) VALUES
(5, 'carta', 'sss'),
(4, 'contrato', 'contrao para descricion'),
(3, 'memorandum', 'da mensaje a todos'),
(2, 'carta poder', 'nos da el poder para'),
(1, 'carta de recomendacion', 'permite realizar la recomendacion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE IF NOT EXISTS `tipo_usuario` (
  `CodTipUsu` int(11) NOT NULL AUTO_INCREMENT,
  `nombreTipUsu` char(35) DEFAULT NULL,
  PRIMARY KEY (`CodTipUsu`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`CodTipUsu`, `nombreTipUsu`) VALUES
(1, 'usuario'),
(2, 'centro de documentacion'),
(3, 'gerencia'),
(4, 'administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipusupri`
--

CREATE TABLE IF NOT EXISTS `tipusupri` (
  `CodTipUsu` int(11) NOT NULL,
  `codPri` int(11) NOT NULL,
  PRIMARY KEY (`CodTipUsu`,`codPri`),
  KEY `codPri` (`codPri`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipusupri`
--

INSERT INTO `tipusupri` (`CodTipUsu`, `codPri`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(2, 6),
(3, 1),
(3, 2),
(3, 3),
(3, 4),
(3, 5),
(3, 7),
(4, 8),
(4, 9),
(4, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transaccion`
--

CREATE TABLE IF NOT EXISTS `transaccion` (
  `codTra` int(11) NOT NULL AUTO_INCREMENT,
  `codRec` int(11) NOT NULL,
  `codUsu` int(11) NOT NULL,
  `destinoAre` int(11) NOT NULL,
  `codEst` int(11) NOT NULL,
  `fecTra` char(10) DEFAULT NULL,
  `codDoc` int(11) NOT NULL,
  `descripcionTra` char(100) DEFAULT NULL,
  `cuentaTra` int(11) DEFAULT NULL,
  PRIMARY KEY (`codTra`),
  KEY `codUsu` (`codUsu`),
  KEY `destinoAre` (`destinoAre`),
  KEY `codDoc` (`codDoc`),
  KEY `codEst` (`codEst`),
  KEY `codRec` (`codRec`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=58 ;

--
-- Volcado de datos para la tabla `transaccion`
--

INSERT INTO `transaccion` (`codTra`, `codRec`, `codUsu`, `destinoAre`, `codEst`, `fecTra`, `codDoc`, `descripcionTra`, `cuentaTra`) VALUES
(4, 1, 2, 1, 5, '26-1-2012', 1, 'se cancela y se finaliza el proceso', 4),
(3, 2, 3, 1, 3, '26-1-2012', 1, 'si aceptamos tal curso pase po genrenia', 3),
(2, 2, 2, 2, 3, '26-1-2012', 1, 'ok se acepta esta solicitad infmaamor', 2),
(1, 2, 2, 1, 6, '26-1-2012', 1, 'Se invita al curso de capacitaion', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `codUsu` int(11) NOT NULL AUTO_INCREMENT,
  `nombreUsu` char(30) DEFAULT NULL,
  `nickUsu` char(20) DEFAULT NULL,
  `claveUsu` char(30) DEFAULT NULL,
  `apellidoUsu` char(30) DEFAULT NULL,
  `correoUsu` char(40) DEFAULT NULL,
  `CodTipUsu` int(11) NOT NULL,
  `codEst` int(11) NOT NULL,
  `codAre` int(11) NOT NULL,
  `DNIUsu` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`codUsu`),
  KEY `CodTipUsu` (`CodTipUsu`),
  KEY `codAre` (`codAre`),
  KEY `codEst` (`codEst`),
  KEY `DNIUsu` (`DNIUsu`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`codUsu`, `nombreUsu`, `nickUsu`, `claveUsu`, `apellidoUsu`, `correoUsu`, `CodTipUsu`, `codEst`, `codAre`, `DNIUsu`) VALUES
(1, 'ADMIN', 'admin', '12345', 'ADMINISTRADOR', 'rene@hot', 2, 1, 0, '4284279312'),
(5, 'ROSMERY', 'ros', 'ros', 'QUISPE INFANTES', 'ros@gmail.com', 1, 2, 1, '111111'),
(3, 'ELIZABEHT VERONICA', 'eli', 'eli', 'VERA CERVANTES', 'elizabeth@gmail.com', 1, 2, 2, '42454545'),
(2, 'WILFREDO FELIX', 'will', 'will', 'QUISPE INFANTES', 'wilfredoqi@gmail.com', 1, 2, 1, '42842793'),
(4, 'MADELEY KARINA', 'made', 'made', 'COAQUIRA CONGONA', 'madeley@coaquiracongona', 1, 2, 5, '12121212'),
(6, 'WILFREDO FELIX', 'willy', 'willy', 'INFANTES INFANTES', 'wilfredoqi@gmail.com', 1, 2, 1, '1111111');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
