-- USE SpringTraining;
CREATE DATABASE spring_training;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(45),
  last_name VARCHAR(45),
  email VARCHAR(45)
);

INSERT INTO student (first_name, last_name, email) VALUES
  ('John', 'Doe', 'johndoe@example.com'),
  ('Jane', 'Doe', 'janedoe@example.com'),
  ('Bob', 'Smith', 'bobsmith@example.com');
