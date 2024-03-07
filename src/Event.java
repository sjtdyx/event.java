
import java.time.LocalDate;
import java.util.ArrayList;

public class Event {
 private String eventID;
 private String eventName;
 private String eventVenue;
 private LocalDate eventDate;
private ArrayList<String> eventAttendees;
 
public String getEventID() {
return eventID;
}
 public void setEventID(String eventID) {
 this.eventID = eventID;
 }

 public String getEventName() {
return eventName;
}
 public void setEventName(String eventName) {
this.eventName = eventName;
}

public String getEventVenue() {
 return eventVenue;
}
public void setEventVenue(String eventVenue) {
 this.eventVenue = eventVenue;
}

public LocalDate getEventDate() {
 return eventDate;
}
public void setEventDate(LocalDate eventDate) {
 this.eventDate = eventDate;
 }

 public ArrayList<String> getEventAttendees() {
 return eventAttendees;
 }
 public void setEventAttendees(ArrayList<String> eventAttendees) {
 this.eventAttendees = eventAttendees;
 }

 public Event(String eventID, String eventName, String eventVenue, LocalDate eventDate) {
 this.eventID = eventID;
 this.eventName = eventName;
 this.eventVenue = eventVenue;
 this.eventDate = eventDate;
 this.eventAttendees = new ArrayList<>();
 }
 

 /*add,remove,find */
 public void addAttendee(String attendeeName){
 eventAttendees.add(attendeeName);
 }
 public void removeAttendee(String attendee){
 eventAttendees.remove(attendee);
 }
 public boolean findAttendee(String attendeeName){
return eventAttendees.contains(attendeeName);
 }
 public int getTotalAttendees(){
 return eventAttendees.size();
 }

public void updateAttendee(String AttendeeToUpdate,String newAttendee){
 if(eventAttendees.contains(AttendeeToUpdate)){
 int index = eventAttendees.indexOf(AttendeeToUpdate);
 eventAttendees.set(index,newAttendee);
 }
 }
 @Override
 public String toString(){
 return "The details of the event:" +
"\nEvent ID=" + eventID + 
"\nEvent name=" + eventName + 
"\nEvent venue=" + eventVenue + 
"\nEvent date=" + eventDate + 
"\nEvent attendees=" + eventAttendees;}
 }
 
 

 


 
 
