package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the Spotify Streamer button */
    public void launchSpotifyStreamerApp(View view) {
        // Displaying a Toast in response to button click
        Toast.makeText(getApplicationContext(),
                "This button will launch Spotify Streamer app!", Toast.LENGTH_LONG).show();
    }

    /** Called when the user touches the Scores App button */
    public void launchScoresApp(View view) {
        // Displaying a Toast in response to button click
        Toast.makeText(getApplicationContext(),
                "This button will launch Scores app!", Toast.LENGTH_LONG).show();
    }

    /** Called when the user touches the Library App button */
    public void launchLibraryApp(View view) {
        // Displaying a Toast in response to button click
        Toast.makeText(getApplicationContext(),
                "This button will launch Library app!", Toast.LENGTH_LONG).show();
    }

    /** Called when the user touches the Build It Bigger button */
    public void launchBuildItBiggerApp(View view) {
        // Displaying a Toast in response to button click
        Toast.makeText(getApplicationContext(),
                "This button will launch Build It Bigger app!", Toast.LENGTH_LONG).show();
    }

    /** Called when the user touches the XYZ Reader button */
    public void launchXYZReaderApp(View view) {
        // Displaying a Toast in response to button click
        Toast.makeText(getApplicationContext(),
                "This button will launch XYZ Reader app!", Toast.LENGTH_LONG).show();
    }

    /** Called when the user touches the Capstone button */
    public void launchCapstoneApp(View view) {
        // Displaying a Toast in response to button click
        Toast.makeText(getApplicationContext(),
                "This button will launch Capstone app!", Toast.LENGTH_LONG).show();
    }


}
