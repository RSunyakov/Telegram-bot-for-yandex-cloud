package ru.kpfu.itis;

import com.amazon.sqs.javamessaging.AmazonSQSMessagingClientWrapper;
import com.amazon.sqs.javamessaging.ProviderConfiguration;
import com.amazon.sqs.javamessaging.SQSConnection;
import com.amazon.sqs.javamessaging.SQSConnectionFactory;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import javax.jms.*;
import java.util.Arrays;

public class Main {
    final static String chatID = "353124639";

    public static void main(String[] args) throws JMSException, InterruptedException, TelegramApiException {

        BotExecution botExecution = new BotExecution();
        botExecution.initConnection();
        botExecution.sendMessage(Arrays.asList("https://storage.yandexcloud.net/vvot/%5BFACE%5Dface-detection-sample0.jpeg [FACE]face-detection-sample0.jpeg", "https://storage.yandexcloud.net/vvot/%5BFACE%5Dface-detection-sample1.jpeg [FACE]face-detection-sample1.jpeg", "https://storage.yandexcloud.net/vvot/%5BFACE%5Dface-detection-sample2.jpeg [FACE]face-detection-sample2.jpeg"));
    }
}
