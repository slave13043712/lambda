package org.aakimov.lambda;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;

import java.util.List;
import java.util.Map;

/**
 * @author Alexander Akimov
 */
public class HelloWorldHandler {
    public List<Map<String, AttributeValue>> handle() {
        ScanRequest request = new ScanRequest().withTableName("SuperMission");
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
        ScanResult result = client.scan(request);
        List<Map<String, AttributeValue>> items = result.getItems();

        return items;
    }
}
