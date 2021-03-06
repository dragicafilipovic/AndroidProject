package com.androidprojekat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PostsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void btnSettings(View view) {
        Intent intent= new Intent(PostsActivity.this , SettingsActivity.class);
        startActivity(intent);

    }

    public void btnReadPost(View view) {
        Intent intent= new Intent(PostsActivity.this , ReadPostActivity.class);
        startActivity(intent);
    }

    public void btnCreatePost(View view) {
        Intent intent= new Intent(PostsActivity.this , CreatePostActivity.class);
        startActivity(intent);
    }
}
