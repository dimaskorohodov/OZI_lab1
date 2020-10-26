import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
  private FileManager fileManager;

  public UserService() {
    fileManager = new FileManager();
  }


  public List<User> getUsers() {
    return fileManager.getUsers();
  }

  public void addUser(String username) {
    fileManager.addToFile(username + "\n" + "");
  }

  public void changeAdminPassword(String adminName, String newPassword) {
    List<User> users = fileManager.getUsers();
    System.out.println("ADMIN"==adminName);
    for (User user : users) {
      System.out.println(user.getUsername());
      if (user.getUsername().equals(adminName)) {
        System.out.println("YES");
        user.setPassword(newPassword);
      }
      else {
        System.out.println("NO");
      }
    }
    fileManager.reWriteFile(users);
  }

  public void test(){

    System.out.println(fileManager.getUsers().size());
    fileManager.reWriteFile(fileManager.getUsers());
  }


  public User login(String userName, String password) {
    User user = null;
    for (User checkUser : getUsers()) {
      if (checkUser.getUsername().equals(userName) && checkUser.getPassword().equals(password)) {
        user = new User(userName, password);
      }
    }
    return user;
  }

  public User getUserByUserName(String username) {
    for (User user:getUsers()){
      if (user.getUsername().equals(username)) {
        return user;
      }
    }
    return null;
  }

  public Boolean blockUser(String userName) {
    for (User user : getUsers()) {
      if (user.getUsername().equals(userName)) {
        if (user.getActive().equals(true)) {
          user.setActive(false);
          return user.getActive();
        }
        if (user.getActive().equals(false)) {
          user.setActive(Boolean.TRUE);
          return user.getActive();
        }
      }
    }
    return null;
  }

  public boolean changeUserPassword(String userName, String oldPassword, String newPassword) {
    boolean isChanged = false;
    List<User> users = getUsers();
    for (User user : users) {
      if (user.getUsername().equals(userName)) {
        user.setPassword(oldPassword);
        isChanged = true;
      }
    }
    fileManager.reWriteFile(users);
    return isChanged;
  }

}
