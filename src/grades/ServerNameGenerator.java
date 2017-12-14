package grades;

public class ServerNameGenerator {
    public static String getRandomString(String[] strings) {
        int randomIndex = (int) (Math.random() * strings.length);
        return strings[randomIndex];
    }

    public static void main(String[] args) {

        String[] nouns = {"elephant", "horse", "beach", "ball", "state", "wealth", "food", "editor", "heroes", "babies"};

        String[] adjectives = {"calm", "wild", "agreeable", "happy", "delightful", "large", "fancy", "clever", "thankful", "hot"};

        String serverName = getRandomString(adjectives) + " " + getRandomString(nouns);

        System.out.println("Your server name is: " + serverName);

    }

}
