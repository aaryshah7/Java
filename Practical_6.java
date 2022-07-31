//21CE124-Aary Shah
public class Practical_6 {
    public String[] wordsWithout(String[] words, String target) {
        int found = 0;
        
        for (int i = 0; i < words.length; i++) {
          if (words[i].equals(target))
            found++;
        }
        found = words.length - found;
        int place = 0;
        
        String[] str = new String[found];
        for (int j = 0; j < words.length; j++) {
          if (!words[j].equals(target)) {
            str[place] = words[j];
            place++;
          }
        }
        System.out.println(str);
        return str;
      }

      public static void main(String[] args) {
        Practical_6 p6=new Practical_6();
        String[] s={"a","b","c","d"};
        p6.wordsWithout(s, "a");
        System.out.println("21CE124-Aary Shah");
      }
}



