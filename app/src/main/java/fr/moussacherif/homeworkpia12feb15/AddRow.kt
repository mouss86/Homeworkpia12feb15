package fr.moussacherif.homeworkpia12feb15

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Addrow(elmenttoadd : String) {
    Row(modifier = Modifier
        .background(Color.White)
        .fillMaxWidth()
    ) {
        Text(elmenttoadd, modifier = Modifier.background(Color.Cyan))

    }
}

@Preview
@Composable
fun AddrowPreview() {
    Addrow("X")
}

