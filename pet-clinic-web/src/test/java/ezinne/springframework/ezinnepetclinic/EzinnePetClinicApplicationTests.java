package ezinne.springframework.ezinnepetclinic;

import ezinne.springframework.sfgpetclinic.EzinnePetClinicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {EzinnePetClinicApplication.class})
class EzinnePetClinicApplicationTests {

	@Test
	void contextLoads() {
	}


}
