The HTTP protocol uses **stateless** connections. The client browser makes a connection to the server, sends the request, gets the response, and closes the connection. In other words, the connection exists for only a *single* request/response.

An `HttpSession` object can hold conversational state across multiple requests from the same client. In other words, it persists for an entire `session` with a specific client. We can use it to store everything we got back from the client in all the requests the client makes during a session.


# Exercise of this week
- (Cookie 1) After accessing `/hello-servlet` more than once, `Welcome back` shall be displayed. Try to delete the cookies of `localhost` in your browser, see what happens while visiting `/hello-servlet` again.
- (Cookie 2) By default, your browser would accept cookies, so `response.encodeURL` does not necessarily fall back to URL rewriting. Try to disable the cookies for `localhost` in your browser.
- Implement `log-out` for the simple login page.
- Imagine there is a text file that stores the *name password* information. Please authenticate the user based on this file, and display error message such as **wrong password**, **no such user**.

The hint for the last exercise: A sample text file

```
Tom abc123y
James ut$034u
```
indicates that user `Tom`'s password is `abc123y`, and user `James`'s password is `ut$034u`.

# Optional exercise of this week
Implement the `remember me for 1 week` in our simple login page.