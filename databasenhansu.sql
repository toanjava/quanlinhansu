-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema nhansu
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema nhansu
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `nhansu` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `nhansu` ;

-- -----------------------------------------------------
-- Table `nhansu`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nhansu`.`department` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL DEFAULT NULL,
  `active` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `nhansu`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nhansu`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `active` INT NULL DEFAULT NULL,
  `citizenid` VARCHAR(255) NULL DEFAULT NULL,
  `position` VARCHAR(255) NULL DEFAULT NULL,
  `wagepolicy` VARCHAR(255) NULL DEFAULT NULL,
  `ethnic` VARCHAR(255) NULL DEFAULT NULL,
  `permanentaddress` VARCHAR(255) NULL DEFAULT NULL,
  `address` VARCHAR(255) NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `gender` VARCHAR(255) NULL DEFAULT NULL,
  `image` VARCHAR(255) NULL DEFAULT NULL,
  `experience` INT NULL DEFAULT NULL,
  `basicsalary` FLOAT NULL DEFAULT NULL,
  `actualsalary` FLOAT NULL DEFAULT NULL,
  `birthday` DATE NULL DEFAULT NULL,
  `workingday` DATE NULL DEFAULT NULL,
  `placebirth` VARCHAR(255) NULL DEFAULT NULL,
  `departmentname` VARCHAR(255) NULL DEFAULT NULL,
  `nativecountry` VARCHAR(255) NULL DEFAULT NULL,
  `nationality` VARCHAR(255) NULL DEFAULT NULL,
  `phonenumber` VARCHAR(255) NULL DEFAULT NULL,
  `name` VARCHAR(255) NULL DEFAULT NULL,
  `seniority` VARCHAR(255) NULL DEFAULT NULL,
  `religion` VARCHAR(255) NULL DEFAULT NULL,
  `academic` VARCHAR(255) NULL DEFAULT NULL,
  `educational` VARCHAR(255) NULL DEFAULT NULL,
  `marriage` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `nhansu`.`office`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nhansu`.`office` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `address` VARCHAR(100) NULL DEFAULT NULL,
  `active` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `nhansu`.`title`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nhansu`.`title` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL DEFAULT NULL,
  `active` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
