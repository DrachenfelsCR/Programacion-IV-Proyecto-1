drop database Proyecto1;
CREATE DATABASE Proyecto1;
use Proyecto1;



create table Usuario (
       id  varchar(10)  not null,
       clave varchar(20) not null,
       rol varchar(10) not null check(rol in('ADMIN',"Student","Professor")),
       email varchar(20),
       telefono varchar(8),
       user_name varchar(20),
       Primary Key (id)         
     );


     
create table Course(
	id varchar(10),
    nameC varchar(20) not null,
	discount bool,
    price double,
    Primary Key(id)
    
);
create table Student_course ( 
    student_id varchar(10),
    course_id varchar(10),
	grade double,
    Primary Key (student_id,course_id)
);
create table GroupC ( 
    id varchar(10),
    id_course varchar(10),
    schedules varchar(25),
    Primary Key (id)
);

create table Group_students ( 
   student_id varchar(10),
   groupc_id varchar(10),
   rol varchar(10) check(rol in("Student")),
    Primary Key (student_id,groupc_id)
);

create table Group_professor ( 
   professor_id varchar(10),
   groupc_id varchar(10),
   rol varchar(10) check(rol in("Professor")),
    Primary Key (professor_id, groupc_id)
);
create table specialties(
	name_spc varchar(20),
    id_number int,
	Primary key(name_spc)
);
create table Professor_spc(
id_professor varchar(10),
idname_spc varchar(20),
Primary key(id_professor,idname_spc)
);

ALTER TABLE Student_course ADD Foreign Key (student_id) REFERENCES Usuario(id);
ALTER TABLE Student_course ADD Foreign Key (course_id) REFERENCES Course(id);
ALTER TABLE GroupC ADD Foreign Key (id_course) REFERENCES Course(id);
ALTER TABLE Group_students ADD Foreign Key(student_id) REFERENCES Usuario(id);
ALTER TABLE Group_students ADD Foreign Key(groupc_id) REFERENCES GroupC(id);
ALTER TABLE Group_professor ADD Foreign Key(professor_id) REFERENCES Usuario(id);
ALTER TABLE Group_professor ADD Foreign Key(groupc_id) REFERENCES GroupC(id);