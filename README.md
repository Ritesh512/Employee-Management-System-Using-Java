# Employee-Management-System-Using-Java
Employee Management System is a Java application, developed to maintain the details of employees working in the organization. The applicatoion maintains the information 
of employees like personal details, employee_id, etc. It is completely developed in java using MySQL database for storing the details of the employees and admin. It is 
useful for real life application for mainting the records of employees in the company. 

# Features: 
1. Login  
2. Add a new employee details in the system. 
3. Remove an employee from the system. 
4. Update the details of an employee. 

# Database Queries
create database emp;
use emp;

create table login (username varchar(100),password varchar(100));
insert into login values("ritesh","1234");
select * from login;

create table employee (name varchar(100),fname varchar(100),age varchar(100),dob varchar(100),address varchar(100),phone varchar(100),email varchar(100),education varchar(100),post varchar(100),aadhar varchar(100),emp_id varchar(100));
select * from employee;
