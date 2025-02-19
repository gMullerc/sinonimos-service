CREATE TABLE TB_DIFICULDADE (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(50) NOT null,
    codigo VARCHAR(50) UNIQUE NOT null
);

INSERT INTO TB_DIFICULDADE (descricao, codigo) VALUES 
    ('Fácil', 'FACIL'),
    ('Médio', 'MEDIO'),
    ('Difícil', 'DIFICIL');

create table TB_SINONIMO (
	id SERIAL primary key,
    descricao TEXT NOT NULL,
    dificuldade_id INT NOT NULL,
    FOREIGN KEY (dificuldade_id) REFERENCES TB_DIFICULDADE(id) ON DELETE RESTRICT
);

create table TB_SINONIMO_PALAVRA (
	id SERIAL primary key,
	sinonimo_id int not null,
    descricao TEXT NOT NULL,
    FOREIGN KEY (sinonimo_id) REFERENCES TB_SINONIMO(id) ON DELETE restrict
);


INSERT INTO TB_SINONIMO (descricao, dificuldade_id) VALUES 
    ('Correr', (SELECT id FROM TB_DIFICULDADE WHERE codigo = 'FACIL'));

INSERT INTO TB_SINONIMO_PALAVRA (sinonimo_id, descricao) VALUES
    (1, 'Andar'),
    (1, 'Pular');
