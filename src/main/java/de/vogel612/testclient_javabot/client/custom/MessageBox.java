package de.vogel612.testclient_javabot.client.custom;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import com.gmail.inverseconduit.datatype.ChatMessage;

public class MessageBox extends HBox {

	private final Text name = new Text();
	private final Label message = new Label();

	public MessageBox(final ChatMessage chatMessage) {
		name.setText(chatMessage.getUsername());
		message.setText(chatMessage.getMessage());
		setLayout();
		getChildren().addAll(name, message);
	}

	private void setLayout() {
		message.setWrapText(true);
		name.getStyleClass().add("fancytext");
		minHeight(50);
		setAlignment(Pos.CENTER_LEFT);
		getStyleClass().add("userInput");
	}
}