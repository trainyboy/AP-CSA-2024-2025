public class StringTools {
    public StringTools(){
    }
    public String lastLetter(String str)
    {
        return str.substring(str.length()-1);
    }
    public String formatPhoneNumber(String str1){
        return "("+str1.substring(0,3)+") "+str1.substring(3,6)+"-"+str1.substring(6);
    }
    public String middleThree(String str){
        return str.substring(str.length()/2-1, str.length()/2+2);
    }
    public String swapLastTwo (String str){
        return str.substring(0,str.length()-2)+str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1);
    }
    public boolean frontAgain (String str, int n){
        return str.substring(0,n).equals(str.substring(str.length()-n));
    }



}
