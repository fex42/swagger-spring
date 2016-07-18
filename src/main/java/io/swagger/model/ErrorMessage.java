package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ErrorDetails;
import java.util.ArrayList;
import java.util.List;



/**
 * Response type when a service call was not successful. Contains details about the error(s) that occurred.
 **/

@ApiModel(description = "Response type when a service call was not successful. Contains details about the error(s) that occurred.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class ErrorMessage   {
  
  private List<ErrorDetails> errors = new ArrayList<ErrorDetails>();
  private String date = null;

  /**
   * List of errors
   **/
  public ErrorMessage errors(List<ErrorDetails> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "List of errors")
  @JsonProperty("errors")
  public List<ErrorDetails> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorDetails> errors) {
    this.errors = errors;
  }

  /**
   * Server date of when the error(s) occurred
   **/
  public ErrorMessage date(String date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(value = "Server date of when the error(s) occurred")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorMessage errorMessage = (ErrorMessage) o;
    return Objects.equals(errors, errorMessage.errors) &&
        Objects.equals(date, errorMessage.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMessage {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

