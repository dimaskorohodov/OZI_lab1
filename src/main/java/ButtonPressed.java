import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPressed implements ActionListener {
  private String username;
  private String password;

  public ButtonPressed(String username, String password) {
    this.username = username;
    this.password = password;

  }



  public void actionPerformed(ActionEvent e) {
    System.out.println(username + " " + password);

  }
}
