package io.TelcosDataAgregation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


public class ClientData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("surnames")
  private String surnames = null;

  @SerializedName("addresses")
  private String addresses = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("account")
  private String account = null;

  public ClientData name(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientData surnames(String surnames) {
    this.surnames = surnames;
    return this;
  }

  public String getSurnames() {
    return surnames;
  }

  public void setSurnames(String surnames) {
    this.surnames = surnames;
  }

  public ClientData addresses(String addresses) {
    this.addresses = addresses;
    return this;
  }

  public String getAddresses() {
    return addresses;
  }

  public void setAddresses(String addresses) {
    this.addresses = addresses;
  }

  public ClientData email(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ClientData account(String account) {
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
    ClientData clientData = (ClientData) o;
    return Objects.equals(this.name, clientData.name) &&
        Objects.equals(this.surnames, clientData.surnames) &&
        Objects.equals(this.addresses, clientData.addresses) &&
        Objects.equals(this.email, clientData.email) &&
        Objects.equals(this.account, clientData.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surnames, addresses, email, account);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surnames: ").append(toIndentedString(surnames)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

