/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava.articulos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author japar
 */
public class Article {
    Date published;
    String author;
    String title;
    List<String> tags;

    public Article(Date published, String author, String title) {
        this(published, author,title,new ArrayList<String>());
    }

    public Article(Date published, String author, String title, List<String> tags) {
        this.published = published;
        this.author = author;
        this.title = title;
        this.tags = tags;
    }
    
    

    public String getAuthor() {
        return author;
    }

    public Date getPublished() {
        return published;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return author+" '"+title+"'";
    }
    
    
    
}
