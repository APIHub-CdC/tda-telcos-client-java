package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Person {
  @SerializedName("clientData")
  private List<ClientData> clientData = null;

  @SerializedName("summaries")
  private List<Summary> summaries = null;

  @SerializedName("planDetails")
  private List<PlanDetail> planDetails = null;

  @SerializedName("billing")
  private List<Billing> billing = null;

  @SerializedName("paymentHistory")
  private List<PaymentHistory> paymentHistory = null;

  @SerializedName("creditPayments")
  private List<CreditPayment> creditPayments = null;

  public Person clientData(List<ClientData> clientData) {
    this.clientData = clientData;
    return this;
  }

  public Person addClientDataItem(ClientData clientDataItem) {
    if (this.clientData == null) {
      this.clientData = new ArrayList<ClientData>();
    }
    this.clientData.add(clientDataItem);
    return this;
  }

  public List<ClientData> getClientData() {
    return clientData;
  }

  public void setClientData(List<ClientData> clientData) {
    this.clientData = clientData;
  }

  public Person summaries(List<Summary> summaries) {
    this.summaries = summaries;
    return this;
  }

  public Person addSummariesItem(Summary summariesItem) {
    if (this.summaries == null) {
      this.summaries = new ArrayList<Summary>();
    }
    this.summaries.add(summariesItem);
    return this;
  }

  public List<Summary> getSummaries() {
    return summaries;
  }

  public void setSummaries(List<Summary> summaries) {
    this.summaries = summaries;
  }

  public Person planDetails(List<PlanDetail> planDetails) {
    this.planDetails = planDetails;
    return this;
  }

  public Person addPlanDetailsItem(PlanDetail planDetailsItem) {
    if (this.planDetails == null) {
      this.planDetails = new ArrayList<PlanDetail>();
    }
    this.planDetails.add(planDetailsItem);
    return this;
  }

  public List<PlanDetail> getPlanDetails() {
    return planDetails;
  }

  public void setPlanDetails(List<PlanDetail> planDetails) {
    this.planDetails = planDetails;
  }

  public Person billing(List<Billing> billing) {
    this.billing = billing;
    return this;
  }

  public Person addBillingItem(Billing billingItem) {
    if (this.billing == null) {
      this.billing = new ArrayList<Billing>();
    }
    this.billing.add(billingItem);
    return this;
  }

  public List<Billing> getBilling() {
    return billing;
  }

  public void setBilling(List<Billing> billing) {
    this.billing = billing;
  }

  public Person paymentHistory(List<PaymentHistory> paymentHistory) {
    this.paymentHistory = paymentHistory;
    return this;
  }

  public Person addPaymentHistoryItem(PaymentHistory paymentHistoryItem) {
    if (this.paymentHistory == null) {
      this.paymentHistory = new ArrayList<PaymentHistory>();
    }
    this.paymentHistory.add(paymentHistoryItem);
    return this;
  }

  public List<PaymentHistory> getPaymentHistory() {
    return paymentHistory;
  }

  public void setPaymentHistory(List<PaymentHistory> paymentHistory) {
    this.paymentHistory = paymentHistory;
  }

  public Person creditPayments(List<CreditPayment> creditPayments) {
    this.creditPayments = creditPayments;
    return this;
  }

  public Person addCreditPaymentsItem(CreditPayment creditPaymentsItem) {
    if (this.creditPayments == null) {
      this.creditPayments = new ArrayList<CreditPayment>();
    }
    this.creditPayments.add(creditPaymentsItem);
    return this;
  }

  public List<CreditPayment> getCreditPayments() {
    return creditPayments;
  }

  public void setCreditPayments(List<CreditPayment> creditPayments) {
    this.creditPayments = creditPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.clientData, person.clientData) &&
        Objects.equals(this.summaries, person.summaries) &&
        Objects.equals(this.planDetails, person.planDetails) &&
        Objects.equals(this.billing, person.billing) &&
        Objects.equals(this.paymentHistory, person.paymentHistory) &&
        Objects.equals(this.creditPayments, person.creditPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientData, summaries, planDetails, billing, paymentHistory, creditPayments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    clientData: ").append(toIndentedString(clientData)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    planDetails: ").append(toIndentedString(planDetails)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    paymentHistory: ").append(toIndentedString(paymentHistory)).append("\n");
    sb.append("    creditPayments: ").append(toIndentedString(creditPayments)).append("\n");
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

