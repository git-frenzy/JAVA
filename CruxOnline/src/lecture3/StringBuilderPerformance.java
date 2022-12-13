package lecture3;

public class StringBuilderPerformance {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        appendStringBuilder(100000);
        long end = System.currentTimeMillis();

        System.out.println(end - start);


    }

    public static void appendStringBuilder(int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= n; i++) {

            sb.append(i);


        }

    }
}
