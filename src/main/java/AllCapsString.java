public class AllCapsString {
    String capsStr;

    public AllCapsString(String str){
        capsStr = str.toUpperCase();
    }

    public String getCapsStr() {
        return capsStr;
    }

    public void setCapsStr(String capsStr) {
        this.capsStr = capsStr.toUpperCase();
    }
}
