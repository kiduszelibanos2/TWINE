package twine.sbox;

public class SBox {

    private static final int[] SBOX={

            12,0,15,10,
            2,11,9,5,
            8,3,13,7,
            1,14,6,4

    };

    public static byte substitute(byte value){

        return (byte)SBOX[value & 0x0F];

    }

}