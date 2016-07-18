package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import io.swagger.model.Paging;
import java.util.ArrayList;
import java.util.List;



/**
 * Container for categories with paging info
 **/

@ApiModel(description = "Container for categories with paging info")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class PageableCategoryList   {
  
  private List<Category> categories = new ArrayList<Category>();
  private Paging paging = null;

  /**
   * Categories
   **/
  public PageableCategoryList categories(List<Category> categories) {
    this.categories = categories;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Categories")
  @JsonProperty("categories")
  public List<Category> getCategories() {
    return categories;
  }
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  /**
   * Information for pagination
   **/
  public PageableCategoryList paging(Paging paging) {
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
    PageableCategoryList pageableCategoryList = (PageableCategoryList) o;
    return Objects.equals(categories, pageableCategoryList.categories) &&
        Objects.equals(paging, pageableCategoryList.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageableCategoryList {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

