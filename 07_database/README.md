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
**Note 1: You should update the dependency and URL above if you are using other databases (e.g., `MySQL`, `Oracle`)**.

**Note 2: The PostgreSQL in my computer is set in `trust` mode, so it is fine to connect it without password.**

## Login 1
In this project, I adopt the traditional way to create a `Connection` when initializing the application, and then store it into `Context`'s attribute.

## Login 2
In this project, I create the `Connection` through `DataSource`, which is recommended by Java EE.

```java
PGSimpleDataSource source = new PGSimpleDataSource();
source.setServerNames(new String[]{"localhost"});
source.setDatabaseName("mydb");
source.setUser("chenzhongpu");
```
Note this `datasouce` is not able to poll connections, so please check your application server or check out the excellent [jakarta commons DBCP project](http://jakarta.apache.org/commons/dbcp/).

This is how we obtain `Connection`:

```java
Connection connection = source.getConnection();
```

## Login 3
In this project, we are using the connection pool provided by our application server(i.e., `Tomcat`).

Firstly, create a `context.xml` under `webapp/META-INF`:

```xml
<?xml version='1.0' encoding='UTF-8' ?>
<Context reloadable="true">
    <Resource name="jdbc/MyDB" auth="Container" type="javax.sql.DataSource"
              maxActive="100" maxIdle="30" maxWait="10000" removeAbandoned="true"
              username="chenzhongpu" driverClassName="org.postgresql.Driver"
              url="jdbc:postgresql://localhost/mydb" />
</Context>
```
Secondly, add a ref in `web.xml`:

```xml
<resource-ref>
  <description>DB Connection Pool</description>
  <res-ref-name>jdbc/MyDB</res-ref-name>
  <res-type>javax.sql.DataSource</res-type>
  <res-auth>Container</res-auth>
  <res-sharing-scope>Shareable</res-sharing-scope>
</resource-ref>
```
Lastly, create a datasource via `JNDI`:

```java
InitialContext ctx = new InitialContext();
DataSource source = (DataSource) ctx.lookup("java:comp/env/jdbc/MyDB");
```

The method above here is container-specific, and this is because `context.xml` only works in `Tomcat`. In fact, it is possible to deploy datasource via `<data-source>` element. Read more at [is there a standard way to define a JDBC Datasource for Java EE containers?
](https://stackoverflow.com/questions/2279913).