package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import java.math.BigDecimal;



/**
 * Cash flow
 **/

@ApiModel(description = "Cash flow")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class CashFlow   {
  
  private Category category = null;
  private BigDecimal income = null;
  private BigDecimal spending = null;
  private BigDecimal balance = null;

  /**
   * Category data
   **/
  public CashFlow category(Category category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Category data")
  @JsonProperty("category")
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }

  /**
   * The total calculated income for the given category
   **/
  public CashFlow income(BigDecimal income) {
    this.income = income;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total calculated income for the given category")
  @JsonProperty("income")
  public BigDecimal getIncome() {
    return income;
  }
  public void setIncome(BigDecimal income) {
    this.income = income;
  }

  /**
   * The total calculated spending for the given category
   **/
  public CashFlow spending(BigDecimal spending) {
    this.spending = spending;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total calculated spending for the given category")
  @JsonProperty("spending")
  public BigDecimal getSpending() {
    return spending;
  }
  public void setSpending(BigDecimal spending) {
    this.spending = spending;
  }

  /**
   * The calculated balance for the given category
   **/
  public CashFlow balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The calculated balance for the given category")
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
    CashFlow cashFlow = (CashFlow) o;
    return Objects.equals(category, cashFlow.category) &&
        Objects.equals(income, cashFlow.income) &&
        Objects.equals(spending, cashFlow.spending) &&
        Objects.equals(balance, cashFlow.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, income, spending, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlow {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

