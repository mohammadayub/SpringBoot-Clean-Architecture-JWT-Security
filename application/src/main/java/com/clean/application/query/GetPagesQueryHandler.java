package com.clean.application.query;

import com.dirkheijnen.mediator.interfaces.IRequestHandler;
import org.springframework.stereotype.Component;

@Component
public class GetPagesQueryHandler implements IRequestHandler<GetPagesQuery,String> {
    @Override
    public String handle(GetPagesQuery request) {

        return "home";
    }
}
