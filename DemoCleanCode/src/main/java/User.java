abstract class User {
    public int status;
    public abstract void startLogin();

//    public void startLogin(){
//        if ( status == 1){
//            //TODO - Active
//        } else if (status == 2){
//            //TODO - InActive
//        } else if (status == 3) {
//            // TODO - Deleted
//        }
//    }
}

class ActiveUser extends User {
    @Override
    public void startLogin() {
        System.out.println("Start Login with Active user");
    }
}

class DeletedUser extends User {
    @Override
    public void startLogin() {
        System.out.println("Start Login with Deleted user");
    }
}