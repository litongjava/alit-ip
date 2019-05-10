package com.alit.ip.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

/**
 * @author litong
 * @date 2019年5月10日_上午9:13:36
 * @version 1.0
 */
@Controller
@Slf4j
public class IndexController {
  @RequestMapping
  @ResponseBody
  public String index(HttpServletRequest request) {
    String remoteAddr = request.getRemoteAddr();
    log.info(remoteAddr);
    return remoteAddr;
  }
}
