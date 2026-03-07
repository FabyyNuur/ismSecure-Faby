package sn.ism.cdsd.crypto;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
       // String chaine = "a1398967867843564785feb2";
        CryptoImpl crypto = new CryptoImpl();
        // SecretKey k = crypto.generateKey("mypass");
        // System.out.println(crypto.bytesToHexString(k.getEncoded()));
        // //crypto.saveHexkey(k, "macle.txt");
        // String message= "Bonjour tout le monde";
        // String encrypted = crypto.encrypt(message, k);
        
        // System.out.println("Message chiffré : " + encrypted);
        
        // String decrypted = crypto.decrypt(encrypted, k);
        // System.out.println("Message déchiffré : " + decrypted);

        crypto.encryptOrDecryptFile("MySecret.text","MySecret_deff.text","mypass",Cipher.ENCRYPT_MODE);

        crypto.encryptOrDecryptFile("MySecret_deff.text","MySecret2.text","mypass",Cipher.DECRYPT_MODE);

    }
}
