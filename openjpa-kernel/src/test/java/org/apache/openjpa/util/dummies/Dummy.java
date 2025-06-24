package org.apache.openjpa.util.dummies;

public class Dummy {
    private String str;
    private int i;

    public Dummy(String str, int i) {
        this.str = str;
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "str='" + str + '\'' +
                ", i=" + i +
                '}';
    }
}
