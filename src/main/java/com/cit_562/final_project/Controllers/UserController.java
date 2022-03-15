package com.cit_562.final_project.Controllers;

import com.cit_562.final_project.Entities.User;
import com.cit_562.final_project.Repositories.UserRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/usr") // This means URL's start with /usr (after Application path)
public class UserController {

  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private UserRepository userRepository;

  private static final Logger LOGGER = LogManager.getLogger(UserController.class);
  
  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestParam String name, 
                                          @RequestParam String ccBrand,
                                          @RequestParam String ccNum, 
                                          @RequestParam String ccExpiration, 
                                          @RequestParam String ccSecCode) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    User user = new User();
    user.setName(name);
    user.setCCBrand(ccBrand);
    user.setCCNum(ccNum);
    user.setCCExpiration(ccExpiration);
    user.setCCSecCode(ccSecCode);
    userRepository.save(user);
    LOGGER.debug("Added User: {}", user.getName());
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }
}
