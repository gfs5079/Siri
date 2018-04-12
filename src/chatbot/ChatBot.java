
package chatbot;


import java.text.DateFormat;
import java.util.Random;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author geoffreysalfi
 */
public class ChatBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        Random rand = new Random();
        String question;
        String percip;
        String name;
        int temp = rand.nextInt(80) + 1;
        
        System.out.println("Who am I speaking with?");
        name = scnr.nextLine();
        System.out.println("What can I help with " + name + "?");
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
        
        //ask a question
        question = scnr.nextLine();
        
        //weather
        if (question.contains("temperature")){
            System.out.println("It is " + temp + " degrees outside");
         if (temp < 32){
            System.out.println("Bundle up, its cold out");
        }
        else if (temp > 32 && temp < 50){
            System.out.println("You might need a fleece today");
        }
        else if (temp > 50 && temp < 70){
            System.out.println("You can get away with a light sweatshirt");
        }
        else {
            System.out.println("It's hot out, find a pool!");
            }
        }
        else if (question.contains("time")){
            System.out.println(sdf.format(cal.getTime()));
        }
        else if (question.contains("date")){
            System.out.println(dateFormat.format(date));
        }
        else if (question.contains("sports")){
            System.out.println("Here are current teams playing:");
            System.out.println("Eagles, Steelers, Rangers, Flyers");
        }
        else if (question.contains("food") || question.contains("resturant")){
            System.out.println("Here is a list of local food resturants");
            System.out.println("In n Out, Wings Over, Champs, 5 Guys, Herwigs");
        }
        else {
            System.out.println("Sorry, I didn't get that");
            System.out.println("Here are some commands I can help with:");
            System.out.println("Date, Sporting Events, Local Resuturants");
        }
 
        
    }
    
}
