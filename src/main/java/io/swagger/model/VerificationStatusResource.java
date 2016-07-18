package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * User&#39;s verification status
 **/

@ApiModel(description = "User's verification status")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class VerificationStatusResource   {
  
  private String userId = null;
  private Boolean isUserVerified = false;

  /**
   * User's identifier
   **/
  public VerificationStatusResource userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User's identifier")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * User's verification status
   **/
  public VerificationStatusResource isUserVerified(Boolean isUserVerified) {
    this.isUserVerified = isUserVerified;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User's verification status")
  @JsonProperty("isUserVerified")
  public Boolean getIsUserVerified() {
    return isUserVerified;
  }
  public void setIsUserVerified(Boolean isUserVerified) {
    this.isUserVerified = isUserVerified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationStatusResource verificationStatusResource = (VerificationStatusResource) o;
    return Objects.equals(userId, verificationStatusResource.userId) &&
        Objects.equals(isUserVerified, verificationStatusResource.isUserVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, isUserVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationStatusResource {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    isUserVerified: ").append(toIndentedString(isUserVerified)).append("\n");
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

