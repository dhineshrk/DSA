public class p17 {
    public static void main(String[] args) {
        int n = 6;
        int start = 'A';
        for(int i=0;i<n;i++){
            for(char ch = (char)(int)(start+n-1-i);ch<=(char)(int)(start+n-1);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
