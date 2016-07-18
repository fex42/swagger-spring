package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Bank;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for data of multiple banks
 **/

@ApiModel(description = "Container for data of multiple banks")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class BankList   {
  
  private List<Bank> banks = new ArrayList<Bank>();

  /**
   * Banks data
   **/
  public BankList banks(List<Bank> banks) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankList bankList = (BankList) o;
    return Objects.equals(banks, bankList.banks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankList {\n");
    
    sb.append("    banks: ").append(toIndentedString(banks)).append("\n");
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

