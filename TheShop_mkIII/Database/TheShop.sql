DROP TABLE IF EXISTS "accountcreation";
CREATE TABLE "accountcreation" ("FirstName" CHAR NOT NULL  DEFAULT (null) ,"LastName" CHAR NOT NULL  DEFAULT (null) ,"ContactNo" INTEGER NOT NULL  DEFAULT (null) ,"Address" VARCHAR NOT NULL  DEFAULT (null) ,"Username" VARCHAR NOT NULL ,"Password" VARCHAR NOT NULL ,"EmailAdd" VARCHAR NOT NULL  DEFAULT (null) );
INSERT INTO "accountcreation" VALUES('Manuel ','Parro','09476950426
09476950426','Bacoor','renzlee','theprime','manuel_parro@dlsu.edu.ph');
INSERT INTO "accountcreation" VALUES('asd','zxc',12391231,'asdasd','qweasdzxc','1234','asdzxc@yahoo.com');
INSERT INTO "accountcreation" VALUES('Paolo','Wenceslao',948282822,'Marikina','PWenceslao','1234','Paolo@gmail.com');
DROP TABLE IF EXISTS "accountdata";
CREATE TABLE "accountdata" ("username" CHAR NOT NULL , "password" VARCHAR NOT NULL , "firstname" CHAR NOT NULL , "surname" CHAR NOT NULL , "age" INTEGER NOT NULL );
INSERT INTO "accountdata" VALUES('root','root','Manuel','Parro',19);
INSERT INTO "accountdata" VALUES('admin','admin','Charilen','Concepcion',19);
