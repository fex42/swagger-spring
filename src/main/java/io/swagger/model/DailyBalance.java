package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Balance data for a single day
 **/

@ApiModel(description = "Balance data for a single day")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class DailyBalance   {
  
  private String date = null;
  private BigDecimal balance = null;
  private BigDecimal income = null;
  private BigDecimal spending = null;
  private List<Long> transactions = new ArrayList<Long>();

  /**
   * Date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).
   **/
  public DailyBalance date(String date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * Calculated account balance at the end of the given day.
   **/
  public DailyBalance balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Calculated account balance at the end of the given day.")
  @JsonProperty("balance")
  public BigDecimal getBalance() {
    return balance;
  }
  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  /**
   * The sum of income of the given day.
   **/
  public DailyBalance income(BigDecimal income) {
    this.income = income;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The sum of income of the given day.")
  @JsonProperty("income")
  public BigDecimal getIncome() {
    return income;
  }
  public void setIncome(BigDecimal income) {
    this.income = income;
  }

  /**
   * The sum of spending of the given day.
   **/
  public DailyBalance spending(BigDecimal spending) {
    this.spending = spending;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The sum of spending of the given day.")
  @JsonProperty("spending")
  public BigDecimal getSpending() {
    return spending;
  }
  public void setSpending(BigDecimal spending) {
    this.spending = spending;
  }

  /**
   * Transactions for the given day
   **/
  public DailyBalance transactions(List<Long> transactions) {
    this.transactions = transactions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Transactions for the given day")
  @JsonProperty("transactions")
  public List<Long> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<Long> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyBalance dailyBalance = (DailyBalance) o;
    return Objects.equals(date, dailyBalance.date) &&
        Objects.equals(balance, dailyBalance.balance) &&
        Objects.equals(income, dailyBalance.income) &&
        Objects.equals(spending, dailyBalance.spending) &&
        Objects.equals(transactions, dailyBalance.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, balance, income, spending, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyBalance {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    spending: ").append(toIndentedString(spending)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

