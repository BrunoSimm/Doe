package com.pds.doe.Controller.LoginController;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;
import com.pds.doe.Model.Servicos.CadastroServico.LoginService;
import com.pds.doe.Model.Servicos.DTOs.LoginDTO;
import com.pds.doe.Model.Servicos.DTOs.LoginReturnDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/login")
@CrossOrigin(originPatterns = "http://localhost:4200")
public class LoginController {

	private LoginService loginService;
	
	@Autowired
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}

	@PostMapping
	public ResponseEntity<LoginReturnDTO> login(@RequestBody LoginDTO loginDTO){

		Usuario usuario = this.loginService.validateLogin(loginDTO);

		if(usuario == null){
			return ResponseEntity.status(403).build(); //TODO: VALIDAR NO FRONT
		}

		HttpHeaders responseHeaders = new HttpHeaders();
		
		responseHeaders.set(
			"x-access-token", 
		  	"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NSwibmFtZSI6ImJydW5vIiwiZW1haWwiOiJicnVub3NpbW13b3dAZ21haWwuY29tIiwiaWF0IjoxNjM4MzY5NTc4LCJleHAiOjE2Mzg0NTU5Nzh9.tLTOUfV1MJgKF-vkgta2m2lWfPQaV99u-8IqjOrnWQc"
		);
		responseHeaders.set("Access-Control-Expose-Headers", "x-access-token");

		return ResponseEntity.ok().headers(responseHeaders).body(new LoginReturnDTO(usuario.getUser_id(), usuario.getNome(), usuario.getEmail()));
	}

	
}
