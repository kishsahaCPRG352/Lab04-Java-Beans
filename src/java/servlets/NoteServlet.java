
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;


public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String title = br.readLine();
        String contents = br.readLine();
        
        br.close(); 
        
        Note note = new Note(title, contents);
        
        request.setAttribute("note", note);
        
        String edit = request.getParameter("edit");
        
        if ((edit != null) ) {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        return;
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = "";
        String contents = "";
        // capture the parameters coming in from the POST request
        title = request.getParameter("title");
        contents = request.getParameter("contents");
        
        //System.out.println(firstname + " " + lastname);
        
        // Create a person object using the form parameters
        Note editedNote = new Note(title, contents);
        
        // Create an attribute that contains the person object
        request.setAttribute("note", editedNote);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }


}
