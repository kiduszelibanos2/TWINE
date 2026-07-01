package twine.cipher;

import twine.permutation.Permutation;
import twine.sbox.SBox;

public class Encryption {

    public static byte[] round(byte[] state, byte[] key){

        xor(state,key);

        substitute(state);

        permute(state);

        return state;
    }

    private static void xor(byte[] s, byte[] k){

        for(int i=0;i<s.length;i++){

            s[i]^=k[i];

        }

    }

    private static void substitute(byte[] s){

        for(int i=0;i<s.length;i++){

            s[i]=SBox.substitute(s[i]);

        }

    }

    private static void permute(byte[] s){

        Permutation.shuffle(s);

    }

}