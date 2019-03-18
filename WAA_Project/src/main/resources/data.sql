INSERT INTO Role (id, roleId, role_Name) VALUES (1, 'admin', 'Admin Role');
INSERT INTO Role (id, roleId, role_Name) VALUES (2, 'faculty', 'Faculty Role');
INSERT INTO Role (id, roleId, role_Name) VALUES (3, 'student', 'Student Role');

INSERT INTO User (id, username, password, active) VALUES (1, 'admin', '$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);

INSERT INTO Course (id, courseId, course_Name) VALUES (1, 'CS401', 'Modern Programming Practice');
INSERT INTO Course (id, courseId, course_Name) VALUES (2, 'CS545', 'Web Application Architecture and Framework');
INSERT INTO Course (id, courseId, course_Name) VALUES (3, 'CS525', 'Advanced Software Development');
INSERT INTO Course (id, courseId, course_Name) VALUES (4, 'CS472', 'Web Application Programming');
INSERT INTO Course (id, courseId, course_Name) VALUES (5, 'CS422', 'Database Management System');

INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (1, 'August 2018', '2018-07-23', '2018-08-16');
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (2, 'September 2018', '2018-09-03', '2018-09-27');
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (3, 'October 2018', '2018-10-01', '2018-10-25');
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (4, 'December 2018', '2018-11-26', '2018-12-20');
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (5, 'January 2019', '2019-01-14', '2018-02-07');
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (6, 'February 2019', '2019-02-11', '2018-02-21');
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (7, 'March 2019', '2019-02-25', '2018-03-15');

INSERT INTO Place (id, placeid, place_name) VALUES (1, 'DB', 'Dalby Hall');

INSERT INTO TypeTM (id, from_time, to_time, typeid, type_name) VALUES (1, '7:55:00', '9:25:00', 'EAM', 'Early morning');
INSERT INTO TypeTM (id, from_time, to_time, typeid, type_name) VALUES (2, '8:45:00', '9:15:00', 'AM', 'Morning');


