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

interface UserDB {  // connect to db
    public String getNameById(int id ) throws UserNotFoundException;
}