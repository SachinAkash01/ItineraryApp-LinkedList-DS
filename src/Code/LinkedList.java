/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author it21351372
 */
public class LinkedList {
    private Link first;
    
    public LinkedList(){
        first = null;
    }
    
    public Link getFirst(){
        return first;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void insertFirst(int no, String d, String p){
        Link linkObj = new Link(no,d,p);
        linkObj.next = first;
        first = linkObj;
    }
    
    public void insertLast(int no, String d, String p){
        Link linkObj = new Link(no,d,p);
        Link current = first;
        
        if (isEmpty()){
            first = linkObj;
        }
        else{
            while (current.next != null){
                current.next = linkObj;
            }
        }
    }
    
    public void deleteFirst(){
        first = first.next;
    }
    
    public void insertBefore(int key, int no,String d, String p){
        Link linkObj = new Link(no,d,p);
        Link current = first;
        Link previous = current;
        while (current != null){
            if (current.getDestinationNo() == key){
                if (current == first){
                    first = linkObj;
                }
                else{
                    previous = linkObj;
                }
            }
        }
    }
    
    public Link find(int no){
        Link current = first;
        
        while (current != null){
            if (current.getDestinationNo() == no){
                return current;
            }
            current = current.next;
        }
        
        return null;
    }
    
    public Link delete(int no){
        Link current = first;
        Link previous = current;
        while (current != null){
            if (current.getDestinationNo() == no){
                if (current == first){
                    first = first.next;
                }
                else{
                    previous.next = current.next;
                }
                return current;
            }
            else{
                previous = current;
                current = current.next;
            }
        }
        return null;
    }
}
