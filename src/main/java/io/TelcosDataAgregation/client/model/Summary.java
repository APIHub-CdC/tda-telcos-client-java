package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Summary {
  @SerializedName("plan_name")
  private String planName = null;

  @SerializedName("pack_name")
  private String packName = null;

  @SerializedName("balance")
  private BigDecimal balance = null;

  @SerializedName("mb_included")
  private BigDecimal mbIncluded = null;

  @SerializedName("mb_consumed")
  private BigDecimal mbConsumed = null;

  @SerializedName("available_minutes")
  private String availableMinutes = null;

  @SerializedName("available_sms")
  private String availableSms = null;

  @SerializedName("account")
  private String account = null;

  @SerializedName("payment_date")
  private String paymentDate = null;

  @SerializedName("credit_limit_date")
  private String creditLimitDate = null;

  @SerializedName("valid_until")
  private String validUntil = null;

  public Summary planName(String planName) {
    this.planName = planName;
    return this;
  }

  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public Summary packName(String packName) {
    this.packName = packName;
    return this;
  }

  public String getPackName() {
    return packName;
  }

  public void setPackName(String packName) {
    this.packName = packName;
  }

  public Summary balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public Summary mbIncluded(BigDecimal mbIncluded) {
    this.mbIncluded = mbIncluded;
    return this;
  }

  public BigDecimal getMbIncluded() {
    return mbIncluded;
  }

  public void setMbIncluded(BigDecimal mbIncluded) {
    this.mbIncluded = mbIncluded;
  }

  public Summary mbConsumed(BigDecimal mbConsumed) {
    this.mbConsumed = mbConsumed;
    return this;
  }

  public BigDecimal getMbConsumed() {
    return mbConsumed;
  }

  public void setMbConsumed(BigDecimal mbConsumed) {
    this.mbConsumed = mbConsumed;
  }

  public Summary availableMinutes(String availableMinutes) {
    this.availableMinutes = availableMinutes;
    return this;
  }

  public String getAvailableMinutes() {
    return availableMinutes;
  }

  public void setAvailableMinutes(String availableMinutes) {
    this.availableMinutes = availableMinutes;
  }

  public Summary availableSms(String availableSms) {
    this.availableSms = availableSms;
    return this;
  }

  public String getAvailableSms() {
    return availableSms;
  }

  public void setAvailableSms(String availableSms) {
    this.availableSms = availableSms;
  }

  public Summary account(String account) {
    this.account = account;
    return this;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Summary paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }
  
  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public Summary creditLimitDate(String creditLimitDate) {
    this.creditLimitDate = creditLimitDate;
    return this;
  }

  public String getCreditLimitDate() {
    return creditLimitDate;
  }

  public void setCreditLimitDate(String creditLimitDate) {
    this.creditLimitDate = creditLimitDate;
  }

  public Summary validUntil(String validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  public String getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(String validUntil) {
    this.validUntil = validUntil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Summary summary = (Summary) o;
    return Objects.equals(this.planName, summary.planName) &&
        Objects.equals(this.packName, summary.packName) &&
        Objects.equals(this.balance, summary.balance) &&
        Objects.equals(this.mbIncluded, summary.mbIncluded) &&
        Objects.equals(this.mbConsumed, summary.mbConsumed) &&
        Objects.equals(this.availableMinutes, summary.availableMinutes) &&
        Objects.equals(this.availableSms, summary.availableSms) &&
        Objects.equals(this.account, summary.account) &&
        Objects.equals(this.paymentDate, summary.paymentDate) &&
        Objects.equals(this.creditLimitDate, summary.creditLimitDate) &&
        Objects.equals(this.validUntil, summary.validUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planName, packName, balance, mbIncluded, mbConsumed, availableMinutes, availableSms, account, paymentDate, creditLimitDate, validUntil);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    packName: ").append(toIndentedString(packName)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    mbIncluded: ").append(toIndentedString(mbIncluded)).append("\n");
    sb.append("    mbConsumed: ").append(toIndentedString(mbConsumed)).append("\n");
    sb.append("    availableMinutes: ").append(toIndentedString(availableMinutes)).append("\n");
    sb.append("    availableSms: ").append(toIndentedString(availableSms)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    creditLimitDate: ").append(toIndentedString(creditLimitDate)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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

