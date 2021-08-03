package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

public class ConfigurationRequestTermsAndConditions {
  @SerializedName("terms_and_conditions_label")
  private String termsAndConditionsLabel = null;

  @SerializedName("terms_and_conditions_title")
  private String termsAndConditionsTitle = null;

  @SerializedName("terms_and_conditions")
  private String termsAndConditions = null;

  public ConfigurationRequestTermsAndConditions termsAndConditionsLabel(String termsAndConditionsLabel) {
    this.termsAndConditionsLabel = termsAndConditionsLabel;
    return this;
  }

  public String getTermsAndConditionsLabel() {
    return termsAndConditionsLabel;
  }

  public void setTermsAndConditionsLabel(String termsAndConditionsLabel) {
    this.termsAndConditionsLabel = termsAndConditionsLabel;
  }

  public ConfigurationRequestTermsAndConditions termsAndConditionsTitle(String termsAndConditionsTitle) {
    this.termsAndConditionsTitle = termsAndConditionsTitle;
    return this;
  }

   
  public String getTermsAndConditionsTitle() {
    return termsAndConditionsTitle;
  }

  public void setTermsAndConditionsTitle(String termsAndConditionsTitle) {
    this.termsAndConditionsTitle = termsAndConditionsTitle;
  }

  public ConfigurationRequestTermsAndConditions termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  public String getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationRequestTermsAndConditions configurationRequestTermsAndConditions = (ConfigurationRequestTermsAndConditions) o;
    return Objects.equals(this.termsAndConditionsLabel, configurationRequestTermsAndConditions.termsAndConditionsLabel) &&
        Objects.equals(this.termsAndConditionsTitle, configurationRequestTermsAndConditions.termsAndConditionsTitle) &&
        Objects.equals(this.termsAndConditions, configurationRequestTermsAndConditions.termsAndConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termsAndConditionsLabel, termsAndConditionsTitle, termsAndConditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationRequestTermsAndConditions {\n");
    
    sb.append("    termsAndConditionsLabel: ").append(toIndentedString(termsAndConditionsLabel)).append("\n");
    sb.append("    termsAndConditionsTitle: ").append(toIndentedString(termsAndConditionsTitle)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
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

