package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;


public class AckTelcosDataAggregation {
  @SerializedName("acknowledgeId")
  private UUID acknowledgeId = null;

  @SerializedName("dateTime")
  private OffsetDateTime dateTime = null;

  @SerializedName("operation")
  private String operation = null;

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

  public String getOperation() {
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

