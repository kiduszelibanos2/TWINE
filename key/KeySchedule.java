package twine.key;

public class KeySchedule {

    public static byte[][] generate(String key){

        byte[][] keys = new byte[36][16];

        for(int i=0;i<36;i++){

            for(int j=0;j<16;j++){

                keys[i][j]=(byte)((key.charAt(j%key.length())+i+j)&0x0F);

            }

        }

        return keys;

    }

}