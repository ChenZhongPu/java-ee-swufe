> A REST API (also known as RESTful API) is an application programming interface (API or web API) that conforms to the constraints of REST architectural style and allows for interaction with RESTful web services. REST stands for representational state transfer and was created by computer scientist Roy Fielding.

Jakarta EE also provides RESTful Web Services, which can help developes design reliable HTTP APIs.

Note that `Tomcat` don't have built-in RESTful Web Services, so it is recommended to use [GlassFish](https://glassfish.org/download) instead. In this demo project, we choose latest `GlassFish 6.1.0` with `Jakarta EE 9` specification.


For web development, currently people would like to separate front and back ends totally, so it is advised to adopt `JSON` as the main data format transferred back and forth. What is more, for mobile devices (e.g., iOS and Android), what we need is a `request-response` model, and `RESTful Web Services` can make it simpler.