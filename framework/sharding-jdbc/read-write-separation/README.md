# 数据库脚本

```mysql
CREATE DATABASE testdb DEFAULT CHARACTER SET utf8mb4 COLLATE utf8_general_ci;

USE testdb;

CREATE TABLE test_table (
`id` INT(11) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(20) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

# 官网地址