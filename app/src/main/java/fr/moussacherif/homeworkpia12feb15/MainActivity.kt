package fr.moussacherif.homeworkpia12feb15

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.moussacherif.homeworkpia12feb15.ui.theme.Homeworkpia12feb15Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Homeworkpia12feb15Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Shopping()
                }
            }
        }
    }
}
@Composable
fun Shopping() {
    //var additems  = mutableListOf<String>("Apelsin", "Banan")

    var additems = remember {
        mutableStateListOf("")
    }


    Column{
        Row {
            Column(modifier = Modifier
                .height(100.dp)
                .width(100.dp)
                .background(Color.Blue)) {
                Text(text = "Hommework")



            }
            Button(onClick = { additems.add("X")  }) {
                Text("X")

            }
            Button(onClick = { additems.add("Y")}) {
                Text("Y")
            }
        }
        LazyColumn {

            items(additems) {  additem ->
                Addrow(elmenttoadd = additem,  )

                }
            items(5) { index ->
                Text(text = "Item: $index")
            }

            }


        Button(onClick = { /*TODO*/ }) {
            Text(text = "Reset")
            
        }



    }


}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Homeworkpia12feb15Theme {
        Shopping()
    }
}