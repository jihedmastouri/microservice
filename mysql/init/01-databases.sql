# create databases
CREATE DATABASE IF NOT EXISTS `primary`;
CREATE DATABASE IF NOT EXISTS `secondary`;
CREATE DATABASE IF NOT EXISTS `primary`;
CREATE DATABASE IF NOT EXISTS `primary`;
CREATE DATABASE IF NOT EXISTS `secondary`;
CREATE DATABASE IF NOT EXISTS `secondary`;


# create root user and grant rights
CREATE USER 'root'@'localhost' IDENTIFIED BY 'local';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';
