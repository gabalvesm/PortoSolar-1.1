import androidx.activity.ComponentActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

data class Product(val name: String, val price: Double, val imageUrl: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProductList(
                products = listOf(
                    Product("Biquíni Floral", 129.90, "https://example.com/biquini.jpg"),
                    Product("Sunga Estampada", 89.90, "https://example.com/sunga.jpg")
                )
            )
        }
    }
}

@Composable
fun ProductList(products: List<Product>) {
    Column {
        products.forEach { product ->
            Text(product.name + " - R$" + product.price)
        }
    }
}
