CREATE TABLE persona (
  id INT NOT NULL AUTO_INCREMENT,
  cedula VARCHAR(20) DEFAULT NULL,
  nombre VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE libro (
  id int NOT NULL AUTO_INCREMENT,
  titulo varchar(255) DEFAULT NULL,
  autor_id int DEFAULT NULL,
  ISBN varchar(20) DEFAULT NULL,
  paginas int DEFAULT NULL,
  edicion int DEFAULT NULL,
  editorial varchar(255) DEFAULT NULL,
  lugar varchar(255) DEFAULT NULL,
  fecha_edicion date DEFAULT NULL,
  PRIMARY KEY (id),
  KEY autor_id (autor_id),
  CONSTRAINT libro_ibfk_1 FOREIGN KEY (autor_id) REFERENCES persona (id)
) ;


/*SP*/
DELIMITER //
CREATE PROCEDURE IngresarLibro(
    IN p_titulo VARCHAR(255),
    IN p_author VARCHAR(255),
    IN p_ISBN VARCHAR(20),
    IN p_paginas INT,
    IN p_edition VARCHAR(50),
    IN p_editorial VARCHAR(255),
    IN p_lugar VARCHAR(255),
    IN p_fecha_edicion DATE
)
BEGIN
    DECLARE autor_id INT;
    
    SELECT id INTO autor_id
    FROM persona
    WHERE nombre = p_author;
    
    INSERT INTO libro(titulo, autor_id, ISBN, paginas, edicion, editorial, lugar, fecha_edicion)
    VALUES(p_titulo, autor_id, p_ISBN, p_paginas, p_edition, p_editorial, p_lugar, p_fecha_edicion);
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE InsertarLibro(
    IN p_title VARCHAR(255),
    IN p_author VARCHAR(255),
    IN p_ISBN VARCHAR(20),
    IN p_pages INT,
    IN p_edition VARCHAR(50),
    IN p_publisher VARCHAR(255),
    IN p_place VARCHAR(255),
    IN p_publication_date DATE
)
BEGIN
    DECLARE autor_id INT;
    
    SELECT id INTO autor_id
    FROM persona
    WHERE nombre = p_author;
    
    INSERT INTO libro(titulo, autor_id, ISBN, paginas, edicion, editorial, lugar, fecha_edicion)
    VALUES(p_title, autor_id, p_ISBN, p_pages, p_edition, p_publisher, p_place, p_publication_date);
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE InsertarPersona(
    IN p_cedula VARCHAR(20),
    IN p_full_name VARCHAR(255)
)
BEGIN
    INSERT INTO persona(cedula, nombre)
    VALUES(p_cedula, p_full_name);
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE ObtenerLibrosConAutores()
BEGIN
    SELECT l.id, l.titulo, p.nombre AS autor, l.ISBN, l.paginas, l.edicion, l.editorial, l.lugar, l.fecha_edicion
    FROM libro l
    INNER JOIN persona p ON l.autor_id = p.id
    ORDER BY l.titulo;
END //
DELIMITER ;
DELIMITER //
CREATE PROCEDURE ObtenerIdAutorPorCedula(
    IN p_cedula VARCHAR(20),
    OUT p_id_autor INT
)
BEGIN
    DECLARE autor_id INT DEFAULT -1;
    
    SELECT id INTO autor_id
    FROM persona
    WHERE cedula = p_cedula;
    
    SET p_id_autor = autor_id;
END //
DELIMITER ;

DELIMITER //

CREATE PROCEDURE actualizarLibro (
    IN p_id INT,
    IN p_titulo VARCHAR(255),
    IN p_autor_id INT,
    IN p_ISBN VARCHAR(20),
    IN p_paginas INT,
    IN p_edicion INT,
    IN p_editorial VARCHAR(255),
    IN p_lugar VARCHAR(255),
    IN p_fecha_edicion DATE
)
BEGIN
    UPDATE libro
    SET
        titulo = p_titulo,
        autor_id = p_autor_id,
        ISBN = p_ISBN,
        paginas = p_paginas,
        edicion = p_edicion,
        editorial = p_editorial,
        lugar = p_lugar,
        fecha_edicion = p_fecha_edicion
    WHERE id = p_id;
END //

DELIMITER ;
