package Algorithm.string;

public class Apply {
    public void main(String[]args){
        String str1="String";
        String str2="h e l l o";
        System.out.println(str1.charAt(1));
        System.out.println(str1.length()); 
        System.out.println(str1.substring(0,2)); 
        System.out.println(str1.contains("str"));
        System.out.println(str1.equals("string"));
        System.out.println(str2.split(""));
        System.out.println(str1.trim());
        System.out.println(str1.indexOf("s"));
        System.out.println(str1.replace("s","ss"));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.concat("world"));
    }
}
