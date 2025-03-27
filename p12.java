public class p12 {
    public static void main(String[] args) {
        int num=1;
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num+=1;
            }
            System.out.println();
        }
    }
}
