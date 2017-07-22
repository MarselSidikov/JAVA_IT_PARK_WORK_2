create table auto
(
  id IDENTITY,
  model varchar(100),
  color varchar(100),
  owner_id INTEGER,
  FOREIGN KEY (owner_id) references human(id)
);