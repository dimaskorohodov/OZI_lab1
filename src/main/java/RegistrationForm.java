import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm implements ActionListener {

  public RegistrationForm(){
    submitButton.addActionListener(this);
    usernameField.addActionListener(this);
    passwordField.addActionListener(this);
    createGui();
  }

  JButton submitButton = new JButton("Submit");
  JTextField usernameField = new JTextField();
  JTextField passwordField = new JTextField();

  public  void createGui() {
    JFrame jFrame = new JFrame("Registration Window");
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


    //submitButton.addActionListener(new ButtonPressed(usernameField.getText(),passwordField.getText()));

  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == submitButton) {
      System.out.printf(usernameField.getText()+passwordField.getText());

      AdminForm adminForm = new AdminForm();

    }
  }
}
