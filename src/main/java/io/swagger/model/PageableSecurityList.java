package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Paging;
import io.swagger.model.Security;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for page of securities
 **/

@ApiModel(description = "Container for page of securities")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class PageableSecurityList   {
  
  private List<Security> securities = new ArrayList<Security>();
  private Paging paging = null;

  /**
   * List of securities
   **/
  public PageableSecurityList securities(List<Security> securities) {
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

  /**
   * Information for pagination
   **/
  public PageableSecurityList paging(Paging paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Information for pagination")
  @JsonProperty("paging")
  public Paging getPaging() {
    return paging;
  }
  public void setPaging(Paging paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageableSecurityList pageableSecurityList = (PageableSecurityList) o;
    return Objects.equals(securities, pageableSecurityList.securities) &&
        Objects.equals(paging, pageableSecurityList.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securities, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageableSecurityList {\n");
    
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

