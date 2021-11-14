package Algorithm.link_apply;

public class TestBracketsMatch {
    public static void main(String[] args) {
        String s1 = "()(){}[)";
        String s2 = "[}[]";
        String s3 = "(()(){}[]())";
        BracketsMatch bracketsMatch = new BracketsMatch();
        System.out.println("s1是否匹配：" + bracketsMatch.isValid(s1));
        System.out.println("s2是否匹配：" + bracketsMatch.isValid(s2));
        System.out.println("s3是否匹配：" + bracketsMatch.isValid(s3));
    }
}