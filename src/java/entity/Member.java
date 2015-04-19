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
public class Member {
    private int id;
    private String FName;
    private String LName;
    private String MName;
    private Date DateOfBith;
    private String IdentityNum;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the FName
     */
    public String getFName() {
        return FName;
    }

    /**
     * @param FName the FName to set
     */
    public void setFName(String FName) {
        this.FName = FName;
    }

    /**
     * @return the LName
     */
    public String getLName() {
        return LName;
    }

    /**
     * @param LName the LName to set
     */
    public void setLName(String LName) {
        this.LName = LName;
    }

    /**
     * @return the MName
     */
    public String getMName() {
        return MName;
    }

    /**
     * @param MName the MName to set
     */
    public void setMName(String MName) {
        this.MName = MName;
    }

    /**
     * @return the DateOfBith
     */
    public Date getDateOfBith() {
        return DateOfBith;
    }

    /**
     * @param DateOfBith the DateOfBith to set
     */
    public void setDateOfBith(Date DateOfBith) {
        this.DateOfBith = DateOfBith;
    }

    /**
     * @return the IdentityNum
     */
    public String getIdentityNum() {
        return IdentityNum;
    }

    /**
     * @param IdentityNum the IdentityNum to set
     */
    public void setIdentityNum(String IdentityNum) {
        this.IdentityNum = IdentityNum;
    }
}
