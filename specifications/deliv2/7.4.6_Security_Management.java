public class AccessManager {
	/**
 	* The constructor could be made private
 	* to prevent others from instantiating this
 	* class. But this would also make it
 	* impossible to create instances of
 	* AccessManager subclasses.
	*/
	protected AccessManager() {  }  

 	/**
  	 * A handle to the unique AccessManager
  	* instance.
 	*/
 	static private AccessManager _instance = null;
	/**
	 * @return The unique instance of this
	 * class.
	 */
	 static public AccessManager instance( ) {
	 if ( null = = _instance) {
		 _instance = new AccessManager( );
	 }
	 return _instance;
 }
  /**
	* @return The result of privilege check for the current user
	* class.
	*/   
  static public bool CheckPrivileges() { }

}

public class PasswordManager {
	/**
 	* The constructor could be made private
 	* to prevent others from instantiating this
 	* class. But this would also make it
 	* impossible to create instances of
 	* PasswordManager subclasses.
	*/
	protected PasswordManager() {  }  

 	/**
  	 * A handle to the unique PasswordManager
  	* instance.
 	*/
 	static private PasswordManager _instance = null;
	/**
	 * @return The unique instance of this
	 * class.
	 */
	 static public PasswordManager instance( ) {
	 if ( null = = _instance) {
		 _instance = new PasswordManager( );
	 }
	 return _instance;
 }
  /**
	* @param password as a String to be validated
	* @return is true if password successfully validates
	*/   
  static private bool ValidatePassword(String password) { }
	/**
	* @param password is a String to be validated
	* @return will return an encrypted version of the password as a String
	*/   
  static public String EncryptPassword(String password) { }
	/**
	* @param username is the user name for log in
	* @param pwd is the user's password for log in
	* @return is the validation of the login credentials
	*/   
  static public bool ValidateLogInCredentials(String username, String pwd) { }

}
