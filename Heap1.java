package HW3;

import HW3.Heapcloneandequals.Heap;

public class Heap1 implements Cloneable {
    String[] strs;
    int len;
    public Heap1 (String[] strings) {
        strs = new String[strings.length];
        for(int i=0; i< strings.length; i++) {
            strs[i] = strings[i];
        }
        len = strs.length;
    }

    public Heap clone() throws CloneNotSupportedException  {
        Heap cloned = (Heap)super.clone();
        return cloned;
    }

    public int getSize() {
        return len;
    }

    public boolean equals(Heap m) {
        if(len != m.len) {
            return false;
        }
        for(String st : strs) {
            if(!strs.equals(m.strs)) {
                return false;
            }
        }
        return  true;
    }

    public void remove() {
        if(len >0) {
            strs[len-1] = null;
        }
        len = len-1;
    }
}