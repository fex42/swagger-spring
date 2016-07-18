package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Category data
 **/

@ApiModel(description = "Category data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class Category   {
  
  private Long id = null;
  private String name = null;
  private Long parentId = null;
  private String parentName = null;
  private Boolean isCustom = false;
  private List<Long> children = new ArrayList<Long>();

  /**
   * Category identifier
   **/
  public Category id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Category identifier")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Category name
   **/
  public Category name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Category name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Identifier of the parent category (if a parent category exists)
   **/
  public Category parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier of the parent category (if a parent category exists)")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  /**
   * Name of the parent category (if a parent category exists)
   **/
  public Category parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the parent category (if a parent category exists)")
  @JsonProperty("parentName")
  public String getParentName() {
    return parentName;
  }
  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  /**
   * Whether the category is a finAPI global category (in which case this field will be false), or the category was created by a user (in which case this field will be true)
   **/
  public Category isCustom(Boolean isCustom) {
    this.isCustom = isCustom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Whether the category is a finAPI global category (in which case this field will be false), or the category was created by a user (in which case this field will be true)")
  @JsonProperty("isCustom")
  public Boolean getIsCustom() {
    return isCustom;
  }
  public void setIsCustom(Boolean isCustom) {
    this.isCustom = isCustom;
  }

  /**
   * List of sub-categories identifiers (if any exist)
   **/
  public Category children(List<Long> children) {
    this.children = children;
    return this;
  }

  
  @ApiModelProperty(value = "List of sub-categories identifiers (if any exist)")
  @JsonProperty("children")
  public List<Long> getChildren() {
    return children;
  }
  public void setChildren(List<Long> children) {
    this.children = children;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(id, category.id) &&
        Objects.equals(name, category.name) &&
        Objects.equals(parentId, category.parentId) &&
        Objects.equals(parentName, category.parentName) &&
        Objects.equals(isCustom, category.isCustom) &&
        Objects.equals(children, category.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parentId, parentName, isCustom, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    isCustom: ").append(toIndentedString(isCustom)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

