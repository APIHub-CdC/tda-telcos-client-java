package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Call {
  @SerializedName("total_minutes")
  private BigDecimal totalMinutes = null;

  @SerializedName("weekdays_minutes")
  private BigDecimal weekdaysMinutes = null;

  @SerializedName("weekends_minutes")
  private BigDecimal weekendsMinutes = null;

  @SerializedName("top")
  private List<TopCall> top = null;

  public Call totalMinutes(BigDecimal totalMinutes) {
    this.totalMinutes = totalMinutes;
    return this;
  }

  public BigDecimal getTotalMinutes() {
    return totalMinutes;
  }

  public void setTotalMinutes(BigDecimal totalMinutes) {
    this.totalMinutes = totalMinutes;
  }

  public Call weekdaysMinutes(BigDecimal weekdaysMinutes) {
    this.weekdaysMinutes = weekdaysMinutes;
    return this;
  }

  public BigDecimal getWeekdaysMinutes() {
    return weekdaysMinutes;
  }

  public void setWeekdaysMinutes(BigDecimal weekdaysMinutes) {
    this.weekdaysMinutes = weekdaysMinutes;
  }

  public Call weekendsMinutes(BigDecimal weekendsMinutes) {
    this.weekendsMinutes = weekendsMinutes;
    return this;
  }

  public BigDecimal getWeekendsMinutes() {
    return weekendsMinutes;
  }

  public void setWeekendsMinutes(BigDecimal weekendsMinutes) {
    this.weekendsMinutes = weekendsMinutes;
  }

  public Call top(List<TopCall> top) {
    this.top = top;
    return this;
  }

  public Call addTopItem(TopCall topItem) {
    if (this.top == null) {
      this.top = new ArrayList<TopCall>();
    }
    this.top.add(topItem);
    return this;
  }

  public List<TopCall> getTop() {
    return top;
  }

  public void setTop(List<TopCall> top) {
    this.top = top;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Call call = (Call) o;
    return Objects.equals(this.totalMinutes, call.totalMinutes) &&
        Objects.equals(this.weekdaysMinutes, call.weekdaysMinutes) &&
        Objects.equals(this.weekendsMinutes, call.weekendsMinutes) &&
        Objects.equals(this.top, call.top);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalMinutes, weekdaysMinutes, weekendsMinutes, top);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Call {\n");
    
    sb.append("    totalMinutes: ").append(toIndentedString(totalMinutes)).append("\n");
    sb.append("    weekdaysMinutes: ").append(toIndentedString(weekdaysMinutes)).append("\n");
    sb.append("    weekendsMinutes: ").append(toIndentedString(weekendsMinutes)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
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

