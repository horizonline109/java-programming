package day40_b;

public class countLetters {
    public static void main(String[] args) {
        countLetters("apple tree");
        System.out.println(getSumFromString("10fhfjdakleuidfjk590fjl"));
    }

    public static void countLetters(String str) {
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count = 0;

            if (!checked.contains("" + eachLetter)) {


                for (int j = 0; j < str.length(); j++) {
                    char eachOtherLetter = str.charAt(j);
                    if (eachLetter == eachOtherLetter) {
                        count++;
                    }
                }
                System.out.println(eachLetter + " - " + count);
                checked += eachLetter;
            }
        }
    }


    public static int getSumFromString(String str) {
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);

                if (!Character.isDigit(str.charAt(i + 1))) {
                    if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                        sum += Integer.parseInt(num);
                        num = "";
                    }
                }

            }
        }
            return sum;

    }
}
