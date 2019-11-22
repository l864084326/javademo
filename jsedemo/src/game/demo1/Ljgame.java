package game.demo1;

public class Ljgame {
    //灵境入口
    public static void main(String[] args) {
        int i = pdAge(new Users("1", "2" ,"3", 4));
        System.out.println(i);
    }

    //判断进入灵境之人的年龄是否符合
    public static int pdAge(Users u){
        //有没有这个人？
        if (u != null){
            if (u.age>=10 && u.age<=30){
                return 1;
            }
        }
        //不符合
        return -1;
    }
    //记录每一个进入的人
    public static int savaUsers(Users u,Users[] ua){
        //判断该用户是否存在
        for (int i = 0;i<ua.length;i++){
            if (ua[i]!=null){
                if (ua[i].name.equals(u.name)){
                    return -1;
                }

                }
            }
        for (int i = 0;i<ua.length;i++){
            if (ua[i]==null){
                ua[i] = u;
            }
        }
        //如果不存在就记录下来
return 1;//删除
    }
}
