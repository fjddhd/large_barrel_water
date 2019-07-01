package top.khora.large_barrel_water.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VioceController {
    @ResponseBody
    @RequestMapping("/sendGetVoiceRequest")
    public String sendGetVoiceRequest(){

        return "";
    }
}
