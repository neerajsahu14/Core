class User {

    private final String userid;
    private final String username;
    private final String userEmail;

    private User(UserBuilder builder) {
        // inialize the user
        this.userid = builder.userid;
        this.userEmail = builder.userEmail;
        this.username = builder.username;
    }

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getUserEmail() {
        return userEmail;
    }

    // @Override
    // public String toString() {
    // // TODO Auto-generated method stub
    // return this.username+":"+this.userEmail +":"+this.userid;
    // }

    static class UserBuilder {
        private String userid;
        private String username;
        private String userEmail;

        public UserBuilder() {

        }

        public UserBuilder setUserid(String userid) {
            this.userid = userid;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }

    }

}