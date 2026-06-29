1class Solution {
2    public String removeStars(String s) {
3        StringBuilder stack=new StringBuilder();
4
5        for(char ch:s.toCharArray()){
6            if('*'==ch){
7                stack.deleteCharAt(stack.length()-1);
8            }else{
9                stack.append(ch);
10            }
11        }
12        return stack.toString();
13    }
14}