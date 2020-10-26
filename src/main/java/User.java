import java.util.Objects;

public class User {
  private String username;
  private String password;
  private Boolean isActive;
  private Boolean restrictionsOn;

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(username, user.username) &&
      Objects.equals(password, user.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  public Boolean getActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
  }

  public Boolean getRestrictionsOn() {
    return restrictionsOn;
  }

  public void setRestrictionsOn(Boolean restrictionsOn) {
    this.restrictionsOn = restrictionsOn;
  }
}
