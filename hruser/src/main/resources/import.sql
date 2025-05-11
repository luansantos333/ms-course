INSERT INTO tb_role (role_name) VALUES ('ROLE_USER');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');


INSERT INTO tb_user (name,username,password) VALUES ('Joãozinho', 'joazinho123@email.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO tb_user (name,username,password) VALUES ('Mariazinha', 'mariazinha123@email.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO tb_user (name,username,password) VALUES ('Pedrinho', 'pedrinho123@email.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1,1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2,2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3,1);
