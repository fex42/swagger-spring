package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Password changing details
 **/

@ApiModel(description = "Password changing details")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class PasswordChangingResource   {
  
  private String userId = null;
  private String passwordChangeToken = null;

  /**
   * User identifier
   **/
  public PasswordChangingResource userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User identifier")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Encrypted password change token. Decrypt this token with your data decryption key, and pass the decrypted token to the /users/executePasswordChange service in order to set a new password for the user.
   **/
  public PasswordChangingResource passwordChangeToken(String passwordChangeToken) {
    this.passwordChangeToken = passwordChangeToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Encrypted password change token. Decrypt this token with your data decryption key, and pass the decrypted token to the /users/executePasswordChange service in order to set a new password for the user.")
  @JsonProperty("passwordChangeToken")
  public String getPasswordChangeToken() {
    return passwordChangeToken;
  }
  public void setPasswordChangeToken(String passwordChangeToken) {
    this.passwordChangeToken = passwordChangeToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordChangingResource passwordChangingResource = (PasswordChangingResource) o;
    return Objects.equals(userId, passwordChangingResource.userId) &&
        Objects.equals(passwordChangeToken, passwordChangingResource.passwordChangeToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, passwordChangeToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordChangingResource {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    passwordChangeToken: ").append(toIndentedString(passwordChangeToken)).append("\n");
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

