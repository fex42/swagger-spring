package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Set of identifiers (in ascending order)
 **/

@ApiModel(description = "Set of identifiers (in ascending order)")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class IdentifierList   {
  
  private List<Long> identifiers = new ArrayList<Long>();

  /**
   * Set of identifiers (in ascending order)
   **/
  public IdentifierList identifiers(List<Long> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  
  @ApiModelProperty(value = "Set of identifiers (in ascending order)")
  @JsonProperty("identifiers")
  public List<Long> getIdentifiers() {
    return identifiers;
  }
  public void setIdentifiers(List<Long> identifiers) {
    this.identifiers = identifiers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifierList identifierList = (IdentifierList) o;
    return Objects.equals(identifiers, identifierList.identifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifierList {\n");
    
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
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

