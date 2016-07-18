package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Container for a bank account&#39;s data
 **/

@ApiModel(description = "Container for a bank account's data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class Account   {
  
  private Long id = null;
  private Long bankConnectionId = null;
  private String accountName = null;
  private String accountNumber = null;
  private String subAccountNumber = null;
  private String iban = null;
  private Long accountTypeId = null;
  private String accountTypeName = null;
  private BigDecimal balance = null;
  private String lastSuccessfulUpdate = null;
  private String lastUpdateAttempt = null;
  private Boolean isNew = false;


  public enum StatusEnum {
    UPDATED("UPDATED"),
    UPDATED_FIXED("UPDATED_FIXED"),
    DOWNLOAD_IN_PROGRESS("DOWNLOAD_IN_PROGRESS"),
    DOWNLOAD_FAILED("DOWNLOAD_FAILED"),
    DEPRECATED("DEPRECATED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;

  /**
   * Account identifier
   **/
  public Account id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Account identifier")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Identifier of the bank connection that this account belongs to
   **/
  public Account bankConnectionId(Long bankConnectionId) {
    this.bankConnectionId = bankConnectionId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifier of the bank connection that this account belongs to")
  @JsonProperty("bankConnectionId")
  public Long getBankConnectionId() {
    return bankConnectionId;
  }
  public void setBankConnectionId(Long bankConnectionId) {
    this.bankConnectionId = bankConnectionId;
  }

  /**
   * Account name
   **/
  public Account accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  
  @ApiModelProperty(value = "Account name")
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * (National) account number
   **/
  public Account accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "(National) account number")
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * Account's sub-account-number. Note that this field can change from 'null' to a value - or vice versa - any time when the account is being updated. This is subject to changes within the bank's internal account management.
   **/
  public Account subAccountNumber(String subAccountNumber) {
    this.subAccountNumber = subAccountNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Account's sub-account-number. Note that this field can change from 'null' to a value - or vice versa - any time when the account is being updated. This is subject to changes within the bank's internal account management.")
  @JsonProperty("subAccountNumber")
  public String getSubAccountNumber() {
    return subAccountNumber;
  }
  public void setSubAccountNumber(String subAccountNumber) {
    this.subAccountNumber = subAccountNumber;
  }

  /**
   * Account's IBAN. Note that this field can change from 'null' to a value - or vice versa - any time when the account is being updated. This is subject to changes within the bank's internal account management.
   **/
  public Account iban(String iban) {
    this.iban = iban;
    return this;
  }

  
  @ApiModelProperty(value = "Account's IBAN. Note that this field can change from 'null' to a value - or vice versa - any time when the account is being updated. This is subject to changes within the bank's internal account management.")
  @JsonProperty("iban")
  public String getIban() {
    return iban;
  }
  public void setIban(String iban) {
    this.iban = iban;
  }

  /**
   * Identifier of the account's type. Note that, in general, the type of an account can change any time when the account is being updated. This is subject to changes within the bank's internal account management. However, if the account's type has previously been changed explicitly (via the PATCH method), then the explicitly set type will NOT be automatically changed anymore, even if the type has changed on the bank side. <br/>1 = Checking,<br/>2 = Savings,<br/>3 = CreditCard,<br/>4 = Security,<br/>5 = Loan,<br/>6 = Pocket,<br/>7 = Membership
   **/
  public Account accountTypeId(Long accountTypeId) {
    this.accountTypeId = accountTypeId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifier of the account's type. Note that, in general, the type of an account can change any time when the account is being updated. This is subject to changes within the bank's internal account management. However, if the account's type has previously been changed explicitly (via the PATCH method), then the explicitly set type will NOT be automatically changed anymore, even if the type has changed on the bank side. <br/>1 = Checking,<br/>2 = Savings,<br/>3 = CreditCard,<br/>4 = Security,<br/>5 = Loan,<br/>6 = Pocket,<br/>7 = Membership")
  @JsonProperty("accountTypeId")
  public Long getAccountTypeId() {
    return accountTypeId;
  }
  public void setAccountTypeId(Long accountTypeId) {
    this.accountTypeId = accountTypeId;
  }

  /**
   * Name of the account's type
   **/
  public Account accountTypeName(String accountTypeName) {
    this.accountTypeName = accountTypeName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the account's type")
  @JsonProperty("accountTypeName")
  public String getAccountTypeName() {
    return accountTypeName;
  }
  public void setAccountTypeName(String accountTypeName) {
    this.accountTypeName = accountTypeName;
  }

  /**
   * Current account balance
   **/
  public Account balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  
  @ApiModelProperty(value = "Current account balance")
  @JsonProperty("balance")
  public BigDecimal getBalance() {
    return balance;
  }
  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  /**
   * Timestamp of when the account was last successfully updated. The value is returned in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).
   **/
  public Account lastSuccessfulUpdate(String lastSuccessfulUpdate) {
    this.lastSuccessfulUpdate = lastSuccessfulUpdate;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp of when the account was last successfully updated. The value is returned in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).")
  @JsonProperty("lastSuccessfulUpdate")
  public String getLastSuccessfulUpdate() {
    return lastSuccessfulUpdate;
  }
  public void setLastSuccessfulUpdate(String lastSuccessfulUpdate) {
    this.lastSuccessfulUpdate = lastSuccessfulUpdate;
  }

  /**
   * Timestamp of when the account was last tried to be imported or updated. The value is returned in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).
   **/
  public Account lastUpdateAttempt(String lastUpdateAttempt) {
    this.lastUpdateAttempt = lastUpdateAttempt;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp of when the account was last tried to be imported or updated. The value is returned in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).")
  @JsonProperty("lastUpdateAttempt")
  public String getLastUpdateAttempt() {
    return lastUpdateAttempt;
  }
  public void setLastUpdateAttempt(String lastUpdateAttempt) {
    this.lastUpdateAttempt = lastUpdateAttempt;
  }

  /**
   * Indicating whether this account is 'new' or not. Any newly imported account will have this flag initially set to true, and remain so until you set it to false (see PATCH /accounts/<id>). How you use this field is up to your interpretation, however it is recommended to set the flag to false for all accounts right after the initial import of the bank connection. This way, you will be able recognize accounts that get newly imported during a later update of the bank connection, by checking for any accounts with the flag set to true right after an update.
   **/
  public Account isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Indicating whether this account is 'new' or not. Any newly imported account will have this flag initially set to true, and remain so until you set it to false (see PATCH /accounts/<id>). How you use this field is up to your interpretation, however it is recommended to set the flag to false for all accounts right after the initial import of the bank connection. This way, you will be able recognize accounts that get newly imported during a later update of the bank connection, by checking for any accounts with the flag set to true right after an update.")
  @JsonProperty("isNew")
  public Boolean getIsNew() {
    return isNew;
  }
  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }

  /**
   * The current status of the account. Possible values are:<br/>&bull; <code>UPDATED</code> means that the account is up to date from finAPI's point of view. This means that no current import/update is running, and the previous import/update could successfully update the account's data (e.g. transactions and securities), and the bank given balance matched the transaction's calculated sum, meaning that no 'Zwischensaldo' was inserted.<br/>&bull; <code>UPDATED_FIXED</code> means that the account is up to date from finAPI's point of view (no current import/update is running, and the previous import/update could successfully update the account's data), BUT there was a deviation in the bank given balance which was fixed by a 'Zwischensaldo' transaction.<br/>&bull; <code>DOWNLOAD_IN_PROGRESS</code> means that the account's data is currently being imported/updated.<br/>&bull; <code>DOWNLOAD_FAILED</code> means that the account was delivered by the bank server and finAPI was able to match it, but could not successfully import/update the data (possible reasons: finAPI could not get the account's balance, or it could not parse all transactions/securities, or some different error has occurred. Note however that when we get a balance and just an empty list of transactions or securities, then this is regarded as valid and successful download. Reason: For some accounts that have very little activity, we may actually get no recent transactions but only a balance.<br/>&bull; <code>DEPRECATED</code> means that the account could no longer get matched with any account from the bank server. This can mean either that the account was terminated by the user and is no longer sent by the bank server, or that finAPI could no longer match it because the account's data (name, type, iban, account number, etc.) has been changed by the bank.
   **/
  public Account status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The current status of the account. Possible values are:<br/>&bull; <code>UPDATED</code> means that the account is up to date from finAPI's point of view. This means that no current import/update is running, and the previous import/update could successfully update the account's data (e.g. transactions and securities), and the bank given balance matched the transaction's calculated sum, meaning that no 'Zwischensaldo' was inserted.<br/>&bull; <code>UPDATED_FIXED</code> means that the account is up to date from finAPI's point of view (no current import/update is running, and the previous import/update could successfully update the account's data), BUT there was a deviation in the bank given balance which was fixed by a 'Zwischensaldo' transaction.<br/>&bull; <code>DOWNLOAD_IN_PROGRESS</code> means that the account's data is currently being imported/updated.<br/>&bull; <code>DOWNLOAD_FAILED</code> means that the account was delivered by the bank server and finAPI was able to match it, but could not successfully import/update the data (possible reasons: finAPI could not get the account's balance, or it could not parse all transactions/securities, or some different error has occurred. Note however that when we get a balance and just an empty list of transactions or securities, then this is regarded as valid and successful download. Reason: For some accounts that have very little activity, we may actually get no recent transactions but only a balance.<br/>&bull; <code>DEPRECATED</code> means that the account could no longer get matched with any account from the bank server. This can mean either that the account was terminated by the user and is no longer sent by the bank server, or that finAPI could no longer match it because the account's data (name, type, iban, account number, etc.) has been changed by the bank.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(id, account.id) &&
        Objects.equals(bankConnectionId, account.bankConnectionId) &&
        Objects.equals(accountName, account.accountName) &&
        Objects.equals(accountNumber, account.accountNumber) &&
        Objects.equals(subAccountNumber, account.subAccountNumber) &&
        Objects.equals(iban, account.iban) &&
        Objects.equals(accountTypeId, account.accountTypeId) &&
        Objects.equals(accountTypeName, account.accountTypeName) &&
        Objects.equals(balance, account.balance) &&
        Objects.equals(lastSuccessfulUpdate, account.lastSuccessfulUpdate) &&
        Objects.equals(lastUpdateAttempt, account.lastUpdateAttempt) &&
        Objects.equals(isNew, account.isNew) &&
        Objects.equals(status, account.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bankConnectionId, accountName, accountNumber, subAccountNumber, iban, accountTypeId, accountTypeName, balance, lastSuccessfulUpdate, lastUpdateAttempt, isNew, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bankConnectionId: ").append(toIndentedString(bankConnectionId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    subAccountNumber: ").append(toIndentedString(subAccountNumber)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    accountTypeId: ").append(toIndentedString(accountTypeId)).append("\n");
    sb.append("    accountTypeName: ").append(toIndentedString(accountTypeName)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    lastSuccessfulUpdate: ").append(toIndentedString(lastSuccessfulUpdate)).append("\n");
    sb.append("    lastUpdateAttempt: ").append(toIndentedString(lastUpdateAttempt)).append("\n");
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

