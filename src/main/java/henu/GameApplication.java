package henu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @create 2019-11-26 20:52
 */
@SpringBootApplication
@MapperScan("henu.dao")
public class GameApplication {
    public static void main( String[] args )
    {
        SpringApplication.run(GameApplication.class,args);
    }
}


