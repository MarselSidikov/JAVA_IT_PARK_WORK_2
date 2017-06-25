create table auto
(
	id serial primary key,
	model varchar(100),
	color varchar(100),
	owner_id integer references human(id)
);

