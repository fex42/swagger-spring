package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import io.swagger.model.Label;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for a transaction&#39;s data
 **/

@ApiModel(description = "Container for a transaction's data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class Transaction   {
  
  private Long id = null;
  private Long parentId = null;
  private Long accountId = null;
  private String valueDate = null;
  private String bankBookingDate = null;
  private String finapiBookingDate = null;
  private BigDecimal amount = null;
  private String purpose = null;
  private String counterpartName = null;
  private String counterpartAccountNumber = null;
  private String counterpartIban = null;
  private String counterpartBlz = null;
  private String counterpartBic = null;
  private String type = null;
  private String primanota = null;
  private Category category = null;
  private List<Label> labels = new ArrayList<Label>();
  private Boolean isPotentialDuplicate = false;
  private Boolean isNew = false;
  private String importDate = null;
  private List<Long> children = new ArrayList<Long>();

  /**
   * Transaction identifier
   **/
  public Transaction id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Transaction identifier")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Parent transaction identifier
   **/
  public Transaction parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "Parent transaction identifier")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  /**
   * Account identifier
   **/
  public Transaction accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Account identifier")
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  /**
   * Value date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).
   **/
  public Transaction valueDate(String valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Value date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).")
  @JsonProperty("valueDate")
  public String getValueDate() {
    return valueDate;
  }
  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }

  /**
   * Bank booking date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).
   **/
  public Transaction bankBookingDate(String bankBookingDate) {
    this.bankBookingDate = bankBookingDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Bank booking date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).")
  @JsonProperty("bankBookingDate")
  public String getBankBookingDate() {
    return bankBookingDate;
  }
  public void setBankBookingDate(String bankBookingDate) {
    this.bankBookingDate = bankBookingDate;
  }

  /**
   * finAPI Booking date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time). NOTE: In some cases, banks may deliver transactions that are booked in future, but already included in the current account balance. To keep the account balance consistent with the set of transactions, such \"future transactions\" will be imported with their finapiBookingDate set to the current date (i.e.: date of import). The finapiBookingDate will automatically get adjusted towards the bankBookingDate each time the associated bank account is updated. Example: A transaction is imported on July, 3rd, with a bank reported booking date of July, 6th. The transaction will be imported with its finapiBookingDate set to July, 3rd. Then, on July 4th, the associated account is updated. During this update, the transaction's finapiBookingDate will be automatically adjusted to July 4th. This adjustment of the finapiBookingDate takes place on each update until the bank account is updated on July 6th or later, in which case the transaction's finapiBookingDate will be adjusted to its final value, July 6th.<br/> The finapiBookingDate is the date that is used by the finAPI PFM services. E.g. when you calculate the spendings of an account for the current month, and have a transaction with finapiBookingDate in the current month but bankBookingDate at the beginning of the next month, then this transaction is included in the calculations (as the bank has this transaction's amount included in the current account balance as well).
   **/
  public Transaction finapiBookingDate(String finapiBookingDate) {
    this.finapiBookingDate = finapiBookingDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "finAPI Booking date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time). NOTE: In some cases, banks may deliver transactions that are booked in future, but already included in the current account balance. To keep the account balance consistent with the set of transactions, such \"future transactions\" will be imported with their finapiBookingDate set to the current date (i.e.: date of import). The finapiBookingDate will automatically get adjusted towards the bankBookingDate each time the associated bank account is updated. Example: A transaction is imported on July, 3rd, with a bank reported booking date of July, 6th. The transaction will be imported with its finapiBookingDate set to July, 3rd. Then, on July 4th, the associated account is updated. During this update, the transaction's finapiBookingDate will be automatically adjusted to July 4th. This adjustment of the finapiBookingDate takes place on each update until the bank account is updated on July 6th or later, in which case the transaction's finapiBookingDate will be adjusted to its final value, July 6th.<br/> The finapiBookingDate is the date that is used by the finAPI PFM services. E.g. when you calculate the spendings of an account for the current month, and have a transaction with finapiBookingDate in the current month but bankBookingDate at the beginning of the next month, then this transaction is included in the calculations (as the bank has this transaction's amount included in the current account balance as well).")
  @JsonProperty("finapiBookingDate")
  public String getFinapiBookingDate() {
    return finapiBookingDate;
  }
  public void setFinapiBookingDate(String finapiBookingDate) {
    this.finapiBookingDate = finapiBookingDate;
  }

  /**
   * Transaction amount
   **/
  public Transaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Transaction amount")
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * Transaction purpose
   **/
  public Transaction purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  
  @ApiModelProperty(value = "Transaction purpose")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   * Counterpart name
   **/
  public Transaction counterpartName(String counterpartName) {
    this.counterpartName = counterpartName;
    return this;
  }

  
  @ApiModelProperty(value = "Counterpart name")
  @JsonProperty("counterpartName")
  public String getCounterpartName() {
    return counterpartName;
  }
  public void setCounterpartName(String counterpartName) {
    this.counterpartName = counterpartName;
  }

  /**
   * Counterpart account number
   **/
  public Transaction counterpartAccountNumber(String counterpartAccountNumber) {
    this.counterpartAccountNumber = counterpartAccountNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Counterpart account number")
  @JsonProperty("counterpartAccountNumber")
  public String getCounterpartAccountNumber() {
    return counterpartAccountNumber;
  }
  public void setCounterpartAccountNumber(String counterpartAccountNumber) {
    this.counterpartAccountNumber = counterpartAccountNumber;
  }

  /**
   * Counterpart IBAN
   **/
  public Transaction counterpartIban(String counterpartIban) {
    this.counterpartIban = counterpartIban;
    return this;
  }

  
  @ApiModelProperty(value = "Counterpart IBAN")
  @JsonProperty("counterpartIban")
  public String getCounterpartIban() {
    return counterpartIban;
  }
  public void setCounterpartIban(String counterpartIban) {
    this.counterpartIban = counterpartIban;
  }

  /**
   * Counterpart BLZ
   **/
  public Transaction counterpartBlz(String counterpartBlz) {
    this.counterpartBlz = counterpartBlz;
    return this;
  }

  
  @ApiModelProperty(value = "Counterpart BLZ")
  @JsonProperty("counterpartBlz")
  public String getCounterpartBlz() {
    return counterpartBlz;
  }
  public void setCounterpartBlz(String counterpartBlz) {
    this.counterpartBlz = counterpartBlz;
  }

  /**
   * Counterpart BIC
   **/
  public Transaction counterpartBic(String counterpartBic) {
    this.counterpartBic = counterpartBic;
    return this;
  }

  
  @ApiModelProperty(value = "Counterpart BIC")
  @JsonProperty("counterpartBic")
  public String getCounterpartBic() {
    return counterpartBic;
  }
  public void setCounterpartBic(String counterpartBic) {
    this.counterpartBic = counterpartBic;
  }

  /**
   * Transaction type
   **/
  public Transaction type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Transaction type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Transaction primanota (bank side identification number)
   **/
  public Transaction primanota(String primanota) {
    this.primanota = primanota;
    return this;
  }

  
  @ApiModelProperty(value = "Transaction primanota (bank side identification number)")
  @JsonProperty("primanota")
  public String getPrimanota() {
    return primanota;
  }
  public void setPrimanota(String primanota) {
    this.primanota = primanota;
  }

  /**
   * Transaction category, if any is assigned. Note: Recently imported transactions that have currently no category assigned might still get categorized by the background categorization process. To check the status of the background categorization, see GET /bankConnections. Manual category assignments to a transaction will remove the transaction from the background categorization process (i.e. the background categorization process will never overwrite a manual category assignment).
   **/
  public Transaction category(Category category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "Transaction category, if any is assigned. Note: Recently imported transactions that have currently no category assigned might still get categorized by the background categorization process. To check the status of the background categorization, see GET /bankConnections. Manual category assignments to a transaction will remove the transaction from the background categorization process (i.e. the background categorization process will never overwrite a manual category assignment).")
  @JsonProperty("category")
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }

  /**
   * Array of assigned labels
   **/
  public Transaction labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(value = "Array of assigned labels")
  @JsonProperty("labels")
  public List<Label> getLabels() {
    return labels;
  }
  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  /**
   * While finAPI uses a well-elaborated algorithm for uniquely identifying transactions, there is still the possibility that during an account update, a transaction that was imported previously may be imported a second time as a new transaction. For example, this can happen if some transaction data changes on the bank server side. However, finAPI also includes an algorithm of identifying such \"potential duplicate\" transactions. If this field is set to true, it means that finAPI detected a similar transaction that might actually be the same. It is recommended to communicate this information to the end user, and give him an option to delete the transaction in case he confirms that it really is a duplicate.
   **/
  public Transaction isPotentialDuplicate(Boolean isPotentialDuplicate) {
    this.isPotentialDuplicate = isPotentialDuplicate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "While finAPI uses a well-elaborated algorithm for uniquely identifying transactions, there is still the possibility that during an account update, a transaction that was imported previously may be imported a second time as a new transaction. For example, this can happen if some transaction data changes on the bank server side. However, finAPI also includes an algorithm of identifying such \"potential duplicate\" transactions. If this field is set to true, it means that finAPI detected a similar transaction that might actually be the same. It is recommended to communicate this information to the end user, and give him an option to delete the transaction in case he confirms that it really is a duplicate.")
  @JsonProperty("isPotentialDuplicate")
  public Boolean getIsPotentialDuplicate() {
    return isPotentialDuplicate;
  }
  public void setIsPotentialDuplicate(Boolean isPotentialDuplicate) {
    this.isPotentialDuplicate = isPotentialDuplicate;
  }

  /**
   * Indicating whether this transaction is 'new' or not. Any newly imported transaction will have this flag initially set to true. How you use this field is up to your interpretation. For example, you might want to set it to false once a user has clicked on/seen the transaction. You can change this flag to 'false' with the PATCH method.
   **/
  public Transaction isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Indicating whether this transaction is 'new' or not. Any newly imported transaction will have this flag initially set to true. How you use this field is up to your interpretation. For example, you might want to set it to false once a user has clicked on/seen the transaction. You can change this flag to 'false' with the PATCH method.")
  @JsonProperty("isNew")
  public Boolean getIsNew() {
    return isNew;
  }
  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }

  /**
   * Date of transaction import, in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).
   **/
  public Transaction importDate(String importDate) {
    this.importDate = importDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Date of transaction import, in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).")
  @JsonProperty("importDate")
  public String getImportDate() {
    return importDate;
  }
  public void setImportDate(String importDate) {
    this.importDate = importDate;
  }

  /**
   * Sub-transactions identifiers (if this transaction is split)
   **/
  public Transaction children(List<Long> children) {
    this.children = children;
    return this;
  }

  
  @ApiModelProperty(value = "Sub-transactions identifiers (if this transaction is split)")
  @JsonProperty("children")
  public List<Long> getChildren() {
    return children;
  }
  public void setChildren(List<Long> children) {
    this.children = children;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(id, transaction.id) &&
        Objects.equals(parentId, transaction.parentId) &&
        Objects.equals(accountId, transaction.accountId) &&
        Objects.equals(valueDate, transaction.valueDate) &&
        Objects.equals(bankBookingDate, transaction.bankBookingDate) &&
        Objects.equals(finapiBookingDate, transaction.finapiBookingDate) &&
        Objects.equals(amount, transaction.amount) &&
        Objects.equals(purpose, transaction.purpose) &&
        Objects.equals(counterpartName, transaction.counterpartName) &&
        Objects.equals(counterpartAccountNumber, transaction.counterpartAccountNumber) &&
        Objects.equals(counterpartIban, transaction.counterpartIban) &&
        Objects.equals(counterpartBlz, transaction.counterpartBlz) &&
        Objects.equals(counterpartBic, transaction.counterpartBic) &&
        Objects.equals(type, transaction.type) &&
        Objects.equals(primanota, transaction.primanota) &&
        Objects.equals(category, transaction.category) &&
        Objects.equals(labels, transaction.labels) &&
        Objects.equals(isPotentialDuplicate, transaction.isPotentialDuplicate) &&
        Objects.equals(isNew, transaction.isNew) &&
        Objects.equals(importDate, transaction.importDate) &&
        Objects.equals(children, transaction.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, accountId, valueDate, bankBookingDate, finapiBookingDate, amount, purpose, counterpartName, counterpartAccountNumber, counterpartIban, counterpartBlz, counterpartBic, type, primanota, category, labels, isPotentialDuplicate, isNew, importDate, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    bankBookingDate: ").append(toIndentedString(bankBookingDate)).append("\n");
    sb.append("    finapiBookingDate: ").append(toIndentedString(finapiBookingDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    counterpartName: ").append(toIndentedString(counterpartName)).append("\n");
    sb.append("    counterpartAccountNumber: ").append(toIndentedString(counterpartAccountNumber)).append("\n");
    sb.append("    counterpartIban: ").append(toIndentedString(counterpartIban)).append("\n");
    sb.append("    counterpartBlz: ").append(toIndentedString(counterpartBlz)).append("\n");
    sb.append("    counterpartBic: ").append(toIndentedString(counterpartBic)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primanota: ").append(toIndentedString(primanota)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    isPotentialDuplicate: ").append(toIndentedString(isPotentialDuplicate)).append("\n");
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
    sb.append("    importDate: ").append(toIndentedString(importDate)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

