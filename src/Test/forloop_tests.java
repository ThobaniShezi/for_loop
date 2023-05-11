package for_loop;

import main.Main;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
public class forloop_tests {
    @Test
    public  void listOutput(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[0]);

        String expectedOutput = "0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
