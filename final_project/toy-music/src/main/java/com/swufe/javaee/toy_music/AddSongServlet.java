package com.swufe.javaee.toy_music;

import com.swufe.javaee.toy_music.Utils.SongUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddSongServlet", value = "/add-song")
public class AddSongServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       HttpSession session = request.getSession();
       String log = (String) session.getAttribute("admin");
       if (log != null && log.equals("log")) {
           request.getRequestDispatcher("add-song.html").forward(request, response);
       } else {
           response.sendRedirect("admin-login.html");
           return;
       }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int songID = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title").trim();
        String singer = request.getParameter("singer").trim();
        String image = request.getParameter("image").trim();
        String description = request.getParameter("description").trim();
        SongUtils.addSong(songID, title, singer, image, description);
        System.out.println("add a song");
        // Hint: what if error when adding?
        response.sendRedirect("add-success.html");
        return;
    }
}
