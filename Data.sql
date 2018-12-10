
CREATE TABLE Account
(
    fname character varying(10),
    lname character varying(15),
    gamertag character varying(15),
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
    score integer NOT NULL
);

INSERT INTO Account VALUES ('Pen', 'Raines', 'Pentogood', 'PTGood92@email.com', 'Halo 3');
INSERT INTO Account VALUES ('Dexter', 'Tash', 'DexterT2235', 'TashDe@email.com', 'PacMan');
INSERT INTO Account VALUES ('Earle', 'Dabney', 'EDab72', 'EarleDabney@email.com', 'Tertis');
INSERT INTO Account VALUES ('Lawrence', 'Doctor', 'LawDoc', 'DoctL@email.com', 'Super Mario Bros');
INSERT INTO Account VALUES ('Ralf', 'Weaver', 'WeavR', 'weavr@email.com', 'H1Z1');
INSERT INTO Account VALUES ('Truman', 'Michael', 'Mr. Trum', 'MichealTru@email.com', 'Kingdom Hearts');
INSERT INTO Account VALUES ('Aileen', 'Blackwood', 'BWood2001', 'aibwood@email.com', 'Call of Duty: Black Ops');
INSERT INTO Account VALUES ('Shel', 'Trengove', 'GoveShel', 'sheltrengove@email.com', 'Mario Party');
INSERT INTO Account VALUES ('Miles', 'Love', 'MLove', 'mlove23@email.com', 'War Thunder');
INSERT INTO Account VALUES ('Giffard', 'Long', 'GiffyL22', 'giffL22@email.com', 'Kingdom Hearts');
INSERT INTO Account VALUES ('Kandi', 'Sinclair', 'KSincK', 'sinck@email.com', 'Geometry Wars 3'); 
INSERT INTO Account VALUES ('Janessa', 'Cartwright', 'JaneC', 'cartwrightJ@email.com', 'Tertis');
INSERT INTO Account VALUES ('Madeleine', 'Bates', 'MBates', 'bates@email.com', 'PacMan');
INSERT INTO Account VALUES ('Wes', 'Gibson', 'Gibs', 'WesGibson@email.com', 'Super Mario Bros');
INSERT INTO Account VALUES ('Darian', 'Nicholson', 'Nickles son', 'DarianNick@email.com', 'Geometry Wars 3');


INSERT INTO Games VALUES ('H1Z1', 'Daybreak', 'BR', 'T');
INSERT INTO Games VALUES ('Sonic the hedgehog', 'Sega', 'Platformer', 'E');
INSERT INTO Games VALUES ('Call Of Duty: Black Ops', 'Treyarch', 'FPS', 'M');
INSERT INTO Games VALUES ('Kingdom Hearts', 'Square Enix', 'RPG', 'E');
INSERT INTO Games VALUES ('War Thunder', 'Gaijin Entertainment', 'Action', 'T');
INSERT INTO Games VALUES ('Geometry Wars 3', 'Lucid Games Limited', 'MultdirShooting', 'E');
INSERT INTO Games VALUES ('Halo 3', 'Bungie', 'FPS', 'M');
INSERT INTO Games VALUES ('Super Mario Bros', 'Nintendo', 'Platformer', 'E');
INSERT INTO Games VALUES ('PacMan', 'Namco', 'Arcade', 'E');
INSERT INTO Games VALUES ('Tetris', 'Various', 'Puzzle', 'E');


INSERT INTO Highscore VALUES ('Pentogood', 'Halo 3', '47237');
INSERT INTO Highscore VALUES ('DexterT2235', 'PacMan', '930450');
INSERT INTO Highscore VALUES ('EDab72', 'Tetris', '539200');
INSERT INTO Highscore VALUES ('LawDoc', 'Super Mario Bros', '765000');
INSERT INTO Highscore VALUES ('WeavR', 'H1Z1', '45');
INSERT INTO Highscore VALUES ('Mr. Trum', 'Kingdom Hearts', '238500');
INSERT INTO Highscore VALUES ('BWood2001', 'Call of Duty: Black Ops', '55');
INSERT INTO Highscore VALUES ('GoveShel', 'Sonic The Hedgehog', '654090');
INSERT INTO Highscore VALUES ('MLove', 'War Thunder', '23456');
INSERT INTO Highscore VALUES ('GiffyL22', 'Kingdom Hearts', '245900');
INSERT INTO Highscore VALUES ('KSincK', 'Geometry Wars 3', '49206350'); 
INSERT INTO Highscore VALUES ('JaneC', 'H1Z1', '123');
INSERT INTO Highscore VALUES ('MBates', 'PacMan', '897364');
INSERT INTO Highscore VALUES ('Gibs', 'Super Mario Bros', '876400');
INSERT INTO Highscore VALUES ('Nickles son', 'Geometry Wars 3', '31203175');