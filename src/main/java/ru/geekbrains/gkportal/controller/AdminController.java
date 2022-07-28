package ru.geekbrains.gkportal.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.gkportal.dto.House;
import ru.geekbrains.gkportal.service.HouseService;

import static ru.geekbrains.gkportal.config.TemplateNameConst.SCHEME_ADMIN_EDIT_HOUSE_FORM;
import static ru.geekbrains.gkportal.config.TemplateNameConst.returnShablon;