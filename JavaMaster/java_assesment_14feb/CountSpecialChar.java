package java_assesment_14feb;

public class CountSpecialChar {
    public static void main(String[] args) {
        String str="sdssd&*&D!";
        String s=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        System.out.println("count: "+(str.length()-s.length()));
    }
}
