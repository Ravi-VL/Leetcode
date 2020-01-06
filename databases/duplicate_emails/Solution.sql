/*
Duplicate Emails

Problem Statement:

Write a SQL query to find all duplicate emails in a table named Person.

	+----+---------+
	| Id | Email   |
	+----+---------+
	| 1  | a@b.com |
	| 2  | c@d.com |
	| 3  | a@b.com |
	+----+---------+

For example, your query should return the following for the above table:

	+---------+
	| Email   |
	+---------+
	| a@b.com |
	+---------+

Note: All emails are in lowercase.

*/

/*
	Difficulty Level -- Easy
*/


select distinct p1.Email 
    from Person p1, Person p2
    where p1.Email = p2.Email 
        and p1.Id != p2.Id;


