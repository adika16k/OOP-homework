public class Login {
    JDBC jd=new JDBC();
    String user=jd.getUsername();
    String pass = jd.getPass();

    private String Login;
    private String Password;

    public boolean Check(String Login, String Pass){
        Encryption en=new Encryption();
        String pass1=en.Hex(Pass);
        boolean CheckAll = false;
        if( pass1.equals(pass) && Login.equals(user)){
            CheckAll = true; }
        else{
            CheckAll = false;
        }
        return CheckAll;
    }

    public String getLogin(){
        return this.Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return this.Password;
    }
}