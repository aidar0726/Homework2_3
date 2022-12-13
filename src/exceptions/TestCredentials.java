package exceptions;

public class TestCredentials {
    public static void main(String[] args) {
       try {
           Credentials.checkCredentials("admin","admin","admin");
           Credentials.checkCredentials("admin","админ","админ");
       } catch (WrongLoginException | WrongPasswordException e) {
           e.printStackTrace();
       }
    }
}
