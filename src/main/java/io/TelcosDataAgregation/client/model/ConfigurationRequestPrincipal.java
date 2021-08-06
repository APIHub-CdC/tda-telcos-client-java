package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

public class ConfigurationRequestPrincipal {
  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("authorization_statement")
  private String authorizationStatement = null;

  @SerializedName("user_logo")
  private String userLogo = null;

  @SerializedName("primary_color")
  private String primaryColor = null;

  @SerializedName("secondary_color")
  private String secondaryColor = null;

  public ConfigurationRequestPrincipal userName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ConfigurationRequestPrincipal authorizationStatement(String authorizationStatement) {
    this.authorizationStatement = authorizationStatement;
    return this;
  }

  public String getAuthorizationStatement() {
    return authorizationStatement;
  }

  public void setAuthorizationStatement(String authorizationStatement) {
    this.authorizationStatement = authorizationStatement;
  }

  public ConfigurationRequestPrincipal userLogo(String userLogo) {
    this.userLogo = userLogo;
    return this;
  }

  public String getUserLogo() {
    return userLogo;
  }

  public void setUserLogo(String userLogo) {
    this.userLogo = userLogo;
  }

  public ConfigurationRequestPrincipal primaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
    return this;
  }

  public String getPrimaryColor() {
    return primaryColor;
  }

  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
  }

  public ConfigurationRequestPrincipal secondaryColor(String secondaryColor) {
    this.secondaryColor = secondaryColor;
    return this;
  }

  public String getSecondaryColor() {
    return secondaryColor;
  }

  public void setSecondaryColor(String secondaryColor) {
    this.secondaryColor = secondaryColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationRequestPrincipal configurationRequestPrincipal = (ConfigurationRequestPrincipal) o;
    return Objects.equals(this.userName, configurationRequestPrincipal.userName) &&
        Objects.equals(this.authorizationStatement, configurationRequestPrincipal.authorizationStatement) &&
        Objects.equals(this.userLogo, configurationRequestPrincipal.userLogo) &&
        Objects.equals(this.primaryColor, configurationRequestPrincipal.primaryColor) &&
        Objects.equals(this.secondaryColor, configurationRequestPrincipal.secondaryColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, authorizationStatement, userLogo, primaryColor, secondaryColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationRequestPrincipal {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    authorizationStatement: ").append(toIndentedString(authorizationStatement)).append("\n");
    sb.append("    userLogo: ").append(toIndentedString(userLogo)).append("\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
    sb.append("    secondaryColor: ").append(toIndentedString(secondaryColor)).append("\n");
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

