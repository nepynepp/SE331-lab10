package camt.se331.shoppingcart.config.security;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.security.sasl.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by nep on 19/4/2559.
 */
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

    private respone;

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                         org.springframework.security.core.AuthenticationException e) throws IOException, ServletException {

        respone.sendError(
                HttpServletResponse.SC_UNAUTHORIZED,
                "Unauthorized: Authentication token was either missing or invalid.");
    }

    }
