package person.card.Servive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import person.card.DAO.UserMap;
import java.util.Random;
@Service
public class UserService {
    @Autowired
    UserMap userMap;
    Random random=new Random();
    public Words getWord()
    {
        int ran=random.nextInt(1480);
        Words res=userMap.getWord(ran);
        return res;
    }
}
