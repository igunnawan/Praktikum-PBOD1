// Muhamad Gunawan
// 24060122120016

package list;

public class StackOfPoint extends Stack {
    public StackOfPoint() {

    }

    @Override
    public boolean cekElmtType(Object elmt) {
        return (elmt instanceof point);
    }

    @Override
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            if(getElmt(i) instanceof point P){
                P.cetak();
            }
        }
    }
    
    @Override
    public point getElmt(int i){
       return (point)super.getElmt(i);
    }
    
    @Override
    public point getTop(){
       return (point)super.getTop();
    }
}
