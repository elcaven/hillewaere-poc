package com.example.hillewaerepoc.rest.filters;

import com.example.hillewaerepoc.core.RequestScope;
import java.io.IOException;
import java.util.UUID;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

@Component
@Order(-1)
public class RequestScopeFilter extends GenericFilterBean {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
      throws IOException, ServletException {
    try {
      String correlationId = UUID.randomUUID().toString();
      RequestScope.setCorrelationId(correlationId);
      filterChain.doFilter(request, response);
    } finally {
      RequestScope.clear();
    }
  }
}
