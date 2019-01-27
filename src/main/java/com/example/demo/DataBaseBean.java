/**
 * 
 */
package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Component;

/**
 * @author CTM
 *
 */
@Component
public class DataBaseBean {
	String page;
	int pageSize;
	Map<String, List<DatabaseEntity>> storage = new HashMap<>();

	public void addData(List<DatabaseEntity> data, int pageNumber) {
		storage.put("page" + pageNumber, data);
	}

	public List<DatabaseEntity> getStorage(String pageNumber) {
		if(Objects.isNull(pageNumber)) {
			pageNumber = "page1";
		}
		List<DatabaseEntity> res = this.storage.get(pageNumber); 
		if(Objects.isNull(res)) {
			throw new NullPointerException("Invalid page number");
		}
		return res;
	}
}
