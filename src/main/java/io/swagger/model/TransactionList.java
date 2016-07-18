package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Transaction;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for data of multiple transactions
 **/

@ApiModel(description = "Container for data of multiple transactions")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class TransactionList   {
  
  private List<Transaction> transactions = new ArrayList<Transaction>();

  /**
   * Array of transactions
   **/
  public TransactionList transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of transactions")
  @JsonProperty("transactions")
  public List<Transaction> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionList transactionList = (TransactionList) o;
    return Objects.equals(transactions, transactionList.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionList {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

