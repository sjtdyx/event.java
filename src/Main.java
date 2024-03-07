import java.util.Scanner;
import java.time.LocalDate;

public class Main {
 public static void main(String[] args) throws Exception{
System.out.println("Enther the total number of people attending the event:");
 Scanner reader = new Scanner(System.in);
int count = reader.nextInt();
 reader.nextLine();
 
 System.out.println("Enter event ID:");
 String eventID = reader.nextLine();
 System.out.println("Enter event Name:");
 String eventName = reader.nextLine();
 System.out.println("Enter event Venue:");
String eventVenue = reader.nextLine();
System.out.println("Enter event date(YYYY-MM-DD):");
String eventDateInput = reader.nextLine();
LocalDate eventDate = LocalDate.parse(eventDateInput);
 
Event event = new Event(eventID,eventName,eventVenue,eventDate);

for(int i=0;i<count;i++){
 System.out.println("Enter attendee name" + (i+1) + ":");
 String attendeeName = reader.nextLine();
event.addAttendee(attendeeName);
 }
 
organizeEvent(event);
System.out.println(event);
 reader.close();
}

public static void organizeEvent(Event event){
 System.out.println("Now you can do the following:");
 System.out.println("1.Add attendee");
 System.out.println("2.Remove attendee");
 System.out.println("3.Update attendee");
 System.out.println("4.Find a single attendee");
 System.out.println("5.Get total number of attendees");
 System.out.println("6.Do nothing");
 System.out.println("Enter the choice what you want to do(1-6):");
 Scanner reader = new Scanner(System.in);
 int choice = reader.nextInt(); 
 
 switch(choice){
 case 1:
 System.out.println("Enter the name of the attendee you want to add:");
 Scanner a = new Scanner(System.in);
 String attendeeName = a.nextLine();
 event.addAttendee(attendeeName);
 break;
 case 2:
 System.out.println("Enter the name of the attendee you want to remove:");
 Scanner b = new Scanner(System.in);
String attendee = b.nextLine();
 event.removeAttendee(attendee);
 break;
 case 3:
 System.out.print("Enter the attendee name you want to update：");
 Scanner c = new Scanner(System.in);
 String AttendeeToUpdate = c.nextLine();
 System.out.print("Enter a new attendee name：");
 Scanner d = new Scanner(System.in);
 String newAttendee= d.nextLine();
 event.updateAttendee(AttendeeToUpdate, newAttendee);
 break;
 case 4:
System.out.print("Enter the name of the anttendee you want to find:：");
 String attendeeToFind = reader.next();
 if (event.findAttendee(attendeeToFind)) {
 System.out.println("Found it.");
 } else {
 System.out.println("Didn't find.");
 }
 break;
 case 5:
 int totalAttendees = event.getTotalAttendees();
 System.out.println("The total number of attendees is " + totalAttendees);
 break;
 case 6:
 System.out.println("Do nothing.");
 break;
 }
 reader.close();
}
}


    

