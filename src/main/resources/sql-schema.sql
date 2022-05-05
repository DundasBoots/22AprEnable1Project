-- drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `customer_id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`customer_id`)
);
CREATE TABLE IF NOT EXISTS `ims`.`items` (
    `item_id` INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `value` INT(4) DEFAULT NULL,
    `item_name` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`item_id`)
);
CREATE TABLE IF NOT EXISTS `ims`.`orders` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `order_id` INT(11) NOT NULL,
    `customer` VARCHAR(40) DEFAULT NULL,
    `item` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);    
