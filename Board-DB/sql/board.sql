-- �Խ��� ���̺� ����
create table t_board(
    no  number(5) primary key
    , title varchar2(200) not null
    , writer varchar2(100) not null
    , reg_date date default sysdate
);

-- �Խ��� �Ϸù�ȣ ����
create sequence seq_t_board_no;