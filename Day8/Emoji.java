import java.io.*;
import java.nio.charset.StandardCharsets;

public class Emoji {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8));
        System.out.println("🍒 🍋 🍉");
    }
}
