/**
 * This class is generated by jOOQ
 */
package com.staypal.db.tables.records;


import com.staypal.db.tables.AuthTokens;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthTokensRecord extends TableRecordImpl<AuthTokensRecord> implements Record4<String, String, String, Timestamp> {

    private static final long serialVersionUID = -998037328;

    /**
     * Setter for <code>staypaldb.auth_tokens.email</code>.
     */
    public void setEmail(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>staypaldb.auth_tokens.email</code>.
     */
    public String getEmail() {
        return (String) get(0);
    }

    /**
     * Setter for <code>staypaldb.auth_tokens.access_token</code>.
     */
    public void setAccessToken(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>staypaldb.auth_tokens.access_token</code>.
     */
    public String getAccessToken() {
        return (String) get(1);
    }

    /**
     * Setter for <code>staypaldb.auth_tokens.refresh_token</code>.
     */
    public void setRefreshToken(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>staypaldb.auth_tokens.refresh_token</code>.
     */
    public String getRefreshToken() {
        return (String) get(2);
    }

    /**
     * Setter for <code>staypaldb.auth_tokens.time_issued</code>.
     */
    public void setTimeIssued(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>staypaldb.auth_tokens.time_issued</code>.
     */
    public Timestamp getTimeIssued() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return AuthTokens.AUTH_TOKENS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AuthTokens.AUTH_TOKENS.ACCESS_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AuthTokens.AUTH_TOKENS.REFRESH_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return AuthTokens.AUTH_TOKENS.TIME_ISSUED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAccessToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getTimeIssued();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokensRecord value1(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokensRecord value2(String value) {
        setAccessToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokensRecord value3(String value) {
        setRefreshToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokensRecord value4(Timestamp value) {
        setTimeIssued(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthTokensRecord values(String value1, String value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthTokensRecord
     */
    public AuthTokensRecord() {
        super(AuthTokens.AUTH_TOKENS);
    }

    /**
     * Create a detached, initialised AuthTokensRecord
     */
    public AuthTokensRecord(String email, String accessToken, String refreshToken, Timestamp timeIssued) {
        super(AuthTokens.AUTH_TOKENS);

        set(0, email);
        set(1, accessToken);
        set(2, refreshToken);
        set(3, timeIssued);
    }
}
