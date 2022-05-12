package com.demo.controller;


import java.util.List;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.ComputersDto;
import com.demo.dto.MobilesDto;
import com.demo.dto.WatchesDto;
import com.demo.entity.Computers;
import com.demo.entity.Mobiles;
import com.demo.entity.Watches;
import com.demo.repository.ComputersRepository;
import com.demo.repository.MobileRepository;
import com.demo.repository.WatchesRepository;
import com.demo.service.ProductsService;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/UserController")
public class ProductJsonController {

	@Autowired
	private ComputersRepository compuRepo;
	@Autowired
	private MobileRepository mobilesRepo;
	@Autowired
	private WatchesRepository watchesRepo;
	@Autowired
	private ProductsService productsService;
	
  //Get watch deatailes
	@GetMapping(value="/getAllWatches")
	public List<Watches> getAllWatches()
	{
	List<Watches> watches = watchesRepo.findAll();
	return watches;
	}
  //post watch
	@PostMapping(value="/saveWatches")
	public JSONObject saveWatches(@RequestBody Watches watches) {
	Watches save = watchesRepo.save(watches);
	if(save!=null)
	{
	JSONObject response = productsService.productsResponse("ok","Watches Details are Getting saved" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
	return response;
	}
	else
	{
	JSONObject response = productsService.productsResponse("Not ok","Watches Details are NOT Getting saved" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
	return response;
	}


	}
  //update watch modeles
	@PutMapping(value="/updateWatches/{productId}")
	public JSONObject updateWatches(@RequestBody WatchesDto watchDto,@PathVariable Long id)
	{
		 
	Watches watch=new Watches(id, null, null, null, null);
	String brandName = watchDto.getBrandName();
	String Model = watchDto.getModel();
	String Colour = watchDto.getColour();
	String Price = watchDto.getPrice();
	watch.setId(id);
	watch.setBrandName(brandName);
	watch.setModel(Model);
	watch.setColour(Colour);
	watch.setPrice(Price);
	Watches save = watchesRepo.save(watch);
	if(save!=null)
	{
	JSONObject response = productsService.productsResponse("ok","Watch Details are Getting Updated" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
	return response;
	}
	else
	{
	JSONObject response = productsService.productsResponse("Not ok","Watch Details are NOT Getting Updated" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
	return response;
	}

	}
   //delete watch item
	@DeleteMapping(value="/deleteWatches/{id}")
	public JSONObject deleteWatch(@PathVariable Long id)
	{
	Optional<Watches> findById = watchesRepo.findById(null);
	Watches watches = findById.get();
	if(watches!=null)
	{
	watchesRepo.deleteById(null);
	JSONObject response = productsService.productsResponse("ok","Watch Details are Getting Deleted succesfully" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
	return response;
	}
	else
	{
	JSONObject response = productsService.productsResponse("Not ok","Watch Details are NOT Getting Deleted Plese enter valid Watch Id" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
	return response;
	}
	}
//mobiles list get ,put,post,delete
	
	//Get Mobiles deatailes
		@GetMapping(value="/getAllMobiles")
		public List<Mobiles> getAllMobiles()
		{
		List<Mobiles> watches = mobilesRepo.findAll();
		return watches;
		}
	//post mobile
		@PostMapping(value="/saveMobile")
		public JSONObject saveMobiles(@RequestBody Mobiles mobiles) {
		Mobiles save = mobilesRepo.save(mobiles);
		if(save!=null)
		{
		JSONObject response = productsService.productsResponse("ok","mobiles Details are Getting saved" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
		return response;
		}
		else
		{
		JSONObject response = productsService.productsResponse("Not ok","mobile Details are NOT Getting saved" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
		return response;
		}


		}
	//updatemobiles modeles
		@PutMapping(value="/updateMobile/{productId}")
		public JSONObject updateMobiles(@RequestBody MobilesDto mobileDto,@PathVariable Long id)
		{
			 
		Mobiles mobile=new Mobiles();
		String brandName = mobileDto.getBrandName();
		String Model = mobileDto.getModel();
		String Colour = mobileDto.getColour();
		String Price = mobileDto.getPrice();
		mobile.setId(null);
		mobile.setBrandName(null);
		mobile.setModel(null);
		mobile.setColour(null);
		mobile.setPrice(null);
		Mobiles save = mobilesRepo.save(mobile);
		if(save!=null)
		{
		JSONObject response = productsService.productsResponse("ok","mobile Details are Getting Updated" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
		return response;
		}
		else
		{
		JSONObject response = productsService.productsResponse("Not ok","mobile Details are NOT Getting Updated" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
		return response;
		}

		}
	//delete mobile item
		@DeleteMapping(value="/deleteMobile/{id}")
		public JSONObject deleteMobile(@PathVariable Long id)
		{
		Optional<Mobiles> findById = mobilesRepo.findById(null);
		Mobiles mobiles = findById.get();
		if(mobiles!=null)
		{
		mobilesRepo.deleteById(null);
		JSONObject response = productsService.productsResponse("ok","Watch Details are Getting Deleted succesfully" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
		return response;
		}
		else
		{
		JSONObject response = productsService.productsResponse("Not ok","Watch Details are NOT Getting Deleted Plese enter valid Watch Id" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
		return response;
		}
		}

//Computers list get ,put,post,delete
		//Get Mobiles deatailes
				@GetMapping(value="/getAllComputer")
				public List<Computers> getAllComputers()
				{
				List<Computers> computers = compuRepo.findAll();
				return computers;
				}
			//post watch
				@PostMapping(value="/saveComputer")
				public JSONObject saveComputers(@RequestBody Computers computers) {
				Computers save = compuRepo.save(computers);
				if(save!=null)
				{
				JSONObject response = productsService.productsResponse("ok","Computer Details are Getting saved" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
				return response;
				}
				else
				{
				JSONObject response = productsService.productsResponse("Not ok","Computer Details are NOT Getting saved" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
				return response;
				}


				}
			//update watch modeles
				@PutMapping(value="/updateComputer/{productId}")
				public JSONObject updateComputers(@RequestBody ComputersDto computerDto,@PathVariable Long id)
				{
					 
				Computers computer=new Computers();
				String brandName = computerDto.getBrandName();
				String Model = computerDto.getModel();
				String Price = computerDto.getPrice();
				String sizeInches = computerDto.getSizeInches();
				computer.setId(null);
				computer.setBrandName(null);
				computer.setModel(null);
				computer.setSizeInches(null);
				computer.setPrice(null);
				Computers save = compuRepo.save(computer);
				if(save!=null)
				{
				JSONObject response = productsService.productsResponse("ok","Computer Details are Getting Updated" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
				return response;
				}
				else
				{
				JSONObject response = productsService.productsResponse("Not ok","Computer Details are NOT Getting Updated" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
				return response;
				}

				}
			//delete watch item
				@DeleteMapping(value="/deleteComputer/{id}")
				public JSONObject deleteComputer(@PathVariable Long id)
				{
				Optional<Computers> findById = compuRepo.findById(null);
				Computers computer = findById.get();
				if(computer!=null)
				{
				compuRepo.deleteById(null);
				JSONObject response = productsService.productsResponse("ok","computer Details are Getting Deleted succesfully" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
				return response;
				}
				else
				{
				JSONObject response = productsService.productsResponse("Not ok","computer Details are NOT Getting Deleted Plese enter valid Watch Id" , "eyJhbGciOiJIUzI1NiIsInR5dC1...");
				return response;
				}
				}

		
	
}
