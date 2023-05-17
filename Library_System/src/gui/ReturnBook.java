/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Kimo Store
 */
public class ReturnBook extends javax.swing.JFrame {

    Book[] b = new Book[100];
    IssuedBook[] m = new IssuedBook[100];
    int counter = 0, counter1 = 0;
    Date Date;
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    public void readFile() throws FileNotFoundException {
        File f = new File("Books.txt");
        Scanner s = new Scanner(f);
        int i = 0;
        while (s.hasNext()) {
            String line = s.nextLine();
            String token[] = line.split(",");
            b[i] = new Book(token[0], token[1], token[2], token[3], token[4], token[5], token[6], token[7]);
            i++;

        }
        counter = i;

    }

    public void readFile1() throws FileNotFoundException {
        File f = new File("IssuedBooks.txt");
        Scanner s = new Scanner(f);
        int i = 0;
        while (s.hasNext()) {
            String line = s.nextLine();
            String token[] = line.split(",");
            m[i] = new IssuedBook(token[0], token[1], token[2], token[3], token[4], token[5]);
            i++;

        }
        counter1 = i;

    }

    public void delete(String call, String id) {
        for (int i = 0; i < counter1; i++) {
            if (id.equals(m[i].getStudentId()) && call.equals(m[i].getCallNo())) {
                m[i] = m[i + 1];
                counter1--;

            }
        }
        System.out.println("gui.ReturnBook.delete()");

    }

    public void changer(String call) {
        for (int i = 0; i < counter; i++) {
            if (call.equals(b[i].getCallNo())) {
                int newQuantity = Integer.parseInt(b[i].getQuantity()) + 1;
                b[i].setQuantity(String.valueOf(newQuantity));
                int newIssued = Integer.parseInt(b[i].getIssued()) - 1;
                b[i].setIssued(String.valueOf(newIssued));
            }
        }
        System.out.println("in changer()");
    }

    public void checkPenelty(String issuedDate) throws ParseException {
        Date date = new Date();
        String Date1 = format.format(date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Calendar c = Calendar.getInstance();

        c.setTime(sdf.parse(issuedDate));

        c.add(Calendar.DATE, 7);  

        issuedDate = sdf.format(c.getTime());
        System.out.println(Date1);
        System.out.println(issuedDate);
        
         if(Date1.compareTo(issuedDate) > 0){
            JOptionPane.showMessageDialog(this, "You Have penalty");
             
         }
         else{
               JOptionPane.showMessageDialog(this, "Books Returned Successfully");
         }
             

    }

    public boolean checkCallNo(String c) {
        for (int j = 0; j < counter1; j++) {
            if (c.equals(m[j].getCallNo())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkId(String id) {
        for (int j = 0; j < counter1; j++) {
            if (id.equals(m[j].getStudentId())) {
                return true;
            }
        }
        return false;
    }

    public void save() {
        PrintWriter p = null;
        try {
            File f = new File("Books.txt");
            p = new PrintWriter(f);
            for (int i = 0; i < counter; i++) {
                p.println(b[i].getId() + "," + b[i].getCallNo() + "," + b[i].getName() + "," + b[i].getAuthor() + "," + b[i].getPublisher() + "," + b[i].getQuantity() + "," + b[i].getIssued() + "," + b[i].getAdded_date());
            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeleteLibrarian.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            p.close();
        }

    }

    public void save1() {
        PrintWriter p = null;
        try {
            File f = new File("IssuedBooks.txt");
            p = new PrintWriter(f);
            Date date = new Date();
            for (int i = 0; i < counter1; i++) {
                
                p.println((i+1) + "," + m[i].getCallNo() + "," + m[i].getStudentId() + "," + m[i].getStudentName() + "," + m[i].getStudentContact() + "," +m[i].getIssueDate());
            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeleteLibrarian.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            p.close();
        }

    }

    /**
     * Creates new form ReturnBook1
     * @throws java.io.FileNotFoundException
     */
    public ReturnBook() throws FileNotFoundException {
        initComponents();
        readFile();
        readFile1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        callNo1 = new javax.swing.JTextField();
        id1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        callNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callNo1ActionPerformed(evt);
            }
        });

        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Book callno");

        jLabel3.setText("Student id");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Return Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("Note : check the book properly !");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Return Book");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(callNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(callNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void callNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_callNo1ActionPerformed

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LibrarianSection x = new LibrarianSection();
        this.hide();
        x.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String urCall = callNo1.getText();
        String urId = id1.getText();
        if (checkId(urId) && checkCallNo(urCall)) {
            try {
                delete(urCall, urId);
                changer(urCall);
                save();
                save1();
                int index = 0;
                for(int i = 0; i < counter1; i++){
                    if(urCall.equals(m[i].getIssueDate()))
                        index=i;
                }
                
                
                checkPenelty(m[index].getIssueDate());
                LibrarianSection x = new LibrarianSection();
                this.hide();
                x.setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Book CallNo or Student Id");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField callNo1;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
