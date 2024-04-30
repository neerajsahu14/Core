package Designs.BulderPattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserEmail("ns9229900@gmail.com")
                .setUsername("Neeraj Sahu")
                .setUserid("0111CS221137")
                .build();
        System.out.println(user.getUserEmail());
            

    }
}
