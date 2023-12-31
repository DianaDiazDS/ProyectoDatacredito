package edu.co.datacredito.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "loan")
public class Loan {

    @Id
    @Column(name = "id_loan")
    private Long idLoan;
    @Column(name = "report_type")
    private String reportType;
    @Column(name = "amount")
    private int amount;
    @Column(name = "term")
    private String term;
    @Column(name = "interest_rate")
    private double insterestRate;
    @Column(name = "loan_type")
    private String loanType;
    @Column(name = "last_payment_date")
    private String lastPaymentDate;
    @Column(name = "state")
    private String state;

    @Column(name = "branch_office")
    private String branchOffice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "fk_user" )
    private User user;

    public Loan() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public Long getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(Long idLoan) {
        this.idLoan = idLoan;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public double getInsterestRate() {
        return insterestRate;
    }

    public void setInsterestRate(double insterestRate) {
        this.insterestRate = insterestRate;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBranchOffice() {
        return branchOffice;
    }

    public void setBranchOffice(String branchOffice) {
        this.branchOffice = branchOffice;
    }
}
