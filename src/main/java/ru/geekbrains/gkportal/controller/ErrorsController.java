package ru.geekbrains.gkportal.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import static ru.geekbrains.gkportal.config.TemplateNameConst.*;

@Controller
@RequestMapping
public class ErrorsController implements ErrorController {

    private static final Logger logger = Logger.getLogger(ErrorsController.class);

    @Override
    public String getErrorPath() {
        return "error";
    }
