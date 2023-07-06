package com.example.hillewaerepoc.core;

public class RequestScope {
  public static InheritableThreadLocal<String> CORRELATION_ID =
      new MdcSynchronizedInheritableThreadLocal("correlationId");

  private RequestScope() {}

  public static void setCorrelationId(String correlationId) {
    CORRELATION_ID.set(correlationId);
  }

  public static void clear() {
    CORRELATION_ID.remove();
  }
}
