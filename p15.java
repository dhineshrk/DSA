public class p15 {
    public static void main(String[] args) {
        int n =3;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)((int)('A'+i)));
            }
            System.out.println();
        }
    }
}
