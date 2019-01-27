/**
 * 
 */
package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author CTM
 *
 */
@RestController
public class WebserviceController {

	@CrossOrigin
	@PostMapping("/upload")
	public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) {
		String fileName = file.getOriginalFilename();

		// String fileDownloadUri =
		// ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/")
		// .path(fileName).toUriString();
		try {
			InputStream in = file.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			int lineCount = 1;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
//				DatabaseEntity row = new DatabaseEntity(line, retailPrice, discountedPrice, description, brand)
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return new UploadFileResponse(fileName, "Cannot be downloaded", file.getContentType(), file.getSize());
	}
	
	@CrossOrigin
	@GetMapping("/test")
	public String testAPI() {
		return "Success";
	}

}
