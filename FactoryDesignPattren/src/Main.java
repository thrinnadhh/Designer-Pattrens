//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        solve("the sky is blue");
    }
}

public static String solve(String A) {
    char[] charArray = new char[A.length()];
    StringBuffer reversedString = new StringBuffer();
    for(int i=0;i<A.length();i++){
        charArray[i] = A.charAt(i);
    }
        int s = 0;
        while(s<A.length() && charArray[s]==' '){
            s++;
        }

        int e = A.length()-1;
        while(e>=0 && charArray[e]==' '){
            e--;
        }
        System.out.println(s+" "+e+" "+A.length());
        while(e>=s){
            if(charArray[e]==' '){
                reversedString.append(' ');
                while(e>s && charArray[e-1]==' '){
                    e--;
                }
            }
            else{
                reversedString.append(charArray[e]);
            }
            e--;
        }
        return reversedString.toString();
}

