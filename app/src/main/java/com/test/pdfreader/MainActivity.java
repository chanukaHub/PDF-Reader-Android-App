package com.test.pdfreader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mFiles = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView_view_pdf);
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");
        mFiles.add("Filename");

        PdfAdapter pdfAdapter = new PdfAdapter(this,mFiles);
        recyclerView.setAdapter(pdfAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }
}