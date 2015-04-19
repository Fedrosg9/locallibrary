/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author synchris
 */
public class Rental {
    private int id;
    private int memeber_id;
    private int book_id;
    private Date RentalDate;
    private Date ReturnDate;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the memeber_id
     */
    public int getMemeber_id() {
        return memeber_id;
    }

    /**
     * @param memeber_id the memeber_id to set
     */
    public void setMemeber_id(int memeber_id) {
        this.memeber_id = memeber_id;
    }

    /**
     * @return the book_id
     */
    public int getBook_id() {
        return book_id;
    }

    /**
     * @param book_id the book_id to set
     */
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    /**
     * @return the RentalDate
     */
    public Date getRentalDate() {
        return RentalDate;
    }

    /**
     * @param RentalDate the RentalDate to set
     */
    public void setRentalDate(Date RentalDate) {
        this.RentalDate = RentalDate;
    }

    /**
     * @return the ReturnDate
     */
    public Date getReturnDate() {
        return ReturnDate;
    }

    /**
     * @param ReturnDate the ReturnDate to set
     */
    public void setReturnDate(Date ReturnDate) {
        this.ReturnDate = ReturnDate;
    }
    
}
