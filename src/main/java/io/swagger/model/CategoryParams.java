package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Category parameters
 **/

@ApiModel(description = "Category parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class CategoryParams   {
  
  private String name = null;
  private Long parentId = null;

  /**
   * Name of the category. Maximum length is 128 symbols.
   **/
  public CategoryParams name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the category. Maximum length is 128 symbols.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Identifier of the parent category, if the new category should be created as a sub-category. Must point to a main category in this case. If the new category should be a main category itself, this field must remain unset.
   **/
  public CategoryParams parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier of the parent category, if the new category should be created as a sub-category. Must point to a main category in this case. If the new category should be a main category itself, this field must remain unset.")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryParams categoryParams = (CategoryParams) o;
    return Objects.equals(name, categoryParams.name) &&
        Objects.equals(parentId, categoryParams.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryParams {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

