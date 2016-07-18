package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for a bank&#39;s data
 **/

@ApiModel(description = "Container for a bank's data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class Bank   {
  
  private Long id = null;
  private String name = null;
  private String bic = null;
  private List<String> blzs = new ArrayList<String>();
  private String loginFieldUserId = null;
  private String loginFieldCustomerId = null;
  private String loginFieldPin = null;

  /**
   * Bank identifier. This field can be used for sorting.
   **/
  public Bank id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Bank identifier. This field can be used for sorting.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Name of bank. This field can be used for sorting.
   **/
  public Bank name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of bank. This field can be used for sorting.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * BIC of bank. This field can be used for sorting.
   **/
  public Bank bic(String bic) {
    this.bic = bic;
    return this;
  }

  
  @ApiModelProperty(value = "BIC of bank. This field can be used for sorting.")
  @JsonProperty("bic")
  public String getBic() {
    return bic;
  }
  public void setBic(String bic) {
    this.bic = bic;
  }

  /**
   * List of BLZs that belong to this bank
   **/
  public Bank blzs(List<String> blzs) {
    this.blzs = blzs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of BLZs that belong to this bank")
  @JsonProperty("blzs")
  public List<String> getBlzs() {
    return blzs;
  }
  public void setBlzs(List<String> blzs) {
    this.blzs = blzs;
  }

  /**
   * Label for the user ID login field, as it is called on the bank's website (e.g. \"Nutzerkennung\"
   **/
  public Bank loginFieldUserId(String loginFieldUserId) {
    this.loginFieldUserId = loginFieldUserId;
    return this;
  }

  
  @ApiModelProperty(value = "Label for the user ID login field, as it is called on the bank's website (e.g. \"Nutzerkennung\"")
  @JsonProperty("loginFieldUserId")
  public String getLoginFieldUserId() {
    return loginFieldUserId;
  }
  public void setLoginFieldUserId(String loginFieldUserId) {
    this.loginFieldUserId = loginFieldUserId;
  }

  /**
   * Label for the customer ID login field, as it is called on the bank's website (e.g. \"Kundennummer\"
   **/
  public Bank loginFieldCustomerId(String loginFieldCustomerId) {
    this.loginFieldCustomerId = loginFieldCustomerId;
    return this;
  }

  
  @ApiModelProperty(value = "Label for the customer ID login field, as it is called on the bank's website (e.g. \"Kundennummer\"")
  @JsonProperty("loginFieldCustomerId")
  public String getLoginFieldCustomerId() {
    return loginFieldCustomerId;
  }
  public void setLoginFieldCustomerId(String loginFieldCustomerId) {
    this.loginFieldCustomerId = loginFieldCustomerId;
  }

  /**
   * Label for the PIN field, as it is called on the bank's website (mostly \"PIN\"
   **/
  public Bank loginFieldPin(String loginFieldPin) {
    this.loginFieldPin = loginFieldPin;
    return this;
  }

  
  @ApiModelProperty(value = "Label for the PIN field, as it is called on the bank's website (mostly \"PIN\"")
  @JsonProperty("loginFieldPin")
  public String getLoginFieldPin() {
    return loginFieldPin;
  }
  public void setLoginFieldPin(String loginFieldPin) {
    this.loginFieldPin = loginFieldPin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bank bank = (Bank) o;
    return Objects.equals(id, bank.id) &&
        Objects.equals(name, bank.name) &&
        Objects.equals(bic, bank.bic) &&
        Objects.equals(blzs, bank.blzs) &&
        Objects.equals(loginFieldUserId, bank.loginFieldUserId) &&
        Objects.equals(loginFieldCustomerId, bank.loginFieldCustomerId) &&
        Objects.equals(loginFieldPin, bank.loginFieldPin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bic, blzs, loginFieldUserId, loginFieldCustomerId, loginFieldPin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bank {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    blzs: ").append(toIndentedString(blzs)).append("\n");
    sb.append("    loginFieldUserId: ").append(toIndentedString(loginFieldUserId)).append("\n");
    sb.append("    loginFieldCustomerId: ").append(toIndentedString(loginFieldCustomerId)).append("\n");
    sb.append("    loginFieldPin: ").append(toIndentedString(loginFieldPin)).append("\n");
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

