CREATE DATABASE ToDoDatabase;

USE tododatabase;

CREATE TABLE ToDoApp (
id MEDIUMINT NOT NULL AUTO_INCREMENT,
 task VARCHAR(255),
state ENUM ('ToDo', 'Doing', 'Review', 'Done') default 'ToDo',
PRIMARY KEY(id));

INSERT INTO ToDoApp (task, state) VALUES ('Clean the House', 'ToDo');
INSERT INTO ToDoApp (task, state) VALUES ('Walk the dog', 'ToDo');
INSERT INTO ToDoApp (task, state) VALUES ('Do Homework', 'ToDo');

UPDATE `todoapp` SET `state` = 'Doing' WHERE `id` = 1;

DELETE FROM `todoapp` WHERE `id` = 2;
