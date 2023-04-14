import java.util.Arrays;

public class Class {

    private int number;
    private String soz;
    private  int[] array;

    public Class() {
    }

    public Class(int number,String soz,int[]array) {
        this.number = number;
        this.soz=soz;
        this.array=array;

    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;


    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", soz='" + soz + '\'' +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}


