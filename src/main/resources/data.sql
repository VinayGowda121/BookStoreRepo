
INSERT INTO BOOK_INVENTORY (TITLE,AUTHOR,ISBN,AVAILIBILITY)
VALUES 	('Java','Joe',111,'Y'),
		('Java OCA','Joe',112,'Y'),
		('Advanced Java','Joe',113,'Y'),
		('Spring','Tom',222,'Y'),
		('Hibernate','Adam',333,'Y'),
		('HTML','Tim',444,'Y'),
		('AWS','Jim',555,'Y');
		
INSERT INTO BOOK_INVENTORY2(ISBN,CATEGORY,PUBLISHED)
VALUES	(111,'Prgogramming',CURRENT_TIMESTAMP()),
		(112,'Prgogramming',CURRENT_TIMESTAMP()),
		(113,'Prgogramming',CURRENT_TIMESTAMP()),
		(222,'Prgogramming',CURRENT_TIMESTAMP()),
		(333,'Prgogramming',CURRENT_TIMESTAMP()),
		(444,'Prgogramming',CURRENT_TIMESTAMP()),
		(555,'Prgogramming',CURRENT_TIMESTAMP());