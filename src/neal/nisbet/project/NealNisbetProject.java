//Please select from the following
//1. Create Username
//2. Quit
//USER 1
//Please enter full name:
//USER: james hood
//Your user name is Jhood

package neal.nisbet.project;

import java.util.Scanner;

/**
 *
 * @author Neal Nisbet
 */
public class NealNisbetProject {

    public static void main(String[] args) {
        
       int options;
       
       //User menu options
       
       System.out.println("Please select from the following: 1. Create Username 2. Quit");
       Scanner scan1 = new Scanner(System.in);
       options = scan1.nextInt();
       
       if (options ==2)
       {
           System.out.println("You have quit");
       }
       
       else{
           if (options ==1);
            {
               System.out.print("Please enter your full name: ");
            }
       }
       
       
       //Get username
       
       String user;
       String userInitial;
       String userSurname;
       int spaceIndex;
       
       System.out.println("User 1:");
       Scanner scan2 = new Scanner(System.in);
       user = scan2.nextLine();
       
       userInitial = user.substring(0,1);
       spaceIndex = user.indexOf(" ");
       userSurname = user.substring(spaceIndex +1);
       
       //Correct username case
       
       userInitial = userInitial.toUpperCase();
       userSurname = userSurname.toLowerCase();
   
       System.out.println("Your user name is: " +userInitial +userSurname);
                
    }
    
}
