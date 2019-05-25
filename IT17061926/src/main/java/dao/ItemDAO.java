package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Item;

//Just to avoid DB calls in this example, Assume below data is interacting with DB
public class ItemDAO {
	static HashMap<String, Item> usersMap = new HashMap<String, Item>();

	public ItemDAO() {
			Item user1 = new Item();
			user1.setId("1");
			user1.setPrice(20);
			user1.setName("raj");
			
			Item user2 = new Item();
			user2.setId("2");
			user2.setPrice(21);
			user2.setName("ram");
			
			usersMap.put("1", user1);
			usersMap.put("2", user2);
	}

	public List<Item> getAllUsers() {

		List<Item> userList = new ArrayList<Item>(usersMap.values());
		return userList;
	}

	public Item getUserForId(String id) {
		Item user = usersMap.get(id);
		return user;
	}

	public Item createUser(Item user) {
		usersMap.put(user.getId(), user);
		return usersMap.get(user.getId());
	}

	public Item updateUser(Item user) {
		Item existingUser= usersMap.get(user.getId());
		if (existingUser != null) {
			existingUser.setName(user.getName());
			existingUser.setPrice(user.getPrice());
		} else {
			usersMap.put(user.getId(), user);
		}
		return usersMap.get(user.getId());
	}

	public Item deleteUser(String id) {
		Item userResponse = usersMap.remove(id);
		return userResponse;
	}
   }