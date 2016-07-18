package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Container for bank connection update parameters
 **/

@ApiModel(description = "Container for bank connection update parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class UpdateBankConnectionParams   {
  
  private Long bankConnectionId = null;
  private String bankingPin = null;
  private Boolean importNewAccounts = false;

  /**
   * Bank connection identifier
   **/
  public UpdateBankConnectionParams bankConnectionId(Long bankConnectionId) {
    this.bankConnectionId = bankConnectionId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Bank connection identifier")
  @JsonProperty("bankConnectionId")
  public Long getBankConnectionId() {
    return bankConnectionId;
  }
  public void setBankConnectionId(Long bankConnectionId) {
    this.bankConnectionId = bankConnectionId;
  }

  /**
   * Online banking PIN. If a PIN is stored in the bank connection, then this field may remain unset. If the field is set though then it will always be used (even if there is some other PIN stored in the bank connection)
   **/
  public UpdateBankConnectionParams bankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
    return this;
  }

  
  @ApiModelProperty(value = "Online banking PIN. If a PIN is stored in the bank connection, then this field may remain unset. If the field is set though then it will always be used (even if there is some other PIN stored in the bank connection)")
  @JsonProperty("bankingPin")
  public String getBankingPin() {
    return bankingPin;
  }
  public void setBankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
  }

  /**
   * Whether new accounts that have not yet been imported will be imported or not. Default is false
   **/
  public UpdateBankConnectionParams importNewAccounts(Boolean importNewAccounts) {
    this.importNewAccounts = importNewAccounts;
    return this;
  }

  
  @ApiModelProperty(value = "Whether new accounts that have not yet been imported will be imported or not. Default is false")
  @JsonProperty("importNewAccounts")
  public Boolean getImportNewAccounts() {
    return importNewAccounts;
  }
  public void setImportNewAccounts(Boolean importNewAccounts) {
    this.importNewAccounts = importNewAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBankConnectionParams updateBankConnectionParams = (UpdateBankConnectionParams) o;
    return Objects.equals(bankConnectionId, updateBankConnectionParams.bankConnectionId) &&
        Objects.equals(bankingPin, updateBankConnectionParams.bankingPin) &&
        Objects.equals(importNewAccounts, updateBankConnectionParams.importNewAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankConnectionId, bankingPin, importNewAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBankConnectionParams {\n");
    
    sb.append("    bankConnectionId: ").append(toIndentedString(bankConnectionId)).append("\n");
    sb.append("    bankingPin: ").append(toIndentedString(bankingPin)).append("\n");
    sb.append("    importNewAccounts: ").append(toIndentedString(importNewAccounts)).append("\n");
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

