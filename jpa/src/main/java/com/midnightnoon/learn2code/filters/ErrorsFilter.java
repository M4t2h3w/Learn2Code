package com.midnightnoon.learn2code.filters;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class ErrorsFilter extends Filter<ILoggingEvent> {
    @Override
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        if(iLoggingEvent.getLevel().toString() == Level.ERROR.levelStr)
            return FilterReply.NEUTRAL;
        return FilterReply.DENY;
    }
}
