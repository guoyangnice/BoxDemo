import java.util.Date;

public class Box {
    /**
     * 宝箱编号
     */
    private int id;

    /**
     * 时间戳
     */
    private Date date;

    /**
     * hash值
     */
    private String hashValue;

    /**
     * 上一个宝箱hash值
     */
    private String lashBoxHashValue;

    /**
     * 神秘数字，当签未指定是何种类型的数字
     */
    private int mysteriousNumber;

    public Box(int id, Date date, String hashValue, String lashBoxHashValue, int mysteriousNumber) {
        this.id = id;
        this.date = date;
        this.hashValue = hashValue;
        this.lashBoxHashValue = lashBoxHashValue;
        this.mysteriousNumber = mysteriousNumber;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", hashValue='" + hashValue + '\'' +
                ", lashBoxHashValue='" + lashBoxHashValue + '\'' +
                ", mysteriousNumber='" + mysteriousNumber + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHashValue() {
        return hashValue;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    public String getLashBoxHashValue() {
        return lashBoxHashValue;
    }

    public void setLashBoxHashValue(String lashBoxHashValue) {
        this.lashBoxHashValue = lashBoxHashValue;
    }

    public int getMysteriousNumber() {
        return mysteriousNumber;
    }

    public void setMysteriousNumber(int mysteriousNumber) {
        this.mysteriousNumber = mysteriousNumber;
    }
}
