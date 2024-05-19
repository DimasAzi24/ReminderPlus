package com.example.reminderplus
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.reminderplus.ui.theme.ReminderPlusTheme




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val MTugas = HomeFragment()
        val fragment = supportFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if(fragment !is HomeFragment){
            supportFragmentManager.beginTransaction()
                .add(R.id.MenuAwal, MTugas, MenuTugas::class.java.simpleName)
                .commit()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ReminderPlusTheme {
        Greeting("Android")
    }
}