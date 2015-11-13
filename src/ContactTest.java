import java.util.Scanner;

/**
 * @author woytek
 * @author Julianna Nichols
 */

public class ContactTest {

    /**
     * This is the main method for the ContactClass program.
     * @param args the command line arguments
     */
	
    public static void main(String[] args) {
    	
        Contact testContact = new Contact();
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "Enter last name: " );
        input = keyboard.nextLine();
        testContact.setLastName( input );
        
        System.out.print( "Enter first name: " );
        input = keyboard.nextLine();
        testContact.setFirstName( input );
        
        System.out.print( "Enter middle name: " );
        input = keyboard.nextLine();
        testContact.setMiddleName( input );
        
        System.out.print( "Enter prefix: " );
        input = keyboard.nextLine();
        testContact.setPrefix( input );
        
        System.out.print( "Enter phone number (### - ### - ####): " );
        input = keyboard.nextLine();
        testContact.setPhoneNumber( input );
             
        System.out.println( "Last name: " + testContact.getLastName() );
        
    }
    
    /**
     * This class sets and gets the information for the contact.
     * @author Julianna Nichols
     *
     */
    
    public static class Contact {
        Contact() {
        }
        
        /**
         * Sets last name
         * @param n
         */
        
        public void setLastName( String n ) {
            
            if( !n.matches( "^[A-Za-z]+$" )) {
                System.out.println( "Invalid characters in last name!" );
            } else {
                lName = n;
            }
        }
        
        /**
         * Returns last name 
         * @return lName
         */
        
        public String getLastName() {
            return lName;
        }
        
        /**
         * Sets first name 
         * @param n
         */
    
        public void setFirstName( String n ) {
            
        	if ( !n.matches( "^[A-Za-z]=$" )) {
        		System.out.println( "Invalid characters in first name!" );
        	} else {
        		fName = n;
        	}
        }
        
        /**
         * Returns first name 
         * @return fName
         */
        
        public String getFirstName() {
            return fName;
        }
        
        /**
         * Sets middle name
         * @param n
         */
        
        public void setMiddleName( String n ) {
            
        	if( !n.matches( "^[A-Za-z]+$" )) {
        		System.out.print( "Invalid characters in middle name!" );
        	} else {
        		mName = n;
        	}
        }
        
        /**
         * Returns middle name
         * @return mName
         */
        
        public String getMiddleName() {
            return mName;
        }
        
        /**
         * Sets prefix
         * @param n
         */
        
        public void setPrefix( String n ) {
        	
        	if( !n.matches( "^[A-Za-z]+$" )) {
        		System.out.print( "Invalid characters in prefix!" );
        	} else {
        		prefix = n;
        	}
        }
        
        /**
         * Returns prefix
         * @return prefix
         */
        
        public String getPrefix() {
        	return prefix;
        }
        
        /**
         * Sets phone number
         * @param n
         */
        
        public void setPhoneNumber( String n ) {
        	
        }
        
        private String lName,fName, mName;
        private String prefix;
        private String phone;
        private String email;
        private String street, city, state, zip;
        private String occupation;
        
        
    }
    
}
