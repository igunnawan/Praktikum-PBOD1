// Muhamad Gunawan
// 24060122120016

package list;

public class MList {
    public static void main(String[] args){
        try {
            System.out.println("-----StackOfNumber S1-----");
            StackOfNumber S1 = new StackOfNumber();
            S1.add(16);
            S1.add(23);
            S1.add(56);
            S1.del();
            S1.add(99);
            S1.cetak();
            System.out.println("TOP Element : " + S1.getTop());
            
            // System.out.println("-----StackOfPoints S2-----");
            // StackOfPoint S2 = new StackOfPoint();
            // S2.add(new point(4.0,5.0));
            // S2.add(new point(9.0,7.0));
            // S2.add(new point(4.0,5.0));
            // S2.del();
            // S2.add(new point(10.0,5.0));
            // S2.cetak();
            // System.out.print("TOP Element : "); S2.getTop().cetak();
            
            // System.out.println("-----QueueOfNumber Q1-----");
            // QueueOfNumber Q1 = new QueueOfNumber();
            // Q1.add(12.0);
            // Q1.add(23.0);
            // Q1.add(56.0);
            // Q1.del();
            // Q1.add(99.0);
            // Q1.cetak();
            // System.out.println("HEAD Element : " + Q1.getHead());
            // System.out.println("TAIL Element : " + Q1.getTail());
            
            // System.out.println("-----QueueOfPoints Q2-----");
            // QueueOfPoint Q2 = new QueueOfPoint();
            // Q2.add(new point(34.0,89.0));
            // Q2.add(new point(-76.0,90.0));
            // Q2.add(new point(0.0,0.0));
            // Q2.del();
            // Q2.add(new point(-10,-10));
            // Q2.cetak();
            // System.out.println("HEAD Element : ");
            // Q2.getHead().cetak();
            // System.out.println("TAIL Element : ");
            // Q2.getTail().cetak();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
