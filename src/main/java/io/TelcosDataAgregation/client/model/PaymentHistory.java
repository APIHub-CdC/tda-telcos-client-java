package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public class PaymentHistory {
  @SerializedName("date")
  private String date = null;

  @SerializedName("pay_mode")
  private String payMode = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("account")
  private String account = null;

  public PaymentHistory date(String date) {
    this.date = date;
    return this;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PaymentHistory payMode(String payMode) {
    this.payMode = payMode;
    return this;
  }

  public String getPayMode() {
    return payMode;
  }

  public void setPayMode(String payMode) {
    this.payMode = payMode;
  }

  public PaymentHistory amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PaymentHistory phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PaymentHistory account(String account) {
    this.account = account;
    return this;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentHistory paymentHistory = (PaymentHistory) o;
    return Objects.equals(this.date, paymentHistory.date) &&
        Objects.equals(this.payMode, paymentHistory.payMode) &&
        Objects.equals(this.amount, paymentHistory.amount) &&
        Objects.equals(this.phoneNumber, paymentHistory.phoneNumber) &&
        Objects.equals(this.account, paymentHistory.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, payMode, amount, phoneNumber, account);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentHistory {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

