package com.google.listeners;

import com.codeborne.selenide.logevents.LogEvent;
import com.codeborne.selenide.logevents.LogEventListener;
import lombok.extern.log4j.Log4j;


@Log4j
public class CustomLogEventListener implements LogEventListener {

    @Override
    public void onEvent(LogEvent currentLog) {
        log.info(String.format("Action is: %s ,action is finished, duration is: %s and status is: %s", currentLog.getSubject(), currentLog.getDuration(), currentLog.getStatus()));
    }

    // Since Selenide 5.2.3

//    @Override
//    public void afterEvent(LogEvent currentLog) {
//        log.info(String.format("Action is finished, duration is: %s and status is: %s", currentLog.getDuration(), currentLog.getStatus()));
//    }
//
//    @Override
//    public void beforeEvent(LogEvent currentLog) {
//        log.info("Starting action: " + currentLog.getElement());
//    }
}
