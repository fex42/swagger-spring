package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Container for bank connection credentials
 **/

@ApiModel(description = "Container for bank connection credentials")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class BankConnectionParams   {
  
  private String bankingUserId = null;
  private String bankingCustomerId = null;
  private String bankingPin = null;
  private String defaultTwoStepProcedureId = null;

  /**
   * New online banking user ID. If you do not want to change the current user ID let this field remain unset. Note that you cannot clear the current user ID, i.e. a bank connection must always have a user ID
   **/
  public BankConnectionParams bankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
    return this;
  }

  
  @ApiModelProperty(value = "New online banking user ID. If you do not want to change the current user ID let this field remain unset. Note that you cannot clear the current user ID, i.e. a bank connection must always have a user ID")
  @JsonProperty("bankingUserId")
  public String getBankingUserId() {
    return bankingUserId;
  }
  public void setBankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
  }

  /**
   * New online banking customer ID. If you do not want to change the current customer ID let this field remain unset. If you want to clear the current customer ID, set the field's value to an empty string (\"\").
   **/
  public BankConnectionParams bankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
    return this;
  }

  
  @ApiModelProperty(value = "New online banking customer ID. If you do not want to change the current customer ID let this field remain unset. If you want to clear the current customer ID, set the field's value to an empty string (\"\").")
  @JsonProperty("bankingCustomerId")
  public String getBankingCustomerId() {
    return bankingCustomerId;
  }
  public void setBankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
  }

  /**
   * New online banking PIN. If you do not want to change the current PIN let this field remain unset. If you want to clear the current PIN, set the field's value to an empty string (\"\").
   **/
  public BankConnectionParams bankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
    return this;
  }

  
  @ApiModelProperty(value = "New online banking PIN. If you do not want to change the current PIN let this field remain unset. If you want to clear the current PIN, set the field's value to an empty string (\"\").")
  @JsonProperty("bankingPin")
  public String getBankingPin() {
    return bankingPin;
  }
  public void setBankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
  }

  /**
   * New default two-step-procedure. Must match the 'procedureId' of one of the procedures that are listed in the bank connection. If you do not want to change this field let it remain unset. If you want to clear the current default two-step-procedure, set the field's value to an empty string (\"\").
   **/
  public BankConnectionParams defaultTwoStepProcedureId(String defaultTwoStepProcedureId) {
    this.defaultTwoStepProcedureId = defaultTwoStepProcedureId;
    return this;
  }

  
  @ApiModelProperty(value = "New default two-step-procedure. Must match the 'procedureId' of one of the procedures that are listed in the bank connection. If you do not want to change this field let it remain unset. If you want to clear the current default two-step-procedure, set the field's value to an empty string (\"\").")
  @JsonProperty("defaultTwoStepProcedureId")
  public String getDefaultTwoStepProcedureId() {
    return defaultTwoStepProcedureId;
  }
  public void setDefaultTwoStepProcedureId(String defaultTwoStepProcedureId) {
    this.defaultTwoStepProcedureId = defaultTwoStepProcedureId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankConnectionParams bankConnectionParams = (BankConnectionParams) o;
    return Objects.equals(bankingUserId, bankConnectionParams.bankingUserId) &&
        Objects.equals(bankingCustomerId, bankConnectionParams.bankingCustomerId) &&
        Objects.equals(bankingPin, bankConnectionParams.bankingPin) &&
        Objects.equals(defaultTwoStepProcedureId, bankConnectionParams.defaultTwoStepProcedureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankingUserId, bankingCustomerId, bankingPin, defaultTwoStepProcedureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankConnectionParams {\n");
    
    sb.append("    bankingUserId: ").append(toIndentedString(bankingUserId)).append("\n");
    sb.append("    bankingCustomerId: ").append(toIndentedString(bankingCustomerId)).append("\n");
    sb.append("    bankingPin: ").append(toIndentedString(bankingPin)).append("\n");
    sb.append("    defaultTwoStepProcedureId: ").append(toIndentedString(defaultTwoStepProcedureId)).append("\n");
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

