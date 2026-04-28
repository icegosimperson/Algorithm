SELECT p.firstName as firstName, p.lastName as lastName, a.city as city, a.state as state
FROM Person p
Left Outer JOIN Address a
ON p.personId = a.personId;