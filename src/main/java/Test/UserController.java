package Test;


@Controller
public class UserController {
    @RequestMapping
    public User getUser(){
        return new User(123,"wyf");
    }
    @RequestMapping("wyf")
    public void m1(){
        System.out.println("push测试");
    }
}
