package com.naveen;

import com.rabbitmq.client.AMQP.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Publisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.newConnection();
	}

}
