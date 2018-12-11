CREATE TABLE todotable (
  status ENUM ("complete","incomplete") not null,
  id int  not null AUTO_Increment, 
  duedate DATE,
  task VARCHAR(255),
  primary key (id)
);

INSERT INTO todo_table (status, date, task) VALUES ();