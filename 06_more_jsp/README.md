A JSP becomes a servlet. The Container looks at your JSP, translates it into Java source code, and complies it into a full-fledged Java servlet class. There are mainly six different types of elements in a JSP:
- scriptlets
- directives
- declarations
- Java expressions
- EL expression 
- actions

Note: in modern web apps, JSP is **NOT** a preferred template engine any more, and you may use other elegant alternatives such as [Thymeleaf](https://www.thymeleaf.org/).

The several reasons that you **still** learn JSP:
- Help you to maintain legacy codes.
- Help you to understand what a good template engine is. 


# Exercise of this week
- Modify `HobbyServlet.java` so that each person can have serval hobbies.