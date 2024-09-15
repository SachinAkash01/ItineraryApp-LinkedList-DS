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
public class Link {
    private int destinationNo;
    private String description;
    private String photo;
    public Link next;

    public Link(int destinationNo, String description, String photo) {
        this.destinationNo = destinationNo;
        this.description = description;
        this.photo = photo;
        this.next = null;
    }

    public int getDestinationNo() {
        return destinationNo;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoto() {
        return photo;
    }
    
}
