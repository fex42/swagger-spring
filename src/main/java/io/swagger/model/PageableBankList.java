package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Bank;
import io.swagger.model.Paging;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for banks with paging info
 **/

@ApiModel(description = "Container for banks with paging info")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class PageableBankList   {
  
  private List<Bank> banks = new ArrayList<Bank>();
  private Paging paging = null;

  /**
   * Banks data
   **/
  public PageableBankList banks(List<Bank> banks) {
    this.banks = banks;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Banks data")
  @JsonProperty("banks")
  public List<Bank> getBanks() {
    return banks;
  }
  public void setBanks(List<Bank> banks) {
    this.banks = banks;
  }

  /**
   * Information for pagination
   **/
  public PageableBankList paging(Paging paging) {
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
    PageableBankList pageableBankList = (PageableBankList) o;
    return Objects.equals(banks, pageableBankList.banks) &&
        Objects.equals(paging, pageableBankList.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banks, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageableBankList {\n");
    
    sb.append("    banks: ").append(toIndentedString(banks)).append("\n");
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

