package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jinhui.scheduler.biz.cmbfae.service.product.CmbfaeProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml","classpath:META-INF/job/job.xml", "classpath*:META-INF/spring/*.xml"})
public class PoductTest {

	@Autowired
	private CmbfaeProductService productService;


	@Test
	public void importProduct() throws Exception {
		productService.importProductInfo();
	}

	
	
}
