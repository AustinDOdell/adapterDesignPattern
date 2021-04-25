package adapterDesignPattern;
/**
 * 
 * @author Odell
 *
 */

/**
 * 
 * Creates instance of Album
 *
 */
public class AnalogAdapter implements AnalogAlbum{
	private DigitalAlbum album;
	
	/**
	 * Sets Instance to entered values.
	 * @param album
	 */
	public AnalogAdapter(DigitalAlbum album)
	{
		this.album = album;
	}
	/**
	 * @return method nextSong();
	 */
	public String play() {
		return album.nextSong();
	}
	/**
	 * @return method prevSong();
	 */
	public String rewind() {
		return album.prevSong();
	}
	/**
	 * @return method nextSong();
	 */
	public String ffwd() {
		return album.nextSong();
	}
	/**
	 * @return method pause();
	 */
	public String pause() {
		return album.pause();
	}
	/**
	 * @return method stop();
	 */
	public String stopEject() {
		return album.stop();
	}
}
