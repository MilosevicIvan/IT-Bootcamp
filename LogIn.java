package MojNovcanik;

public class LogIn extends SignUp{

    private String username;
    private String password;

    public LogIn(String username, String password, String username1, String password1) {
        super(username, password);
        this.username = username1;
        this.password = password1;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String toString (){

        StringBuilder sb = new StringBuilder();

        sb.append(super.getUsername());
        sb.append(super.getPassword());
    }

}
