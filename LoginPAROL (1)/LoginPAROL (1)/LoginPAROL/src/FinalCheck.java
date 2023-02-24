public class FinalCheck {
    public boolean FinalCheck2(String Login, String Password) {
        boolean IsUpper = false;
        boolean IsUpper2 = false;

        boolean IsDigit = false;
        boolean IsDigit2 = false;
        for(int i = 0;i<Login.length();i++){
            if(Character.isUpperCase(Login.charAt(i))){
                IsUpper = true;
                break;
            }
        }
        for(int i = 0;i<Password.length();i++){
            if(Character.isUpperCase(Password.charAt(i))){
                IsUpper2 = true;
                break;
            }
        }
        char[] chars = Login.toCharArray();
        char[] chars2 = Password.toCharArray();

        for(char c : chars){
            if(Character.isDigit(c)){
                IsDigit = true;
                break;
            }
        }

        for(char c : chars2){
            if(Character.isDigit(c)){
                IsDigit2 = true;
                break;
            }
        }


        if(IsUpper == true && IsUpper2 == true && IsDigit == true && IsDigit2 == true){
            return true;
        }
        else {
            return false;
        }
    }
}

