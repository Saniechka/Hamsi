public class Operations {

    public String [] c = {

            "76657273", "69746569", "74204c65", "7576656e",
            "2c204b61", "74686f6c", "69656b65", "20556e69"
    };



    public static String convertAndKonkaten(String[] c,String[] blocks){
        String [] constants = new String[c.length];
        for (int i = 0; i < c.length; i++) {
            int k = Integer.parseInt(c[i],16);
            constants[i] =Integer.toBinaryString(k).toString();
        }
        String konkatenacja=blocks[0]+blocks[1];

        for (int i = -1; i < 4; i=i+2) {
            if(i++ ==2){
                konkatenacja+=blocks[i+1]+blocks[i+2]+blocks[i+3]+blocks[i+4];
            }
            else {konkatenacja += constants[i+1]+ constants[i+2]+ constants[i+3]+ constants[i+4];}
        }
        konkatenacja+=blocks[6]+blocks[7];
        return konkatenacja;
    }


}
