package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Container for a user&#39;s data
 **/

@ApiModel(description = "Container for a user's data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class User   {
  
  private String id = null;
  private String password = null;
  private String email = null;
  private String phone = null;

  /**
   * User identifier
   **/
  public User id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * User's password. Please note that some services may return a distorted password, where each symbol is just shown as an 'X' character, i.e. if the user's password is '12345', a service may return the string 'XXXXX'. See the documentation of individual services to find out whether the password is returned in a distorted form or not.
   **/
  public User password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User's password. Please note that some services may return a distorted password, where each symbol is just shown as an 'X' character, i.e. if the user's password is '12345', a service may return the string 'XXXXX'. See the documentation of individual services to find out whether the password is returned in a distorted form or not.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * User's email address
   **/
  public User email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "User's email address")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * User's phone number
   **/
  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(value = "User's phone number")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(id, user.id) &&
        Objects.equals(password, user.password) &&
        Objects.equals(email, user.email) &&
        Objects.equals(phone, user.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password, email, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

