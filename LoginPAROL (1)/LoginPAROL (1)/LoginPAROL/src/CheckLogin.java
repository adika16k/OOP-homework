public class CheckLogin {
    private int Len = 6;
    private boolean IsMoreThan6;
    public boolean CheckLen(String Login, String Password){
        if(Login.length()<6 || Password.length()<6){
            IsMoreThan6 = false;
        }
        else{
            IsMoreThan6 = true;
        }
        return IsMoreThan6;
    }
}
