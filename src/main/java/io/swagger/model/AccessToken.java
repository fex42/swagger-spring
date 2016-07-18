package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * User access token info
 **/

@ApiModel(description = "User access token info")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class AccessToken   {
  
  private String accessToken = null;
  private String tokenType = null;
  private String refreshToken = null;
  private Integer expiresIn = null;
  private String scope = null;

  /**
   * Access token
   **/
  public AccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Access token")
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * Token type (it's always 'bearer')
   **/
  public AccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Token type (it's always 'bearer')")
  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  /**
   * Refresh token. Only mandatory for grant_type='password'.
   **/
  public AccessToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  
  @ApiModelProperty(value = "Refresh token. Only mandatory for grant_type='password'.")
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   * Expiration time in seconds
   **/
  public AccessToken expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Expiration time in seconds")
  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   * Requested scopes (it's always 'all')
   **/
  public AccessToken scope(String scope) {
    this.scope = scope;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Requested scopes (it's always 'all')")
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(accessToken, accessToken.accessToken) &&
        Objects.equals(tokenType, accessToken.tokenType) &&
        Objects.equals(refreshToken, accessToken.refreshToken) &&
        Objects.equals(expiresIn, accessToken.expiresIn) &&
        Objects.equals(scope, accessToken.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, refreshToken, expiresIn, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

