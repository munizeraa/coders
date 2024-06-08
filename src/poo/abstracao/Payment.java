package poo.abstracao;

import java.util.Date;

public class Payment {
    private Date expirationDate;

    public Payment(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void pay(double amount) {
        System.out.printf(String.format("Paying with %.2f...", amount));
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}

class Teste {
    public static void main(String[] args) {
        Payment p = new Payment(new Date());
        p.pay(889);
    }
}
