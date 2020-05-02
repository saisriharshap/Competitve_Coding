class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] a = J.toCharArray();
        char[] b = S.toCharArray();
        int count = 0;
        for(char c : b){
            for( char t : a){
                if(c==t)
                    count++;
            }
        }
        return count;
    }
}