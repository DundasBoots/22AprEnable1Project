 DROP TABLE IF EXISTS `customers`;

 CREATE TABLE IF NOT EXISTS `customers` (
     `id` INT(11) NOT NULL AUTO_INCREMENT,
     `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
     PRIMARY KEY (`id`)
 );
DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `order_id` INT(11) NOT NULL,
    `customer` VARCHAR(40) DEFAULT NULL,
    `item` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)	
); 
 DROP TABLE IF EXISTS `items`;
 CREATE TABLE IF NOT EXISTS `items` (
     `id` INT(11) NOT NULL AUTO_INCREMENT,
    `value` INT(4) DEFAULT NULL,
    `item_name` VARCHAR(40) DEFAULT NULL,
     PRIMARY KEY (`id`)
 );
    