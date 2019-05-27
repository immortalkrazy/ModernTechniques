package Loan;

import java.util.Date;

public class Loan {

      private double annualInterestRate;
      private int numberOfYears;
      private double loanAmount;
      private Date loanDate;

      public Loan() {
            this(1, 1, 1);
      }

      public Loan(double annualInterstRate, int numberOfYears, double loanAmount) {

            this.annualInterestRate = annualInterstRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new Date();
      }

}
