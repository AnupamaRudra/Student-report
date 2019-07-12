drop DATABASE IF EXISTS `rest`;
CREATE DATABASE IF NOT EXISTS `rest`;
use `rest`;

CREATE table student (
  id int(10) primary key not null,
  name varchar(128) unique key not null,
  maths int(3) not null
  physics int(3) not null
  chemistry int(3) not null
  total int(3) not null
  
) ENGINE =InnoDB DEFAULT CHARSET=utf8;
