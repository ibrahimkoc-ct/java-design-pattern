package com.ba.facade;

public class EncryptorFacade {


    private AESEncryptor aesEncryptor = new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor= new SHAEncryptor();

    public void encrypt(String text, EncType encType) {
        switch (encType) {
            case AES: aesEncryptor.encrypt(text); break;
            case MD5: md5Encryptor.encrypt(text, "KEY"); break;
            case SHA:shaEncryptor.encrypt(text, "KEY", true); break;
            default: throw new IllegalArgumentException(encType.toString());
        }
    }

    public enum EncType {
        SHA,
        MD5,
        AES
    }
}
//Facede pattern bize bir sistem geli�tirilirken kullan�c�ya kolayl�k ve kod kalabal�g�n� azaltmak i�in arka planda yap�lan i�lemleri kullan�c�ya bir method yard�m�yla dogrudan verir
