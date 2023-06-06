package ObjectAndClasses_Ex.Articles.Articles;

public class Article {
    //Poleta (Harakteristikite)
    private String title;
    private String content;
    private String author;


    //Metodi (Deistviqta)

    //Konstruktor

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //metod za zadavane na nova stoinost na content (Edit)
    public void setContent(String newContent) {
        this.content = newContent;
    }
    // metod za zadavavane na nova stoinost na poloeto Avtor (change)

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    // zadavane na nova stoinost na poleto Title

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }


    @Override
    public String toString() {
       return this.title + " - " + this.content + ": " + this.author;

    }
}
