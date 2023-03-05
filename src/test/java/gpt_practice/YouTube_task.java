package gpt_practice;

public class YouTube_task {
    public static void isPoly(String s){
        String reversedTmp = new StringBuilder(s).reverse().toString();
        String reversed = reversedTmp.replaceAll("\\W","");
        boolean isPoly = s.equalsIgnoreCase(reversed);
        if(isPoly){
            System.out.println("Строка является палиндромом");
        }else{
            System.out.println("Строка не является палиндромом");
            System.out.println(reversed);
            System.out.println(s);
        }
    }
    public static void main(String[]args){
        String s = "A man, a plan, a canal: Panama";
        String s1 = s.replaceAll("\\W","");
        isPoly(s1);
    }
}
