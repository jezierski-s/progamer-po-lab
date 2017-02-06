delete from user;
insert into user(id, login, mail, name) values(1,'Siva', 'siva@gmail.com', '');
insert into user(id, login, mail, name) values(2,'Prasad', 'prasad@gmail.com', '');
insert into user(id, login, mail, name) values(3,'Reddy', 'redddy@gmail.com', '');

delete from game;
insert into game(id, name, price, producer, distrib, isnew) values(1,'Assassins Creed Syndicade', '120', 'Ubisoft', 0, 1);
insert into game(id, name, price, producer, distrib, isnew) values(2,'Grand Theft Auto V', '220', 'Rockstar', 0, 1);
insert into game(id, name, price, producer, distrib, isnew) values(3,'Fifa 17', '180', 'EA Sports', 0, 1);