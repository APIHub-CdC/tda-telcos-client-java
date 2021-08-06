package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public class TopCall {
  @SerializedName("priority")
  private BigDecimal priority = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("frequency")
  private BigDecimal frequency = null;

  @SerializedName("total_minutes")
  private BigDecimal totalMinutes = null;

  public TopCall priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }

  public TopCall phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public TopCall destination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public TopCall frequency(BigDecimal frequency) {
    this.frequency = frequency;
    return this;
  }

  public BigDecimal getFrequency() {
    return frequency;
  }

  public void setFrequency(BigDecimal frequency) {
    this.frequency = frequency;
  }

  public TopCall totalMinutes(BigDecimal totalMinutes) {
    this.totalMinutes = totalMinutes;
    return this;
  }
  
  public BigDecimal getTotalMinutes() {
    return totalMinutes;
  }

  public void setTotalMinutes(BigDecimal totalMinutes) {
    this.totalMinutes = totalMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopCall topCall = (TopCall) o;
    return Objects.equals(this.priority, topCall.priority) &&
        Objects.equals(this.phoneNumber, topCall.phoneNumber) &&
        Objects.equals(this.destination, topCall.destination) &&
        Objects.equals(this.frequency, topCall.frequency) &&
        Objects.equals(this.totalMinutes, topCall.totalMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, phoneNumber, destination, frequency, totalMinutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopCall {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    totalMinutes: ").append(toIndentedString(totalMinutes)).append("\n");
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

