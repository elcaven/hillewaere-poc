package com.example.hillewaerepoc.core;

import org.slf4j.MDC;

public class MdcSynchronizedInheritableThreadLocal extends InheritableThreadLocal<String> {
    private final String mdcKey;

    public MdcSynchronizedInheritableThreadLocal(String mdcKey) {
        this.mdcKey = mdcKey;
    }

    @Override
    public void set(String value) {
        super.set(value);
        MDC.put(mdcKey, value);
    }

    @Override
    public void remove() {
        super.remove();
        MDC.remove(mdcKey);
    }
}
