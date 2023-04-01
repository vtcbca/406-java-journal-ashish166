class cricketer{
    void name(String name,int no_of_matches){
        System.out.println("-----------------------");
        System.out.println("Player's Name:"+name);
        System.out.println("Total Match played:"+no_of_matches);
    }
}
class batsman extends cricketer{
    void avg_run(int total_run,int total_time_out){
        float avgrun = total_run/total_time_out;
        System.out.println("Average Run:"+avgrun);
    }
}
class bowler extends cricketer{
    void avg_wicket(int total_wicket,int total_run_gave){
        float avgwicket = total_run_gave/total_wicket;
        System.out.println("Average Wicket:"+avgwicket);
        System.out.println("-------------------------");

    }
}
public class pg2 {
    public static void main(String args[]){
        batsman b1 = new batsman();
        bowler b2 = new bowler();
        b1.name("Ashish",10);
        b1.avg_run(650,6);
        b2.name("Gagan",10);
        b2.avg_wicket(21,190);
    }
}
