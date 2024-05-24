// Muhamad Gunawan
// 24060122120016

package list;

public class StackOfNumber extends Stack {
    public StackOfNumber() {

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
    public Object getTop(){
       return (Object)super.getTop();
    }
}
