package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Error details
 **/

@ApiModel(description = "Error details")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class ErrorDetails   {
  
  private String message = null;


  public enum CodeEnum {
    MISSING_FIELD("MISSING_FIELD"),
    UNKNOWN_ENTITY("UNKNOWN_ENTITY"),
    METHOD_NOT_ALLOWED("METHOD_NOT_ALLOWED"),
    ENTITY_EXISTS("ENTITY_EXISTS"),
    ILLEGAL_ENTITY_STATE("ILLEGAL_ENTITY_STATE"),
    UNEXPECTED_ERROR("UNEXPECTED_ERROR"),
    ILLEGAL_FIELD_VALUE("ILLEGAL_FIELD_VALUE"),
    UNAUTHORIZED_ACCESS("UNAUTHORIZED_ACCESS"),
    BAD_REQUEST("BAD_REQUEST"),
    UNSUPPORTED_ORDER("UNSUPPORTED_ORDER"),
    ILLEGAL_PAGE_SIZE("ILLEGAL_PAGE_SIZE"),
    INVALID_FILTER_OPTIONS("INVALID_FILTER_OPTIONS"),
    TOO_MANY_IDS("TOO_MANY_IDS"),
    BANK_SERVER_REJECTION("BANK_SERVER_REJECTION"),
    IBAN_ONLY_MONEY_TRANSFER_NOT_SUPPORTED("IBAN_ONLY_MONEY_TRANSFER_NOT_SUPPORTED"),
    INVALID_TWO_STEP_PROCEDURE("INVALID_TWO_STEP_PROCEDURE"),
    MISSING_TWO_STEP_PROCEDURE("MISSING_TWO_STEP_PROCEDURE"),
    UNSUPPORTED_MEDIA_TYPE("UNSUPPORTED_MEDIA_TYPE"),
    UNSUPPORTED_BANK("UNSUPPORTED_BANK"),
    USER_NOT_VERIFIED("USER_NOT_VERIFIED"),
    USER_ALREADY_VERIFIED("USER_ALREADY_VERIFIED"),
    INVALID_TOKEN("INVALID_TOKEN");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CodeEnum code = null;

  /**
   * Error message
   **/
  public ErrorDetails message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Error message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Error code. See the documentation of the individual services for details about what values may be returned.
   **/
  public ErrorDetails code(CodeEnum code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "Error code. See the documentation of the individual services for details about what values may be returned.")
  @JsonProperty("code")
  public CodeEnum getCode() {
    return code;
  }
  public void setCode(CodeEnum code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(message, errorDetails.message) &&
        Objects.equals(code, errorDetails.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

