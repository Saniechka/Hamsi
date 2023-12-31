public class Counter {

    public static  int[]  XOR(String[] blocks){

     int[] a={ 0xff00f0f0, 0xccccaaaa, 0xf0f0cccc, 0xff00aaaa,
                0xccccaaaa, 0xf0f0ff00,	0xaaaacccc, 0xf0f0ff00,
                0xf0f0cccc,	0xaaaaff00,	0xccccff00,	0xaaaaf0f0,
                0xaaaaf0f0,	0xff00cccc,	0xccccf0f0,	0xff00aaaa};
     int [] s = new int[16];
     s[0] = Integer.parseInt(blocks[0])^a[0];
        for (int i = 1; i <15 ; i++) {
            s[i]= Integer.parseInt(blocks[i])^a[i];
        }
        s[15]= Integer.parseInt(blocks[15])^a[15];
        return s;
}
}
