/** SOSServer communicates with the front-end for creation of events.
* Also it is held responsible for managing user sessions and keeping
* track of them, as well as dispatching messages through the system.
*/
public class SOSServer {
	/**
 	* The constructor could be made private
 	* to prevent others from instantiating this
 	* class. But this would also make it
 	* impossible to create instances of
 	* SOSServer subclasses.
	*/
	protected SOSServer() {  }  

 	/**
  	 * A handle to the unique SOSServer
  	* instance.
 	*/
 	static private SOSServer _instance = null;
	/**
	 * @return The unique instance of this
	 * class.
	 */
	 static public SOSServer instance( ) {
	 if ( null = = _instance) {
		 _instance = new SOSServer( );
	 }
	 return _instance;
 }
  /**
	* This method creates an event and stores its data.
	* @param event is a String coming from the front-end including a JSON
	*							 which stores all of the event details, including name,
	*							 type, location, etc.
	* @return is true if event is successfully created and false otherwise.
	*/   
  static public bool CreateEvent(String event) { }
	/**
	 * Sends a message via the server
	 * @param msg is the message to be sent
	 */
	static public void send(String msg) { }
	/**
	* This method parses a message coming from the front-end which supposed
	* to be in JSON format.
	* @param msg is a String coming from the front-end including the JSON
	* @return is the parsed message
	*/   
	static public String ParseMessage(String msg) { }
}



/** SOSSessionManager keeps track of each session for every user.
* It can gather information about the current session, update the session,
* or even destroy it.
*/
public class SOSSessionManager {
	/**
 	* The constructor could be made private
 	* to prevent others from instantiating this
 	* class. But this would also make it
 	* impossible to create instances of
 	* SOSSessionManager subclasses.
	*/
	protected SOSSessionManager() {  }  

 	/**
  	 * A handle to the unique SOSSessionManager
  	* instance.
 	*/
 	static private SOSSessionManager _instance = null;
	/**
	 * @return The unique instance of this
	 * class.
	 */
	 static public SOSSessionManager instance( ) {
	 if ( null = = _instance) {
		 _instance = new SOSSessionManager( );
	 }
	 return _instance;
 }
  /**
	* This method returns the infromation regarding a given session.
	* @param sessionID is the ID for the desired session
	* @return is a String containing current session's information.
	*/   
  static public String GetSessionInformation(String sessionID) { }
	/**
	* This method returns the infromation regarding a current live session
	* @return is a String containing current session's ID.
	*/   
  static public String GetCurrentSession() { }
	/**
	* This method updates the given session with the modified data
	* @param sessionID is the ID of the session to be updated
	* @param data is the modified data to be updated on the given session
	* @return is true if update information is successfull and false otherwise.
	*/   
	static public bool UpdateSessionInformation(String data, String sessionID) { }
	/**
	* This method destroys a given user session
	* @param sessionID is the ID for the session to be destroyed
	* @return is true if DestroySession is successfull and false otherwise.
	*/   
	static public bool DestroySession(String sessionID) { }
	/**
	* This method logs out the user from their current session.
	* @return is true if Logout is successfull and false otherwise.
	*/   
	static public bool LogOutUser() { }

}

/* This is the interface for the Command design pattern */
public interface Command {
	public abstract void execute ( );
}

/* The class for the SOSDispatcher to be used in Command pattern */
public class SOSDispatcher {
	/**
	* This method returns all of the events.
	* @return is an ArrayList containg of Strings of events.
	*/   
	public ArrayList<String> GetAllEvents() { }
	/**
	* The method for dispatching events.
	*/
	public void Dispatch() { }
}

/* The class for the GetAllEventsCommand implenting the command pattern */
public class GetAllEventsCommand implements Command {
	private SOSDispatcher sosDispatch;
	/* Command constructor */
	public GetAllEventsCommand (SOSDispatcher dis) { sosDispatch = dis }
	public void execute () {
		sosDispatch.GetAllEvents();
	}
}

/* The class for the DispatchCommand implenting the command pattern */
public class DispatchCommand implements Command {
	private SOSDispatcher sosDispatch;
	/* Command constructor */
	public DispatchCommand (SOSDispatcher dis) { sosDispatch = dis }
	public void execute () {
		sosDispatch.Dispatch();
	}
}
