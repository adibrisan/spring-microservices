package com.adimicroservices.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(
        scanBasePackages = {
                "com.adimicroservices.notification",
                "com.adimicroservices.amqp"
        }
)
@PropertySources({
        @PropertySource("classpath:clients-${spring.profiles.active}.properties")
})
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(RabbitMQMessageProducer producer, NotificationConfig notificationConfig){
//        return args -> {
//            producer.publish(new Person("adrian",26),
//                    notificationConfig.getInternalExchange(),
//                    notificationConfig.getInternalNotificationRoutingKey());
//        };
//    }
//    record Person(String name, int age){}
}
