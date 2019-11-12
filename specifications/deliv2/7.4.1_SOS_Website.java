/* Session class keeps the user's current session on the website */
public class Session {
  /* instance variables for user name and user's data*/
  static private String userName = null;
  static private String userData = null;
  /* constructor method for the sesison */
  public Session(String user, String data) {
    userName = user;
    userData = data;
  }
}

/* Form class to be used in diferent forms around the system */
public class Form {
  /* Constructor */
  public Form() { }
  /** Closes the form
  * @return is true if close is successfull and false otherwise.
  */
  static public bool close() { }
  /** Submits the form
  * @return is true if submit is successfull and false otherwise.
  */
  static public bool submit() { }
}

/* Form for log in */
public class LogInForm extends Form {
  /* instance variables */
  static private String userName = null;
  static private String password = null;
  /* Constructor */
  public LogInForm() { }
  /* Login click confirmation method */
  static public void ConfirmLoginClick() { }
}

/* Form for edit profile */
public class EditProfileForm extends Form {
  /* instance variables */
  static private String emailAddress = null;
  static private PrivacyEnum accountPrivacy;
  static private String phoneNumber;
  static private String password = null;
  static private String dateOfBirth;
  /* Constructor */
  public EditProfileForm(String email, PrivacyEnum privacy, String dob,
                          String phone, String password) {
    emailAddress = email;
    accountPrivacy = privacy;
    dateOfBirth = dob;
    phoneNumber = phone;
  }
  /* Click submit button */
  static public void SubmitClick() { }
  /** Verifies the submit Click
  * @return is true if submit verification is successfull and false otherwise
  */
  static public bool SubmitVerificationClick() { }
  /** This method asks the SOS sytem for validation of updated profile.
  * @return is true if successfull and false otherwise
  */
  static public bool AskForValidation() { }
}
