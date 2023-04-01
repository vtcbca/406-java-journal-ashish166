public class Solution_2 {
    public static void main(String args[]){
        int number = Integer.parseInt(args[0]);
        for(int i = 0; i < number; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
