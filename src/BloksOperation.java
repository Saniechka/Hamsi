public class BloksOperation {

    public static  int[] block( int[] data ){
        if(data.length != 4) throw  new IllegalArgumentException("Nieprawidłowa długosć bloków");
        int a = data[0];
        int b =data[1];
        int c = data[2];
        int d =data[3];

        a= a>>>13;
        c=c>>>3;
        b=b^a^c;
        d=d^c^(a<<3);
        b>>>=1;
        d>>>=7;
        a=a^b^d;
        c= c^d^(b<<7);
        a>>>=4;
        c>>>=22;
        data[0]=a;
        data[1]=b;
        data[2]=c;
        data[3]=d;
    return data;
    }
}
