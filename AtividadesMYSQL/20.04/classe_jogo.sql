-- MySQL Script generated by MySQL Workbench
-- Thu Apr 22 14:08:43 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_generation_game_online
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_generation_game_online
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_generation_game_online` DEFAULT CHARACTER SET utf8 ;
USE `db_generation_game_online` ;

-- -----------------------------------------------------
-- Table `db_generation_game_online`.`tb_classe`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_generation_game_online`.`tb_classe` ;

CREATE TABLE IF NOT EXISTS `db_generation_game_online`.`tb_classe` (
  `idtb_classe` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idtb_classe`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_generation_game_online`.`tb_personagens`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_generation_game_online`.`tb_personagens` ;

CREATE TABLE IF NOT EXISTS `db_generation_game_online`.`tb_personagens` (
  `idtb_personagens` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `poder_defesa` INT NOT NULL,
  `poder_ataque` INT NOT NULL,
  `classe_id` INT NOT NULL,
  PRIMARY KEY (`idtb_personagens`),
  INDEX `fk_tb_personagens_tb_classe_idx` (`classe_id` ASC) VISIBLE,
  CONSTRAINT `fk_tb_personagens_tb_classe`
    FOREIGN KEY (`classe_id`)
    REFERENCES `db_generation_game_online`.`tb_classe` (`idtb_classe`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;