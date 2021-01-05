package stage5.hw1;

public class Main {
    public static void main(String[] args) {
        String mode = "default";

        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals("mode")) {
                mode = args[i + 1];
            }
        }
        System.out.println(mode);
    }
}
