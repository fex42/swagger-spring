package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Container for bank connection import parameters
 **/

@ApiModel(description = "Container for bank connection import parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class ImportBankConnectionParams   {
  
  private Long bankId = null;
  private String bankingUserId = null;
  private String bankingCustomerId = null;
  private String bankingPin = null;
  private Boolean storePin = false;

  /**
   * Bank Identifier
   **/
  public ImportBankConnectionParams bankId(Long bankId) {
    this.bankId = bankId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Bank Identifier")
  @JsonProperty("bankId")
  public Long getBankId() {
    return bankId;
  }
  public void setBankId(Long bankId) {
    this.bankId = bankId;
  }

  /**
   * Online banking user ID credential
   **/
  public ImportBankConnectionParams bankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Online banking user ID credential")
  @JsonProperty("bankingUserId")
  public String getBankingUserId() {
    return bankingUserId;
  }
  public void setBankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
  }

  /**
   * Online banking customer ID credential (for most banks this field can remain unset)
   **/
  public ImportBankConnectionParams bankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
    return this;
  }

  
  @ApiModelProperty(value = "Online banking customer ID credential (for most banks this field can remain unset)")
  @JsonProperty("bankingCustomerId")
  public String getBankingCustomerId() {
    return bankingCustomerId;
  }
  public void setBankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
  }

  /**
   * Online banking PIN
   **/
  public ImportBankConnectionParams bankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Online banking PIN")
  @JsonProperty("bankingPin")
  public String getBankingPin() {
    return bankingPin;
  }
  public void setBankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
  }

  /**
   * Whether to store the PIN. If the PIN is stored, it is not required to pass the PIN again when updating this bank connection or executing orders (like money transfers). Default is false.
   **/
  public ImportBankConnectionParams storePin(Boolean storePin) {
    this.storePin = storePin;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to store the PIN. If the PIN is stored, it is not required to pass the PIN again when updating this bank connection or executing orders (like money transfers). Default is false.")
  @JsonProperty("storePin")
  public Boolean getStorePin() {
    return storePin;
  }
  public void setStorePin(Boolean storePin) {
    this.storePin = storePin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportBankConnectionParams importBankConnectionParams = (ImportBankConnectionParams) o;
    return Objects.equals(bankId, importBankConnectionParams.bankId) &&
        Objects.equals(bankingUserId, importBankConnectionParams.bankingUserId) &&
        Objects.equals(bankingCustomerId, importBankConnectionParams.bankingCustomerId) &&
        Objects.equals(bankingPin, importBankConnectionParams.bankingPin) &&
        Objects.equals(storePin, importBankConnectionParams.storePin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankId, bankingUserId, bankingCustomerId, bankingPin, storePin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportBankConnectionParams {\n");
    
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bankingUserId: ").append(toIndentedString(bankingUserId)).append("\n");
    sb.append("    bankingCustomerId: ").append(toIndentedString(bankingCustomerId)).append("\n");
    sb.append("    bankingPin: ").append(toIndentedString(bankingPin)).append("\n");
    sb.append("    storePin: ").append(toIndentedString(storePin)).append("\n");
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

