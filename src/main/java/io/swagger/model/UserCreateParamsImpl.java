package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * User details
 **/

@ApiModel(description = "User details")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class UserCreateParamsImpl   {
  
  private String email = null;
  private String phone = null;
  private String id = null;
  private String password = null;

  /**
   * User's email address
   **/
  public UserCreateParamsImpl email(String email) {
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
  public UserCreateParamsImpl phone(String phone) {
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

  /**
   * User's identifier. Max length is 36 symbols. Only the following symbols are allowed: 0-9, A-Z, a-z, -, _, ., +, @. If not specified, then a unique random value will be generated.
   **/
  public UserCreateParamsImpl id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "User's identifier. Max length is 36 symbols. Only the following symbols are allowed: 0-9, A-Z, a-z, -, _, ., +, @. If not specified, then a unique random value will be generated.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * User's password. Min length is 6 symbols and max length is 36 symbols. If not specified, then a unique random value will be generated.
   **/
  public UserCreateParamsImpl password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "User's password. Min length is 6 symbols and max length is 36 symbols. If not specified, then a unique random value will be generated.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateParamsImpl userCreateParamsImpl = (UserCreateParamsImpl) o;
    return Objects.equals(email, userCreateParamsImpl.email) &&
        Objects.equals(phone, userCreateParamsImpl.phone) &&
        Objects.equals(id, userCreateParamsImpl.id) &&
        Objects.equals(password, userCreateParamsImpl.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phone, id, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateParamsImpl {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

