package exo66.encryption;

import java.util.List;
import java.util.Map;

public class MainOccurence {
    public static void main(String[] args) {
        List<String> fileToTestOccurence = UploadFile.loadFile("b.txt");
        TestOccurence testOccurence =new TestOccurence();
        Map<Character, Integer> characterIntegerMap = testOccurence.testOccurence(fileToTestOccurence);
        System.out.println(characterIntegerMap);
        EncryptByDictionnary dictionnary = testOccurence.getDictionnary(fileToTestOccurence);
        List<String> decryptedFileByOccurence = dictionnary.decrypt(fileToTestOccurence);
        SaveData.saveData("c.txt",decryptedFileByOccurence);

        List<String> dico = UploadFile.loadFile("liste_francais.txt");
        System.out.println(gap(fileToTestOccurence, dico));

    }

    public static int gap(List<String> fileToTestOccurence, List<String> dico){
        int[] occurencesMatch = new int[50];
        for(int i=0;i<50;i++){
            int nb = 0;
            EncryptByGap encryptByGap =new EncryptByGap(i);
            List<String> decryptedTest = encryptByGap.decrypt(fileToTestOccurence);
            for(String line:decryptedTest){
                String[] s = line.split(" ");
                for(String mot: s) {
                    if(dico.contains(mot)) {
                        nb++;
                    }
                }
            }
            occurencesMatch[i] = nb;
        }
        int nb = 0;
        int max = -1;
        for(int i=0; i<occurencesMatch.length;i++) {
            if(max < occurencesMatch[i]) {
                nb = i;
                max = occurencesMatch[i];
            }
        }
        return nb;
    }
}
