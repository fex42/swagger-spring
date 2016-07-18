package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Execute password change parameters
 **/

@ApiModel(description = "Execute password change parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class ExecutePasswordChangeParams   {
  
  private String userId = null;
  private String password = null;
  private String passwordChangeToken = null;

  /**
   * User identifier
   **/
  public ExecutePasswordChangeParams userId(String userId) {
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
   * User's new password
   **/
  public ExecutePasswordChangeParams password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User's new password")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Decrypted password change token (the token that you received from the /users/requestPasswordChange service, decrypted with your data decryption key)
   **/
  public ExecutePasswordChangeParams passwordChangeToken(String passwordChangeToken) {
    this.passwordChangeToken = passwordChangeToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Decrypted password change token (the token that you received from the /users/requestPasswordChange service, decrypted with your data decryption key)")
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
    ExecutePasswordChangeParams executePasswordChangeParams = (ExecutePasswordChangeParams) o;
    return Objects.equals(userId, executePasswordChangeParams.userId) &&
        Objects.equals(password, executePasswordChangeParams.password) &&
        Objects.equals(passwordChangeToken, executePasswordChangeParams.passwordChangeToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, password, passwordChangeToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePasswordChangeParams {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

