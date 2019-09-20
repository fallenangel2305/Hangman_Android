# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     db_hangman
# Server version:               5.0.51b-community-nt
# Server OS:                    Win32
# Target compatibility:         ANSI SQL
# HeidiSQL version:             4.0
# Date/time:                    2017-12-21 15:34:52
# --------------------------------------------------------

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ANSI,NO_BACKSLASH_ESCAPES';*/
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;*/


#
# Database structure for database 'db_hangman'
#

CREATE DATABASE /*!32312 IF NOT EXISTS*/ "db_hangman" /*!40100 DEFAULT CHARACTER SET latin1 */;

USE "db_hangman";


#
# Table structure for table 'tbl_admin'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_admin" (
  "admin_id" int(10) unsigned NOT NULL auto_increment,
  "admin_username" varchar(50) default NULL,
  "admin_password" varchar(50) default NULL,
  PRIMARY KEY  ("admin_id")
);



#
# Dumping data for table 'tbl_admin'
#

# No data found.



#
# Table structure for table 'tbl_option'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_option" (
  "option_id" int(20) unsigned NOT NULL auto_increment,
  "option_name" varchar(50) default NULL,
  "qus_id" int(20) unsigned default NULL,
  "option_isValid" varchar(20) default NULL,
  PRIMARY KEY  ("option_id")
);



#
# Dumping data for table 'tbl_option'
#

# No data found.



#
# Table structure for table 'tbl_player'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_player" (
  "player_id" int(10) unsigned NOT NULL auto_increment,
  "player_name" varchar(50) default NULL,
  "player_email" varchar(50) default NULL,
  PRIMARY KEY  ("player_id")
);



#
# Dumping data for table 'tbl_player'
#

# No data found.



#
# Table structure for table 'tbl_question'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_question" (
  "qus_id" int(20) unsigned NOT NULL auto_increment,
  "qus_name" varchar(50) default '50',
  PRIMARY KEY  ("qus_id")
);



#
# Dumping data for table 'tbl_question'
#

# No data found.



#
# Table structure for table 'tbl_score'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_score" (
  "score_id" int(20) unsigned NOT NULL auto_increment,
  "player_id" int(20) unsigned default NULL,
  "score_point" int(20) unsigned default NULL,
  PRIMARY KEY  ("score_id")
);



#
# Dumping data for table 'tbl_score'
#

# No data found.



#
# Table structure for table 'tbl_test'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_test" (
  "test_id" int(20) unsigned NOT NULL auto_increment,
  "player_id" int(20) unsigned default NULL,
  "qus_id" int(20) unsigned default NULL,
  "option_id" int(20) unsigned default NULL,
  "option_isvalid" varchar(10) default NULL,
  PRIMARY KEY  ("test_id")
);



#
# Dumping data for table 'tbl_test'
#

# No data found.

/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
