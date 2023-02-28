package com.projeto.pilha;

import com.projeto.no.No;

public class Pilha<T> {
    private No<T> refNo = null;

    public Pilha() {
        this.refNo = null;
    }

    public boolean isEmpty(){
        return(refNo == null);
    }

    public No<T> top(){
        return refNo;
    }

    public void push(T dado){
        No<T> refAuxiliar = refNo;
        refNo = new No<T>(dado);
        refNo.setNext(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No<T> noPopped = refNo;
            refNo = refNo.getNext();
            return noPopped;
        }
        return null;
    }
}
