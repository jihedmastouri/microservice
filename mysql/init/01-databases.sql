# create databases
CREATE DATABASE IF NOT EXISTS `constatapp`;
CREATE DATABASE IF NOT EXISTS `collisionapp`;
CREATE DATABASE IF NOT EXISTS `devisapp`;
CREATE DATABASE IF NOT EXISTS `dossierapp`;
CREATE DATABASE IF NOT EXISTS `rembourapp`;
CREATE DATABASE IF NOT EXISTS `reparationapp`;

# create root user and grant rights
CREATE USER 'root'@'localhost' IDENTIFIED BY 'local';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';
