UPDATE "SEQUENCE" SET SEQ_COUNT = 50 WHERE SEQ_NAME = 'SEQ_GEN_TABLE';
INSERT INTO "ADMINISTRATOR" VALUES (1, 'admin', 'admin');
INSERT INTO "PRACOWNIK" VALUES (1, 'pracownik', 'pracownik');
INSERT INTO "MAGAZYN" VALUES (1, 'Szkolna 15', 'ASTRA głw.', 500);
INSERT INTO "PRODUKT" VALUES (1, 100, 123, 'Buty', 'Adidas', 'ZM-2012/12-01', 'opis', 1, 1);
INSERT INTO "PRODUKT" VALUES (2, 100, 123, 'Buty', 'Nike', 'ZM-2012/12-02', 'opis', 1, 1);
INSERT INTO "PRODUKT" VALUES (3, 100, 123, 'Buty', 'Lacosta', 'ZM-2012/12-03', 'opis', 1, 1);
INSERT INTO "UZYTKOWNIK" VALUES (1, 'Nowigradzka 30', 'haslo', 'Adam', 'login', 'adam@o2.pl', 'Kornowski');