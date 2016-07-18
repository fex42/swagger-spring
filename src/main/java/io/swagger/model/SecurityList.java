package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Security;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for securities resources
 **/

@ApiModel(description = "Container for securities resources")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class SecurityList   {
  
  private List<Security> securities = new ArrayList<Security>();

  /**
   * List of securities
   **/
  public SecurityList securities(List<Security> securities) {
    this.securities = securities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of securities")
  @JsonProperty("securities")
  public List<Security> getSecurities() {
    return securities;
  }
  public void setSecurities(List<Security> securities) {
    this.securities = securities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityList securityList = (SecurityList) o;
    return Objects.equals(securities, securityList.securities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityList {\n");
    
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
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

