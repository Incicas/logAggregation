package com.armory.logsort;

public class ListNode {

    private String value;
    private ListNode next;

    public ListNode(String value, ListNode next){
        this.value = value;
        this.next = next;
    }
    public ListNode(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
    public ListNode getNext(){
        return next;
    }

    public void setValue(String newValue){
        value = newValue;
    }
    public void setNext(ListNode newNext){
        next = newNext;
    }
}
