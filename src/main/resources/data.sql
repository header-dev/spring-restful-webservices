insert into user_details(id, birth_date, name)
values(10001, current_date(), 'Witz');

insert into user_details(id, birth_date, name)
values(10002, current_date(), 'Mod');

insert into user_details(id, birth_date, name)
values(10003, current_date(), 'Test');


insert into post(id, description, user_id)
values(20001,'Learn AWS with Spring boot Microservice' , 10001);

insert into post(id, description, user_id)
values(20002,'Learn Azure with Spring boot Microservice' , 10002);

insert into post(id, description, user_id)
values(20003,'Learn Laravel with AWS' , 10003);