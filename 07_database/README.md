Database is one of the most important courses of Computer Science, and it is also essential to web development. 

# Useful links
- [SQL Tutorial](https://www.w3schools.com/sql/default.asp)


# A Demo For Login Using SQL
Firstly, we prepared the data in a database called `mydb`, and then create a table `users`.

```sql
CREATE TABLE users (
  name varchar(80),
  pwd varchar(80)
);

INSERT INTO users VALUES ('zhongpu', '123456');
INSERT INTO users VALUES ('bob', '654321');
```

I am using `PostgreSQL` in my computer, so add this into `pom.xml`:
```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.2.23</version>
</dependency>
```
The connection String is:
```java
"jdbc:postgresql://localhost/mydb?user=chenzhongpu"
```
You should update the dependency and URL above if you are using other databases (e.g., `MySQL`, `Oracle`).

## Login 1
In this project, I adopt the traditional way to create a `Connection` when initializing the application, and then store it into `Context`'s attribute.

## Login 2
In this project, I crate the `Connection` through `DataSource`, which is recommended by Java EE.

```java
source = new PGSimpleDataSource();
source.setServerNames(new String[]{"localhost"});
source.setDatabaseName("mydb");
source.setUser("chenzhongpu");
```
Note this `datasouce` is not able to poll connections, so please use Check your application server or check out the excellent [jakarta commons DBCP project](http://jakarta.apache.org/commons/dbcp/).