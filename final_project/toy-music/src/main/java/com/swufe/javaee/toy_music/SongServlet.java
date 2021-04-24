package com.swufe.javaee.toy_music;

import com.swufe.javaee.toy_music.Utils.SongUtils;
import com.swufe.javaee.toy_music.model.Song;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SongServlet", value = "/song")
public class SongServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        int i = 0;
        try {
           i = Integer.parseInt(request.getParameter("id"));
           // Hint: what if this id is not found?
            Song song = SongUtils.getSongByID(i);
            request.setAttribute("song", song);
            request.getRequestDispatcher("song.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            // Hint: is it better to show a 404 page?
           request.getRequestDispatcher("/") .forward(request, response);
        }
    }
}
