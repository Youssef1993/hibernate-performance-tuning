
insert into author(id, name) values (1, 'Youssef ABIDI');
insert into author(id, name) values (2, 'John Wick');
insert into author(id, name) values (3, 'Vlad Mihalcea');
insert into author(id, name) values (4, 'Rod Johnson');
insert into author(id, name) values (5, 'Linus Trovalds');


insert into post (id, title, creation_date, author_id, content) values (1, 'What Is Hibernate?', '2020-12-25 22:26:31.333', 1, '1 - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin quis volutpat arcu, et interdum odio');
insert into post (id, title, creation_date, author_id, content) values (2, 'How to kill someone with a pen?', '2020-11-25 20:26:31.444', 2, '2 - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin quis volutpat arcu, et interdum odio');
insert into post (id, title, creation_date, author_id, content) values (3, 'Here, take this Hypersistence optimizer, thank me later', '2020-10-25 12:26:31.555', 3, '3 - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin quis volutpat arcu, et interdum odio');
insert into post (id, title, creation_date, author_id, content) values (4, 'Have you ever heard about EJB ? yea it''s dead ', '2020-09-25 02:26:31.666', 4, '4 - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin quis volutpat arcu, et interdum odio');
insert into post (id, title, creation_date, author_id, content) values (5, 'Richard who ? Stallman ? never heard of him!', '2020-12-25 22:26:31.333', 5, '5 - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin quis volutpat arcu, et interdum odio');
insert into post (id, title, creation_date, author_id, content) values (6, 'How about Hibernate Types', '2020-12-25 22:26:31.333', 3, '6 - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin quis volutpat arcu, et interdum odio');
insert into post (id, title, creation_date, author_id, content) values (7, 'Yea all servers are mine now', '2020-12-25 22:26:31.333', 5, '7 - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin quis volutpat arcu, et interdum odio');

insert into comment(id, content, post_id) values (1, 'First Comment', 1);
insert into comment(id, content, post_id) values (2, 'Second Comment', 2);
insert into comment(id, content, post_id) values (3, 'Third Comment', 1);
insert into comment(id, content, post_id) values (4, 'Fourth Comment', 2);
insert into comment(id, content, post_id) values (5, 'Another Comment', 3);
insert into comment(id, content, post_id) values (6, 'One more Comment', 1);
insert into comment(id, content, post_id) values (7, 'Keep going Comment', 3);
insert into comment(id, content, post_id) values (8, 'We''re close Comment', 2);
insert into comment(id, content, post_id) values (9, 'Last Comment', 1);

insert into tag(id, name, post_id) values (1, 'Java', 1);
insert into tag(id, name, post_id) values (2, 'Hibernate', 1);
insert into tag(id, name, post_id) values (3, 'JPA', 1);
insert into tag(id, name, post_id) values (4, 'SQL', 3);
insert into tag(id, name, post_id) values (5, 'Spring Boot', 4);
insert into tag(id, name, post_id) values (6, 'Guava', 5);
insert into tag(id, name, post_id) values (7, 'HazleCast', 2);


