/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TokenSecretRef authenticates with Vault by presenting a token. */
@ApiModel(description = "TokenSecretRef authenticates with Vault by presenting a token.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecVaultAuthTokenSecretRef {
  public static final String SERIALIZED_NAME_KEY = "key";

  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1alpha2IssuerSpecVaultAuthTokenSecretRef key(String key) {

    this.key = key;
    return this;
  }

  /**
   * The key of the entry in the Secret resource&#39;s &#x60;data&#x60; field to be used. Some
   * instances of this field may be defaulted, in others it may be required.
   *
   * @return key
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The key of the entry in the Secret resource's `data` field to be used. Some instances of this field may be defaulted, in others it may be required.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1alpha2IssuerSpecVaultAuthTokenSecretRef name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the resource being referred to. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value =
          "Name of the resource being referred to. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecVaultAuthTokenSecretRef v1alpha2IssuerSpecVaultAuthTokenSecretRef =
        (V1alpha2IssuerSpecVaultAuthTokenSecretRef) o;
    return Objects.equals(this.key, v1alpha2IssuerSpecVaultAuthTokenSecretRef.key)
        && Objects.equals(this.name, v1alpha2IssuerSpecVaultAuthTokenSecretRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecVaultAuthTokenSecretRef {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
