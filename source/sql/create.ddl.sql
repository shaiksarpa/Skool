
DROP TABLE IF EXISTS USER CASCADE;

CREATE TABLE USER 
(ID INT PRIMARY KEY AUTO_INCREMENT,
 USERNAME VARCHAR(20) UNIQUE,
 PASSWORD VARCHAR(15) NOT NULL
)ENGINE=INNODB AUTO_INCREMENT=0;

DROP TABLE IF EXISTS CLASS_DETAILS CASCADE
 
create table CLASS_DETAILS
(ID int primary key auto_increment,
 CLASS varchar(5) not null,
 DESCRIPTION VARCHAR(10),
 MED ENum('TM','EM')
)ENGINE=INNODB AUTO_INCREMENT=0; 

