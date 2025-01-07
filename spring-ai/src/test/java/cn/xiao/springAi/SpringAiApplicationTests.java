package cn.xiao.springAi;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.ai.openai.OpenAiChatModel;


import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
class SpringAiApplicationTests {

    @Resource
    private OpenAiChatModel openAiChatModel;  // 自动注入的 OpenAiChatModel


    @Test
    void test02() {
        System.out.println(openAiChatModel.call("Hello, how are you?"));
    }

}
