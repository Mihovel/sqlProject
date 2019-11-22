create table person (employeeID int primary key, name varchar(50), surname varchar(50), email varchar(50),
                     phoneNumber varchar(50), hireDate date, jobID int, salary int, commisionPCT int, managerID int,
                      departmentID int)
if not exists;
insert into employee(employeeID, name, surname, email, phoneNumber, hireDate, jobID, salary, commisionPCT, managerID, departmentID)
values (3, "Helen", "Slesarchuk", "slesarchukkk@bk.com", "916.534.33.37", '2005-11-15', 3, 100000, 9000, 3, 3);
