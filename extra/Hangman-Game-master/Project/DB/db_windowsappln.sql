# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     db_windowsappln
# Server version:               5.0.51b-community-nt
# Server OS:                    Win32
# Target compatibility:         ANSI SQL
# HeidiSQL version:             4.0
# Date/time:                    2018-01-17 11:05:04
# --------------------------------------------------------

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ANSI,NO_BACKSLASH_ESCAPES';*/
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;*/


#
# Database structure for database 'db_windowsappln'
#

CREATE DATABASE /*!32312 IF NOT EXISTS*/ "db_windowsappln" /*!40100 DEFAULT CHARACTER SET latin1 */;

USE "db_windowsappln";


#
# Table structure for table 'tbl_category'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_category" (
  "category_id" int(10) unsigned NOT NULL auto_increment,
  "category_name" varchar(50) default NULL,
  PRIMARY KEY  ("category_id")
) AUTO_INCREMENT=22;



#
# Dumping data for table 'tbl_category'
#

LOCK TABLES "tbl_category" WRITE;
/*!40000 ALTER TABLE "tbl_category" DISABLE KEYS;*/
REPLACE INTO "tbl_category" ("category_id", "category_name") VALUES
	('21','nnnnnnnn');
/*!40000 ALTER TABLE "tbl_category" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_subcategory'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_subcategory" (
  "category_id" int(10) unsigned default NULL,
  "subcat_id" int(10) unsigned NOT NULL auto_increment,
  "subcat_name" varchar(500) default NULL,
  PRIMARY KEY  ("subcat_id")
) AUTO_INCREMENT=9;



#
# Dumping data for table 'tbl_subcategory'
#

LOCK TABLES "tbl_subcategory" WRITE;
/*!40000 ALTER TABLE "tbl_subcategory" DISABLE KEYS;*/
REPLACE INTO "tbl_subcategory" ("category_id", "subcat_id", "subcat_name") VALUES
	('17','3','Mobile');
REPLACE INTO "tbl_subcategory" ("category_id", "subcat_id", "subcat_name") VALUES
	('17','4','Laptop');
REPLACE INTO "tbl_subcategory" ("category_id", "subcat_id", "subcat_name") VALUES
	('16','5','Veg');
REPLACE INTO "tbl_subcategory" ("category_id", "subcat_id", "subcat_name") VALUES
	('16','8','nonveg');
/*!40000 ALTER TABLE "tbl_subcategory" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_supplier'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_supplier" (
  "sup_id" int(10) unsigned NOT NULL auto_increment,
  "sup_name" varchar(50) default NULL,
  "sup_contact" varchar(50) default NULL,
  "sup_email" varchar(50) default NULL,
  "sup_address" varchar(500) default NULL,
  PRIMARY KEY  ("sup_id")
);



#
# Dumping data for table 'tbl_supplier'
#

# No data found.

/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
