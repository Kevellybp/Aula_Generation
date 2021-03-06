-- MySQL Script generated by MySQL Workbench
-- Thu Apr 22 17:44:42 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_pizzaria_legal
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_pizzaria_legal
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_pizzaria_legal` DEFAULT CHARACTER SET utf8 ;
USE `db_pizzaria_legal` ;

-- -----------------------------------------------------
-- Table `db_pizzaria_legal`.`tb_categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_pizzaria_legal`.`tb_categoria` ;

CREATE TABLE IF NOT EXISTS `db_pizzaria_legal`.`tb_categoria` (
  `idt_categoria` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(45) NOT NULL,
  `ativo` TINYINT NOT NULL,
  PRIMARY KEY (`idt_categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria_legal`.`tb_pizza`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_pizzaria_legal`.`tb_pizza` ;

CREATE TABLE IF NOT EXISTS `db_pizzaria_legal`.`tb_pizza` (
  `id_pizza` INT NOT NULL AUTO_INCREMENT,
  `sabor` VARCHAR(45) NOT NULL,
  `tamanho` VARCHAR(45) NOT NULL,
  `preco` DECIMAL NOT NULL,
  `id_categoria` INT NOT NULL,
  PRIMARY KEY (`id_pizza`),
  INDEX `fk_tb_pizza_tb_categoria_idx` (`id_categoria` ASC) VISIBLE,
  CONSTRAINT `fk_tb_pizza_tb_categoria`
    FOREIGN KEY (`id_categoria`)
    REFERENCES `db_pizzaria_legal`.`tb_categoria` (`idt_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
INSERT INTO `db_pizzaria_legal`.`tb_categoria` (`tipo`, `ativo`) VALUES ('Doce', false);
INSERT INTO `db_pizzaria_legal`.`tb_categoria` (`tipo`, `ativo`) VALUES ('Salgada', true);
-- select * from tb_categoria
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `tamanho`, `preco`, `id_categoria`) VALUES ('Calabresa', 'Media', '25.00', '2');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `tamanho`, `preco`, `id_categoria`) VALUES ('Mussarela', 'Grande', '35.00', '2');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `tamanho`, `preco`, `id_categoria`) VALUES ('Banana', 'Pequena', '20.00', '1');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `tamanho`, `preco`, `id_categoria`) VALUES ('Portuguesa', 'Fam??lia', '45.00', '2');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `tamanho`, `preco`, `id_categoria`) VALUES ('Milho', 'M??dia', '35.00', '2');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `tamanho`, `preco`, `id_categoria`) VALUES ('Toscana', 'M??dia', '40.00', '2');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `tamanho`, `preco`, `id_categoria`) VALUES ('Romeu e Julieta', 'pequena', '20.00', '1');
INSERT INTO `db_pizzaria_legal`.`tb_pizza` (`sabor`, `tamanho`, `preco`, `id_categoria`) VALUES ('Fil??', 'grande', '50.00', '1');

-- select * from tb_pizza 
-- select * from tb_pizza where preco > 45.00
-- select * from tb_pizza where preco >=29 and preco <=60
-- select * from tb_pizza where sabor like "%c%"and tamanho like "%c%"
-- select tb_categoria.tipo, tb_categoria.ativo, tb_pizza.sabor, tb_pizza.tamanho, tb_pizza.preco from tb_pizza inner join tb_categoria on tb_categoria.idt_categoria=tb_pizza.id_categoria
-- select tb_categoria.tipo, tb_categoria.ativo, tb_pizza.sabor, tb_pizza.tamanho, tb_pizza.preco from tb_pizza inner join tb_categoria on tb_categoria.idt_categoria=tb_pizza.id_categoria where tb_categoria.tipo= "doce"
