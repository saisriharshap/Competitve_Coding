class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ran = new int[26];
        boolean flag = true;
        for(char c : ransomNote.toCharArray()){
            ran[c-'a']++;
        }
        int[] mag = new int[26];
        for(char c : magazine.toCharArray()){
            mag[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ran[i]!=0 && ran[i]>mag[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}