package unittest;

public class Hello {

    public String hi(String name) {
        return "Hello, " + name;
    }

    public String workWithDb(int id) {
        // Tight coupling with UserDb class
        UserDB userDB = new UserDB();
        return userDB.getNameById(id);
    }
}

class UserDB {
    public String getNameById(int id ){
        // Unstable with dependency
        throw new RuntimeException("DB fail");
    }
}