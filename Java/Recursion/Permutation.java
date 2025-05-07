public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        perm(str, "");
    }
    public static void perm(String s, String per) {
        if(s.length() == 0){
            System.out.println(per);
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            String newS = s.substring(0, i) + s.substring(i + 1);
            perm(newS, per + curr);
        }
    }
}