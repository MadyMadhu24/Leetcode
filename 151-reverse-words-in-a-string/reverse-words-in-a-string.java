class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder answer=new StringBuilder();
        for (int index=words.length-1; index>=0; index--){
            answer.append(words[index]);
            if (index != 0){
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}