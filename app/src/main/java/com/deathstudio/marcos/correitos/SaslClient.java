package com.deathstudio.marcos.correitos;

import javax.security.sasl.SaslException;

public interface SaslClient {

    byte[] evaluateChallenge(byte[] var1) throws SaslException;

    boolean hasInitialResponse();

    boolean isComplete();

    byte[] unwrap(byte[] var1, int var2, int var3) throws SaslException;

    byte[] wrap(byte[] var1, int var2, int var3) throws SaslException;

    String getMechanismName();

    Object getNegotiatedProperty(String var1) throws SaslException;

    void dispose() throws SaslException;
}
