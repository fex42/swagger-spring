package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubTransactionParams;
import java.util.ArrayList;
import java.util.List;



/**
 * Set of logical sub-transactions that a transaction should get split into
 **/

@ApiModel(description = "Set of logical sub-transactions that a transaction should get split into")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class SplitTransactionsParams   {
  
  private List<SubTransactionParams> subTransactions = new ArrayList<SubTransactionParams>();

  /**
   * List of sub-transactions
   **/
  public SplitTransactionsParams subTransactions(List<SubTransactionParams> subTransactions) {
    this.subTransactions = subTransactions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of sub-transactions")
  @JsonProperty("subTransactions")
  public List<SubTransactionParams> getSubTransactions() {
    return subTransactions;
  }
  public void setSubTransactions(List<SubTransactionParams> subTransactions) {
    this.subTransactions = subTransactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTransactionsParams splitTransactionsParams = (SplitTransactionsParams) o;
    return Objects.equals(subTransactions, splitTransactionsParams.subTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTransactionsParams {\n");
    
    sb.append("    subTransactions: ").append(toIndentedString(subTransactions)).append("\n");
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

