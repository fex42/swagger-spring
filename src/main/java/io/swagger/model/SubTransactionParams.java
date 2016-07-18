package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Data of a sub-transaction
 **/

@ApiModel(description = "Data of a sub-transaction")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class SubTransactionParams   {
  
  private BigDecimal amount = null;
  private Long categoryId = null;
  private String purpose = null;
  private String counterpart = null;
  private String counterpartAccountNumber = null;
  private String counterpartIban = null;
  private String counterpartBic = null;
  private String counterpartBlz = null;
  private List<Long> labelIds = new ArrayList<Long>();

  /**
   * Amount
   **/
  public SubTransactionParams amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Amount")
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * Category identifier. If not specified, the original transaction's category will be applied. If you explicitly want the sub-transaction to have no category, then pass this field with value '0' (zero).
   **/
  public SubTransactionParams categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  
  @ApiModelProperty(value = "Category identifier. If not specified, the original transaction's category will be applied. If you explicitly want the sub-transaction to have no category, then pass this field with value '0' (zero).")
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Purpose. If not specified, the original transaction's value will be applied.
   **/
  public SubTransactionParams purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  
  @ApiModelProperty(value = "Purpose. If not specified, the original transaction's value will be applied.")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  /**
   * Counterpart. If not specified, the original transaction's value will be applied.
   **/
  public SubTransactionParams counterpart(String counterpart) {
    this.counterpart = counterpart;
    return this;
  }

  
  @ApiModelProperty(value = "Counterpart. If not specified, the original transaction's value will be applied.")
  @JsonProperty("counterpart")
  public String getCounterpart() {
    return counterpart;
  }
  public void setCounterpart(String counterpart) {
    this.counterpart = counterpart;
  }

  /**
   * Counterpart account number. If not specified, the original transaction's value will be applied.
   **/
  public SubTransactionParams counterpartAccountNumber(String counterpartAccountNumber) {
    this.counterpartAccountNumber = counterpartAccountNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Counterpart account number. If not specified, the original transaction's value will be applied.")
  @JsonProperty("counterpartAccountNumber")
  public String getCounterpartAccountNumber() {
    return counterpartAccountNumber;
  }
  public void setCounterpartAccountNumber(String counterpartAccountNumber) {
    this.counterpartAccountNumber = counterpartAccountNumber;
  }

  /**
   * Counterpart IBAN. If not specified, the original transaction's value will be applied.
   **/
  public SubTransactionParams counterpartIban(String counterpartIban) {
    this.counterpartIban = counterpartIban;
    return this;
  }

  
  @ApiModelProperty(value = "Counterpart IBAN. If not specified, the original transaction's value will be applied.")
  @JsonProperty("counterpartIban")
  public String getCounterpartIban() {
    return counterpartIban;
  }
  public void setCounterpartIban(String counterpartIban) {
    this.counterpartIban = counterpartIban;
  }

  /**
   * Counterpart BIC. If not specified, the original transaction's value will be applied.
   **/
  public SubTransactionParams counterpartBic(String counterpartBic) {
    this.counterpartBic = counterpartBic;
    return this;
  }

  
  @ApiModelProperty(value = "Counterpart BIC. If not specified, the original transaction's value will be applied.")
  @JsonProperty("counterpartBic")
  public String getCounterpartBic() {
    return counterpartBic;
  }
  public void setCounterpartBic(String counterpartBic) {
    this.counterpartBic = counterpartBic;
  }

  /**
   * Counterpart BLZ. If not specified, the original transaction's value will be applied.
   **/
  public SubTransactionParams counterpartBlz(String counterpartBlz) {
    this.counterpartBlz = counterpartBlz;
    return this;
  }

  
  @ApiModelProperty(value = "Counterpart BLZ. If not specified, the original transaction's value will be applied.")
  @JsonProperty("counterpartBlz")
  public String getCounterpartBlz() {
    return counterpartBlz;
  }
  public void setCounterpartBlz(String counterpartBlz) {
    this.counterpartBlz = counterpartBlz;
  }

  /**
   * List of connected labels. Note that when this field is not specified, then the labels of the original transaction will NOT get applied to the sub-transaction. Instead, the sub-transaction will have no labels assigned to it.
   **/
  public SubTransactionParams labelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
    return this;
  }

  
  @ApiModelProperty(value = "List of connected labels. Note that when this field is not specified, then the labels of the original transaction will NOT get applied to the sub-transaction. Instead, the sub-transaction will have no labels assigned to it.")
  @JsonProperty("labelIds")
  public List<Long> getLabelIds() {
    return labelIds;
  }
  public void setLabelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubTransactionParams subTransactionParams = (SubTransactionParams) o;
    return Objects.equals(amount, subTransactionParams.amount) &&
        Objects.equals(categoryId, subTransactionParams.categoryId) &&
        Objects.equals(purpose, subTransactionParams.purpose) &&
        Objects.equals(counterpart, subTransactionParams.counterpart) &&
        Objects.equals(counterpartAccountNumber, subTransactionParams.counterpartAccountNumber) &&
        Objects.equals(counterpartIban, subTransactionParams.counterpartIban) &&
        Objects.equals(counterpartBic, subTransactionParams.counterpartBic) &&
        Objects.equals(counterpartBlz, subTransactionParams.counterpartBlz) &&
        Objects.equals(labelIds, subTransactionParams.labelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, categoryId, purpose, counterpart, counterpartAccountNumber, counterpartIban, counterpartBic, counterpartBlz, labelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubTransactionParams {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    counterpart: ").append(toIndentedString(counterpart)).append("\n");
    sb.append("    counterpartAccountNumber: ").append(toIndentedString(counterpartAccountNumber)).append("\n");
    sb.append("    counterpartIban: ").append(toIndentedString(counterpartIban)).append("\n");
    sb.append("    counterpartBic: ").append(toIndentedString(counterpartBic)).append("\n");
    sb.append("    counterpartBlz: ").append(toIndentedString(counterpartBlz)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
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

