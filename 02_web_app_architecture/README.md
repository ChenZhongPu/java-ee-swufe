Servlets don't have a `main()` method. They're under the control of another Java application called a [Container](https://en.wikipedia.org/wiki/Web_container). Starting from `servlet 3.0`, it is recommended to use `annotations` instead of `DD` to specify the mapping of servlets. When designing a web application, always keep `MVC` in mind.

# Useful link
- [Tomcat 9.0 Doc: Servlet API](https://tomcat.apache.org/tomcat-9.0-doc/servletapi/index.html)

# Optional exercise of this week
- Try to deploy `Tomcat` and [NGINX](https://www.nginx.com/) to achieve performance load balance.