public class User2 {
    String name;
    public String email;
  
    public void setUsername(String username) {
      name = username;
    }
  
    public void setEmail(String useremail) {
      email = useremail;
    }
  
    public String getUserName() {
      return name;
    }
  
    public void printName() {
      System.out.println("It's an User class output");
    }
  }