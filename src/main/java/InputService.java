

import java.util.List;
import java.util.Scanner;

public class InputService {
  Scanner scanner = new Scanner(System.in);
  UserService userService = new UserService();




  public  String getUserInput(){
    return scanner.nextLine();
  }

  public User login(){
    System.out.println("Enter username login:");
    String userName = scanner.nextLine();
    System.out.println("Enter password:");
    String password = scanner.nextLine();

    boolean restriction =false;
    for (int i = 0; i < password.length()-1; i++) {
      char following = password.charAt(i);
      char next = password.charAt(i + 1);
      if (following == next) {
        restriction = true;
      }
    }

    if (!restriction) {
      User user = null;

      if ((user = userService.login(userName, password)) != null) {
        return user;
      }
    }
    else {
      System.out.println("Password can not contains repeatable symbolls!!!");
    }
    return null;
  }

  public void changeAdminPassword() {
    System.out.println("Enter old password:");
    String oldPassword = scanner.nextLine();
    if (userService.getUserByUserName("ADMIN").getPassword().equals(oldPassword)) {
      System.out.println("Enter new password:");
      String newPassword = scanner.nextLine();
      userService.changeAdminPassword("ADMIN", newPassword);
    }
    else {
      System.out.println("Wrong password");
      changeAdminPassword();
    }
  }

  public void addEmptyUser() {
    System.out.println("Enter user name");
    String username = scanner.nextLine();
    userService.addUser(username);
    System.out.println("User was added");
  }

  public void listUsers() {
    System.out.println("Users registrated in system:");
    List<User> users = userService.getUsers();
    for (User user : users) {
      if (!user.getUsername().equals("ADMIN")) {
        System.out.println(user.getUsername());
      }
    }
  }

  public void blockService() {
    System.out.println("Enter user name for blocking/unblocking:");
    String userName = scanner.nextLine();
    Boolean isBlocked = userService.blockUser(userName);
    if (isBlocked==true) {
      System.out.println(userName + " was blocked");
    }
    if (isBlocked == false) {
      System.out.println(userName + " was unblocked");
    }
  }

  public void changeUserPassword(String userName) {
    System.out.println("Enter old password");
    String oldPassword = scanner.nextLine();
    System.out.println("Enter new password:");
    String newPassword = scanner.nextLine();
    if(userService.changeUserPassword(userName, oldPassword, newPassword)){
      System.out.println("Password was changed");
    }
    else {
      System.out.println("Wrong password");
    }
  }
}
