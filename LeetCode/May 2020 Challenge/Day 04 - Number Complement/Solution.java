class Solution {
    public int findComplement(int num) {
        int n = 1;
        String str = Integer.toBinaryString(num);
        int len = str.length();
        while(len>0){
            num = num^n;
            n=n<<1;
            len--;
        }
        return num;
    }
}