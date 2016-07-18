package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TwoStepProcedure;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for a bank connection&#39;s data
 **/

@ApiModel(description = "Container for a bank connection's data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class BankConnection   {
  
  private Long id = null;
  private Long bankId = null;
  private String bankingUserId = null;
  private String bankingCustomerId = null;
  private String bankingPin = null;


  public enum TypeEnum {
    ONLINE("ONLINE"),
    DEMO("DEMO");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;


  public enum UpdateStatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    READY("READY");

    private String value;

    UpdateStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private UpdateStatusEnum updateStatus = null;


  public enum CategorizationStatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    PENDING("PENDING"),
    READY("READY");

    private String value;

    CategorizationStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CategorizationStatusEnum categorizationStatus = null;
  private List<TwoStepProcedure> twoStepProcedures = new ArrayList<TwoStepProcedure>();
  private Boolean ibanOnlyMoneyTransferSupported = false;
  private String defaultTwoStepProcedureId = null;
  private List<Long> accountIds = new ArrayList<Long>();

  /**
   * Bank connection identifier
   **/
  public BankConnection id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Bank connection identifier")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Identifier of the bank that this connection belongs to
   **/
  public BankConnection bankId(Long bankId) {
    this.bankId = bankId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifier of the bank that this connection belongs to")
  @JsonProperty("bankId")
  public Long getBankId() {
    return bankId;
  }
  public void setBankId(Long bankId) {
    this.bankId = bankId;
  }

  /**
   * Stored online banking user ID credential
   **/
  public BankConnection bankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Stored online banking user ID credential")
  @JsonProperty("bankingUserId")
  public String getBankingUserId() {
    return bankingUserId;
  }
  public void setBankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
  }

  /**
   * Stored online banking customer ID credential
   **/
  public BankConnection bankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
    return this;
  }

  
  @ApiModelProperty(value = "Stored online banking customer ID credential")
  @JsonProperty("bankingCustomerId")
  public String getBankingCustomerId() {
    return bankingCustomerId;
  }
  public void setBankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
  }

  /**
   * Stored online banking PIN. Note that each symbol of the PIN is distorted with an 'X' character.
   **/
  public BankConnection bankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
    return this;
  }

  
  @ApiModelProperty(value = "Stored online banking PIN. Note that each symbol of the PIN is distorted with an 'X' character.")
  @JsonProperty("bankingPin")
  public String getBankingPin() {
    return bankingPin;
  }
  public void setBankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
  }

  /**
   * Bank connection type
   **/
  public BankConnection type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Bank connection type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Current status of transactions download. The POST /bankConnections/import and POST /bankConnections/<id>/update services will set this flag to IN_PROGRESS before they return. Once the import or update has finished, the status will be changed to READY.
   **/
  public BankConnection updateStatus(UpdateStatusEnum updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Current status of transactions download. The POST /bankConnections/import and POST /bankConnections/<id>/update services will set this flag to IN_PROGRESS before they return. Once the import or update has finished, the status will be changed to READY.")
  @JsonProperty("updateStatus")
  public UpdateStatusEnum getUpdateStatus() {
    return updateStatus;
  }
  public void setUpdateStatus(UpdateStatusEnum updateStatus) {
    this.updateStatus = updateStatus;
  }

  /**
   * Current status of transactions categorization. The asynchronous download process that is triggered by a call of the POST /bankConnections/import and POST /bankConnections/<id>/update services will set this flag to PENDING once the download has finished and a categorization is scheduled for the imported transactions. A separate categorization thread will then start to categorize the transactions (during this process, the status is IN_PROGRESS). When categorization has finished, the status will be (re-)set to READY. Note that the current categorization status should only be queried after the download has finished, i.e. once the download status has switched from IN_PROGRESS to READY.
   **/
  public BankConnection categorizationStatus(CategorizationStatusEnum categorizationStatus) {
    this.categorizationStatus = categorizationStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Current status of transactions categorization. The asynchronous download process that is triggered by a call of the POST /bankConnections/import and POST /bankConnections/<id>/update services will set this flag to PENDING once the download has finished and a categorization is scheduled for the imported transactions. A separate categorization thread will then start to categorize the transactions (during this process, the status is IN_PROGRESS). When categorization has finished, the status will be (re-)set to READY. Note that the current categorization status should only be queried after the download has finished, i.e. once the download status has switched from IN_PROGRESS to READY.")
  @JsonProperty("categorizationStatus")
  public CategorizationStatusEnum getCategorizationStatus() {
    return categorizationStatus;
  }
  public void setCategorizationStatus(CategorizationStatusEnum categorizationStatus) {
    this.categorizationStatus = categorizationStatus;
  }

  /**
   * Available two-step-procedures for this bank connection, e.g. for submitting a money transfer request (see /accounts/requestSepaMoneyTransfer). The available two-step-procedures are re-evaluated each time this bank connection is updated (/bankConnections/update). This means that this list may change as a result of an update.
   **/
  public BankConnection twoStepProcedures(List<TwoStepProcedure> twoStepProcedures) {
    this.twoStepProcedures = twoStepProcedures;
    return this;
  }

  
  @ApiModelProperty(value = "Available two-step-procedures for this bank connection, e.g. for submitting a money transfer request (see /accounts/requestSepaMoneyTransfer). The available two-step-procedures are re-evaluated each time this bank connection is updated (/bankConnections/update). This means that this list may change as a result of an update.")
  @JsonProperty("twoStepProcedures")
  public List<TwoStepProcedure> getTwoStepProcedures() {
    return twoStepProcedures;
  }
  public void setTwoStepProcedures(List<TwoStepProcedure> twoStepProcedures) {
    this.twoStepProcedures = twoStepProcedures;
  }

  /**
   * Whether this bank connection accepts money transfer requests where the recipient's account is defined just by the IBAN (without an additional BIC). This field is re-evaluated each time this bank connection is updated. See also: /accounts/requestSepaMoneyTransfer
   **/
  public BankConnection ibanOnlyMoneyTransferSupported(Boolean ibanOnlyMoneyTransferSupported) {
    this.ibanOnlyMoneyTransferSupported = ibanOnlyMoneyTransferSupported;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Whether this bank connection accepts money transfer requests where the recipient's account is defined just by the IBAN (without an additional BIC). This field is re-evaluated each time this bank connection is updated. See also: /accounts/requestSepaMoneyTransfer")
  @JsonProperty("ibanOnlyMoneyTransferSupported")
  public Boolean getIbanOnlyMoneyTransferSupported() {
    return ibanOnlyMoneyTransferSupported;
  }
  public void setIbanOnlyMoneyTransferSupported(Boolean ibanOnlyMoneyTransferSupported) {
    this.ibanOnlyMoneyTransferSupported = ibanOnlyMoneyTransferSupported;
  }

  /**
   * The default two-step-procedure. Must match one of the available 'procedureId's from the 'twoStepProcedures' list. When this field is set, you can execute two-step-procedures (e.g. accounts/requestSepaMoneyTransfer) without having to give a procedure explicitly. finAPI will use the default procedure in such cases. Note that the list of available procedures of a bank connection may change as a result of an update of the connection, and if this field references a procedure that is no longer available, finAPI will automatically clear the default procedure (set it to null.
   **/
  public BankConnection defaultTwoStepProcedureId(String defaultTwoStepProcedureId) {
    this.defaultTwoStepProcedureId = defaultTwoStepProcedureId;
    return this;
  }

  
  @ApiModelProperty(value = "The default two-step-procedure. Must match one of the available 'procedureId's from the 'twoStepProcedures' list. When this field is set, you can execute two-step-procedures (e.g. accounts/requestSepaMoneyTransfer) without having to give a procedure explicitly. finAPI will use the default procedure in such cases. Note that the list of available procedures of a bank connection may change as a result of an update of the connection, and if this field references a procedure that is no longer available, finAPI will automatically clear the default procedure (set it to null.")
  @JsonProperty("defaultTwoStepProcedureId")
  public String getDefaultTwoStepProcedureId() {
    return defaultTwoStepProcedureId;
  }
  public void setDefaultTwoStepProcedureId(String defaultTwoStepProcedureId) {
    this.defaultTwoStepProcedureId = defaultTwoStepProcedureId;
  }

  /**
   * Accounts which relate to this bank connection
   **/
  public BankConnection accountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Accounts which relate to this bank connection")
  @JsonProperty("accountIds")
  public List<Long> getAccountIds() {
    return accountIds;
  }
  public void setAccountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankConnection bankConnection = (BankConnection) o;
    return Objects.equals(id, bankConnection.id) &&
        Objects.equals(bankId, bankConnection.bankId) &&
        Objects.equals(bankingUserId, bankConnection.bankingUserId) &&
        Objects.equals(bankingCustomerId, bankConnection.bankingCustomerId) &&
        Objects.equals(bankingPin, bankConnection.bankingPin) &&
        Objects.equals(type, bankConnection.type) &&
        Objects.equals(updateStatus, bankConnection.updateStatus) &&
        Objects.equals(categorizationStatus, bankConnection.categorizationStatus) &&
        Objects.equals(twoStepProcedures, bankConnection.twoStepProcedures) &&
        Objects.equals(ibanOnlyMoneyTransferSupported, bankConnection.ibanOnlyMoneyTransferSupported) &&
        Objects.equals(defaultTwoStepProcedureId, bankConnection.defaultTwoStepProcedureId) &&
        Objects.equals(accountIds, bankConnection.accountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bankId, bankingUserId, bankingCustomerId, bankingPin, type, updateStatus, categorizationStatus, twoStepProcedures, ibanOnlyMoneyTransferSupported, defaultTwoStepProcedureId, accountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankConnection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bankingUserId: ").append(toIndentedString(bankingUserId)).append("\n");
    sb.append("    bankingCustomerId: ").append(toIndentedString(bankingCustomerId)).append("\n");
    sb.append("    bankingPin: ").append(toIndentedString(bankingPin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
    sb.append("    categorizationStatus: ").append(toIndentedString(categorizationStatus)).append("\n");
    sb.append("    twoStepProcedures: ").append(toIndentedString(twoStepProcedures)).append("\n");
    sb.append("    ibanOnlyMoneyTransferSupported: ").append(toIndentedString(ibanOnlyMoneyTransferSupported)).append("\n");
    sb.append("    defaultTwoStepProcedureId: ").append(toIndentedString(defaultTwoStepProcedureId)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
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

