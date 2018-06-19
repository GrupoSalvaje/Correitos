package com.deathstudio.marcos.correitos;


import java.util.Map;

import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;

public interface SaslClientFactory {
    SaslClient createSaslClient(String[] var1, String var2, String var3, String var4, Map<String, ?> props, CallbackHandler var6) throws SaslException;

    String[] getMechanismNames(Map<String, ?> props);
}
