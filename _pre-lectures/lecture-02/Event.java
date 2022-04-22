import java.time.LocalDateTime;

public class Event {
  LocalDateTime start;
  LocalDateTime end;
  String location;

  public Event(LocalDateTime start, LocalDateTime end, String location) {
    this.start = start;
    this.end = end;
    this.location = location;
  }

  // Return true if the other event is in 
  // the same room at an overlapping time
  public boolean conflict(Event other) {
	  
	  if (!location.equals(other.location)) { return false; }
    // checks if the location is the same. if the location are not the same no overlap. 
    //true = not the same location false = same
	  
	  if ((this.start.compareTo(other.start) <= 0) &&
	  	  (this.end.compareTo(other.start) > 0))
	  {  //checks if the start time of one location overlaps 
       //or starts during the other event 
		  return true;
	  }
	  
	  
	  return false;
  }
}
