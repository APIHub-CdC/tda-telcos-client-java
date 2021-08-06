package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.UUID;


public class AckTDARequest extends AckTelcosDataAggregation {
  @SerializedName("requestId")
  private UUID requestId = null;

  @SerializedName("subscriptionId")
  private UUID subscriptionId = null;

  @SerializedName("inquiryId")
  private UUID inquiryId = null;

  public AckTDARequest requestId(UUID requestId) {
    this.requestId = requestId;
    return this;
  }

  public UUID getRequestId() {
    return requestId;
  }

  public void setRequestId(UUID requestId) {
    this.requestId = requestId;
  }

  public AckTDARequest subscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  public UUID getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public UUID getInquiryId() {
    return inquiryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckTDARequest ackTDARequest = (AckTDARequest) o;
    return Objects.equals(this.requestId, ackTDARequest.requestId) &&
        Objects.equals(this.subscriptionId, ackTDARequest.subscriptionId) &&
        Objects.equals(this.inquiryId, ackTDARequest.inquiryId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, subscriptionId, inquiryId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckTDARequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    inquiryId: ").append(toIndentedString(inquiryId)).append("\n");
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

