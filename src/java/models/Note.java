
package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;

public class Note implements Serializable {
    private String title;
    private String contents;
    

    public Note() {
        this.title = title;
        this.contents = contents;
    }

    public Note(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
      
    
}

