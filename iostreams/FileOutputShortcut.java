// iostreams/FileOutputShortcut.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// {ValidateByHand}
import java.io.*;

public class FileOutputShortcut {
  static String file = "FileOutputShortcut.dat";
  public static void
  main(String[] args) throws IOException {
    try(BufferedReader in = new BufferedReader(
          new StringReader(BufferedInputFile.read(
            "FileOutputShortcut.java")));
    // Here's the shortcut:
    PrintWriter out = new PrintWriter(file)) {
      int lineCount = 1;
      String s;
      while((s = in.readLine()) != null )
        out.println(lineCount++ + ": " + s);
    }
    // Show the stored file:
    System.out.println(BufferedInputFile.read(file));
  }
}
