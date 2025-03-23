package person.card.Control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import person.card.Servive.AlibabaService;
import person.card.Servive.Message;
import person.card.Servive.UserService;
import person.card.Servive.Words;
@RestController
public class UserControl {
    @Autowired
    UserService userService;
    @Autowired
    AlibabaService alibabaService;
    @PostMapping("/api/word")
    public Words word()
    {
        Words res=userService.getWord();
        return res;
    }
    @PostMapping("api/chat")
    public String chat(@RequestBody Message msg)
    {
        String message=msg.getMessage();
       String res= alibabaService.getMeg(message);
        return res;
    }
}
