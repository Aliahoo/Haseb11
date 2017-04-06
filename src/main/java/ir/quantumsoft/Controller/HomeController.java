package ir.quantumsoft.Controller;

/**
 * Created by AliSalehi on 23/03/2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;


@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String goToIndex(ModelMap model) {
        model.addAttribute("message", "به نرم افزار حاسب خوش آمدید");

        return "index";
    }


}
