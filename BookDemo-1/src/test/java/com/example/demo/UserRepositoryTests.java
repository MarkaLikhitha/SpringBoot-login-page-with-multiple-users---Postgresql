package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	/*
	 * @Test public void testCreateUser() { User user = new User();
	 * user.setEmail("fdgdfgfdg@gmail.com"); user.setFirstName("fdgfdgfdg");
	 * user.setPassword("likki1122"); User savedUser = repo.save(user);
	 * 
	 * User existUser = entityManager.find(User.class, savedUser.getId());
	 * 
	 * assertThat(existUser.getEmail()).isEqualTo(user.getEmail()); }
	 */
	/*
	 * @Test public void testFindByEmail() { String email = "uuuuu@gmail.com";
	 * 
	 * User user = repo.findByEmail(email);
	 * 
	 * assertThat(user).isNotNull(); }
	 */
}
