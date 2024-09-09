public class SplitDemo {
    public static void main(String[] args) {
        String sampleData = "Splits this string around matches of the given regular expression";
        String[] splitData = sampleData.split(" ");
        for (String element : splitData) {
            System.out.println(element);
        }

    }
}
