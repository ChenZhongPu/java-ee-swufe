A JSP becomes a servlet. The Container looks at your JSP, translates it into Java source code, and complies it into a full-fledged Java servlet class. There are mainly six different types of elements in a JSP:
- scriptlets
- directives
- declarations
- Java expressions
- EL expression 
- actions

And `EL` is the most important one.

Note: in modern web apps, JSP is **NOT** a preferred template engine any more, and you may use other elegant alternatives such as [Thymeleaf](https://www.thymeleaf.org/).

The several reasons that you **still** learn JSP:
- Help you to maintain legacy codes.
- Help you to understand what a good template engine is. 

# Useful links
- [EL](https://stackoverflow.com/tags/el/info)
- [What is Java Bean](https://stackoverflow.com/questions/3295496)
- [include directive, jsp include action](https://stackoverflow.com/questions/7879906/)
- [Maven: JSTL (Chinese)](https://feitu.github.io/2016/11/26/servlet_jsp_jstl_el_maven/)

# Exercise of this week
- Modify `HobbyServlet.java` so that each person can have several hobbies.
- Add a beautiful `nav bar` for `hobbyResult.jsp` by `include directive` or `jsp include action`.
- Refactor the *for loop* using `JSTL` for `hobbyResult.jsp`.