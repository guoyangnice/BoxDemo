import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<OpenBoxProperty> openBoxProperties = new ArrayList<>();
        OpenBoxProperty boxProperty =  open(1,"0");
        System.out.println("第"+1+"盒子的神秘数字:" + boxProperty.getMysteriousNumber());
        System.out.println("第"+1+"盒子的hashvalue:" + boxProperty.getHashValue());
        for(int id = 2;id <= 10;id++){
            openBoxProperties.add(boxProperty);
            boxProperty = open(id,boxProperty.getHashValue());
            System.out.println("第"+id+"盒子的神秘数字:" + boxProperty.getMysteriousNumber());
            System.out.println("第"+id+"盒子的hashvalue:" + boxProperty.getHashValue());
        }
    }

    private static OpenBoxProperty open(int id, String lastHashValue){
        OpenBoxProperty openBoxProperty = new OpenBoxProperty();
        String hashValue = "";
        for(int j = 1;j <= 2147483647;j++){
            hashValue = generaHashIncludeFiveZero(String.valueOf(id) + j + lastHashValue);
            if(hashValue.startsWith("00000")){
                openBoxProperty.setMysteriousNumber(j);
                openBoxProperty.setHashValue(hashValue);
                break;
            }
        }
        return openBoxProperty;
    }

    private static String generaHashIncludeFiveZero(String str){
        GeneraHashValue hashValue = new GeneraHashValue();
        String hashCode = hashValue.getSHA256(str);
        return hashCode;
    }

}
