import util.Input;

public class ServerNameGenerator {
    private static String[] nounArr = {"Car", "Dog", "Pen", "Chair", "Document", "Glass", "Cup", "Space", "Pod", "Key"};
    private static String[] adjArr = {"Smart", "Quick", "Fast", "Intelligent", "Square", "Circular", "Orthogonal", "Sharp", "Diagnostic", "Current"};

    public static String randomElementFromArray(String[] arr) {
        int arrLen = arr.length;
        int randomIdx = (int) Math.floor(Math.random()*arrLen);
        return arr[randomIdx];
    }

    public static void main(String[] args) {
        Input inp = new Input();
        do {
            String noun = randomElementFromArray(nounArr);
            String adj = randomElementFromArray(adjArr);
            System.out.println("Here's your server name:\n"+adj+"-"+noun);
        } while(inp.yesNo("Generate another?"));
    }
}
