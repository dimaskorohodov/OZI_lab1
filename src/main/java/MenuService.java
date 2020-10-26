

public class MenuService {
  static InputService inputService = new InputService();


  public static void printMenu() {
    System.out.println("1. Login");
    System.out.println("2. Exit");
  }

  public static void startMenu() {
    Boolean continueMenu = true;

    while (continueMenu) {
      printMenu();
      String input = inputService.getUserInput();
      switch (input) {
        case "1": {
          User user = inputService.login();
          if (user != null) {
            if (user.getUsername().equals("ADMIN")) {
              adminMenu(user);
            } else {
              userMenu(user);
            }
          } else {
            System.out.println("Wrong credentials");
          }
          break;
        }
        case "2": {
          continueMenu = false;
          break;
        }
      }
    }
  }

  public static void printAdminMenu() {
    System.out.println("1. Change password");
    System.out.println("2. Add empty user");
    System.out.println("3. Watch users list");
    System.out.println("4. Block/unblock user");
    System.out.println("5. Turn on password restrictions");
    System.out.println("6. Exit");
  }

  public static void adminMenu(User user) {
    boolean continueMenu = true;

    while (continueMenu) {
      printAdminMenu();
      String input = inputService.getUserInput();
      switch (input) {
        case "1": {
          inputService.changeAdminPassword();
          break;
        }
        case "2": {
          inputService.addEmptyUser();
          break;
        }
        case "3": {
          inputService.listUsers();
          break;
        }
        case "4": {
          inputService.blockService();
          break;
        }
        case "5": {

          break;
        }
        case "6": {
          continueMenu = false;
          break;
        }
      }
    }
  }


  public static void printUserMenu() {
    System.out.println("1 Change password");
    System.out.println("2. Exit");
  }

  public static void userMenu(User user) {
    boolean continueMenu = true;

    while (continueMenu) {
      printUserMenu();
      String input = inputService.getUserInput();

      switch (input){
        case "1":{
          inputService.changeUserPassword(user.getUsername());
          break;
        }
        case "2":{
          continueMenu=false;
          break;
        }
      }
    }
  }
}
