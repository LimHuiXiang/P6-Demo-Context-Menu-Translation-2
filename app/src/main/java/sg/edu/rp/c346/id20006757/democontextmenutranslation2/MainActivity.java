package sg.edu.rp.c346.id20006757.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText,tvTranslatedText2;
    String wordClicked="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2= findViewById(R.id.textViewTranslatedText2);
        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //…
        getMenuInflater().inflate(R.menu.menu_main, menu);
        if( v ==tvTranslatedText){
            wordClicked ="hello";
        }
        else if ( v == tvTranslatedText2){
            wordClicked = "bye";
        }
    }



    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // …
        int id = item.getItemId();
        if(wordClicked.equalsIgnoreCase("hello")) {
            if (id == R.id.EnglishSelection) { //check whether the selected menu item ID is 0
                //code for action
                //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText.setText("Hello");
                return true; //menu item successfully handled
            } else if (id == R.id.italianSelection) { //check if the selected menu item ID is 1
                //code for action
                //Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText.setText("Ciao");
                return true;  //menu item successfully handled
            }
        }
        if(wordClicked.equalsIgnoreCase("bye"))
            if (id == R.id.EnglishSelection) { //check whether the selected menu item ID is 0
                //code for action
                //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText.setText("Bye");
                return true; //menu item successfully handled
            } else if (id == R.id.italianSelection) { //check if the selected menu item ID is 1
                //code for action
                //Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText.setText("Adido");
                return true;  //menu item successfully handled
            }



        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }


}