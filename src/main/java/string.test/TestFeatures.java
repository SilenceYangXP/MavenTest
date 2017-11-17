package string.test;

import java.util.Optional;
import java.util.Random;

public class TestFeatures {
    public  static  void  main(String[] args)
    {
        Random random=new Random();
        System.out.println(random.nextBoolean());
        InstanceTest instanceTest=InstanceTest.getInstanceTest();
        System.runFinalizersOnExit(true);
        Optional<String> name1 = Optional.empty();
        System.out.println(name1.get());
    }

}


//ctrl + shfit +space 给出提示
//file-->settings-->live template 设置快捷键
//ctrl + enter 给出提示
//ctrl+shift+i 在某个类上点击，可以查看雷的内容
//alt + insert 重载
//alt + f12  打开cmd
