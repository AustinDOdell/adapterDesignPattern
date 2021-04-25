package adapterDesignPattern;
import java.util.ArrayList;
/**
 * 
 * @author Odell
 *
 */
/**
 * 
 * Implements AnalogAlbum for methods.
 * Creates currentIndex
 * Creates ArrayList
 *
 */
public class Cassett implements AnalogAlbum {
	public static ArrayList<String> casList = new ArrayList<String>();
	private int currentIndex;
	
	/**
	 * Adds these to the ArrayList
	 * @param s1
	 * @param s2
	 * @param s3
	 * @param s4
	 * @param s5
	 */
	public Cassett(String s1, String s2, String s3, String s4, String s5)
	{
		casList.add(s1);
		casList.add(s2);
		casList.add(s3);
		casList.add(s4);
		casList.add(s5);
	}
	/**
	 * Will check to see what is playing
	 * @return Song or End of Cassett
	 */
	public String play()
	{
		if(currentIndex == 5)
		{
			return "At the end of the cassett you need to rewind";
		}
		else
		{
			currentIndex++;
			return ("Playing song " +currentIndex+": "+casList.get(currentIndex-1));
		}
	}
	/**
	 * Checks to see if you can rewind or will rewind
	 * @return Rewinds the song and prints or states it is fully re-wound
	 */
	public String rewind()
	{
		currentIndex--;
		if(currentIndex == 0)
		{
			return "Fully Re-Wound";
		}
		else
		{
			return ("Rewinding to song "+currentIndex);
		}
	}
	/**
	 * Checks to see if you can fastforward and will if you can
	 * @return returns values based on the currentIndex
	 */
	public String ffwd()
	{
		currentIndex++;
		if(currentIndex == 4)
		{
			return "Forwarded to the end of the cassett";
		}
		else if( currentIndex == 5)
		{
			return "Forwarded to the end of the cassett";
		}
		else
		{
			return("Forwarding to song "+ (currentIndex+1));
		}
		
	}
	/**
	 * Pauses the music
	 * @return String stating it is pausing
	 */
	public String pause()
	{
		return ("Pausing..."+ casList.get(currentIndex-1));
	}
	/**
	 * Stops and Ejects Casett
	 * @return String
	 */
	public String stopEject()
	{
		return "Stopping cassett and ejecting";
	}

}
