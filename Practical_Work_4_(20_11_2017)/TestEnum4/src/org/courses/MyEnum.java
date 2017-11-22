package org.courses;

import java.util.ArrayList;

import java.util.List;

public class MyEnum {

    private static List<MyEnum> enumList = new ArrayList<>();
    private static int count = 0;

    private String name;
    private int ordinal;

    public MyEnum(String name) {
            this.name = name;
            enumList.add(this);
            ordinal = count++;
    }

    public MyEnum() {
    }

    public static List<MyEnum> values() {
        return enumList;
    }


    public String name(){
        return name;
    }

    public int ordinal(){
        return ordinal;
    }

    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null || !(object instanceof MyEnum)){
            return false;
        }
        final MyEnum tempEnum = (MyEnum)object;
        return (name == tempEnum.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + ordinal;
        return result;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(MyEnum myEnum) {
        if(this.getClass() != myEnum.getClass())throw new ClassCastException();
        return this.name.compareTo(myEnum.name);
    }
}
