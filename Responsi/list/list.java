// Muhamad Gunawan
// 24060122120016

package list;

import java.util.ArrayList;
import java.util.List;

public abstract class list {
    protected List<Object> listofpoint;

    list() {
        listofpoint = new ArrayList<>();
    }
    
    public Object getElmt(int i) {
        return listofpoint.get(i);
    }

    public int getSize() {
        return listofpoint.size();
    }

    public void add(Object x) {
        this.listofpoint.add(x);
    }

    public abstract boolean cekElmtType(Object x);

    public abstract void del();

    public abstract void cetak ();

}
