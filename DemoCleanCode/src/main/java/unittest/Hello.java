package unittest;

public class Hello {

    public String hi(String name) {
        return "Hello, " + name;
    }

    UserDB userDB;  // <- Loose coupling

    public String workWithDb(int id) {
        // Tight coupling with UserDb class => Loose coupling
        // UserDB userDB = new UserDB(); <- Tight coupling


        return userDB.getNameById(id);
    }
}

class UserDB {
    public String getNameById(int id ){
        // Unstable with dependency
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("DB fail");
    }
}