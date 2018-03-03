-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: indigopro
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `articles`
--

LOCK TABLES `articles` WRITE;
/*!40000 ALTER TABLE `articles` DISABLE KEYS */;
INSERT INTO `articles` VALUES ('FAMI21','ECR','Famir 21',20,150,'2018-02-16'),('XENO25','POR','Xenon 25',15,850,'2018-02-16'),('ZENI77','TAB','Zenith 77',30,500,'2018-02-16');
/*!40000 ALTER TABLE `articles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES ('ECR','écran'),('POR','portable'),('TAB','tablette');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` VALUES ('DRJE02','DROUAN','Jean',0,'2018-02-16','','','Abidjan','','+0324758254','',''),('DRJZ42','TALA','Blaise ',1,'2018-02-16','Yopougon Sicogi','abj02','Abidjan','32456987','+0368854723698','talabl@yahoo.fr',''),('ADJM00','JOMIKA','JoelMika',0,'2018-02-15','Abidjan Cocody','abdj01','Abidjan','31977536','+22502460959','henrimika@yahoo.fr',''),('KOCE08','KOCI','CESAR',0,'2018-02-19','Bouake Belleville','bke02','Bouake','32450060','+22507239799','kocebk@gmail.com','Merci pour votre promptitude dans le service'),('DEFT24','CONAN','innocent',1,'2018-02-19','abidjan yop','abj02','abidjan','23456987','+2258895231','inno@hot.com','Merci pour le service'),('KPLR23','KAPI','LAURENT',0,'2018-02-20','Korhogo marche','kor01','Korhogo','31023698','+22508795860','kalaur@gmail.com',''),('essai2','ESSAI','essai',0,'20-02-2018','','','','','','',''),('essai','galatawan','',1,'','','','','','','',''),('ZOBIZO01','KOREA','',0,'','','','','','','',''),('ESSAI03','faites','',0,'','','','','','','',''),('DGKI05','Daouda','Kouassi',1,'2018-02-22','Abidjan Koumassi','abj01','Abidjan','32695874','+22578965421','daoukoua@gmail.com',''),('JIKOP65','jhuuu','qszz',1,'','','','','','','',''),('mika','DIOM','',NULL,'2018-02-23','','','','','','',''),('GTHY25','FRAUI','hjuy',NULL,'2018-02-23','','','','','','',''),('essai3','joel','',1,'2018-02-27','','','','','','','');
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `commandes`
--

LOCK TABLES `commandes` WRITE;
/*!40000 ALTER TABLE `commandes` DISABLE KEYS */;
INSERT INTO `commandes` VALUES ('COM1','GIPA01',0,2,'2018-02-16'),('COM2','PLSY01',0,3,'2018-02-16');
/*!40000 ALTER TABLE `commandes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ligne_commandes`
--

LOCK TABLES `ligne_commandes` WRITE;
/*!40000 ALTER TABLE `ligne_commandes` DISABLE KEYS */;
INSERT INTO `ligne_commandes` VALUES ('COM1','XENO25',1,850,1025.1),('COM1','ZENI77',1,500,630),('COM2','FAMI21',2,150,361.8);
/*!40000 ALTER TABLE `ligne_commandes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `mode_reglement`
--

LOCK TABLES `mode_reglement` WRITE;
/*!40000 ALTER TABLE `mode_reglement` DISABLE KEYS */;
INSERT INTO `mode_reglement` VALUES (1,'espèce'),(2,'chéque'),(3,'carte');
/*!40000 ALTER TABLE `mode_reglement` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-01 19:57:40
