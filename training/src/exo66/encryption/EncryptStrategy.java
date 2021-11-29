package exo66.encryption;

import java.util.List;

public interface EncryptStrategy {
    public List<String> encrypt(List<String> fileToEncrypt);
    public List<String> decrypt(List<String> fileToDecrypt);
}
