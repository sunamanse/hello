create table user_login(id varchar2(10),
                        passwd varchar2(30),
                        name varchar2(50));

alter table user_login add constraint user_login_pk PRIMARY key(id);                        
 
 create table boards(  board_no number not null,
                      title     varchar2(100) not null,
                      contents  varchar2(300) not null,
                      writer    varchar2(10) not null,
                      creation_date date,
                      orig_no   number);
                      
alter table boards add constraint board_pk PRIMARY key(board_no);     