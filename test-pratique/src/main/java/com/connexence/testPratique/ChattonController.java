package com.connexence.testPratique;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ChattonController {
	@Autowired
	private ChattonRepository chattonRepository;

	@GetMapping("/chattons")
	public List<Chatton> getChattons() {
		List<Chatton> chattons = chattonRepository.findAll();
		if (chattons.isEmpty()) {
			Chatton premierChatton = new Chatton();
			premierChatton.setNom("Scott");
			premierChatton.setAge(4);
			chattonRepository.save(premierChatton);

			Chatton deuxiemeChatton = new Chatton();
			deuxiemeChatton.setNom("Marie-Antoinette");
			deuxiemeChatton.setAge(2);
			chattonRepository.save(deuxiemeChatton);

			chattons = chattonRepository.findAll();
		}

		// TODO: Filtrer et inverser la liste des chattons ici
		Collections.reverse(chattons);
		List<Chatton> filteredChattons = new ArrayList<Chatton>();
		for (Chatton chatton : chattons) {
			if (chatton.getAge() <= 15) {
				filteredChattons.add(chatton);
			}
		}

		return filteredChattons;
	}

	@PostMapping(value = "/chattons")
	public List<Chatton> addChattons(@RequestBody Chatton chatton, HttpServletResponse response) throws IOException {
		List<Chatton> chattons = chattonRepository.findAll();
		if (chatton.getAge() > 30) {
			response.sendError(400, "Cannot add cats older than 30 years old");
		} else if (chatton.getNom().isBlank()) {
			response.sendError(400, "Cat must have a name");
		} else {
		chattonRepository.save(chatton);
		chattons = chattonRepository.findAll();
		}
		return chattons;
	}

}
