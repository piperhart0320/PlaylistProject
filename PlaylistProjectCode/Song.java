
/**
 * Write a description of class Song here.
 *
 * @author Morgan and Piper
 * @version 1/16/24
 */
public class Song 
{
    //Fields-- what information do we want each Song to store?
    private String name;
    private String singer;
    private double duration;
    boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String name, String singer, double duration)
    {
        this.name = name;
        this.singer = singer;
        this.duration = duration;
        liked = false;
    }
     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getName()
    {
        return name;
    }
    public String getSinger()
    {
        return singer;
    }
    public double getDuration()
    {
        return duration;
    }
    public boolean isLiked()
    {
        return liked;
    }
    public void like()
    {
        liked = true;
    }
    public void unlike()
    {
        liked = false;
    }
}