/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Kimo Store
 */
public class IssuedBook {

    private String id;
    private String callNo;
    private String studentId;
    private String studentName;
    private String studentContact;
    private String issueDate;

    public IssuedBook(String id, String callNo, String studentId, String studentName, String studentContact, String issueDate) {
        this.id = id;
        this.callNo = callNo;
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentContact = studentContact;
        this.issueDate = issueDate;

    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the callNo
     */
    public String getCallNo() {
        return callNo;
    }

    /**
     * @param callNo the callNo to set
     */
    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the studentContact
     */
    public String getStudentContact() {
        return studentContact;
    }

    /**
     * @param studentContact the studentContact to set
     */
    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    /**
     * @return the issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

}
