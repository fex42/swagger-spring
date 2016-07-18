package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CashFlow;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Cash flows
 **/

@ApiModel(description = "Cash flows")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class CashFlowList   {
  
  private List<CashFlow> cashFlows = new ArrayList<CashFlow>();
  private BigDecimal totalIncome = null;
  private BigDecimal totalSpending = null;
  private BigDecimal totalBalance = null;

  /**
   * Array of cash flows
   **/
  public CashFlowList cashFlows(List<CashFlow> cashFlows) {
    this.cashFlows = cashFlows;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of cash flows")
  @JsonProperty("cashFlows")
  public List<CashFlow> getCashFlows() {
    return cashFlows;
  }
  public void setCashFlows(List<CashFlow> cashFlows) {
    this.cashFlows = cashFlows;
  }

  /**
   * The total income
   **/
  public CashFlowList totalIncome(BigDecimal totalIncome) {
    this.totalIncome = totalIncome;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total income")
  @JsonProperty("totalIncome")
  public BigDecimal getTotalIncome() {
    return totalIncome;
  }
  public void setTotalIncome(BigDecimal totalIncome) {
    this.totalIncome = totalIncome;
  }

  /**
   * The total spending
   **/
  public CashFlowList totalSpending(BigDecimal totalSpending) {
    this.totalSpending = totalSpending;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total spending")
  @JsonProperty("totalSpending")
  public BigDecimal getTotalSpending() {
    return totalSpending;
  }
  public void setTotalSpending(BigDecimal totalSpending) {
    this.totalSpending = totalSpending;
  }

  /**
   * The total balance
   **/
  public CashFlowList totalBalance(BigDecimal totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total balance")
  @JsonProperty("totalBalance")
  public BigDecimal getTotalBalance() {
    return totalBalance;
  }
  public void setTotalBalance(BigDecimal totalBalance) {
    this.totalBalance = totalBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashFlowList cashFlowList = (CashFlowList) o;
    return Objects.equals(cashFlows, cashFlowList.cashFlows) &&
        Objects.equals(totalIncome, cashFlowList.totalIncome) &&
        Objects.equals(totalSpending, cashFlowList.totalSpending) &&
        Objects.equals(totalBalance, cashFlowList.totalBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashFlows, totalIncome, totalSpending, totalBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashFlowList {\n");
    
    sb.append("    cashFlows: ").append(toIndentedString(cashFlows)).append("\n");
    sb.append("    totalIncome: ").append(toIndentedString(totalIncome)).append("\n");
    sb.append("    totalSpending: ").append(toIndentedString(totalSpending)).append("\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
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

