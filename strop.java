public class strop {
    public static void main(String[] args) {
        String str="hello";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }

        String result="";

        for(char i=0; i<str.length();i++){
            char ch =str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println("String after removing duplicates: " + result);

        //frequency of characters
        



    }
    
}