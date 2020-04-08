package fleamarketapp;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProductRepositoryTest {

    static ProductRepository productRepository;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        productRepository = new ProductRepository();
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        productRepository = null;
    }

    @Test
    void データ取得() {
        assertEquals("フード付きパーカー", productRepository.getName());
        assertEquals(1200, productRepository.getPrice());
        assertEquals("ウニクロ", productRepository.getLabel());
        assertEquals("フリーサイズ", productRepository.getSize());
        assertEquals(12, productRepository.getGood());
        assertEquals("ワンポイントでロゴが入っています", productRepository.getComment());
    }

}
