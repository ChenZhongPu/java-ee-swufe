package com.swufe.javaee.toy_music;

import com.swufe.javaee.toy_music.Utils.SongUtils;
import com.swufe.javaee.toy_music.model.Song;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdminServlet", value = "/admin")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String log = (String) session.getAttribute("admin");
        if (log != null && log.equals("log")) {
            // admin has been logged
            // read data from file
            List<Song> songs = SongUtils.loadSongs();
            request.setAttribute("songs", songs);
           request.getRequestDispatcher("admin.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("admin-login.html").forward(request, response);
        }
    }
}
