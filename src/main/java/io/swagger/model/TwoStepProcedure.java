package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Two-step-procedure for a communication with a bank server, e.g. for doing a money transfer
 **/

@ApiModel(description = "Two-step-procedure for a communication with a bank server, e.g. for doing a money transfer")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-15T16:13:38.921+02:00")

public class TwoStepProcedure   {
  
  private String procedureId = null;
  private String procedureName = null;
  private String procedureChallengeType = null;

  /**
   * Bank-given ID of the procedure
   **/
  public TwoStepProcedure procedureId(String procedureId) {
    this.procedureId = procedureId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Bank-given ID of the procedure")
  @JsonProperty("procedureId")
  public String getProcedureId() {
    return procedureId;
  }
  public void setProcedureId(String procedureId) {
    this.procedureId = procedureId;
  }

  /**
   * Bank-given name of the procedure
   **/
  public TwoStepProcedure procedureName(String procedureName) {
    this.procedureName = procedureName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Bank-given name of the procedure")
  @JsonProperty("procedureName")
  public String getProcedureName() {
    return procedureName;
  }
  public void setProcedureName(String procedureName) {
    this.procedureName = procedureName;
  }

  /**
   * The challenge type of the procedure. Possible values are:<br/>&bull; <code>TEXT</code> - the challenge will be a text that contains instructions for the user on how to retrieve the TAN.<br/>&bull; <code>PHOTO</code> - the challenge will contain a BASE-64 string depicting a photo (or any kind of QR-code-like data) that must be shown to the user.<br/>&bull; <code>FLICKER_CODE</code> - the challenge will contain a BASE-64 string depicting a flicker code animation that must be shown to the user.<br/>Note that this challenge type information does not originate from the bank server, but is determined by finAPI internally. There is no guarantee that the determined challenge type is correct. Note also that this field may not be set, meaning that finAPI could not determine the challenge type of the procedure.
   **/
  public TwoStepProcedure procedureChallengeType(String procedureChallengeType) {
    this.procedureChallengeType = procedureChallengeType;
    return this;
  }

  
  @ApiModelProperty(value = "The challenge type of the procedure. Possible values are:<br/>&bull; <code>TEXT</code> - the challenge will be a text that contains instructions for the user on how to retrieve the TAN.<br/>&bull; <code>PHOTO</code> - the challenge will contain a BASE-64 string depicting a photo (or any kind of QR-code-like data) that must be shown to the user.<br/>&bull; <code>FLICKER_CODE</code> - the challenge will contain a BASE-64 string depicting a flicker code animation that must be shown to the user.<br/>Note that this challenge type information does not originate from the bank server, but is determined by finAPI internally. There is no guarantee that the determined challenge type is correct. Note also that this field may not be set, meaning that finAPI could not determine the challenge type of the procedure.")
  @JsonProperty("procedureChallengeType")
  public String getProcedureChallengeType() {
    return procedureChallengeType;
  }
  public void setProcedureChallengeType(String procedureChallengeType) {
    this.procedureChallengeType = procedureChallengeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwoStepProcedure twoStepProcedure = (TwoStepProcedure) o;
    return Objects.equals(procedureId, twoStepProcedure.procedureId) &&
        Objects.equals(procedureName, twoStepProcedure.procedureName) &&
        Objects.equals(procedureChallengeType, twoStepProcedure.procedureChallengeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(procedureId, procedureName, procedureChallengeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwoStepProcedure {\n");
    
    sb.append("    procedureId: ").append(toIndentedString(procedureId)).append("\n");
    sb.append("    procedureName: ").append(toIndentedString(procedureName)).append("\n");
    sb.append("    procedureChallengeType: ").append(toIndentedString(procedureChallengeType)).append("\n");
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

