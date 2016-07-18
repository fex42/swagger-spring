package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Container for parameters for a SEPA money transfer order request
 **/

@ApiModel(description = "Container for parameters for a SEPA money transfer order request")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class RequestSepaMoneyTransferParams   {
  
  private Long accountId = null;
  private String bankingPin = null;
  private String recipientName = null;
  private String recipientIban = null;
  private String recipientBic = null;
  private BigDecimal amount = null;
  private String purpose = null;
  private String twoStepProcedureId = null;

  /**
   * Identifier of the bank account that you want to transfer money from
   **/
  public RequestSepaMoneyTransferParams accountId(Long accountId) {
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
   * Online banking PIN. If a PIN is stored in the account's bank connection, then this field may remain unset. If the field is set though then it will always be used (even if there is some other PIN stored in the bank connection).
   **/
  public RequestSepaMoneyTransferParams bankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
    return this;
  }

  
  @ApiModelProperty(value = "Online banking PIN. If a PIN is stored in the account's bank connection, then this field may remain unset. If the field is set though then it will always be used (even if there is some other PIN stored in the bank connection).")
  @JsonProperty("bankingPin")
  public String getBankingPin() {
    return bankingPin;
  }
  public void setBankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
  }

  /**
   * Name of the recipient. Note: Neither finAPI nor the involved bank servers are guaranteed to validate the recipient name. Even if the recipient name does not depict the actual registered account holder of the specified recipient account, the money transfer request might still be successful.
   **/
  public RequestSepaMoneyTransferParams recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the recipient. Note: Neither finAPI nor the involved bank servers are guaranteed to validate the recipient name. Even if the recipient name does not depict the actual registered account holder of the specified recipient account, the money transfer request might still be successful.")
  @JsonProperty("recipientName")
  public String getRecipientName() {
    return recipientName;
  }
  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

  /**
   * IBAN of the recipient's account
   **/
  public RequestSepaMoneyTransferParams recipientIban(String recipientIban) {
    this.recipientIban = recipientIban;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "IBAN of the recipient's account")
  @JsonProperty("recipientIban")
  public String getRecipientIban() {
    return recipientIban;
  }
  public void setRecipientIban(String recipientIban) {
    this.recipientIban = recipientIban;
  }

  /**
   * BIC of the recipient's account. Note: This field is optional if - and only if - the bank connection of the account that you want to transfer money from supports the IBAN-Only money transfer. You can find this out via GET /bankConnections/<id>. Also note that when a BIC is given, then this BIC will be used for the money transfer request independent of whether it is required or not.
   **/
  public RequestSepaMoneyTransferParams recipientBic(String recipientBic) {
    this.recipientBic = recipientBic;
    return this;
  }

  
  @ApiModelProperty(value = "BIC of the recipient's account. Note: This field is optional if - and only if - the bank connection of the account that you want to transfer money from supports the IBAN-Only money transfer. You can find this out via GET /bankConnections/<id>. Also note that when a BIC is given, then this BIC will be used for the money transfer request independent of whether it is required or not.")
  @JsonProperty("recipientBic")
  public String getRecipientBic() {
    return recipientBic;
  }
  public void setRecipientBic(String recipientBic) {
    this.recipientBic = recipientBic;
  }

  /**
   * The amount to transfer. Must be a positive decimal number with at most two decimal places (e.g. 99.90)
   **/
  public RequestSepaMoneyTransferParams amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The amount to transfer. Must be a positive decimal number with at most two decimal places (e.g. 99.90)")
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * The purpose of the transfer transaction
   **/
  public RequestSepaMoneyTransferParams purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  
  @ApiModelProperty(value = "The purpose of the transfer transaction")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   * The bank-given ID of the two-step-procedure that should be used for the money transfer. For a list of available two-step-procedures, see the corresponding bank connection (GET /bankConnections). If this field is not set, then the bank connection's default two-step procedure will be used. Note that in this case, when the bank connection has no default two-step procedure set, then the service will return an error (see response messages for details).
   **/
  public RequestSepaMoneyTransferParams twoStepProcedureId(String twoStepProcedureId) {
    this.twoStepProcedureId = twoStepProcedureId;
    return this;
  }

  
  @ApiModelProperty(value = "The bank-given ID of the two-step-procedure that should be used for the money transfer. For a list of available two-step-procedures, see the corresponding bank connection (GET /bankConnections). If this field is not set, then the bank connection's default two-step procedure will be used. Note that in this case, when the bank connection has no default two-step procedure set, then the service will return an error (see response messages for details).")
  @JsonProperty("twoStepProcedureId")
  public String getTwoStepProcedureId() {
    return twoStepProcedureId;
  }
  public void setTwoStepProcedureId(String twoStepProcedureId) {
    this.twoStepProcedureId = twoStepProcedureId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSepaMoneyTransferParams requestSepaMoneyTransferParams = (RequestSepaMoneyTransferParams) o;
    return Objects.equals(accountId, requestSepaMoneyTransferParams.accountId) &&
        Objects.equals(bankingPin, requestSepaMoneyTransferParams.bankingPin) &&
        Objects.equals(recipientName, requestSepaMoneyTransferParams.recipientName) &&
        Objects.equals(recipientIban, requestSepaMoneyTransferParams.recipientIban) &&
        Objects.equals(recipientBic, requestSepaMoneyTransferParams.recipientBic) &&
        Objects.equals(amount, requestSepaMoneyTransferParams.amount) &&
        Objects.equals(purpose, requestSepaMoneyTransferParams.purpose) &&
        Objects.equals(twoStepProcedureId, requestSepaMoneyTransferParams.twoStepProcedureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bankingPin, recipientName, recipientIban, recipientBic, amount, purpose, twoStepProcedureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSepaMoneyTransferParams {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bankingPin: ").append(toIndentedString(bankingPin)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientIban: ").append(toIndentedString(recipientIban)).append("\n");
    sb.append("    recipientBic: ").append(toIndentedString(recipientBic)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    twoStepProcedureId: ").append(toIndentedString(twoStepProcedureId)).append("\n");
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

