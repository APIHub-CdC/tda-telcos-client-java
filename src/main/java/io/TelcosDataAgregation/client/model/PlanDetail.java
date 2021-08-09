package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class PlanDetail {
  @SerializedName("account")
  private String account = null;

  @SerializedName("plan_type")
  private String planType = null;

  @SerializedName("period")
  private String period = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("address")
  private List<String> address = null;

  @SerializedName("calls")
  private Call calls = null;

  @SerializedName("service_data")
  private List<PlanDetailServiceData> serviceData = null;

  public PlanDetail account(String account) {
    this.account = account;
    return this;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public PlanDetail planType(String planType) {
    this.planType = planType;
    return this;
  }

  public String getPlanType() {
    return planType;
  }

  public void setPlanType(String planType) {
    this.planType = planType;
  }

  public PlanDetail period(String period) {
    this.period = period;
    return this;
  }

  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public PlanDetail username(String username) {
    this.username = username;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public PlanDetail address(List<String> address) {
    this.address = address;
    return this;
  }

  public PlanDetail addAddressItem(String addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<String>();
    }
    this.address.add(addressItem);
    return this;
  }

  public List<String> getAddress() {
    return address;
  }

  public void setAddress(List<String> address) {
    this.address = address;
  }

  public PlanDetail calls(Call calls) {
    this.calls = calls;
    return this;
  }

  public Call getCalls() {
    return calls;
  }

  public void setCalls(Call calls) {
    this.calls = calls;
  }

  public PlanDetail serviceData(List<PlanDetailServiceData> serviceData) {
    this.serviceData = serviceData;
    return this;
  }

  public PlanDetail addServiceDataItem(PlanDetailServiceData serviceDataItem) {
    if (this.serviceData == null) {
      this.serviceData = new ArrayList<PlanDetailServiceData>();
    }
    this.serviceData.add(serviceDataItem);
    return this;
  }

  public List<PlanDetailServiceData> getServiceData() {
    return serviceData;
  }

  public void setServiceData(List<PlanDetailServiceData> serviceData) {
    this.serviceData = serviceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanDetail planDetail = (PlanDetail) o;
    return Objects.equals(this.account, planDetail.account) &&
        Objects.equals(this.planType, planDetail.planType) &&
        Objects.equals(this.period, planDetail.period) &&
        Objects.equals(this.username, planDetail.username) &&
        Objects.equals(this.address, planDetail.address) &&
        Objects.equals(this.calls, planDetail.calls) &&
        Objects.equals(this.serviceData, planDetail.serviceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, planType, period, username, address, calls, serviceData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanDetail {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    serviceData: ").append(toIndentedString(serviceData)).append("\n");
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

