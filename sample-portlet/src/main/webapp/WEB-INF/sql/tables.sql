create table sample_Employee (
	empId LONG not null primary key,
	employeeName VARCHAR(75) null,
	age INTEGER,
	salary LONG,
	fileEntryId LONG,
	unit VARCHAR(75) null
);

create table sample_Foo (
	uuid_ VARCHAR(75) null,
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);

create table sample_Student (
	studentid LONG not null primary key,
	fname VARCHAR(75) null,
	lname VARCHAR(75) null,
	age INTEGER,
	branch VARCHAR(75) null,
	email VARCHAR(75) null
);