package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Label;
import io.swagger.model.Paging;
import java.util.ArrayList;
import java.util.List;



/**
 * Label resources with paging information
 **/

@ApiModel(description = "Label resources with paging information")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class PageableLabelList   {
  
  private List<Label> labels = new ArrayList<Label>();
  private Paging paging = null;

  /**
   * Data of labels
   **/
  public PageableLabelList labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Data of labels")
  @JsonProperty("labels")
  public List<Label> getLabels() {
    return labels;
  }
  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  /**
   * Information for pagination
   **/
  public PageableLabelList paging(Paging paging) {
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
    PageableLabelList pageableLabelList = (PageableLabelList) o;
    return Objects.equals(labels, pageableLabelList.labels) &&
        Objects.equals(paging, pageableLabelList.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageableLabelList {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

