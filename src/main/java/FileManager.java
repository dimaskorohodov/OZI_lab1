

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
  File file = new File("Users.txt");

  public List<User> getUsers() {

    List<User> users = new ArrayList<User>();
    try(FileReader fileReader = new FileReader(file)) {
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String username = bufferedReader.readLine();
      String password = bufferedReader.readLine();
      users.add(new User(username, password));
      while ((username = bufferedReader.readLine())!=null) {
        password = bufferedReader.readLine();
        users.add(new User(username, password));
      }
    }catch (IOException e){

    }
    return users;
  }

  public void addToFile(String insertion) {
    try (FileWriter fileWriter = new FileWriter(file, true)) {
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write("\n" + insertion);
      bufferedWriter.close();

    } catch (IOException e) {
      System.out.println("Can not write to file");
    }
  }

  public void reWriteFile(List<User> users) {
    try (FileWriter fileWriter = new FileWriter(file)) {
      for (User user : users) {
        fileWriter.write(user.getUsername()+"\n");
        fileWriter.write(user.getPassword()+"\n");
      }
      fileWriter.flush();
    } catch (IOException e) {

    }
  }


}
