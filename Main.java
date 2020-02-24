package com.company;

public class Main {
    public static boolean func(String string , String pattern){
        string += " " ;
        pattern += " " ;
        int j=0 ;
        int same ;
        for (int i = 0 ; i < string.length() ; i++,j++) {
            int t=0 ;
            if (string.charAt(i) != pattern.charAt(j)) {
                if(string.charAt(i) == '*'){
                    same = j;
                    while (same<pattern.length()) {
                        if(pattern.charAt(same) == string.charAt(i+1)){
                            t++;
                        }
                        same++;
                    }
                    if(t==0){return false;}
                    while (pattern.charAt(j) != string.charAt(i + 1)) {
                        j++;//i=2
                    }
                    i++;
                    int patternRest = pattern.length() - j ;//he*lo , heasdlo      2
                    int stringRest = string.length() - i  ;//j=5     i=3        2
                    String prest = " " ;
                    String srest = " ";
                    int r = j;//r=5
                    for (int k = 0; k < patternRest ; k++,r++) {
                        prest += pattern.charAt(r);//lo
                    }
                    int s = i;//s=
                    for (int l = 0; l < stringRest ; l++,s++) {
                        srest += string.charAt(s);//lo
                    }
                    func(srest,prest);
                }
                /*else if (string.charAt(i) == '!'){
                    if(pattern.charAt(j) == string.charAt(i-1)){

                    }
                    else {
                        return false ;
                    }
                }*/
                else{
                    return false ;
                }
            }
            else {}
        }
        return true ;
    }
    public static void main(String[] args) {
            String st1 = "T*It*y" ;
            String st2 = "TakeItEasi" ;
        System.out.println(func(st1 , st2));
        }

}
