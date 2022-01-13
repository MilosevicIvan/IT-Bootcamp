package MojNovcanik;

public class SignUp {

    private String username;
    private String password;

    public SignUp(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb.append(setUsername());
        sb.append(setPassword());

        return sb.toString();
    };








}
