package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Container for parameters for the execution of a submitted SEPA money transfer order
 **/

@ApiModel(description = "Container for parameters for the execution of a submitted SEPA money transfer order")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class ExecuteSepaMoneyTransferParams   {
  
  private Long accountId = null;
  private String bankingTan = null;

  /**
   * Identifier of the bank account that you want to transfer money from
   **/
  public ExecuteSepaMoneyTransferParams accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifier of the bank account that you want to transfer money from")
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  /**
   * Banking TAN that the user received from the bank for executing the money transfer order
   **/
  public ExecuteSepaMoneyTransferParams bankingTan(String bankingTan) {
    this.bankingTan = bankingTan;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Banking TAN that the user received from the bank for executing the money transfer order")
  @JsonProperty("bankingTan")
  public String getBankingTan() {
    return bankingTan;
  }
  public void setBankingTan(String bankingTan) {
    this.bankingTan = bankingTan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteSepaMoneyTransferParams executeSepaMoneyTransferParams = (ExecuteSepaMoneyTransferParams) o;
    return Objects.equals(accountId, executeSepaMoneyTransferParams.accountId) &&
        Objects.equals(bankingTan, executeSepaMoneyTransferParams.bankingTan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bankingTan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteSepaMoneyTransferParams {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bankingTan: ").append(toIndentedString(bankingTan)).append("\n");
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

