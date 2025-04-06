class Solution {
    public int myAtoi(String s) {
        
        s=s.trim();
        if(s.length()==0) return 0;
        int i=0;
        long ans=0;
        int sign=1;
        if(s.charAt(0)=='-') {
            sign=-1;
            i++;
        }
        else if(s.charAt(0)=='+'){
            i++;
        }
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch<'0'|| ch>'9')break;
            ans=ans*10+(ch-'0');

            if(sign*ans>Integer.MAX_VALUE ) return Integer.MAX_VALUE;
            if(sign*ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;

        }

            

        
        return (int)(ans*sign);


    }
}