public class solution_4 {
    void join(int a,int b){
        int no1 = a;
        int no2 = b;
        System.out.println("Addtion:"+(no1+no2));
    }

    void join(String a,String b){
        String s1 = a;
        String s2 = b;
        String concat = s1+s2;
        System.out.println("Concat of both string is:"+concat);
    }

    public static void main(String args[]){
        solution_4 obj = new solution_4();
        obj.join("Hare","Krishna");
        obj.join(26,43);

    }
}
