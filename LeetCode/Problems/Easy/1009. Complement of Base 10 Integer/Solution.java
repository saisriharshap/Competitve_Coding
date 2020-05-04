class Solution {
    public int bitwiseComplement(int N) {
        int len = Integer.toBinaryString(N).length();
        int num =1;
        while(len>0){
            N = N^num;
            num=num<<1;
            len--;
        }
        return N;
    }
}