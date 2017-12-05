package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int FUNC_LOGIN = 1 ;
    Boolean logon = false ;
    private final static  int REQUEST_LONGIN = 102;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FUNC_LOGIN){
            if(resultCode == RESULT_OK){

            }else{
                finish();
            }

        }
    }

    public void func1(View view){
        if(true){
            Intent intent = new Intent(this , Func1Activity.class);
           /* startActivity(intent);*/
            startActivityForResult(intent , REQUEST_LONGIN);

        }}
    public void func2(View view){
        if(true){

            Intent intent = new Intent(this , Func2Activity.class);
           /* startActivity(intent);*/
            startActivityForResult(intent , REQUEST_LONGIN);

        }}
    public void func3(View view){
        if(true){
            Toast.makeText(this , "特殊功能", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this , Func3Activity.class);
           /* startActivity(intent);*/
            startActivityForResult(intent , REQUEST_LONGIN);

        }}
    public void func4(View view){
        if(true){

            Intent intent = new Intent(this , Func4Activity.class);
           /* startActivity(intent);*/
            startActivityForResult(intent , REQUEST_LONGIN);

        }}
    public void func5(View view){
        if(true){

            Intent intent = new Intent(this , Func5Activity.class);
           /* startActivity(intent);*/
            startActivityForResult(intent , REQUEST_LONGIN);

        }}
    public void func6(View view){
        if(true){

            Intent intent = new Intent(this , Func6Activity.class);
           /* startActivity(intent);*/
            startActivityForResult(intent , REQUEST_LONGIN);

        }}
    public void func7(View view){
        if(true){
            Toast.makeText(this , "特殊功能", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this , Func7Activity.class);
           /* startActivity(intent);*/
            startActivityForResult(intent , REQUEST_LONGIN);

        }}
    public void func8(View view){
        if(true){
            Toast.makeText(this , "特殊功能", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this , Func8Activity.class);
           /* startActivity(intent);*/
            startActivityForResult(intent , REQUEST_LONGIN);

        }}
}
