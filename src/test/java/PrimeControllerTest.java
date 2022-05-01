import com.prime.demo.model.PrimeResult;
import com.prime.demo.service.PrimeService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class PrimeControllerTest {

    @Test
    public void testPrimeWithLimit() {
        PrimeService service = spy(PrimeService.class);
        PrimeResult result = service.getPrime(5);
        verify(service).getPrime(5);
        assertThat(result.getLimit()).isEqualTo(5);
        assertThat(result.getPrimeList()).containsExactly(2,3,5);
    }
}
