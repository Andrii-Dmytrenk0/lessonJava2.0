package src.lesson5;

public class StringBuilderBufferPractice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.replace(0,5, "Java");
        sb.delete(5,11);
        System.out.println(sb);

        StringBuffer sbff = new StringBuffer("Hello");
        sbff.append("World");
        sbff.replace(0,5, "End ");
        System.out.println(sbff);
    }
}
