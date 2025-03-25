package planner;

public class Planner {
    String plannerName;
    String[][] datesEvents;
    int index;
    int size;
    Planner(){
        this.plannerName="Default";
        this.datesEvents = new String[10][2];
        this.index=0;
        this.size=10;
        for (int i=0; i<this.datesEvents.length; i++){
            this.datesEvents[i][0]=" ";
            this.datesEvents[i][1]=" ";
        }
    }
    Planner (String plannerName, int size){
        this.plannerName=plannerName;
        this.datesEvents = new String[size][2];
        this.size=size;
        this.index=0;
        for (int i=0; i<this.datesEvents.length; i++){
            this.datesEvents[i][0]=" ";
            this.datesEvents[i][1]=" ";
        }
    }
    private void    displayPlanner(){
        System.out.println("--Date--\t\t--Event--");
        for (String[] events : this.datesEvents) {
            System.out.println(events[0]+ "\t\t"+events[1]);
        }
    }
    void addEvent(String date, String event){
        if (this.index<this.size){
            this.datesEvents[this.index][0] = date;
            this.datesEvents[this.index][1] = event;
            this.index++;
        }
        else {
            System.out.println("Planner is full");
        }
        displayPlanner();
    }
    void deleteEvent(String date){
        for (int i=0; i<this.datesEvents.length; i++){
            if (this.datesEvents[i][0].equalsIgnoreCase(date)){
                this.datesEvents[i][0]=" ";
                this.datesEvents[i][1]=" ";
            }
        }
        displayPlanner();
    }

}
