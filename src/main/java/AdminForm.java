import javax.swing.*;
import java.awt.*;

public class AdminForm {
  JButton submitButton = new JButton("Submit");
  JTextField usernameField = new JTextField();
  JTextField passwordField = new JTextField();


  public AdminForm(){
    createGui();
  }


  public void createGui(){
    JFrame jFrame = new JFrame("Admin Window");
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jFrame.pack();
    jFrame.setSize(Constants.FORM_WIDTH,Constants.FORM_HEIGHT);
    jFrame.setLocation(200,100);
    jFrame.setVisible(true);




    JLabel usernameLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");

    JLabel infoLabel = new JLabel("Test Info!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");







    jFrame.getContentPane().add(submitButton, BorderLayout.CENTER);
    jFrame.getContentPane().add(usernameField);
    jFrame.getContentPane().add(passwordField);
    jFrame.getContentPane().add(usernameLabel);
    jFrame.getContentPane().add(passwordLabel);
    jFrame.getContentPane().add(infoLabel);


    // X Y
    usernameLabel.setBounds(Constants.FORM_WIDTH-285,Constants.FORM_HEIGHT-470,90,20);
    usernameField.setBounds(Constants.FORM_WIDTH-300,Constants.FORM_HEIGHT-450,90,20);

    passwordLabel.setBounds(Constants.FORM_WIDTH-285,Constants.FORM_HEIGHT-410,90,20);
    passwordField.setBounds(Constants.FORM_WIDTH-300,Constants.FORM_HEIGHT-390,90,20);

    infoLabel.setBounds(Constants.FORM_WIDTH-300,Constants.FORM_HEIGHT-350,90,20);


    submitButton.setBounds(Constants.FORM_WIDTH-300,Constants.FORM_HEIGHT-100,90,20);

    usernameField.setEditable(true);
    usernameField.setText("LOL");

  }
}
