import java.util.Scanner;

public class StudentWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      System.out.println(" enter time set in the watch");
      String settime=sc.next();
      System.out.println(" secondsgained");
          int seconds=sc.nextInt();
      System.out.println(" minutes early");
          int earlyminutes=sc.nextInt();
      String[]timeparts=settime.split(":");
	      int hours=Integer.parseInt(timeparts[0]);
	      int minutes=Integer.parseInt(timeparts[1]);
	      int Totalminutes=hours*60+minutes;
	      int extratime=(Totalminutes/5)*seconds;
	      
	          int Totaltime=Totalminutes+extratime-earlyminutes*60;
	          int actualtime=Totaltime/60;
	          int acutalminutes=Totaltime%60;
	          String formattedHours = String.format("%02d", actualtime);
	          String formattedMinutes = String.format("%02d", acutalminutes);
	          
	          System.out.println("The actual time: " + formattedHours + ":" + formattedMinutes);
	          
	      
      
      
	}

}
