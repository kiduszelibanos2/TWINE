package twine.permutation;

public class Permutation {

    static int[] P={

            0,9,2,13,
            4,11,6,15,
            8,1,10,3,
            12,5,14,7

    };

    public static void shuffle(byte[] state){

        byte[] temp = state.clone();

        for(int i=0;i<16;i++){

            state[P[i]]=temp[i];

        }

    }

}