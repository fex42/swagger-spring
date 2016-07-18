package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Container for a security position&#39;s data
 **/

@ApiModel(description = "Container for a security position's data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class Security   {
  
  private Long id = null;
  private Long accountId = null;
  private String name = null;
  private String isin = null;
  private String wkn = null;
  private BigDecimal quote = null;
  private String quoteCurrency = null;


  public enum QuoteTypeEnum {
    ACTU("ACTU"),
    PERC("PERC");

    private String value;

    QuoteTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private QuoteTypeEnum quoteType = null;
  private String quoteDate = null;
  private BigDecimal quantityNominal = null;


  public enum QuantityNominalTypeEnum {
    UNIT("UNIT"),
    FAMT("FAMT");

    private String value;

    QuantityNominalTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private QuantityNominalTypeEnum quantityNominalType = null;
  private BigDecimal marketValue = null;
  private BigDecimal entryQuote = null;
  private String entryQuoteCurrency = null;

  /**
   * Identifier. Note: Whenever a security account is being updated, its security positions will be internally re-created, meaning that the identifier of a security position might change over time.
   **/
  public Security id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifier. Note: Whenever a security account is being updated, its security positions will be internally re-created, meaning that the identifier of a security position might change over time.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Security account identifier
   **/
  public Security accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Security account identifier")
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  /**
   * Name
   **/
  public Security name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * ISIN
   **/
  public Security isin(String isin) {
    this.isin = isin;
    return this;
  }

  
  @ApiModelProperty(value = "ISIN")
  @JsonProperty("isin")
  public String getIsin() {
    return isin;
  }
  public void setIsin(String isin) {
    this.isin = isin;
  }

  /**
   * WKN
   **/
  public Security wkn(String wkn) {
    this.wkn = wkn;
    return this;
  }

  
  @ApiModelProperty(value = "WKN")
  @JsonProperty("wkn")
  public String getWkn() {
    return wkn;
  }
  public void setWkn(String wkn) {
    this.wkn = wkn;
  }

  /**
   * Quote
   **/
  public Security quote(BigDecimal quote) {
    this.quote = quote;
    return this;
  }

  
  @ApiModelProperty(value = "Quote")
  @JsonProperty("quote")
  public BigDecimal getQuote() {
    return quote;
  }
  public void setQuote(BigDecimal quote) {
    this.quote = quote;
  }

  /**
   * Currency of quote
   **/
  public Security quoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "Currency of quote")
  @JsonProperty("quoteCurrency")
  public String getQuoteCurrency() {
    return quoteCurrency;
  }
  public void setQuoteCurrency(String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
  }

  /**
   * Type of quote. 'PERC' if quote is a percentage value, 'ACTU' if quote is the actual amount
   **/
  public Security quoteType(QuoteTypeEnum quoteType) {
    this.quoteType = quoteType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of quote. 'PERC' if quote is a percentage value, 'ACTU' if quote is the actual amount")
  @JsonProperty("quoteType")
  public QuoteTypeEnum getQuoteType() {
    return quoteType;
  }
  public void setQuoteType(QuoteTypeEnum quoteType) {
    this.quoteType = quoteType;
  }

  /**
   * Quote date
   **/
  public Security quoteDate(String quoteDate) {
    this.quoteDate = quoteDate;
    return this;
  }

  
  @ApiModelProperty(value = "Quote date")
  @JsonProperty("quoteDate")
  public String getQuoteDate() {
    return quoteDate;
  }
  public void setQuoteDate(String quoteDate) {
    this.quoteDate = quoteDate;
  }

  /**
   * Value of quantity or nominal
   **/
  public Security quantityNominal(BigDecimal quantityNominal) {
    this.quantityNominal = quantityNominal;
    return this;
  }

  
  @ApiModelProperty(value = "Value of quantity or nominal")
  @JsonProperty("quantityNominal")
  public BigDecimal getQuantityNominal() {
    return quantityNominal;
  }
  public void setQuantityNominal(BigDecimal quantityNominal) {
    this.quantityNominal = quantityNominal;
  }

  /**
   * Type of quantity or nominal value. 'UNIT' if value is a quantity, 'FAMT' if value is the nominal amount
   **/
  public Security quantityNominalType(QuantityNominalTypeEnum quantityNominalType) {
    this.quantityNominalType = quantityNominalType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of quantity or nominal value. 'UNIT' if value is a quantity, 'FAMT' if value is the nominal amount")
  @JsonProperty("quantityNominalType")
  public QuantityNominalTypeEnum getQuantityNominalType() {
    return quantityNominalType;
  }
  public void setQuantityNominalType(QuantityNominalTypeEnum quantityNominalType) {
    this.quantityNominalType = quantityNominalType;
  }

  /**
   * Market value
   **/
  public Security marketValue(BigDecimal marketValue) {
    this.marketValue = marketValue;
    return this;
  }

  
  @ApiModelProperty(value = "Market value")
  @JsonProperty("marketValue")
  public BigDecimal getMarketValue() {
    return marketValue;
  }
  public void setMarketValue(BigDecimal marketValue) {
    this.marketValue = marketValue;
  }

  /**
   * Entry quote
   **/
  public Security entryQuote(BigDecimal entryQuote) {
    this.entryQuote = entryQuote;
    return this;
  }

  
  @ApiModelProperty(value = "Entry quote")
  @JsonProperty("entryQuote")
  public BigDecimal getEntryQuote() {
    return entryQuote;
  }
  public void setEntryQuote(BigDecimal entryQuote) {
    this.entryQuote = entryQuote;
  }

  /**
   * Currency of entry quote
   **/
  public Security entryQuoteCurrency(String entryQuoteCurrency) {
    this.entryQuoteCurrency = entryQuoteCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "Currency of entry quote")
  @JsonProperty("entryQuoteCurrency")
  public String getEntryQuoteCurrency() {
    return entryQuoteCurrency;
  }
  public void setEntryQuoteCurrency(String entryQuoteCurrency) {
    this.entryQuoteCurrency = entryQuoteCurrency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Security security = (Security) o;
    return Objects.equals(id, security.id) &&
        Objects.equals(accountId, security.accountId) &&
        Objects.equals(name, security.name) &&
        Objects.equals(isin, security.isin) &&
        Objects.equals(wkn, security.wkn) &&
        Objects.equals(quote, security.quote) &&
        Objects.equals(quoteCurrency, security.quoteCurrency) &&
        Objects.equals(quoteType, security.quoteType) &&
        Objects.equals(quoteDate, security.quoteDate) &&
        Objects.equals(quantityNominal, security.quantityNominal) &&
        Objects.equals(quantityNominalType, security.quantityNominalType) &&
        Objects.equals(marketValue, security.marketValue) &&
        Objects.equals(entryQuote, security.entryQuote) &&
        Objects.equals(entryQuoteCurrency, security.entryQuoteCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, name, isin, wkn, quote, quoteCurrency, quoteType, quoteDate, quantityNominal, quantityNominalType, marketValue, entryQuote, entryQuoteCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Security {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    wkn: ").append(toIndentedString(wkn)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    quoteCurrency: ").append(toIndentedString(quoteCurrency)).append("\n");
    sb.append("    quoteType: ").append(toIndentedString(quoteType)).append("\n");
    sb.append("    quoteDate: ").append(toIndentedString(quoteDate)).append("\n");
    sb.append("    quantityNominal: ").append(toIndentedString(quantityNominal)).append("\n");
    sb.append("    quantityNominalType: ").append(toIndentedString(quantityNominalType)).append("\n");
    sb.append("    marketValue: ").append(toIndentedString(marketValue)).append("\n");
    sb.append("    entryQuote: ").append(toIndentedString(entryQuote)).append("\n");
    sb.append("    entryQuoteCurrency: ").append(toIndentedString(entryQuoteCurrency)).append("\n");
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

