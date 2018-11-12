
CREATE TABLE Account
(
    fname character varying(10),
    lname character varying(15),
    gamertag character varying(10),
    email character varying(25),
    f_game character varying(25),
    CONSTRAINT Account_pkey PRIMARY KEY(gamertag)
);

CREATE TABLE Games
(
    game_name character varying(25),
    developer character varying(25),
    genre character varying(15),
    rating character(1),
	CONSTRAINT Games_pkey PRIMARY KEY(game_name)
);
	
CREATE TABLE Highscore 
(
    gamertag character varying(25),
    game_name character varying(25),
    score integer NOT NULL,
);

INSERT INTO Account VALUES ('Tim', 'Gwalt', 'Realsy', 'timgwalt@gmail.com', 'H1Z1');
INSERT INTO Account VALUES ('Rachel', 'John', 'Ratchpatch', 'rjohn@gmail.com', 'Kingdom Hearts');
INSERT INTO Account VALUES ('Rachel', 'Bart', 'MFan98', 'bartR@yahoo.com', 'Mario party 8');
INSERT INTO Account VALUES ('John', 'Polst', 'Zercon', 'jp97@twc.com', 'Call Of Duty: Black Ops');
INSERT INTO Account VALUES ('Joel', 'Parman', 'JRPTox', 'JRPtox@yahoo.com', 'War Thunder');

INSERT INTO Games VALUES ('H1Z1', 'Daybreak', 'BR', 'T');
INSERT INTO Games VALUES ('Mario Party', 'Nintendo', 'Party Game', 'E');
INSERT INTO Games VALUES ('Call Of Duty: Black Ops', 'Treyarch', 'FPS', 'M');
INSERT INTO Games VALUES ('Kingdom Hearts', 'Square Enix', 'RPG', 'E');
INSERT INTO Games VALUES ('War Thunder', 'Gaijin Entertainment', 'Action', 'T');

INSERT INTO Highscore VALUES ('JRPTox', 'War Thunder', 7279);
INSERT INTO Highscore VALUES ('Zercon', 'Call Of Duty: Black Ops', 50);
INSERT INTO Highscore VALUES ('JRPTox', 'Call of Duty: Black Ops', 38);
INSERT INTO Highscore VALUES ('Ratchpatch', 'Kingdom Hearts', 254036);