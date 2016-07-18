package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Update transactions parameters
 **/

@ApiModel(description = "Update transactions parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class UpdateTransactionsParams   {
  
  private Boolean isNew = false;
  private Boolean isPotentialDuplicate = false;
  private Long categoryId = null;
  private List<Long> labelIds = new ArrayList<Long>();

  /**
   * Whether this transactions should be flagged as 'new' or not. Any newly imported transaction will have this flag initially set to true. How you use this field is up to your interpretation. For example, you might want to set it to false once a user has clicked on/seen the transaction.
   **/
  public UpdateTransactionsParams isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this transactions should be flagged as 'new' or not. Any newly imported transaction will have this flag initially set to true. How you use this field is up to your interpretation. For example, you might want to set it to false once a user has clicked on/seen the transaction.")
  @JsonProperty("isNew")
  public Boolean getIsNew() {
    return isNew;
  }
  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }

  /**
   * You can set this field only to 'false'. finAPI marks transactions as a potential duplicates  when its internal duplicate detection algorithm is signaling so. Transactions that are flagged as duplicates can be deleted by the user. To prevent the user from deleting original transactions, which might lead to incorrect balances, it is not possible to manually set this flag to 'true'.
   **/
  public UpdateTransactionsParams isPotentialDuplicate(Boolean isPotentialDuplicate) {
    this.isPotentialDuplicate = isPotentialDuplicate;
    return this;
  }

  
  @ApiModelProperty(value = "You can set this field only to 'false'. finAPI marks transactions as a potential duplicates  when its internal duplicate detection algorithm is signaling so. Transactions that are flagged as duplicates can be deleted by the user. To prevent the user from deleting original transactions, which might lead to incorrect balances, it is not possible to manually set this flag to 'true'.")
  @JsonProperty("isPotentialDuplicate")
  public Boolean getIsPotentialDuplicate() {
    return isPotentialDuplicate;
  }
  public void setIsPotentialDuplicate(Boolean isPotentialDuplicate) {
    this.isPotentialDuplicate = isPotentialDuplicate;
  }

  /**
   * Identifier of the new category to apply to the transaction. When updating the transaction's category, the category's fields 'id', 'name', 'parentId', 'parentName', and 'isCustom' will all get updated. To clear the category for the transaction, the categoryId field must be passed with value 0.
   **/
  public UpdateTransactionsParams categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier of the new category to apply to the transaction. When updating the transaction's category, the category's fields 'id', 'name', 'parentId', 'parentName', and 'isCustom' will all get updated. To clear the category for the transaction, the categoryId field must be passed with value 0.")
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Identifiers of labels to apply to the transaction. To clear transactions' labels, pass an empty array of identifiers: '[]'
   **/
  public UpdateTransactionsParams labelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
    return this;
  }

  
  @ApiModelProperty(value = "Identifiers of labels to apply to the transaction. To clear transactions' labels, pass an empty array of identifiers: '[]'")
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
    UpdateTransactionsParams updateTransactionsParams = (UpdateTransactionsParams) o;
    return Objects.equals(isNew, updateTransactionsParams.isNew) &&
        Objects.equals(isPotentialDuplicate, updateTransactionsParams.isPotentialDuplicate) &&
        Objects.equals(categoryId, updateTransactionsParams.categoryId) &&
        Objects.equals(labelIds, updateTransactionsParams.labelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isNew, isPotentialDuplicate, categoryId, labelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTransactionsParams {\n");
    
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
    sb.append("    isPotentialDuplicate: ").append(toIndentedString(isPotentialDuplicate)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

