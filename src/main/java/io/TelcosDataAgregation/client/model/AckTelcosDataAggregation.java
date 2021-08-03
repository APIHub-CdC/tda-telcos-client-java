package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;


public class AckTelcosDataAggregation {
  @SerializedName("acknowledgeId")
  private UUID acknowledgeId = null;

  @SerializedName("dateTime")
  private OffsetDateTime dateTime = null;

  public enum OperationEnum {
    REQUEST("request"),
    
    CONSUMPTION("consumption");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operation")
  private OperationEnum operation = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("qr")
  private String qr = null;

  @SerializedName("widget_url")
  private String widgetUrl = null;

  public UUID getAcknowledgeId() {
    return acknowledgeId;
  }

  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public OperationEnum getOperation() {
    return operation;
  }

  public String getMessage() {
    return message;
  }

   public String getQr() {
    return qr;
  }

  public String getWidgetUrl() {
    return widgetUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckTelcosDataAggregation ackTelcosDataAggregation = (AckTelcosDataAggregation) o;
    return Objects.equals(this.acknowledgeId, ackTelcosDataAggregation.acknowledgeId) &&
        Objects.equals(this.dateTime, ackTelcosDataAggregation.dateTime) &&
        Objects.equals(this.operation, ackTelcosDataAggregation.operation) &&
        Objects.equals(this.message, ackTelcosDataAggregation.message) &&
        Objects.equals(this.qr, ackTelcosDataAggregation.qr) &&
        Objects.equals(this.widgetUrl, ackTelcosDataAggregation.widgetUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acknowledgeId, dateTime, operation, message, qr, widgetUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckTelcosDataAggregation {\n");
    
    sb.append("    acknowledgeId: ").append(toIndentedString(acknowledgeId)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    qr: ").append(toIndentedString(qr)).append("\n");
    sb.append("    widgetUrl: ").append(toIndentedString(widgetUrl)).append("\n");
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

