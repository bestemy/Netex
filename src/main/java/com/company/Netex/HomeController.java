package com.company.Netex;

import com.company.Netex.model.MovieCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.transform.Result;

@Controller
//@RequestMapping("")
public class HomeController<ResultsDao> extends MovieCatalog {
//    @Autowired
//    private ResultsDao resultsDao;
//
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public String index(Model model){
//        model.addAttribute("title", "Welcome");
//        return "home/home";
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.POST)
//    public String processSteamIdField(@RequestParam("steamid")String steamid, Model model) {
//        Result newresult = getMatchHistory(steamid);
////        resultsDao.toString(MovieCatalog);
//        return "redirect:results";
//    }
//
//    private Result getMatchHistory(String steamid) {
//        return null;
//    }














}