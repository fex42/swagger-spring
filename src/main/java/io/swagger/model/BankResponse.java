package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Bank server&#39;s response to some request
 **/

@ApiModel(description = "Bank server's response to some request")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class BankResponse   {
  
  private String successMessage = null;
  private String warnMessage = null;

  /**
   * Technical message from the bank server, confirming the success of the request. Typically, you would not want to present this message to the user. Note that this field may not be set. However if it is not set, it does not necessarily mean that there was an error in processing the request.
   **/
  public BankResponse successMessage(String successMessage) {
    this.successMessage = successMessage;
    return this;
  }

  
  @ApiModelProperty(value = "Technical message from the bank server, confirming the success of the request. Typically, you would not want to present this message to the user. Note that this field may not be set. However if it is not set, it does not necessarily mean that there was an error in processing the request.")
  @JsonProperty("successMessage")
  public String getSuccessMessage() {
    return successMessage;
  }
  public void setSuccessMessage(String successMessage) {
    this.successMessage = successMessage;
  }

  /**
   * In some cases, a bank server may accept the requested order, but return a warn message. This message may be of technical nature, but could also be of interest to the user.
   **/
  public BankResponse warnMessage(String warnMessage) {
    this.warnMessage = warnMessage;
    return this;
  }

  
  @ApiModelProperty(value = "In some cases, a bank server may accept the requested order, but return a warn message. This message may be of technical nature, but could also be of interest to the user.")
  @JsonProperty("warnMessage")
  public String getWarnMessage() {
    return warnMessage;
  }
  public void setWarnMessage(String warnMessage) {
    this.warnMessage = warnMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankResponse bankResponse = (BankResponse) o;
    return Objects.equals(successMessage, bankResponse.successMessage) &&
        Objects.equals(warnMessage, bankResponse.warnMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successMessage, warnMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankResponse {\n");
    
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("    warnMessage: ").append(toIndentedString(warnMessage)).append("\n");
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

