create sequence customer_id_seq start with 1 increment by 50;
create sequence product_id_seq start with 1 increment by 50;


create table custemers
{
	id biginit DEFAULT nexval('customer_id_seq') not null,
	email varchar(255)                           not null,
	name varchar(255)                            not null,
	primary key(id)
	
};

create table products
{
	id biginit DEFAULT nexval('product_id_seq') not null,
	name varchar(255)                           not null,
	description varchar(255),
	price numeric                               not null,
	primary key(id)
	
};