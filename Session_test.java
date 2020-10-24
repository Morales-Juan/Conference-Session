
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;

/**
 * @author Juan Jose Morales
 *get and set elements for a session
 */

public class Session {

	//Public Constants
	
	public final static char WORKSHOP = 'W';
	public final static char TALK = 'T';
	public final static char PANEL = 'P';
	public final static char KEYNOTE = 'K';
	
	
	//Private instance variables
	
	private char type; //represents type of session W,P,T,K
	private String title;
	private String description;
	private String[] presenters;
	private LocalDate date;
	private LocalTime time;
	private Duration length;
	
	
	//Public instance methods
	
	/**
	 * @return no argument constructor, set default values
	 */
	public Session() {
		setType(TALK);
		setTitle("");
		setDescription("");
		setPresenters(new String[0]);
		setDate(2019,01,01); // default date
		setTime(12,01);     // default time
		setLength(60);     // default length
	}
	
	/**
	 * @return three argument constructor
	 */
	public Session (char type, String title, String[] presenters) {
		this();  
			setType(type);  
			setTitle(title);
			setPresenters(presenters);
		}
	
	/**
	 * @return String description of type of session
	 */
	public String getTypeName() {
		String result;
		switch (this.type) {
		case TALK:
			result="Talk";
			break;
		case PANEL:
			result="Panel";
			break;
		case WORKSHOP:
			result="Workshop";
			break;
		case KEYNOTE:
			result="Keynote";
			break;
		default:                //type is set to default TALK
			result="Talk";
			break;
		}
		return result;
	}
	
	/**
	 * @return string to describe the session
	 */
	
	public String toString() {
			String presenters = "";
		if (getPresenters().length==0) {
			presenters="TBD";
		} else {
			for (int i = 0; i<getPresenters().length;i++) {  //loop through presenters
				presenters += " ,";
			}
		}
			String result = getTypeName() + " : " + getTitle() + " (" + presenters + ")";
		return result;
	}
	
	/**
	 * @return char for the type of session 
	 */
	public char getType() {
		return this.type;
		
	}
	
	/**
	 * @return true if type equal to W,T,P,K
	 * return false if not and set to T 
	 */
	public boolean setType(char type) {
		
		if ( type != 'W' && type!= 'T' && type!='K' && type!= 'P')
			return false;
			
					this.type = type;
		
			return true;
	}
	
	/**
	 * @return String with title of the session
	 */
	public String getTitle() {
		return this.title;
		
	}
	
	/**
	 * take a parameter of type String, gives the title of the session 
	 */
	public void setTitle( String title) {
		
		
		this.title = title;
		
	}
	
	/**
	 * take a parameter of type String, gives the description of the session
	 */
	public void setDescription ( String description) {
		this.description = description;
	}
	
	/**
	 * @return String with description of the session
	 */
	public String getDescription() {
		return this.description;
		
	}
	
	/**
	 * @return an array of String[]
	 */
	public String[] getPresenters() {
		return this.presenters;		
		
	}
	
	/**
	 * @return contains the list of speakers
	 */
	public void setPresenters(String[] presenters) {

			this.presenters = presenters;
		
	}
	/**
	 * @return local date instance with date of session
	 */
	public LocalDate getDate() {
		return this.date;
		
	}
	
	/**
	 * takes three parameters to set date of session
	 */
	public void setDate ( int year, int month, int day) {
		this.date = LocalDate.of(year, month, day);
		
	}
	
	/**
	 * @return time of the session
	 */
	public LocalTime getTime() {
		return this.time;
		
	}
	
	/**
	 * takes two parameters to set time of the session
	 */
	public void setTime ( int hour, int minute) {
		this.time = LocalTime.of(hour, minute);
			
	}
	
	/**
	 * @return length of the session
	 */
	public Duration getLength() {
	return this.length;
	
	}
	
	/**
	 * takes integer parameter that gives length of session in minutes
	 */
	public void setLength ( int length) {
	this.length = Duration.ofMinutes(length);
	
	
	}


	
}
