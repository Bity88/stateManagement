package controller;

public class UserList {
    public String name;
    private String password;

    public static boolean validateUser(String username, String password){

        boolean status = false;
        String uname = "james";
        String pw = "123456";

            if(username.equals(uname) && password.equals(pw)){
                return true;
            }

        return status;
    }

//    public static void main(String[] args){
//        UserList u = new UserList();
//
//
//
//    }








}
