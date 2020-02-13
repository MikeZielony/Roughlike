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
        System.out.println(String.format("%s", "/------------------------------------------------------------------------\\"));

        System.out.println(String.format("%1s %5s %1s %20s %1s %20s %1s", 
        "|", "Position",
        "|", "User Name", 
        "|", "Time", 
        "|", "Level", 
        "|", "|"));
        System.out.println(String.format("%s", "---------------------------------------------------------------------------"));
    }
    public void printTable() {
        System.out.println(String.format("%1s %5s %1s %20s %1s %20s %1s", 
        "|", "number",
        "|", "...", 
        "|", "...", 
        "|", "...", 
        "|", "|"));
        System.out.println(String.format("%s", "---------------------------------------------------------------------------"));

    }

}