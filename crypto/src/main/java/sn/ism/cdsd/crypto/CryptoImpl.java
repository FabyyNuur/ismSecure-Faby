package sn.ism.cdsd.crypto;

import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.SecretKey;

public class CryptoImpl implements ICrypto {

    @Override
    public String bytesToHexString(byte[] bytes) {
        throw new UnsupportedOperationException("Unimplemented method 'bytesToHexString'");
    }

    @Override
    public byte[] hexStringToBytes(String hexString) {
        int len=hexString.length();
        byte[] bytes= new byte[len/2];
        for(int i=0; i<len; i+=2){
            char char1 = hexString.charAt(i);
            char char2 = hexString.charAt(i+1); 
            int b1 = Integer.parseInt(char1+"",16);
            int b2 = Integer.parseInt(char2+"", 16);
            bytes[i/2] = (byte)(b1 | (b2<<4) );
        }
        return bytes;
    }

    @Override
    public void saveHexkey(Key hexKey, String filePath) {
        throw new UnsupportedOperationException("Unimplemented method 'saveHexkey'");
    }

    @Override
    public Key loadHexKey(String filePath, String password) {
        throw new UnsupportedOperationException("Unimplemented method 'loadHexKey'");
    }

    @Override
    public SecretKey generateKey() {
        throw new UnsupportedOperationException("Unimplemented method 'generateKey'");
    }

    @Override
    public SecretKey generateKey(String password) {
        throw new UnsupportedOperationException("Unimplemented method 'generateKey'");
    }

    @Override
    public SecretKey generateKey(String password, String salt) {
        throw new UnsupportedOperationException("Unimplemented method 'generateKey'");
    }

    @Override
    public SecretKey generateKey(String password, String salt, String algorithm) {
        throw new UnsupportedOperationException("Unimplemented method 'generateKey'");
    }

    @Override
    public SecretKey generateKey(String password, String salt, String algorithm, int iterationCount) {
        throw new UnsupportedOperationException("Unimplemented method 'generateKey'");
    }

    @Override
    public SecretKey generateKey(String password, String salt, String algorithm, int iterationCount, int keyLength) {
        throw new UnsupportedOperationException("Unimplemented method 'generateKey'");
    }

    @Override
    public String encrypt(String data, Key key) {
        throw new UnsupportedOperationException("Unimplemented method 'encrypt'");
    }

    @Override
    public String decrypt(String data, Key key) {
        throw new UnsupportedOperationException("Unimplemented method 'decrypt'");
    }

    @Override
    public KeyPair generateKeyPair() {
        throw new UnsupportedOperationException("Unimplemented method 'generateKeyPair'");
    }

    @Override
    public KeyPair generateKeyPair(String algorithm) {
        throw new UnsupportedOperationException("Unimplemented method 'generateKeyPair'");
    }

    @Override
    public KeyPair generateKeyPair(String algorithm, int keySize) {
        throw new UnsupportedOperationException("Unimplemented method 'generateKeyPair'");
    }

    @Override
    public String encrypt(String data, PublicKey key) {
        throw new UnsupportedOperationException("Unimplemented method 'encrypt'");
    }

    @Override
    public String decrypt(String data, PrivateKey key) {
        throw new UnsupportedOperationException("Unimplemented method 'decrypt'");
    }
    
}
