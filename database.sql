/*
SQLyog Community v8.55 
MySQL - 5.1.41 : Database - soundmatching
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`soundmatching` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `soundmatching`;

/*Table structure for table `soundstore` */

DROP TABLE IF EXISTS `soundstore`;

CREATE TABLE `soundstore` (
  `speakerName` varchar(1000) DEFAULT NULL,
  `seakTime` varchar(1000) DEFAULT NULL,
  `dataLength` varchar(1000) DEFAULT NULL,
  `fileName` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `soundstore` */

/*Table structure for table `stafftbl` */

DROP TABLE IF EXISTS `stafftbl`;

CREATE TABLE `stafftbl` (
  `stffName` varchar(1000) DEFAULT NULL,
  `staffPost` varchar(1000) DEFAULT NULL,
  `staffContactNo` varchar(1000) DEFAULT NULL,
  `staffEmail` varchar(1000) DEFAULT NULL,
  `staffQualification` varchar(1000) DEFAULT NULL,
  `staffVoice` varchar(1000) DEFAULT NULL,
  `staffAdd` varchar(1000) DEFAULT NULL,
  `staffPassword` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stafftbl` */

insert  into `stafftbl`(`stffName`,`staffPost`,`staffContactNo`,`staffEmail`,`staffQualification`,`staffVoice`,`staffAdd`,`staffPassword`) values ('lucky','Teacher','9923212685','lkapse63@gmail.com','BE','./sounds/test3.wav','Pardi','1234'),('ganesh sir','fddfszcvcx','vzdsv','l','vzdvvcv','./sounds/test1.wav','efdsfg','1234'),('khan madam',NULL,NULL,NULL,NULL,'./sounds/test3.wav',NULL,NULL),('priya madam',NULL,NULL,NULL,NULL,'./sounds/test3.wav',NULL,NULL),('Ashlesha madam',NULL,NULL,NULL,NULL,'./sounds/test3.wav',NULL,NULL),('ajay sir',NULL,NULL,NULL,NULL,'./sounds/test3.wav',NULL,NULL),('kapil sir',NULL,NULL,NULL,NULL,'./sounds/test3.wav',NULL,NULL),('ayush',NULL,NULL,NULL,NULL,'./sounds/test3.wav',NULL,NULL),('nikhil',NULL,NULL,NULL,NULL,'./sounds/test3.wav',NULL,NULL),(NULL,NULL,NULL,NULL,NULL,'./sounds/test3.wav',NULL,NULL);

/*Table structure for table `stdtbl` */

DROP TABLE IF EXISTS `stdtbl`;

CREATE TABLE `stdtbl` (
  `stdName` varchar(1000) DEFAULT NULL,
  `stdClass` varchar(1000) DEFAULT NULL,
  `stdAdd` varchar(1000) DEFAULT NULL,
  `stdcollgeId` varchar(1000) DEFAULT NULL,
  `stdVoice` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stdtbl` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
