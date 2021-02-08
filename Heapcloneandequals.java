package HW3;

public class Heapcloneandequals {
    public static void main(String[] args) throws CloneNotSupportedException {
        String[] s = {"h", "e","a","p","c", "l","o","n","e"};
        Heap heap1 = new Heap(s);
        Heap heap2 = (Heap)(heap1.clone());
        
        //After cloning
        System.out.println("heap1 size: " + heap1.getSize());
        System.out.println("heap2 size: " + heap2.getSize());
        System.out.println(heap1.equals(heap2));

        heap1.remove();
        System.out.println("After modifying heap1..");
        System.out.println("heap1 size: " + heap1.getSize());
        System.out.println("heap2 size: " + heap2.getSize());

        System.out.println(heap1.equals(heap2));
    }

    public static class Heap implements Cloneable {
        String[] strs;
        int len;
        public Heap (String[] strings) {
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
}
