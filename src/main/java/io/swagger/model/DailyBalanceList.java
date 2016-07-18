package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DailyBalance;
import io.swagger.model.Paging;
import java.util.ArrayList;
import java.util.List;



/**
 * Contains a list of daily balances
 **/

@ApiModel(description = "Contains a list of daily balances")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class DailyBalanceList   {
  
  private String latestCommonBalanceTimestamp = null;
  private List<DailyBalance> dailyBalances = new ArrayList<DailyBalance>();
  private Paging paging = null;

  /**
   * The latestCommonBalanceTimestamp is the latest timestamp at which all given accounts have been up to date. Only balances with their date being smaller than the latestCommonBalanceTimestamp are reliable. Example: A user has two accounts: A (last update today, so balance from today) and B (last update yesterday, so balance from yesterday). The service /accounts/dailyBalances will return a balance for yesterday and for today, with the info latestCommonBalanceTimestamp=yesterday. Since account B might have received transactions this morning, today's balance might be wrong. So either make sure that all selected accounts are up to date before calling this service, or use the results carefully in combination with the latestCommonBalanceTimestamp. The format is 'yyyy-MM-dd HH:mm:ss.SSS' (german time).
   **/
  public DailyBalanceList latestCommonBalanceTimestamp(String latestCommonBalanceTimestamp) {
    this.latestCommonBalanceTimestamp = latestCommonBalanceTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "The latestCommonBalanceTimestamp is the latest timestamp at which all given accounts have been up to date. Only balances with their date being smaller than the latestCommonBalanceTimestamp are reliable. Example: A user has two accounts: A (last update today, so balance from today) and B (last update yesterday, so balance from yesterday). The service /accounts/dailyBalances will return a balance for yesterday and for today, with the info latestCommonBalanceTimestamp=yesterday. Since account B might have received transactions this morning, today's balance might be wrong. So either make sure that all selected accounts are up to date before calling this service, or use the results carefully in combination with the latestCommonBalanceTimestamp. The format is 'yyyy-MM-dd HH:mm:ss.SSS' (german time).")
  @JsonProperty("latestCommonBalanceTimestamp")
  public String getLatestCommonBalanceTimestamp() {
    return latestCommonBalanceTimestamp;
  }
  public void setLatestCommonBalanceTimestamp(String latestCommonBalanceTimestamp) {
    this.latestCommonBalanceTimestamp = latestCommonBalanceTimestamp;
  }

  /**
   * List of daily balances for specified accounts and dates range
   **/
  public DailyBalanceList dailyBalances(List<DailyBalance> dailyBalances) {
    this.dailyBalances = dailyBalances;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of daily balances for specified accounts and dates range")
  @JsonProperty("dailyBalances")
  public List<DailyBalance> getDailyBalances() {
    return dailyBalances;
  }
  public void setDailyBalances(List<DailyBalance> dailyBalances) {
    this.dailyBalances = dailyBalances;
  }

  /**
   * Information for pagination
   **/
  public DailyBalanceList paging(Paging paging) {
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
    DailyBalanceList dailyBalanceList = (DailyBalanceList) o;
    return Objects.equals(latestCommonBalanceTimestamp, dailyBalanceList.latestCommonBalanceTimestamp) &&
        Objects.equals(dailyBalances, dailyBalanceList.dailyBalances) &&
        Objects.equals(paging, dailyBalanceList.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestCommonBalanceTimestamp, dailyBalances, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyBalanceList {\n");
    
    sb.append("    latestCommonBalanceTimestamp: ").append(toIndentedString(latestCommonBalanceTimestamp)).append("\n");
    sb.append("    dailyBalances: ").append(toIndentedString(dailyBalances)).append("\n");
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

