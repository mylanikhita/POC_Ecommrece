package com.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.verification.VerificationMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.repository.CrudRepository;

import com.demo.dto.LoginDto;
import com.demo.dto.UpdatePasswordDto;
import com.demo.dto.UpdateUserDetailesDto;
import com.demo.dto.WatchesDto;
import com.demo.entity.User;
import com.demo.entity.Watches;
import com.demo.repository.UserRepository;
//import com.demo.service.ProductsService;
import com.demo.service.UserService;

@SpringBootTest
class HcLgadgetsApplicationTests {

//		@Test
//		void contextLoads() {
//		}

	
	@Autowired
	private UserService userServ;
//	@Autowired
//	private ProductsService productsServ;
//	 @Autowired
//		private UserRepository Repo;
	 
	 
	 @Test
	 void saveUser() {
	 User user=new User();
	 user.setId(1L);
	 user.setFirstName("ravi");
	 user.setLastName("kumar");
	 user.setEmail("ravi12@gmail.com");
	 user.setPassword("Ravi12345");
	 userServ.saveUser(user);

	 }
	 @Test
	 void saveUserFail() {
	 User user=new User();
	 user.setId(1L);
	 user.setFirstName("ravi");
	 user.setLastName("karthik");
	 user.setEmail("karthik12@gmail.com");
	 user.setPassword("Karthik12345");
	 userServ.saveUser(user);

	 }
	 
	 @Test
	 void getUser()
	 {
	 userServ.getUser();
	 }
	
	 @Test
	 void updateUser()
	 {
	 UpdateUserDetailesDto updateUserDto=new UpdateUserDetailesDto();
	 updateUserDto.setFirstName("ravisai");
	 updateUserDto.setLastName("kumar");
	 updateUserDto.setEmail("ravi12@gmail.com");
	 userServ.updateUser(updateUserDto,  1);

	 }
	 
	 
	 @Test
	 void updateUserFail()
	 {
	 UpdateUserDetailesDto updateUserDto=new UpdateUserDetailesDto();
	 updateUserDto.setFirstName("ravisai");
	 updateUserDto.setLastName("kumar");
	 updateUserDto.setEmail("ravi12@gmail.com");
	 userServ.updateUser(updateUserDto, 1);

	 }
	 @Test
	 void saveUsers() {
	 User user=new User();
	 user.setId(1L);
	 user.setFirstName("pavi");
	 user.setLastName("kumar");
	 user.setEmail("pavi12@gmail.com");
	 user.setPassword("Pavi12345");
	 User users=new User(user.getId(),user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword());
	 userServ.saveUser(users);

	 }
	 @Test
	 void deleteUserFail()
	 {
	 userServ.delateUser(9L);
	 }
	 @Test
	 void deleteUser()
	 {
	 userServ.delateUser(7L);
	 }
	 @Test
	 void verifyLogIn()
	 {
	 LoginDto logInDto=new LoginDto();
	 logInDto.setEmail("ravi12@gmail.com");
	 logInDto.setPassword("Ravi12345");
	 userServ.verifylogin(logInDto);

	 }
	 @Test
	 void verifyLogInWrongPassword()
	 {
	 LoginDto logInDto=new LoginDto();
	 logInDto.setEmail("ravi12@gmail.com");
	 logInDto.setPassword("Ravi45");
	 userServ.verifylogin(logInDto);

	 }
	 
	 @Test
	 void verifyLogInWrongUser()
	 {
	 LoginDto logInDto=new LoginDto();
	 logInDto.setEmail("ravi@gmail.com");
	 logInDto.setPassword("Ravi45");
	 userServ.verifylogin(logInDto);

	 }
	
	 @Test
	 void updatePassword()
	 {
	 UpdatePasswordDto uDto=new UpdatePasswordDto();
	 uDto.setOldPassword("Ravi12345");
	 uDto.setNewPassword("Ravi12");
	 uDto.setConfirmNewPassword("Ravi12");
	 userServ.updateUserPassword(uDto, 6);
	 }
	 
	 
	 
	 @Test
	 void updatePasswordWithWrongPassword()
	 {
	 UpdatePasswordDto uDto=new UpdatePasswordDto();
	 uDto.setOldPassword("Ravi12345");
	 uDto.setNewPassword("Ravi12");
	 uDto.setConfirmNewPassword("Ravi12");
	 userServ.updateUserPassword(uDto, 6);

	 }

	 @Test
	 void updatePasswordWithsamePassword()
	 {
	 UpdatePasswordDto uDto=new UpdatePasswordDto();
     uDto.setOldPassword("Ravi12");
     uDto.setNewPassword("Ravi12");
     uDto.setConfirmNewPassword("Ravi12");
     userServ.updateUserPassword(uDto, 6);

     }
     @Test
     void getUserById()
     {
     userServ.getUserById((long) 6);
     }


























//	@MockBean
//	public UserRepository userRepository;
	
//	
//////getUsers
//		@Test
//		public void getUsers() {
//			when(userRepository.findAll()).thenReturn(Stream
//					.of(new User(12, "hi", "j", "iug", "bj"),new User(13, "nicks","hii","fhctr","yuf")).collect(Collectors.toList()));
//			assertEquals(2, userServ.getUsers().size());
//		}
//
//		
////post(register)
//   	@Test
//		public void saveUser() {
//			User user =new User(1,"wf","wwef","wffr", "ugig");
//			when(userRepository.save(user)).thenReturn(user);		
//			assertEquals(user,userServ.saveUser(user));
//	        }
//  //getUseByid
//   	@Test
//   	public void getUserbyAddressTest() {
//   		String address ="bangulur";
//   		when (repo.fingByAdress(address))
//   		.thenReturn(Stream.of(new User(637,"edwe","dd","wdwe","dwe")).collect(Collectors.toList()));
//   		asserstEquals(1,service.getUsebyAddress(address).size());
//   	}
   	



////	delete by id
//		@Test
//		public void deleteUserTest() {
//			User user = new User(1,"wf","wwef","wffr", "ugig");
//			userServ.deleteUserTest(user);
//			vreify(userRepository,times(1)).delete(user);
//}
//private CrudRepository<User, Long> vreify(UserRepository userRepository2, VerificationMode times) {
//	// TODO Auto-generated method stub
//	return null;
//}


		//products
//@Test
//void saveWatchProduct() {
//Watches watch=new Watches();
//watch.setId(104L);
//watch.setBrandName("sonata");
//watch.setColour("analog");
//watch.setModel("Yes");
//watch.setPrice("$899");
//productsServ.saveWatches(watch);
//
//
//
//}
//@Test
//void saveWatchProductUsingDto() {
//WatchesDto watch=new WatchesDto();
//watch.setId(105L);
//watch.setBrandName("poomex");
//watch.setModel("analog");
//watch.setColour("No");
//watch.setPrice("1000$");
//Watches watches=new Watches(watch.getId(),watch.getBrandName(),watch.getModel(),watch.getColour(),watch.getPrice());
//productsServ.saveWatches(watches);
//
//
//
//}
//@Test
//void saveWatchProductFail() {
//Watches watch=new Watches();
//watch.setId(104);
//watch.setBrand("gts");
//watch.setType("analog");
//watch.setWaterResistance("Yes");
//watch.setPrice(1200);
//productsService.saveWatches(watch);
//
//
//
//}
//@Test
//void getWatches()
//{
//productsService.getAllWatches();
//}
//@Test
//void updateWatche()
//{
//WatchesDto watchDto=new WatchesDto();
//watchDto.setBrand("Sonata X pro");
//watchDto.setType("Analog");
//watchDto.setWaterResistance("Yes");
//watchDto.setPrice(2500);
//productsService.updateWatch(watchDto, 104);
//}
//
//@Test
//void deleteWatchFail()
//{
//productsService.delateWatch(111);
//}
//
//@Test
//void deleteWatch()
//{
//productsService.delateWatch(105);
//}

}	    






		




