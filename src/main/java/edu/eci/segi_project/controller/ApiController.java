package edu.eci.segi_project.controller;

import org.springframework.http.HttpStatus;

import java.io.DataInputStream;
import java.io.FileInputStream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segi")
public class ApiController {

	@GetMapping("/intelmqjson")
	public ResponseEntity<?> getIntelmq() {
		try {
			
			
			
			DataInputStream dis = new DataInputStream(new FileInputStream("D:\\Documentos\\intel.txt"));

			byte[] datainBytes = new byte[dis.available()];
			dis.readFully(datainBytes);
			dis.close();

			String content = new String(datainBytes, 0, datainBytes.length);

			System.out.println(content);
			return new ResponseEntity<>(content, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>("Error al conectarse ar servicio ", HttpStatus.NOT_FOUND);
		}
	}
}
