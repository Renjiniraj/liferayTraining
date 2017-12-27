create table sample_Department (
	departmentid LONG not null primary key,
	deptName VARCHAR(75) null
);

create table sample_Marks (
	marksid LONG not null primary key,
	rollNo INTEGER,
	percentage INTEGER,
	userId LONG,
	groupId LONG
);

create table sample_Student (
	studentid LONG not null primary key,
	name VARCHAR(75) null,
	dept_id LONG,
	rollNo INTEGER,
	userId LONG,
	groupId LONG
);