public class substr {
    public static String substring(String str,int si,int ei){
        String substrr=" ";
        for(int i=si;i<=ei;i++){
            substrr+=str.charAt(i);
        }
        return substrr;
    }
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(substring(str, 0, 3));

        // or direclty method using string functions
        String strq="mamu ka phone";
        System.out.println("the another string using function of string ");
        System.out.println(strq.substring(0, 3));
    }
}
