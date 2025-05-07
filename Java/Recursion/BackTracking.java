class BackTracking {
    public static void printperm(String str, String per, int idx) {
        if(str.length() == 0) {
            System.out.println(per);
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printperm(newStr, per + curr, idx + 1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printperm(str, "", 0);
    }
}