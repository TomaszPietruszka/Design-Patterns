package eu.designPatterns.builderexample;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Marcin Szewczyk, 14.01.2020
 */
public class Transfer {
    String payerAccount;
    String receiverAccount;
    BigDecimal amount;
    String currency;
    LocalDate tradeDate;
    String title;
    String transactionType;
    String receiverName;
    String receiverAddress;

    public Transfer(String payerAccount, String receiverAccount, BigDecimal amount, String currency, LocalDate tradeDate, String title, String transactionType, String receiverName, String receiverAddress) {
        this.payerAccount = payerAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
        this.currency = currency;
        this.tradeDate = tradeDate;
        this.title = title;
        this.transactionType = transactionType;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public LocalDate getTradeDate() {
        return tradeDate;
    }

    public String getTitle() {
        return title;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "payerAccount='" + payerAccount + '\'' +
                ", receiverAccount='" + receiverAccount + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", tradeDate=" + tradeDate +
                ", title='" + title + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                '}';
    }
}
