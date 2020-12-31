import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
    //神秘数字最大值
    private static final int MAX_MYSTERIOUS_NUMBER = 2147483647;

    //hash值的特定开头
    private static final String HASH_HEAD = "00000";

    //盒子的数量
    private static final int MAX_BOX_NUMBER = 10;

    public static void main(String[] args) {
        OpenBoxProperty boxProperty =  open(1,"0");
        System.out.println("第"+ 1 +"个盒子的神秘数字:" + boxProperty.getMysteriousNumber());
        System.out.println("第"+ 1 +"个盒子的hashvalue:" + boxProperty.getHashValue());
        System.out.println("第"+ 1 +"个盒子已开启");
        for(int id = 2;id <= MAX_BOX_NUMBER;id++){
            boxProperty = open(id,boxProperty.getHashValue());
            System.out.println("第"+id+"个盒子的神秘数字:" + boxProperty.getMysteriousNumber());
            System.out.println("第"+id+"个盒子的神秘hashvalue:" + boxProperty.getHashValue());
            System.out.println("第"+id+"个盒子已开启");
        }
    }

    //打开盒子，由于需求变更，去掉时间戳
    public static OpenBoxProperty open(int id, String lastHashValue){
        OpenBoxProperty openBoxProperty = new OpenBoxProperty();
        String hashValue = "";
        for(int j = 1;j <= MAX_MYSTERIOUS_NUMBER;j++){
            hashValue = generaHashIncludeFiveZero(String.valueOf(id) + j + lastHashValue);
            if(hashValue.startsWith(HASH_HEAD)){
                openBoxProperty.setMysteriousNumber(j);
                openBoxProperty.setHashValue(hashValue);
                break;
            }
        }
        return openBoxProperty;
    }

    /**
     * 获取hash值
     * @param str
     * @return
     */
    private static String generaHashIncludeFiveZero(String str){
        GeneraHashValue hashValue = new GeneraHashValue();
        String hashCode = hashValue.getSHA256(str);
        return hashCode;
    }

}
