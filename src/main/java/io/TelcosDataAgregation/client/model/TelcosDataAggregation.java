package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class TelcosDataAggregation extends TelcosDataAggregationId {
  @SerializedName("curp")
  private String curp = null;

  /**
   * Inquiry status.
   */
  @JsonAdapter(InquiryStatusEnum.Adapter.class)
  public enum InquiryStatusEnum {
    WAOIR("WAOIR"),
    
    NAOIR("NAOIR"),
    
    AOIR("AOIR"),
    
    TEAOIR("TEAOIR"),
    
    TEIR("TEIR"),
    
    TENAEIR("TENAEIR"),
    
    AEIR("AEIR"),
    
    NAEIR("NAEIR"),
    
    NAEIRMR("NAEIRMR"),
    
    RJTIR("RJTIR"),
    
    RCVIR("RCVIR"),
    
    SN("SN"),
    
    DN("DN"),
    
    NDN("NDN"),
    
    CI("CI"),
    
    EI("EI");

    private String value;

    InquiryStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InquiryStatusEnum fromValue(String text) {
      for (InquiryStatusEnum b : InquiryStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InquiryStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InquiryStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InquiryStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InquiryStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("inquiryStatus")
  private InquiryStatusEnum inquiryStatus = null;

  @SerializedName("successCheck")
  private Boolean successCheck = null;

  public TelcosDataAggregation curp(String curp) {
    this.curp = curp;
    return this;
  }

  public String getCurp() {
    return curp;
  }

  public void setCurp(String curp) {
    this.curp = curp;
  }

  public InquiryStatusEnum getInquiryStatus() {
    return inquiryStatus;
  }

  public Boolean isSuccessCheck() {
    return successCheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelcosDataAggregation telcosDataAggregation = (TelcosDataAggregation) o;
    return Objects.equals(this.curp, telcosDataAggregation.curp) &&
        Objects.equals(this.inquiryStatus, telcosDataAggregation.inquiryStatus) &&
        Objects.equals(this.successCheck, telcosDataAggregation.successCheck) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(curp, inquiryStatus, successCheck, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelcosDataAggregation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    inquiryStatus: ").append(toIndentedString(inquiryStatus)).append("\n");
    sb.append("    successCheck: ").append(toIndentedString(successCheck)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

