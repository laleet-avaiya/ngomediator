package ngomediator.ngomediatorapi.controller;

import ngomediator.ngomediatorapi.model.Admin;
import ngomediator.ngomediatorapi.mongorepository.AdminRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @PutMapping()
    public Admin insert(@RequestBody Admin admin){
        this.adminRepository.insert(admin);
        return admin;
    }

    @PostMapping()
    public Admin update(@RequestBody Admin admin){
        this.adminRepository.save(admin);
        return admin;
    }

    @GetMapping("/all")
    public List<Admin> getAll(){
        List<Admin> admins= this.adminRepository.findAll();
        return admins;
    }

    @PostMapping("/login")
    public Admin login(@RequestBody Admin admin){

        System.out.println(admin.getEmail());
        Admin authorities = this.adminRepository.findByEmail(admin.getEmail());

        if(authorities==null)
        {
            System.out.println("Admin Not Found");
            return null;
        }

        if(authorities.getPassword().equals(admin.getPassword()))
            return authorities;
        else{
            System.out.println("Incorrect Password");
            return null;
        }
    }
}
