package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Container for an account&#39;s name, type and &#39;isNew&#39; flag&#39;.
 **/

@ApiModel(description = "Container for an account's name, type and 'isNew' flag'.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class AccountParams   {
  
  private String accountName = null;
  private Long accountTypeId = null;
  private Boolean isNew = false;

  /**
   * Account name. Maximum length is 512 symbols.
   **/
  public AccountParams accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  
  @ApiModelProperty(value = "Account name. Maximum length is 512 symbols.")
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * Identifier of account type. <br/>1 = Checking,<br/>2 = Savings,<br/>3 = CreditCard,<br/>4 = Security,<br/>5 = Loan,<br/>6 = Pocket,<br/>7 = Membership
   * minimum: 1.0
   * maximum: 7.0
   **/
  public AccountParams accountTypeId(Long accountTypeId) {
    this.accountTypeId = accountTypeId;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier of account type. <br/>1 = Checking,<br/>2 = Savings,<br/>3 = CreditCard,<br/>4 = Security,<br/>5 = Loan,<br/>6 = Pocket,<br/>7 = Membership")
  @JsonProperty("accountTypeId")
  public Long getAccountTypeId() {
    return accountTypeId;
  }
  public void setAccountTypeId(Long accountTypeId) {
    this.accountTypeId = accountTypeId;
  }

  /**
   * Whether this account should be flagged as 'new' or not. Any newly imported account will have this flag initially set to true, and remain so until you set it to false (see PATCH /accounts/<id>). How you use this field is up to your interpretation, however it is recommended to set the flag to false for all accounts right after the initial import of the bank connection. This way, you will be able recognize accounts that get newly imported during a later update of the bank connection, by checking for any accounts with the flag set to true after every update of the bank connection.
   **/
  public AccountParams isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this account should be flagged as 'new' or not. Any newly imported account will have this flag initially set to true, and remain so until you set it to false (see PATCH /accounts/<id>). How you use this field is up to your interpretation, however it is recommended to set the flag to false for all accounts right after the initial import of the bank connection. This way, you will be able recognize accounts that get newly imported during a later update of the bank connection, by checking for any accounts with the flag set to true after every update of the bank connection.")
  @JsonProperty("isNew")
  public Boolean getIsNew() {
    return isNew;
  }
  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountParams accountParams = (AccountParams) o;
    return Objects.equals(accountName, accountParams.accountName) &&
        Objects.equals(accountTypeId, accountParams.accountTypeId) &&
        Objects.equals(isNew, accountParams.isNew);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountTypeId, isNew);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountParams {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountTypeId: ").append(toIndentedString(accountTypeId)).append("\n");
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
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

