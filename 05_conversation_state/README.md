The HTTP protocol uses **stateless** connections. The client browser makes a connection to the server, sends the request, gets the response, and closes the connection. In other words, the connection exists for only a *single* request/response.

An `HttpSession` object can hold conversational state across multiple requests from the same client. In other words, it persists for an entire `session` with a specific client. We can use it to store everything we got back from the client in all the requests the client makes during a session.


# Exercise of this week
- After accessing `/hello-servlet` more than once, `Welcome back` shall be displayed. Try to delete the cookies of `localhost` in your browser, see what happens while visiting `/hello-servlet` again.
- Implement `log-out` for the simple login page.

# Optional exercise 1 of this week
Imagine there is a `HashMap` that stores the *(name -> password)* information. Please authenticate the user by this `HashMap`, and display error message such as **wrong password**, **no such user**.

# Optional exercise 2 of this week
Implement the `remember me for 1 week` in our simple login page.