package twine.cipher;

import twine.key.KeySchedule;
import twine.util.Utils;

public class TwineCipher {

    private String key;

    public TwineCipher(String key) {
        this.key = key;
    }

    public String encrypt(String text) {

        byte[] block = Utils.toBlock(text);

        byte[][] roundKeys = KeySchedule.generate(key);

        for(int i=0;i<36;i++){

            block = Encryption.round(block, roundKeys[i]);

        }

        return Utils.toHex(block);

    }
}