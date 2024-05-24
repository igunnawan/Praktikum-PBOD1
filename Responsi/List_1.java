/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.ArrayList;

/**
 *
 * @author USER
 */
public abstract class List {
    //atribut
    protected ArrayList<Object> list;
    
    //constructor
    List(){
        list = new ArrayList<>();
    }
    
    //method
    public int getSize(){
        //TODO gunakan .size()
    }
    
    public Object getElmt(int i){
        //TODO gunakan .get(i)
    }
    
    public abstract boolean cekElmtType(Object elmt);
    
    public void add(Object elmt) throws Exception{
        if(cekElmtType(elmt)){
            //TODO gunakan addLast
        }else{
            //TODO gunakan throw new Exception
        }
    }
   
    public abstract void del();
    
    public abstract void cetak();
}
