public class ExpandString {
    public static void main(String[] args) {
        ExpandString("3(ab)4(cd)");
    }
    static void ExpandString(String str){
        StringBuffer output=new StringBuffer();
        int i,j,k;
        int n=str.length();
        for(i=0;i<n;i++){
            char ch=str.charAt(i);
            int count =ch-'0';
            StringBuffer temp = new StringBuffer();
            for( j=i+2;str.charAt(j)!=')';j++){
                temp.append(str.charAt(j));
            }
            for(k=1;k<=count;k++){
                output.append(temp);
            }
            i=j;
        }
        System.out.println(output);
    }
}
