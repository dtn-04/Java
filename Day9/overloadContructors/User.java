public class User {
    String username;
    String email;
    int age;

    User(){
        this.username = "nganz";
        this.email = "abc@gmail.com";
        this.age = 21;
    }

    User(String username){
        this.username = username;
        this.email = "abc@gmail.com";
        this.age = 21;
    }

    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 21;
    }

    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
