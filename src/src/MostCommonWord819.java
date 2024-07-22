import java.util.*;


public class MostCommonWord819 {
   public String mostCommonWord(String paragraph,String[]banned){
       //금지어를 담을 Set
       Set<String>bannedSet = new HashSet<>(Arrays.asList(banned));

       //빈도수를 계산하기 위한 Map
       Map<String,Integer>wordCount = new HashMap<>();

       //문장을 소문자로 변환하고, 구두점을 제거한다.
       String normalizedStr = paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase();

       //단어를 분리한다.
       String [] words = normalizedStr.split("\\s+");

       for(String word: words){
           if(!bannedSet.contains(word)){
               wordCount.put(word, wordCount.getOrDefault(word,0)+1);
           }
       }
       //가장 빈번한 단어를 찾는다.
       String mostCommon = "";
       int maxCount = 0;
       for(Map.Entry<String,Integer>entry:wordCount.entrySet()){
           if(entry.getValue() > maxCount){
               mostCommon = entry.getKey();
               maxCount = entry.getValue();
           }
       }
       return mostCommon;
   }

//    public String mostCommonWord(String paragraph, String[] banned) {
//        // 금지어를 담을 배열
//        // 가장 빈출된 단어를 담을 배열
//
//        List<String>hit = new arrayList<>();
//        List<String>frequent = new arrayList<>();
//
//
//        for(String x:  paragraph.tokenizer(" ")){
//            if(banned[0].equals(x)){
//                hit.add(x);
//            }
//            else frequent.add(x);
//
//        }
//        for(int i = 0; i < frequent.length; i++){
//            String word = frequent[i];
//            if(word.equals(frequent[i]++)){
//                cnt++;
//            }
//        }
//        return word;
//    }
}
