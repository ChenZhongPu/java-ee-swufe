Architecturally, JSP may be viewed as a high-level abstraction of Java servlets. JSPs are translated into servlets at runtime, therefore JSP is a Servlet; each JSP servlet is cached and re-used until the original JSP is modified. See more at [Wiki](https://en.wikipedia.org/wiki/Jakarta_Server_Pages).

Clearly, it can be troublesome to write HTML code in servlet, so traditional MVC would regard `jsp` as views, plain old java code as models, and servlets as controllers. 

# Exercise of this week
## Exercise 1
For the `BeerExpert`, we recommend a list of `Beer` objects, instead of a list of `String`, and display the details of recommended `Beer` in JSP.

An example outline of `Beer`:

```java
class Beer {
    private String band;
    private int year_of_birth;
    // ...
}
```
## Exercise 2
Deploy your web application into `war`, and then put it under `tomcat` manually.