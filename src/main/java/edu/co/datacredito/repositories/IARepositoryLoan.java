package edu.co.datacredito.repositories;

import edu.co.datacredito.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IARepositoryLoan extends JpaRepository<Loan, Long> {

  @Query(value = "SELECT * FROM LOAN WHERE ID_LOAN = :idLoan", nativeQuery =
  true) Loan findByIdLoanSQL(Long idLoan);
	 
}
