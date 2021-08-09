package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class FailureTDAConsumption {
  @SerializedName("request")
  private TelcosDataAggregation request = null;

  @SerializedName("errors")
  private List<Error> errors = null;

  public FailureTDAConsumption request(TelcosDataAggregation request) {
    this.request = request;
    return this;
  }

  public TelcosDataAggregation getRequest() {
    return request;
  }

  public void setRequest(TelcosDataAggregation request) {
    this.request = request;
  }

  public FailureTDAConsumption errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public FailureTDAConsumption addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureTDAConsumption failureTDAConsumption = (FailureTDAConsumption) o;
    return Objects.equals(this.request, failureTDAConsumption.request) &&
        Objects.equals(this.errors, failureTDAConsumption.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureTDAConsumption {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

