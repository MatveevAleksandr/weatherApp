package ru.lpost.retrofittest.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import ru.lpost.retrofittest.app.App
import ru.lpost.retrofittest.ui.theme.RetrofitTestTheme
import ru.lpost.retrofittest.viewmodel.MainViewModel
import ru.lpost.retrofittest.viewmodel.MainViewModelFactory
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    private lateinit var vm: MainViewModel
    @Inject
    lateinit var vmFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext as App).appComponent.injectMainActivity(this)
        vm = ViewModelProvider(this, vmFactory)[MainViewModel::class.java]
        setContent {
            RetrofitTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(vm = vm)
                }
            }
        }
    }
}

@Composable
fun Greeting(vm: MainViewModel) {
    val txtEdit = remember{ mutableStateOf("") }
    Column() {
        TextField(value = txtEdit.value, onValueChange = {txtEdit.value = it})
        Button(onClick = { vm.findClick(txtEdit.value) }) {
            Text(text = "Найти")
        }
    }
}
