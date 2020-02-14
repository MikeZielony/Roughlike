import java.sql.Time;

public class Printing {
    
    public String name;
    public Time time;
    public int level;

    public Printing() {

    }

    public Printing(String name, Time time, int level){
        this.name = name;
        this.time = time;
        this.level = level;
    }

    public void printHeader() {
        System.out.println(String.format("%s", "/-----------------------------------------------------------------------\\"));

        System.out.println(String.format("%1s %10s %1s %20s %1s %20s %1s %10s %1s", 
        "|", "Position", // get pos number
        "|", "User Name", // get user name
        "|", "Time", // get time
        "|", "Level", // get level
        "|", "|"));
        System.out.println(String.format("%s", "------------------------------------------------------------------------"));
    }
    public void printTable() {
        System.out.println(String.format("%1s %10s %1s %20s %1s %20s %1s %10s %1s", 
        "|", "1",
        "|", "Janusz", 
        "|", "1:30", 
        "|", "Level 1", 
        "|", "|"));
        System.out.println(String.format("%s", "-------------------------------------------------------------------------"));

    }

}