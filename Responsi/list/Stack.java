// Muhamad Gunawan
// 24060122120016

package list;

import java.util.List;

public abstract class Stack extends list {
    protected List<Object> listofpoint;
    
    public Stack() {
        super();
    }

    public boolean isEmpty() {
        return listofpoint.isEmpty();
    }

    public Object getTop() {
        if (!isEmpty()) {
            return listofpoint.get(listofpoint.size() - 1);
        } 
        else {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
    }
    @Override
    public void del() {
        if (!isEmpty()) {
            listofpoint.remove(getSize()-1);
        }
        else {
            System.out.println("Stack sudah kosong");
        }
    }

    @Override
    public void cetak() {
        System.out.println("Isi stack:");
        for (Object item : listofpoint) {
            System.out.println(item);
        }
    }
}
