create table class_room
(
    class_name    varchar(255) null,
    id_class      int auto_increment
        primary key,
    number_member int          null
);


create table student
(
    id         int auto_increment
        primary key,
    email      varchar(64)  null,
    first_name varchar(255) null,
    id_class   int          null,
    last_name  varchar(255) null,
    constraint student_class_room_id_class_fk
        foreign key (id_class) references class_room (id_class)
);

create table subject
(
    code   varchar(10) charset utf8mb3 not null
        primary key,
    name   varchar(50) charset utf8mb3 not null,
    credit int                         null
);

create table subject_student
(
    id           int auto_increment
        primary key,
    subject_code varchar(10) charset utf8mb3 null,
    student_id   int                         null,
    constraint subject_student_fk_student_id
        foreign key (student_id) references student (id),
    constraint subject_student_fk_subject_code
        foreign key (subject_code) references subject (code)
);
