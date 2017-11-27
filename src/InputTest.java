import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input inp = new Input();

        System.out.println(inp.getString("Test getString() Prompt"));
        System.out.println(inp.yesNo("Test yesNo() Prompt"));
        System.out.println(inp.yesNo());
        System.out.println(inp.yesNo());
        System.out.println(inp.yesNo());
        System.out.println(inp.yesNo());
        System.out.println(inp.yesNo());
        System.out.println(inp.getInt(1,10, "Test getInt(min, max) Prompt"));
        System.out.println(inp.getInt(10,100));
        System.out.println(inp.getInt(100,1000));
        System.out.println(inp.getInt("Test getInt() Prompt"));
        System.out.println(inp.getDouble(1.0,10.0, "Test getDouble(min, max) Prompt"));
        System.out.println(inp.getDouble(10.0,100.0));
        System.out.println(inp.getDouble(100.0,1000.0));
        System.out.println(inp.getDouble("Test getDouble() Prompt"));
    }
}
