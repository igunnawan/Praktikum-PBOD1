// Muhamad Gunawan
// 24060122120016

package list;

public class QueueOfNumber extends Queue {
    public QueueOfNumber() {

    }

    @Override
    public boolean cekElmtType(Object elmt) {
        return (elmt instanceof Integer);
    }

    @Override
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            if(getElmt(i) instanceof Object P){
                ((StackOfNumber) P).cetak();
            }
        }
    }
    
    @Override
    public Object getElmt(int i){
       return (Object)super.getElmt(i);
    }
    
    @Override
    public Object getHead(){
       return (Object)super.getHead();
    }

    @Override
    public Object getTail(){
       return (Object)super.getTail();
    }

}

