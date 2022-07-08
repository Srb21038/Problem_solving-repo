import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        int x=0;
        HashMap<String,Integer> languages = new HashMap<>();
        languages.put("I",1);
        languages.put("V",5);
        languages.put("X",10);
        languages.put("L",50);
        languages.put("C",100);
        languages.put("D",500);
        languages.put("M",1000);
        for(int i=0;i<s.length();i++)
        {
          x = x+languages.get(s.charAt(i)); 
        }
        
    return x;
    }
  public static void main(string args[], String m)
  {
    System.out.println(romanToInt(m));
  }
  
}