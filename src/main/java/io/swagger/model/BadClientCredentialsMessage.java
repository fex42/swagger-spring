package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Bad client credentials error message
 **/

@ApiModel(description = "Bad client credentials error message")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class BadClientCredentialsMessage   {
  
  private String error = null;
  private String errorDescription = null;

  /**
   * Short error message
   **/
  public BadClientCredentialsMessage error(String error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Short error message")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  /**
   * Extended error description
   **/
  public BadClientCredentialsMessage errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Extended error description")
  @JsonProperty("errorDescription")
  public String getErrorDescription() {
    return errorDescription;
  }
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadClientCredentialsMessage badClientCredentialsMessage = (BadClientCredentialsMessage) o;
    return Objects.equals(error, badClientCredentialsMessage.error) &&
        Objects.equals(errorDescription, badClientCredentialsMessage.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadClientCredentialsMessage {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

