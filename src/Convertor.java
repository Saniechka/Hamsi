import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Convertor {
    public static String convertStringtoBinary(String input){
        StringBuilder result = new StringBuilder();
        char[] chars =input.toCharArray();
        for(char aChar : chars){
            result.append(
                 String.format("%8s",Integer.toBinaryString(aChar))
                         .replaceAll(" ","0")
            );
        }
        return result.toString();
    }

    public static String goodViewOfBinary(String binary,  int blockSize,String separator ){
        List<String> result = new ArrayList<>();
        int index = 0;
         int i =0;
        while (index < binary.length()) {
            result.add(binary.substring(index, Math.min(index + blockSize, binary.length())));
            index += blockSize;

        }

        return result.stream().collect(Collectors.joining(separator));
    }

    public static  String convertToHamsi(String str){
        StringBuilder conv = new StringBuilder(str);
        if(str.length() % 256 ==0) {
            return str;
        }else{conv.append("1");
        while((conv.length()+32) % 256 != 0){
            conv.append("0");

        }}
        String sixbit =Integer.toBinaryString(str.length()) ;
        while((conv.length()+sixbit.length()) % 256 !=0){
            conv.append("0");}
        conv.append(sixbit);

        return conv.toString();
    }

    public static String [] convertToBloks(String bites, int blocksize){
        int k = bites.length()/blocksize;
        String[] bloks = new String[k];
        for (int i = 0; i < k; i++) {
            bloks[i]=bites.substring(i*k,(i+1)*k-1);
        }
        return bloks;
    }

    public static BigInteger convertBinToDecResult(String str){
        String result1 =convertStringtoBinary(str);
        String endResult =convertToHamsi(result1);
      BigInteger res = new BigInteger(endResult,2);
        return  res;

    }

    public static  ArrayList<String> convertToArrayForHamsi(String bin){
        int size = bin.length()/256;
        int start = 0;
        ArrayList list = new ArrayList();
        for (int i = 0; i < size; i++) {
            String substring = bin.substring(start,start+32);
             start +=32;
             list.add(substring);
        }
        return  list;
    }



    public static void main(String[] args) {

        String input = "Hello world" ;
        String result = convertStringtoBinary(input);
        System.out.println(result.length());
        System.out.println(result);
        String koniec= convertToHamsi(result);
        System.out.println(koniec );
        int k =koniec.length();
        System.out.println("длинна " +k);

        // pretty print the binary format
        System.out.println(goodViewOfBinary(koniec, 8, " "));

        System.out.println(convertBinToDecResult(input));


    }
}

