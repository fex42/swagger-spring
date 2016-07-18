package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Bank server&#39;s response to a money transfer order request
 **/

@ApiModel(description = "Bank server's response to a money transfer order request")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class MoneyTransferOrderingResponse   {
  
  private String successMessage = null;
  private String warnMessage = null;
  private String challengeMessage = null;
  private String answerFieldLabel = null;
  private String tanListNumber = null;
  private String opticalData = null;
  private String photoTanMimeType = null;
  private String photoTanData = null;

  /**
   * Technical message from the bank server, confirming the success of the request. Typically, you would not want to present this message to the user. Note that this field may not be set. However if it is not set, it does not necessarily mean that there was an error in processing the request.
   **/
  public MoneyTransferOrderingResponse successMessage(String successMessage) {
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
  public MoneyTransferOrderingResponse warnMessage(String warnMessage) {
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

  /**
   * Message from the bank server containing information or instructions on how to retrieve the TAN that is needed to execute the requested money transfer. This message should be presented to the user. Note that some bank servers may limit the message to just the most crucial information, e.g. the message may contain just a single number that depicts the target TAN number on a user's TAN list. You may want to parse the challenge message for such cases and extend it with more detailed information before showing it to the user.
   **/
  public MoneyTransferOrderingResponse challengeMessage(String challengeMessage) {
    this.challengeMessage = challengeMessage;
    return this;
  }

  
  @ApiModelProperty(value = "Message from the bank server containing information or instructions on how to retrieve the TAN that is needed to execute the requested money transfer. This message should be presented to the user. Note that some bank servers may limit the message to just the most crucial information, e.g. the message may contain just a single number that depicts the target TAN number on a user's TAN list. You may want to parse the challenge message for such cases and extend it with more detailed information before showing it to the user.")
  @JsonProperty("challengeMessage")
  public String getChallengeMessage() {
    return challengeMessage;
  }
  public void setChallengeMessage(String challengeMessage) {
    this.challengeMessage = challengeMessage;
  }

  /**
   * Suggestion from the bank server on how you can label your input field where the user must enter his TAN. A typical value that many bank servers give is 'TAN-Nummer'.
   **/
  public MoneyTransferOrderingResponse answerFieldLabel(String answerFieldLabel) {
    this.answerFieldLabel = answerFieldLabel;
    return this;
  }

  
  @ApiModelProperty(value = "Suggestion from the bank server on how you can label your input field where the user must enter his TAN. A typical value that many bank servers give is 'TAN-Nummer'.")
  @JsonProperty("answerFieldLabel")
  public String getAnswerFieldLabel() {
    return answerFieldLabel;
  }
  public void setAnswerFieldLabel(String answerFieldLabel) {
    this.answerFieldLabel = answerFieldLabel;
  }

  /**
   * In case that the bank server has instructed the user to look up a TAN from a TAN list, this field may contain the identification number of the TAN list. However in most cases, this field is only set (i.e. not null) when the user has multiple active TAN lists.
   **/
  public MoneyTransferOrderingResponse tanListNumber(String tanListNumber) {
    this.tanListNumber = tanListNumber;
    return this;
  }

  
  @ApiModelProperty(value = "In case that the bank server has instructed the user to look up a TAN from a TAN list, this field may contain the identification number of the TAN list. However in most cases, this field is only set (i.e. not null) when the user has multiple active TAN lists.")
  @JsonProperty("tanListNumber")
  public String getTanListNumber() {
    return tanListNumber;
  }
  public void setTanListNumber(String tanListNumber) {
    this.tanListNumber = tanListNumber;
  }

  /**
   * In case that the bank server has instructed the user to scan a flicker code, then this field will contain the raw data for the flicker animation as a BASE-64 string. Otherwise, this field will be not set (i.e. null). For more information on how to process the flicker code data, please address the <a href=\"https://finapi.zendesk.com\">finAPI Developer Portal</a>.
   **/
  public MoneyTransferOrderingResponse opticalData(String opticalData) {
    this.opticalData = opticalData;
    return this;
  }

  
  @ApiModelProperty(value = "In case that the bank server has instructed the user to scan a flicker code, then this field will contain the raw data for the flicker animation as a BASE-64 string. Otherwise, this field will be not set (i.e. null). For more information on how to process the flicker code data, please address the <a href=\"https://finapi.zendesk.com\">finAPI Developer Portal</a>.")
  @JsonProperty("opticalData")
  public String getOpticalData() {
    return opticalData;
  }
  public void setOpticalData(String opticalData) {
    this.opticalData = opticalData;
  }

  /**
   * In case that the 'photoTanData' field is set (i.e. not null), this field contains the MIME type to use for interpreting the photo data (e.g.: 'image/png')
   **/
  public MoneyTransferOrderingResponse photoTanMimeType(String photoTanMimeType) {
    this.photoTanMimeType = photoTanMimeType;
    return this;
  }

  
  @ApiModelProperty(value = "In case that the 'photoTanData' field is set (i.e. not null), this field contains the MIME type to use for interpreting the photo data (e.g.: 'image/png')")
  @JsonProperty("photoTanMimeType")
  public String getPhotoTanMimeType() {
    return photoTanMimeType;
  }
  public void setPhotoTanMimeType(String photoTanMimeType) {
    this.photoTanMimeType = photoTanMimeType;
  }

  /**
   * In case that the bank server has instructed the user to scan a photo (or more generally speaking, any kind of QR-code-like data), then this field will contain the raw data of the photo as a BASE-64 string. Otherwise, this field will be not set (i.e. null). For more information on how to process the photo data, please address the <a href=\"https://finapi.zendesk.com\">finAPI Developer Portal</a>.
   **/
  public MoneyTransferOrderingResponse photoTanData(String photoTanData) {
    this.photoTanData = photoTanData;
    return this;
  }

  
  @ApiModelProperty(value = "In case that the bank server has instructed the user to scan a photo (or more generally speaking, any kind of QR-code-like data), then this field will contain the raw data of the photo as a BASE-64 string. Otherwise, this field will be not set (i.e. null). For more information on how to process the photo data, please address the <a href=\"https://finapi.zendesk.com\">finAPI Developer Portal</a>.")
  @JsonProperty("photoTanData")
  public String getPhotoTanData() {
    return photoTanData;
  }
  public void setPhotoTanData(String photoTanData) {
    this.photoTanData = photoTanData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyTransferOrderingResponse moneyTransferOrderingResponse = (MoneyTransferOrderingResponse) o;
    return Objects.equals(successMessage, moneyTransferOrderingResponse.successMessage) &&
        Objects.equals(warnMessage, moneyTransferOrderingResponse.warnMessage) &&
        Objects.equals(challengeMessage, moneyTransferOrderingResponse.challengeMessage) &&
        Objects.equals(answerFieldLabel, moneyTransferOrderingResponse.answerFieldLabel) &&
        Objects.equals(tanListNumber, moneyTransferOrderingResponse.tanListNumber) &&
        Objects.equals(opticalData, moneyTransferOrderingResponse.opticalData) &&
        Objects.equals(photoTanMimeType, moneyTransferOrderingResponse.photoTanMimeType) &&
        Objects.equals(photoTanData, moneyTransferOrderingResponse.photoTanData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successMessage, warnMessage, challengeMessage, answerFieldLabel, tanListNumber, opticalData, photoTanMimeType, photoTanData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyTransferOrderingResponse {\n");
    
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("    warnMessage: ").append(toIndentedString(warnMessage)).append("\n");
    sb.append("    challengeMessage: ").append(toIndentedString(challengeMessage)).append("\n");
    sb.append("    answerFieldLabel: ").append(toIndentedString(answerFieldLabel)).append("\n");
    sb.append("    tanListNumber: ").append(toIndentedString(tanListNumber)).append("\n");
    sb.append("    opticalData: ").append(toIndentedString(opticalData)).append("\n");
    sb.append("    photoTanMimeType: ").append(toIndentedString(photoTanMimeType)).append("\n");
    sb.append("    photoTanData: ").append(toIndentedString(photoTanData)).append("\n");
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

