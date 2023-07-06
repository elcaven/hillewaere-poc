package com.example.hillewaerepoc.core;

public class RequestScope {
  public static InheritableThreadLocal<String> CORRELATION_ID =
      new MdcSynchronizedInheritableThreadLocal("correlation.id");

  private RequestScope() {}

  public static void setCorrelationId(String correlationId) {
    CORRELATION_ID.set(correlationId);
  }

  public static void clear() {
    CORRELATION_ID.remove();
  }
}
