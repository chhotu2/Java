package checked_Exception;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class compileTimeException {

  public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException{
    FileReader fr = new FileReader("file.txt");
    System.out.println("File Reader");
  }
}