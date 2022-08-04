package ru.geekbrains.gkportal.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.gkportal.dto.*;
import ru.geekbrains.gkportal.entity.Account;
import ru.geekbrains.gkportal.entity.Contact;
import ru.geekbrains.gkportal.entity.questionnaire.Question;
import ru.geekbrains.gkportal.entity.questionnaire.Questionnaire;
import ru.geekbrains.gkportal.entity.questionnaire.QuestionnaireContactConfirm;
import ru.geekbrains.gkportal.service.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import static ru.geekbrains.gkportal.config.TemplateNameConst.*;
import static ru.geekbrains.gkportal.service.ContactTypeService.OWNER_TYPE;

@Controller
public class RegistrationController {

    private static final Logger logger = Logger.getLogger(RegistrationController.class);

    private final static String QUESTIONNAIRE_ID = "bb2248ae-2d7e-427d-85ef-7b85888f0319";
    private HouseService houseService;
    private ContactTypeService contactTypeService;
    private AccountService accountService;
    private ContactService contactService;
    private CommunicationService communicationService;
    private QuestionnaireService questionnaireService;
    private OwnershipTypeService ownershipTypeService;
    private OwnershipService ownershipService;
    private AnswerResultService answerResultService;
    private MailService mailService;

    @Autowired
    public void setOwnershipService(OwnershipService ownershipService) {
        this.ownershipService = ownershipService;
    }

    @Autowired
    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }