package exo66.encryption;

import java.util.*;

public class TestOccurence {

    private List<String> testOccurence = new ArrayList<>();
    private Map<Character, Integer> occurencePerLetter = new HashMap<>();
    private String origin ="eaisnrtoludcmpégbvhfqyxjèàkwzêçôâîûùï";

    public Map<Character,Integer> testOccurence(List<String> encryptedFileToTest) {
        for (String line : encryptedFileToTest) {
            for (char c : line.toCharArray()) {
                if (c==' '){
                    continue;
                }
                if(occurencePerLetter.containsKey(c)){
                    occurencePerLetter.put(c,occurencePerLetter.get(c)+1);
                }
                else {
                    occurencePerLetter.put(c,1);
                }
            }
        }
        return occurencePerLetter;
    }

    private List<Map.Entry<Character, Integer>> ordonedOccurence(){
        return occurencePerLetter.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).toList();

    }

    private String getOccuredDictionnary(List<String> encryptedFileToTest){
        List<Map.Entry<Character, Integer>> entries = ordonedOccurence();
        List<Character> chars = entries.stream().map(Map.Entry::getKey).toList();
        String occuredDictionnary="";
        for (char c:chars) {
            occuredDictionnary +=c;
        }
        return occuredDictionnary;
    }

    public EncryptByDictionnary getDictionnary(List<String> encryptedFileToTest) {
        return new EncryptByDictionnary(this.origin, this.getOccuredDictionnary(encryptedFileToTest));
    }


}



