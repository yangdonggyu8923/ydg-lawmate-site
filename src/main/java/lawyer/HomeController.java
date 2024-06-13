package lawyer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/")
public class HomeController {

    @GetMapping
    public String home(){
        String date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        return "안녕 Lawyer! " + date;
    }

}
