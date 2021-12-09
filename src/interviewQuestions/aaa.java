package interviewQuestions;

public class aaa {

    public static void main(String[] args) {
         String s1="banana";
         String s2="banana";
         String s3= new String("banana");
         String s4=s1;

        System.out.println(s1==s2);
        System.out.println("-----");
        System.out.println(s1==s3);
        System.out.println("-----");

        System.out.println(s1.equals(s3));
        System.out.println("-----");

        System.out.println(s1.equals(s2));
        System.out.println("-----");

        System.out.println(s1==s4);
        System.out.println("-----");



    }
}
