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
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (4, 'November 2018', '2018-10-29', '2018-11-22');
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (5, 'December 2018', '2018-11-26', '2018-12-20');
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (6, 'January 2019', '2019-01-14', '2018-02-07');
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (7, 'February 2019', '2019-02-11', '2018-02-21');
INSERT INTO Block (id, block_Name, begin_Date, end_Date) VALUES (8, 'March 2019', '2019-02-25', '2018-03-21');

INSERT INTO block_session (id, block_ID, session) VALUES (1, 1, '2018-07-23');
INSERT INTO block_session (id, block_ID, session) VALUES (2, 1, '2018-07-24');
INSERT INTO block_session (id, block_ID, session) VALUES (3, 1, '2018-07-25');
INSERT INTO block_session (id, block_ID, session) VALUES (4, 1, '2018-07-26');
INSERT INTO block_session (id, block_ID, session) VALUES (5, 1, '2018-07-27');
INSERT INTO block_session (id, block_ID, session) VALUES (6, 1, '2018-07-28');
INSERT INTO block_session (id, block_ID, session) VALUES (7, 1, '2018-07-30');
INSERT INTO block_session (id, block_ID, session) VALUES (8, 1, '2018-07-31');
INSERT INTO block_session (id, block_ID, session) VALUES (9, 1, '2018-08-01');
INSERT INTO block_session (id, block_ID, session) VALUES (10, 1, '2018-08-02');
INSERT INTO block_session (id, block_ID, session) VALUES (11, 1, '2018-08-03');
INSERT INTO block_session (id, block_ID, session) VALUES (12, 1, '2018-08-05');
INSERT INTO block_session (id, block_ID, session) VALUES (13, 1, '2018-08-06');
INSERT INTO block_session (id, block_ID, session) VALUES (14, 1, '2018-08-07');
INSERT INTO block_session (id, block_ID, session) VALUES (15, 1, '2018-08-08');
INSERT INTO block_session (id, block_ID, session) VALUES (16, 1, '2018-08-09');
INSERT INTO block_session (id, block_ID, session) VALUES (17, 1, '2018-08-10');
INSERT INTO block_session (id, block_ID, session) VALUES (18, 1, '2018-08-12');
INSERT INTO block_session (id, block_ID, session) VALUES (19, 1, '2018-08-13');
INSERT INTO block_session (id, block_ID, session) VALUES (20, 1, '2018-08-14');
INSERT INTO block_session (id, block_ID, session) VALUES (21, 1, '2018-08-15');
INSERT INTO block_session (id, block_ID, session) VALUES (22, 1, '2018-08-16');

INSERT INTO block_session (id, block_ID, session) VALUES (23, 2, '2018-09-03');
INSERT INTO block_session (id, block_ID, session) VALUES (24, 2, '2018-09-04');
INSERT INTO block_session (id, block_ID, session) VALUES (25, 2, '2018-09-05');
INSERT INTO block_session (id, block_ID, session) VALUES (26, 2, '2018-09-06');
INSERT INTO block_session (id, block_ID, session) VALUES (27, 2, '2018-09-07');
INSERT INTO block_session (id, block_ID, session) VALUES (28, 2, '2018-09-08');
INSERT INTO block_session (id, block_ID, session) VALUES (29, 2, '2018-09-10');
INSERT INTO block_session (id, block_ID, session) VALUES (30, 2, '2018-09-11');
INSERT INTO block_session (id, block_ID, session) VALUES (31, 2, '2018-09-12');
INSERT INTO block_session (id, block_ID, session) VALUES (32, 2, '2018-09-13');
INSERT INTO block_session (id, block_ID, session) VALUES (33, 2, '2018-09-14');
INSERT INTO block_session (id, block_ID, session) VALUES (34, 2, '2018-09-15');
INSERT INTO block_session (id, block_ID, session) VALUES (35, 2, '2018-09-17');
INSERT INTO block_session (id, block_ID, session) VALUES (36, 2, '2018-09-18');
INSERT INTO block_session (id, block_ID, session) VALUES (37, 2, '2018-09-19');
INSERT INTO block_session (id, block_ID, session) VALUES (38, 2, '2018-09-20');
INSERT INTO block_session (id, block_ID, session) VALUES (39, 2, '2018-09-21');
INSERT INTO block_session (id, block_ID, session) VALUES (40, 2, '2018-09-22');
INSERT INTO block_session (id, block_ID, session) VALUES (41, 2, '2018-09-24');
INSERT INTO block_session (id, block_ID, session) VALUES (42, 2, '2018-09-25');
INSERT INTO block_session (id, block_ID, session) VALUES (43, 2, '2018-09-26');
INSERT INTO block_session (id, block_ID, session) VALUES (44, 2, '2018-09-27');

INSERT INTO block_session (id, block_ID, session) VALUES (45, 3, '2018-10-01');
INSERT INTO block_session (id, block_ID, session) VALUES (46, 3, '2018-10-02');
INSERT INTO block_session (id, block_ID, session) VALUES (47, 3, '2018-10-03');
INSERT INTO block_session (id, block_ID, session) VALUES (48, 3, '2018-10-04');
INSERT INTO block_session (id, block_ID, session) VALUES (49, 3, '2018-10-05');
INSERT INTO block_session (id, block_ID, session) VALUES (50, 3, '2018-10-06');
INSERT INTO block_session (id, block_ID, session) VALUES (51, 3, '2018-10-08');
INSERT INTO block_session (id, block_ID, session) VALUES (52, 3, '2018-10-09');
INSERT INTO block_session (id, block_ID, session) VALUES (53, 3, '2018-10-10');
INSERT INTO block_session (id, block_ID, session) VALUES (54, 3, '2018-10-11');
INSERT INTO block_session (id, block_ID, session) VALUES (55, 3, '2018-10-12');
INSERT INTO block_session (id, block_ID, session) VALUES (56, 3, '2018-10-13');
INSERT INTO block_session (id, block_ID, session) VALUES (57, 3, '2018-10-15');
INSERT INTO block_session (id, block_ID, session) VALUES (58, 3, '2018-10-16');
INSERT INTO block_session (id, block_ID, session) VALUES (59, 3, '2018-10-17');
INSERT INTO block_session (id, block_ID, session) VALUES (60, 3, '2018-10-18');
INSERT INTO block_session (id, block_ID, session) VALUES (61, 3, '2018-10-19');
INSERT INTO block_session (id, block_ID, session) VALUES (62, 3, '2018-10-20');
INSERT INTO block_session (id, block_ID, session) VALUES (63, 3, '2018-10-22');
INSERT INTO block_session (id, block_ID, session) VALUES (64, 3, '2018-10-23');
INSERT INTO block_session (id, block_ID, session) VALUES (65, 3, '2018-10-24');
INSERT INTO block_session (id, block_ID, session) VALUES (66, 3, '2018-10-25');

INSERT INTO block_session (id, block_ID, session) VALUES (67, 4, '2018-10-29');
INSERT INTO block_session (id, block_ID, session) VALUES (68, 4, '2018-10-30');
INSERT INTO block_session (id, block_ID, session) VALUES (69, 4, '2018-10-31');
INSERT INTO block_session (id, block_ID, session) VALUES (70, 4, '2018-11-01');
INSERT INTO block_session (id, block_ID, session) VALUES (71, 4, '2018-11-02');
INSERT INTO block_session (id, block_ID, session) VALUES (72, 4, '2018-11-03');
INSERT INTO block_session (id, block_ID, session) VALUES (73, 4, '2018-11-05');
INSERT INTO block_session (id, block_ID, session) VALUES (74, 4, '2018-11-06');
INSERT INTO block_session (id, block_ID, session) VALUES (75, 4, '2018-11-07');
INSERT INTO block_session (id, block_ID, session) VALUES (76, 4, '2018-11-08');
INSERT INTO block_session (id, block_ID, session) VALUES (77, 4, '2018-11-09');
INSERT INTO block_session (id, block_ID, session) VALUES (78, 4, '2018-11-10');
INSERT INTO block_session (id, block_ID, session) VALUES (79, 4, '2018-11-12');
INSERT INTO block_session (id, block_ID, session) VALUES (80, 4, '2018-11-13');
INSERT INTO block_session (id, block_ID, session) VALUES (81, 4, '2018-11-14');
INSERT INTO block_session (id, block_ID, session) VALUES (82, 4, '2018-11-15');
INSERT INTO block_session (id, block_ID, session) VALUES (83, 4, '2018-11-16');
INSERT INTO block_session (id, block_ID, session) VALUES (84, 4, '2018-11-17');
INSERT INTO block_session (id, block_ID, session) VALUES (85, 4, '2018-11-19');
INSERT INTO block_session (id, block_ID, session) VALUES (86, 4, '2018-11-20');
INSERT INTO block_session (id, block_ID, session) VALUES (87, 4, '2018-11-21');
INSERT INTO block_session (id, block_ID, session) VALUES (88, 4, '2018-11-22');

INSERT INTO block_session (id, block_ID, session) VALUES (89, 5, '2018-11-26');
INSERT INTO block_session (id, block_ID, session) VALUES (90, 5, '2018-11-27');
INSERT INTO block_session (id, block_ID, session) VALUES (91, 5, '2018-11-28');
INSERT INTO block_session (id, block_ID, session) VALUES (92, 5, '2018-11-29');
INSERT INTO block_session (id, block_ID, session) VALUES (93, 5, '2018-11-30');
INSERT INTO block_session (id, block_ID, session) VALUES (94, 5, '2018-12-01');
INSERT INTO block_session (id, block_ID, session) VALUES (95, 5, '2018-12-03');
INSERT INTO block_session (id, block_ID, session) VALUES (96, 5, '2018-12-04');
INSERT INTO block_session (id, block_ID, session) VALUES (97, 5, '2018-12-05');
INSERT INTO block_session (id, block_ID, session) VALUES (98, 5, '2018-12-06');
INSERT INTO block_session (id, block_ID, session) VALUES (99, 5, '2018-12-07');
INSERT INTO block_session (id, block_ID, session) VALUES (100, 5, '2018-12-08');
INSERT INTO block_session (id, block_ID, session) VALUES (101, 5, '2018-12-10');
INSERT INTO block_session (id, block_ID, session) VALUES (102, 5, '2018-12-11');
INSERT INTO block_session (id, block_ID, session) VALUES (103, 5, '2018-12-12');
INSERT INTO block_session (id, block_ID, session) VALUES (104, 5, '2018-12-13');
INSERT INTO block_session (id, block_ID, session) VALUES (105, 5, '2018-12-14');
INSERT INTO block_session (id, block_ID, session) VALUES (106, 5, '2018-12-15');
INSERT INTO block_session (id, block_ID, session) VALUES (107, 5, '2018-12-17');
INSERT INTO block_session (id, block_ID, session) VALUES (108, 5, '2018-12-18');
INSERT INTO block_session (id, block_ID, session) VALUES (109, 5, '2018-12-19');
INSERT INTO block_session (id, block_ID, session) VALUES (110, 5, '2018-12-20');

INSERT INTO block_session (id, block_ID, session) VALUES (111, 6, '2019-01-14');
INSERT INTO block_session (id, block_ID, session) VALUES (112, 6, '2019-01-15');
INSERT INTO block_session (id, block_ID, session) VALUES (113, 6, '2019-01-16');
INSERT INTO block_session (id, block_ID, session) VALUES (114, 6, '2019-01-17');
INSERT INTO block_session (id, block_ID, session) VALUES (115, 6, '2019-01-18');
INSERT INTO block_session (id, block_ID, session) VALUES (116, 6, '2019-01-19');
INSERT INTO block_session (id, block_ID, session) VALUES (117, 6, '2019-01-21');
INSERT INTO block_session (id, block_ID, session) VALUES (118, 6, '2019-01-22');
INSERT INTO block_session (id, block_ID, session) VALUES (119, 6, '2019-01-23');
INSERT INTO block_session (id, block_ID, session) VALUES (120, 6, '2019-01-24');
INSERT INTO block_session (id, block_ID, session) VALUES (121, 6, '2019-01-25');
INSERT INTO block_session (id, block_ID, session) VALUES (122, 6, '2019-01-26');
INSERT INTO block_session (id, block_ID, session) VALUES (123, 6, '2019-01-28');
INSERT INTO block_session (id, block_ID, session) VALUES (124, 6, '2019-01-29');
INSERT INTO block_session (id, block_ID, session) VALUES (125, 6, '2019-01-30');
INSERT INTO block_session (id, block_ID, session) VALUES (126, 6, '2019-01-31');
INSERT INTO block_session (id, block_ID, session) VALUES (127, 6, '2019-02-01');
INSERT INTO block_session (id, block_ID, session) VALUES (128, 6, '2019-02-02');
INSERT INTO block_session (id, block_ID, session) VALUES (129, 6, '2019-02-04');
INSERT INTO block_session (id, block_ID, session) VALUES (130, 6, '2019-02-05');
INSERT INTO block_session (id, block_ID, session) VALUES (131, 6, '2019-02-06');
INSERT INTO block_session (id, block_ID, session) VALUES (132, 6, '2019-02-07');

INSERT INTO block_session (id, block_ID, session) VALUES (133, 7, '2019-02-11');
INSERT INTO block_session (id, block_ID, session) VALUES (134, 7, '2019-02-12');
INSERT INTO block_session (id, block_ID, session) VALUES (135, 7, '2019-02-13');
INSERT INTO block_session (id, block_ID, session) VALUES (136, 7, '2019-02-14');
INSERT INTO block_session (id, block_ID, session) VALUES (137, 7, '2019-02-15');
INSERT INTO block_session (id, block_ID, session) VALUES (138, 7, '2019-02-16');
INSERT INTO block_session (id, block_ID, session) VALUES (139, 7, '2019-02-18');
INSERT INTO block_session (id, block_ID, session) VALUES (140, 7, '2019-02-20');
INSERT INTO block_session (id, block_ID, session) VALUES (141, 7, '2019-02-21');

INSERT INTO block_session (id, block_ID, session) VALUES (142, 8, '2019-02-25');
INSERT INTO block_session (id, block_ID, session) VALUES (143, 8, '2019-02-26');
INSERT INTO block_session (id, block_ID, session) VALUES (144, 8, '2019-02-27');
INSERT INTO block_session (id, block_ID, session) VALUES (145, 8, '2019-02-28');
INSERT INTO block_session (id, block_ID, session) VALUES (146, 8, '2019-03-01');
INSERT INTO block_session (id, block_ID, session) VALUES (147, 8, '2019-03-02');
INSERT INTO block_session (id, block_ID, session) VALUES (148, 8, '2019-03-04');
INSERT INTO block_session (id, block_ID, session) VALUES (149, 8, '2019-03-05');
INSERT INTO block_session (id, block_ID, session) VALUES (150, 8, '2019-03-06');
INSERT INTO block_session (id, block_ID, session) VALUES (151, 8, '2019-03-07');
INSERT INTO block_session (id, block_ID, session) VALUES (152, 8, '2019-03-08');
INSERT INTO block_session (id, block_ID, session) VALUES (153, 8, '2019-03-09');
INSERT INTO block_session (id, block_ID, session) VALUES (154, 8, '2019-03-11');
INSERT INTO block_session (id, block_ID, session) VALUES (155, 8, '2019-03-12');
INSERT INTO block_session (id, block_ID, session) VALUES (156, 8, '2019-03-13');
INSERT INTO block_session (id, block_ID, session) VALUES (157, 8, '2019-03-14');
INSERT INTO block_session (id, block_ID, session) VALUES (158, 8, '2019-03-15');
INSERT INTO block_session (id, block_ID, session) VALUES (159, 8, '2019-03-16');
INSERT INTO block_session (id, block_ID, session) VALUES (160, 8, '2019-03-18');
INSERT INTO block_session (id, block_ID, session) VALUES (161, 8, '2019-03-19');
INSERT INTO block_session (id, block_ID, session) VALUES (162, 8, '2019-03-20');
INSERT INTO block_session (id, block_ID, session) VALUES (163, 8, '2019-03-21');

INSERT INTO Place (id, placeid, place_name) VALUES (1, 'DB', 'Dalby Hall');
INSERT INTO Place (id, placeid, place_name) VALUES (2, 'HH', 'Women Dorm');

INSERT INTO TypeTM (id, from_time, to_time, typeid, type_name) VALUES (1, '7:55:00', '9:25:00', 'EAM', 'Early morning');
INSERT INTO TypeTM (id, from_time, to_time, typeid, type_name) VALUES (2, '8:45:00', '9:15:00', 'AM', 'Morning');
INSERT INTO TypeTM (id, from_time, to_time, typeid, type_name) VALUES (3, '13:30:00', '15:00:00', 'DC', 'DC');

INSERT INTO Person (dtype, id, bar_code, first_Name, last_Name, birthDay, gender, entry_date, studentId, facultyId) VALUES ('student', 1, '123456', 'Thao', 'Dao', '1991-09-10', 'F', '2018-08-08', '986640', null);
INSERT INTO Person (dtype, id, bar_code, first_Name, last_Name, birthDay, gender, entry_date, studentId, facultyId) VALUES ('student', 2, '123457', 'Trinh', 'Nguyen', '1988-12-14', 'M', '2018-08-08', '986641', null);
INSERT INTO Person (dtype, id, bar_code, first_Name, last_Name, birthDay, gender, entry_date, studentId, facultyId) VALUES ('student', 3, '123458', 'Dang', 'Nguyen', '1985-09-10', 'F', '2018-08-08', '986642', null);

INSERT INTO Person (dtype, id, bar_code, first_Name, last_Name, birthDay, gender, entry_date, studentId, facultyId) VALUES ('faculty', 4, '123459', '', 'Guthrie', null, 'F', null, null, '1001');
INSERT INTO Person (dtype, id, bar_code, first_Name, last_Name, birthDay, gender, entry_date, studentId, facultyId) VALUES ('faculty', 5, '123460', '', 'Shrestha', null, 'F', null, null, '1002');
INSERT INTO Person (dtype, id, bar_code, first_Name, last_Name, birthDay, gender, entry_date, studentId, facultyId) VALUES ('faculty', 6, '123461', '', 'Xing', null, 'F', null, null, '1003');

