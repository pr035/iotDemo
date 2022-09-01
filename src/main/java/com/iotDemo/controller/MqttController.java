package com.iotDemo.controller;
import java.lang.reflect.Type;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iotDemo.MqttGateway;
import com.iotDemo.entity.MqttMessage;

@RestController
public class MqttController {
	private ObjectMapper objectMapper =  new ObjectMapper();
	private List<MqttMessage> mq;
	@Autowired
	MqttGateway mqttGateway;
	@PostMapping("/sendmessage")

	public  String publish(@RequestBody String mqttMessage){
		Gson gson = new Gson();
		Type type = new TypeToken<List<MqttMessage>>(){}.getType();
		 List<MqttMessage> prodList = gson.fromJson(mqttMessage, type);
		
//		mq = objectMapper.readValue(mqttMessage, new TypeReference<>() {
//        });
		
	
	//public ResponseEntity<MqttMessage> publish(@RequestBody MqttMessage mqttMessage){
	//try {
	//JsonObject convertObject=new Gson().fromJson(mqttMessage,JsonObject.class);
		System.out.println(prodList.get(0).getB());
    


	for(MqttMessage s:prodList) {
		System.out.println(s);
		System.out.println(s.getM() +"/cmd");
		mqttGateway.senToMqtt(s.toString(),s.getM() +"/cmd");
	}

	
	
		return "sucess";
//	return ResponseEntity.ok("Success");
//	}catch (Exception e) {
//		e.printStackTrace();
//		return ResponseEntity.ok("fail");
//	}	
}
}
