public class Lesson_3 {

    public static void longWord() {
        String s1 = "Mother";
        String s2 = "Father";
        String s3 = "GrandMother";

        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();

        if(len1>len2 && len1>len3){
            System.out.println("Max"+ " " + len1);
        }
        else if(len2>len1 && len2>len3 ){
            System.out.println("Max"+ " " + len2);
        }
        else{
            System.out.println("Max"+ " " + len3);
        }
    }
    public static void main(String[] args) {
        longWord();
    }
}