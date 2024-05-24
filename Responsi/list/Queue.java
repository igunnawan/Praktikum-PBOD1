// Muhamad Gunawan
// 24060122120016

package list;

import java.util.List;

public abstract class Queue extends list {
    protected List<Object> listofpoint;
    //constructor
    
    public Queue(){
        super();
    }
    
    public boolean isEmpty() {
        return listofpoint.isEmpty();
    }

    public Object getHead(){
        return getElmt(0);
    }
    
    public Object getTail(){
        return getElmt(getSize()-1);
    }
     
    @Override
    public void del(){
        if (!isEmpty()) {
            listofpoint.remove(getSize()-1);
        }
        else {
            System.out.println("Queue sudah kosong");
        }
    }
    
    @Override
    public void cetak(){
        System.out.println("Isi stack:");
        for (Object item : listofpoint) {
            System.out.println(item);
        }
    }
}