public class main {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        int sum =0;
        String[] split = jewels.split("");
        for (String s: split) {
            String s1 = stones.replaceAll(s, "");
            sum += stones.length() - s1.length();
        }
        System.out.println("sum = " + sum);
    }
}
