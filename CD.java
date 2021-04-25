package adapterDesignPattern;
/**
 * @author Austin Odell
 */
import java.util.ArrayList;
/**
 * 
 * Creates ArrayList and currentIndex
 *
 */
public class CD implements DigitalAlbum {
	public static ArrayList<String> CDList = new ArrayList<String>();
	private int currentIndex;
	/**
	 * Adds these into the ArrayList
	 * @param s1
	 * @param s2
	 * @param s3
	 * @param s4
	 * @param s5
	 */
	public CD(String s1, String s2, String s3, String s4, String s5)
	{
		CDList.add(s1);
		CDList.add(s2);
		CDList.add(s3);
		CDList.add(s4);
		CDList.add(s5);
	}
	/**
	 * Starts the CD playing at the beginning of the track
	 * @return The first song
	 */
	public String playFromBeginning()
	{
		currentIndex=1;
		currentIndex++;
		return ("Playing song 1: "+CDList.get(currentIndex-1));
	}
	/**
	 * List what song is being played
	 * @return Returns the song being played
	 */
	public String playSong(int num)
	{
		if(currentIndex == 1)
		{
			return ("Playing Song "+currentIndex + ": "+CDList.get(currentIndex-1));
		} 
		else if (currentIndex == 2)
		{
			return ("Playing Song "+currentIndex + ": "+CDList.get(currentIndex-1));
		}
		else if (currentIndex == 3)
		{
			return ("Playing Song "+currentIndex + ": "+CDList.get(currentIndex-1));
		}
		else if (currentIndex == 4)
		{
			return ("Playing Song "+currentIndex + ": "+CDList.get(currentIndex-1));
		}
		else
		{return ("Playing Song "+currentIndex + ": "+CDList.get(currentIndex-1));
			
		}
	}
	/**
	 * Goes to the next song if possible
	 * @return The next song or sets it to the beginning
	 */
	public String nextSong()
	{
		if(currentIndex != 5)
		{
			currentIndex++;
			return ("Playing: "+currentIndex+ ": "+CDList.get(currentIndex-1));
		}
		else
		{
			currentIndex = 1;
			return ("Playing: "+currentIndex+ ": "+CDList.get(currentIndex-1));
		}
	}
	/**
	 * Goes back a song.
	 * @return The previous song
	 */
	public String prevSong()
	{
		if(currentIndex != 1)
		{
			currentIndex--;
		}
		return ("Skipping back and playing: "+CDList.get(currentIndex-1));
	}
	/**
	 * Pauses the Music
	 * @return It pauses.
	 */
	public String pause()
	{
		return "Pausing:";
	}
	/**
	 * Stops the CD
	 * @return That it stops
	 */
	public String stop() {
		return "Stopping";
	}

}
