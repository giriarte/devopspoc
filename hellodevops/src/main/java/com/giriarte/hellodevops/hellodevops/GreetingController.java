package com.giriarte.hellodevops.hellodevops;

import com.giriarte.hellodevops.hellodevops.model.CacheElement;
import com.giriarte.hellodevops.hellodevops.model.Item;
import com.giriarte.hellodevops.hellodevops.repository.CacheElementRepository;
import com.giriarte.hellodevops.hellodevops.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	private Logger logger = LoggerFactory.getLogger(GreetingController.class);

	@Autowired ItemRepository itemRepository;

	@Autowired CacheElementRepository cacheElementRepository;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("fullGreeting", GreetingBuilder.buildGreeting(name));

		logger.debug("Greeting requested for name : " + name);

		logger.debug("Amount of items in table::: " + itemRepository.findAll().size());

		itemRepository.insert(new Item(Long.toString(System.currentTimeMillis()), "Item_Name", 0));

		logger.debug("Amount of items in table:::: " + itemRepository.findAll().size());

		boolean fromCache = cacheElementRepository.findById(name).isPresent();
		if (!fromCache) {
			cacheElementRepository.save(new CacheElement(name, 0));
		}

		model.addAttribute("fromCache", fromCache);

		return "greeting";
	}

}
