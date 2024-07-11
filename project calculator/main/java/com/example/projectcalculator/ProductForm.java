package com.example.projectcalculator;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductForm extends AppCompatActivity {

    private EditText productCodeEditText;
    private EditText productNameEditText;
    private EditText productPriceEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_form);

        // Find views by ID
        productCodeEditText = findViewById(R.id.Product_code);
        productNameEditText = findViewById(R.id.Product_name);
        productPriceEditText = findViewById(R.id.Product_price);

        Button addProductButton = findViewById(R.id.Add_product);

        // Set click listener for the "Add Product" button
        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addProduct();
            }
        });
    }

    private void addProduct() {
        String productCode = productCodeEditText.getText().toString().trim();
        String productName = productNameEditText.getText().toString().trim();
        String productPriceString = productPriceEditText.getText().toString().trim();

        // Input validation
        if (TextUtils.isEmpty(productCode) || TextUtils.isEmpty(productName) || TextUtils.isEmpty(productPriceString)) {
            Toast.makeText(ProductForm.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return; // Exit the function if any field is empty
        }

        // Assuming you have a method to register the product (e.g., save to a file or database)
        // Replace this placeholder with your actual product registration logic:
        boolean productRegistered = registerProduct(productCode, productName, productPriceString);

        if (productRegistered) {
            Toast.makeText(ProductForm.this, "Product registered successfully!", Toast.LENGTH_SHORT).show();

            // Clear the input fields for the next product
            productCodeEditText.setText("");
            productNameEditText.setText("");
            productPriceEditText.setText("");
        } else {
            Toast.makeText(ProductForm.this, "Product registration failed", Toast.LENGTH_SHORT).show();
        }
    }

    // Replace this with your actual product registration logic (e.g., file I/O or database)
    private boolean registerProduct(String productCode, String productName, String productPriceString) {


        return true; // Assuming successful registration (replace with actual success/failure condition)
    }
}
