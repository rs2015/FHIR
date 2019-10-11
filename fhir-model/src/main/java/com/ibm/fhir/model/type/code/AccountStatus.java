/*
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.model.type.code;

import com.ibm.fhir.model.type.Code;
import com.ibm.fhir.model.type.Extension;
import com.ibm.fhir.model.type.String;

import java.util.Collection;
import java.util.Objects;

import javax.annotation.Generated;

@Generated("com.ibm.fhir.tools.CodeGenerator")
public class AccountStatus extends Code {
    /**
     * Active
     */
    public static final AccountStatus ACTIVE = AccountStatus.of(ValueSet.ACTIVE);

    /**
     * Inactive
     */
    public static final AccountStatus INACTIVE = AccountStatus.of(ValueSet.INACTIVE);

    /**
     * Entered in error
     */
    public static final AccountStatus ENTERED_IN_ERROR = AccountStatus.of(ValueSet.ENTERED_IN_ERROR);

    /**
     * On Hold
     */
    public static final AccountStatus ON_HOLD = AccountStatus.of(ValueSet.ON_HOLD);

    /**
     * Unknown
     */
    public static final AccountStatus UNKNOWN = AccountStatus.of(ValueSet.UNKNOWN);

    private volatile int hashCode;

    private AccountStatus(Builder builder) {
        super(builder);
    }

    public static AccountStatus of(java.lang.String value) {
        return AccountStatus.builder().value(value).build();
    }

    public static AccountStatus of(ValueSet value) {
        return AccountStatus.builder().value(value).build();
    }

    public static String string(java.lang.String value) {
        return AccountStatus.builder().value(value).build();
    }

    public static Code code(java.lang.String value) {
        return AccountStatus.builder().value(value).build();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AccountStatus other = (AccountStatus) obj;
        return Objects.equals(id, other.id) && Objects.equals(extension, other.extension) && Objects.equals(value, other.value);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Objects.hash(id, extension, value);
            hashCode = result;
        }
        return result;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id(id);
        builder.extension(extension);
        builder.value(value);
        return builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Code.Builder {
        private Builder() {
            super();
        }

        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder value(java.lang.String value) {
            return (value != null) ? (Builder) super.value(ValueSet.from(value).value()) : this;
        }

        public Builder value(ValueSet value) {
            return (value != null) ? (Builder) super.value(value.value()) : this;
        }

        @Override
        public AccountStatus build() {
            return new AccountStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Active
         */
        ACTIVE("active"),

        /**
         * Inactive
         */
        INACTIVE("inactive"),

        /**
         * Entered in error
         */
        ENTERED_IN_ERROR("entered-in-error"),

        /**
         * On Hold
         */
        ON_HOLD("on-hold"),

        /**
         * Unknown
         */
        UNKNOWN("unknown");

        private final java.lang.String value;

        ValueSet(java.lang.String value) {
            this.value = value;
        }

        public java.lang.String value() {
            return value;
        }

        public static ValueSet from(java.lang.String value) {
            for (ValueSet c : ValueSet.values()) {
                if (c.value.equals(value)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(value);
        }
    }
}