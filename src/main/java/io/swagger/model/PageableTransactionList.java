package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Paging;
import io.swagger.model.Transaction;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for page of transactions, data about total count of transactions and balances
 **/

@ApiModel(description = "Container for page of transactions, data about total count of transactions and balances")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class PageableTransactionList   {
  
  private List<Transaction> transactions = new ArrayList<Transaction>();
  private Paging paging = null;
  private BigDecimal income = null;
  private BigDecimal spending = null;
  private BigDecimal balance = null;

  /**
   * Array of transactions per page
   **/
  public PageableTransactionList transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of transactions per page")
  @JsonProperty("transactions")
  public List<Transaction> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }

  /**
   * Information for pagination
   **/
  public PageableTransactionList paging(Paging paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Information for pagination")
  @JsonProperty("paging")
  public Paging getPaging() {
    return paging;
  }
  public void setPaging(Paging paging) {
    this.paging = paging;
  }

  /**
   * The total income of all transactions
   **/
  public PageableTransactionList income(BigDecimal income) {
    this.income = income;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total income of all transactions")
  @JsonProperty("income")
  public BigDecimal getIncome() {
    return income;
  }
  public void setIncome(BigDecimal income) {
    this.income = income;
  }

  /**
   * The total spending of all transactions
   **/
  public PageableTransactionList spending(BigDecimal spending) {
    this.spending = spending;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total spending of all transactions")
  @JsonProperty("spending")
  public BigDecimal getSpending() {
    return spending;
  }
  public void setSpending(BigDecimal spending) {
    this.spending = spending;
  }

  /**
   * The total sum of all transactions
   **/
  public PageableTransactionList balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total sum of all transactions")
  @JsonProperty("balance")
  public BigDecimal getBalance() {
    return balance;
  }
  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageableTransactionList pageableTransactionList = (PageableTransactionList) o;
    return Objects.equals(transactions, pageableTransactionList.transactions) &&
        Objects.equals(paging, pageableTransactionList.paging) &&
        Objects.equals(income, pageableTransactionList.income) &&
        Objects.equals(spending, pageableTransactionList.spending) &&
        Objects.equals(balance, pageableTransactionList.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions, paging, income, spending, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageableTransactionList {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    spending: ").append(toIndentedString(spending)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

