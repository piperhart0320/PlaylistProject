
/**
 * Write a description of class Playlist here.
 *
 * @author Morgan and Piper
 * @version (a version number or a date)
 */
import java.util.ArrayList;
/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist 
{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */

    private ArrayList<Song> playlist;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist()
    {
        playlist = new ArrayList<Song>();
    }
      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public void addSong(String name, String singer, String duration)
    {
        playlist.add(new Song(name, singer, duration));
    }
    public void removeSong(int i)
    {
        playlist.remove(i);
    }
    public String allSongs()
    {
        String fullList = "";
        for (int i = 0; i < playlist.size(); i++)
        {
            fullList += playlist.get(i).getName() + " by ";
            fullList += playlist.get(i).getSinger() + " ("; 
            fullList += playlist.get(i).getDuration() + ") \r\n"; 

        }

        return fullList;
    }
    public String allLikedSongs()
    {
        String likednames = "";
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).isLiked());
            {
                likednames += playlist.get(i).getName() + " by ";
                likednames += playlist.get(i).getSinger() + " ("; 
                likednames += playlist.get(i).getDuration() + ") "; 
            }
        }
        return likednames;
    }
    public int duration()
    {
        int duration = 0;
        for (int i = 0; i < playlist.size(); i++)
        {
            duration += playlist.get(i).calcDuration();
        }
        return duration;
    }
    public void likeSong(int i)
    {
        playlist.get(i).like();
    }
    public void removedUnliked()
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (!playlist.get(i).isLiked());
            {
                playlist.remove(i);
            }
        }
    }
    
}
