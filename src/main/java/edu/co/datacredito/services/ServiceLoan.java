package edu.co.datacredito.services;

import edu.co.datacredito.models.Loan;
import edu.co.datacredito.repositories.IARepositoryLoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLoan {

    @Autowired
    private IARepositoryLoan iaRepositoryLoan;

    public List<Loan> listLoans() {
        return iaRepositoryLoan.findAll();
    }

    public Loan getLoan(Long idLoan) {
        return iaRepositoryLoan.findByIdLoanSQL(idLoan);
    }

    public Loan saveLoan(Loan loan) {
        if (loan.getUser().getScore() > 0) {
            iaRepositoryLoan.save(loan);
            return loan;
        } else {
            throw new IllegalArgumentException("El puntaje del usuario es menor o igual a cero.");
        }
    }

    public void deleteLoan(Long idLoan) {
        iaRepositoryLoan.deleteById(idLoan);
    }

    public Loan updateLoan(Long idLoan, Loan Loan) {
        Loan loan = iaRepositoryLoan.findByIdLoanSQL(idLoan);
        iaRepositoryLoan.save(Loan);
        return loan;
    }
}
