package HUAWEI;
import java.util.Scanner;

public class NumOfIp {

        private static int a = 0;
        private static int b = 0;
        private static int c = 0;
        private static int d = 0;
        private static int e = 0;
        private static int error = 0;
        private static int p = 0;

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                String input = sc.next();
                String[] address = input.split("~");
                String ip = address[0];
                String mask = address[1];
                getInfo(ip, mask);
            }
            System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + error + " " + p);
        }

        private static void getInfo(String ip, String mask){
            String[] ipArr = ip.split("\\.");
            String[] maskArr = mask.split("\\.");
            if(ipArr.length !=4 || maskArr.length !=4){
                error++;
                return;
            }
            int[] ipInt = new int[4];
            int[] maskInt = new int[4];
            for(int i=0; i<4; i++){
                if(ipArr[i].equals(" ") || maskArr[i].equals(" ")){
                    error++;
                    return;
                }
                ipInt[i] = Integer.parseInt(ipArr[i]);
                maskInt[i] = Integer.parseInt(maskArr[i]);
                if( ipInt[i]>255 || maskInt[i]>255 ){
                    error++;
                    return;
                }
            }
            if( checkIpMask(ipInt, maskInt) ){
                int ipInt0 = ipInt[0];
                int ipInt1 = ipInt[1];
                if( ipInt0>=1 && ipInt0<=126 ){
                    a++;
                    if( ipInt0==10 )
                        p++;
                }else if( ipInt0>=128 && ipInt0<=191 ){
                    b++;
                    if( ipInt0==172 && ipInt1>=16 && ipInt1<=31 )
                        p++;
                }else if( ipInt0>=192 && ipInt0<=223 ){
                    c++;
                    if(  ipInt0==192 && ipInt1==168 )
                        p++;
                }else if( ipInt0>=224 && ipInt0<=239 ){
                    d++;
                }else if( ipInt0>=240 && ipInt0<=255 )
                    e++;
            }
        }

        private static boolean checkIpMask(int[] ipInt, int[] maskInt){
            if( checkMask(maskInt) == false ){
                error++;
                return false;
            }
            return true;
        }

        private static boolean checkMask(int[] maskInt){
            String s = "";
            for(int i = 0; i<4; i++){
                //返回int变量的二进制表示的字符串
                String str = Integer.toBinaryString( maskInt[i] );
                int pad = 8-str.length();
                if(str.length()<8){
                    for(int j=0; j<pad; j++)
                        str = "0"+str;
                }
                s += str;
            }
            int index = s.indexOf("0");
            String temp = s.substring(index+1);
            if(temp.contains("1")){
                return false;
            }else
                return true;
        }


}

