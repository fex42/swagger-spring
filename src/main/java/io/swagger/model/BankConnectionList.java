package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BankConnection;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for data of multiple bank connections
 **/

@ApiModel(description = "Container for data of multiple bank connections")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class BankConnectionList   {
  
  private List<BankConnection> connections = new ArrayList<BankConnection>();

  /**
   * List of bank connections
   **/
  public BankConnectionList connections(List<BankConnection> connections) {
    this.connections = connections;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of bank connections")
  @JsonProperty("connections")
  public List<BankConnection> getConnections() {
    return connections;
  }
  public void setConnections(List<BankConnection> connections) {
    this.connections = connections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankConnectionList bankConnectionList = (BankConnectionList) o;
    return Objects.equals(connections, bankConnectionList.connections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankConnectionList {\n");
    
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
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

