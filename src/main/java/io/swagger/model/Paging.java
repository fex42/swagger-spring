package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Container for pagination information
 **/

@ApiModel(description = "Container for pagination information")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class Paging   {
  
  private Integer page = null;
  private Integer perPage = null;
  private Integer pageCount = null;
  private Long totalCount = null;

  /**
   * Current page number
   **/
  public Paging page(Integer page) {
    this.page = page;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Current page number")
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }

  /**
   * Current page size
   **/
  public Paging perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Current page size")
  @JsonProperty("perPage")
  public Integer getPerPage() {
    return perPage;
  }
  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  /**
   * Total number of pages
   **/
  public Paging pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Total number of pages")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  /**
   * Total number of resources
   **/
  public Paging totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Total number of resources")
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paging paging = (Paging) o;
    return Objects.equals(page, paging.page) &&
        Objects.equals(perPage, paging.perPage) &&
        Objects.equals(pageCount, paging.pageCount) &&
        Objects.equals(totalCount, paging.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, perPage, pageCount, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paging {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

