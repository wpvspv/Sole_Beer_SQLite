package com.example.mh.sole_beer;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

public class Liquor_Store_Cacktail extends Activity {
    String Liquor_kind;
    SQLiteDatabase db;
    DBHelper helper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liquorstore_cacktail);
        TextView tx001_0=(TextView) findViewById(R.id.tx001_0);
        TextView tx001_1=(TextView) findViewById(R.id.tx001_1);
        TextView tx001_2=(TextView) findViewById(R.id.tx001_2);
        TextView tx001_3=(TextView) findViewById(R.id.tx001_3);
        TextView tx002_0=(TextView) findViewById(R.id.tx002_0);
        TextView tx002_1=(TextView) findViewById(R.id.tx002_1);
        TextView tx002_2=(TextView) findViewById(R.id.tx002_2);
        TextView tx002_3=(TextView) findViewById(R.id.tx002_3);
        TextView tx003_0=(TextView) findViewById(R.id.tx003_0);
        TextView tx003_1=(TextView) findViewById(R.id.tx003_1);
        TextView tx003_2=(TextView) findViewById(R.id.tx003_2);
        TextView tx003_3=(TextView) findViewById(R.id.tx003_3);
        TextView tx004_0=(TextView) findViewById(R.id.tx004_0);
        TextView tx004_1=(TextView) findViewById(R.id.tx004_1);
        TextView tx004_2=(TextView) findViewById(R.id.tx004_2);
        TextView tx004_3=(TextView) findViewById(R.id.tx004_3);
        TextView tx005_0=(TextView) findViewById(R.id.tx005_0);
        TextView tx005_1=(TextView) findViewById(R.id.tx005_1);
        TextView tx005_2=(TextView) findViewById(R.id.tx005_2);
        TextView tx005_3=(TextView) findViewById(R.id.tx005_3);
        TextView tx006_0=(TextView) findViewById(R.id.tx006_0);
        TextView tx006_1=(TextView) findViewById(R.id.tx006_1);
        TextView tx006_2=(TextView) findViewById(R.id.tx006_2);
        TextView tx006_3=(TextView) findViewById(R.id.tx006_3);
        TextView tx007_0=(TextView) findViewById(R.id.tx007_0);
        TextView tx007_1=(TextView) findViewById(R.id.tx007_1);
        TextView tx007_2=(TextView) findViewById(R.id.tx007_2);
        TextView tx007_3=(TextView) findViewById(R.id.tx007_3);
        TextView tx008_0=(TextView) findViewById(R.id.tx008_0);
        TextView tx008_1=(TextView) findViewById(R.id.tx008_1);
        TextView tx008_2=(TextView) findViewById(R.id.tx008_2);
        TextView tx008_3=(TextView) findViewById(R.id.tx008_3);
        TextView tx009_0=(TextView) findViewById(R.id.tx009_0);
        TextView tx009_1=(TextView) findViewById(R.id.tx009_1);
        TextView tx009_2=(TextView) findViewById(R.id.tx009_2);
        TextView tx009_3=(TextView) findViewById(R.id.tx009_3);
        TextView tx010_0=(TextView) findViewById(R.id.tx010_0);
        TextView tx010_1=(TextView) findViewById(R.id.tx010_1);
        TextView tx010_2=(TextView) findViewById(R.id.tx010_2);
        TextView tx010_3=(TextView) findViewById(R.id.tx010_3);
        TextView tx011_0=(TextView) findViewById(R.id.tx011_0);
        TextView tx011_1=(TextView) findViewById(R.id.tx011_1);
        TextView tx011_2=(TextView) findViewById(R.id.tx011_2);
        TextView tx011_3=(TextView) findViewById(R.id.tx011_3);
        TextView tx012_0=(TextView) findViewById(R.id.tx012_0);
        TextView tx012_1=(TextView) findViewById(R.id.tx012_1);
        TextView tx012_2=(TextView) findViewById(R.id.tx012_2);
        TextView tx012_3=(TextView) findViewById(R.id.tx012_3);
        TextView tx013_0=(TextView) findViewById(R.id.tx013_0);
        TextView tx013_1=(TextView) findViewById(R.id.tx013_1);
        TextView tx013_2=(TextView) findViewById(R.id.tx013_2);
        TextView tx013_3=(TextView) findViewById(R.id.tx013_3);
        TextView tx014_0=(TextView) findViewById(R.id.tx014_0);
        TextView tx014_1=(TextView) findViewById(R.id.tx014_1);
        TextView tx014_2=(TextView) findViewById(R.id.tx014_2);
        TextView tx014_3=(TextView) findViewById(R.id.tx014_3);
        TextView tx015_0=(TextView) findViewById(R.id.tx015_0);
        TextView tx015_1=(TextView) findViewById(R.id.tx015_1);
        TextView tx015_2=(TextView) findViewById(R.id.tx015_2);
        TextView tx015_3=(TextView) findViewById(R.id.tx015_3);
        TextView tx016_0=(TextView) findViewById(R.id.tx016_0);
        TextView tx016_1=(TextView) findViewById(R.id.tx016_1);
        TextView tx016_2=(TextView) findViewById(R.id.tx016_2);
        TextView tx016_3=(TextView) findViewById(R.id.tx016_3);
        TextView tx017_0=(TextView) findViewById(R.id.tx017_0);
        TextView tx017_1=(TextView) findViewById(R.id.tx017_1);
        TextView tx017_2=(TextView) findViewById(R.id.tx017_2);
        TextView tx017_3=(TextView) findViewById(R.id.tx017_3);
        TextView tx018_0=(TextView) findViewById(R.id.tx018_0);
        TextView tx018_1=(TextView) findViewById(R.id.tx018_1);
        TextView tx018_2=(TextView) findViewById(R.id.tx018_2);
        TextView tx018_3=(TextView) findViewById(R.id.tx018_3);
        TextView tx019_0=(TextView) findViewById(R.id.tx019_0);
        TextView tx019_1=(TextView) findViewById(R.id.tx019_1);
        TextView tx019_2=(TextView) findViewById(R.id.tx019_2);
        TextView tx019_3=(TextView) findViewById(R.id.tx019_3);
        TextView tx020_0=(TextView) findViewById(R.id.tx020_0);
        TextView tx020_1=(TextView) findViewById(R.id.tx020_1);
        TextView tx020_2=(TextView) findViewById(R.id.tx020_2);
        TextView tx020_3=(TextView) findViewById(R.id.tx020_3);
        TextView tx021_0=(TextView) findViewById(R.id.tx021_0);
        TextView tx021_1=(TextView) findViewById(R.id.tx021_1);
        TextView tx021_2=(TextView) findViewById(R.id.tx021_2);
        TextView tx021_3=(TextView) findViewById(R.id.tx021_3);
        TextView tx022_0=(TextView) findViewById(R.id.tx022_0);
        TextView tx022_1=(TextView) findViewById(R.id.tx022_1);
        TextView tx022_2=(TextView) findViewById(R.id.tx022_2);
        TextView tx022_3=(TextView) findViewById(R.id.tx022_3);
        TextView tx023_0=(TextView) findViewById(R.id.tx023_0);
        TextView tx023_1=(TextView) findViewById(R.id.tx023_1);
        TextView tx023_2=(TextView) findViewById(R.id.tx023_2);
        TextView tx023_3=(TextView) findViewById(R.id.tx023_3);
        TextView tx024_0=(TextView) findViewById(R.id.tx024_0);
        TextView tx024_1=(TextView) findViewById(R.id.tx024_1);
        TextView tx024_2=(TextView) findViewById(R.id.tx024_2);
        TextView tx024_3=(TextView) findViewById(R.id.tx024_3);
        TextView tx025_0=(TextView) findViewById(R.id.tx025_0);
        TextView tx025_1=(TextView) findViewById(R.id.tx025_1);
        TextView tx025_2=(TextView) findViewById(R.id.tx025_2);
        TextView tx025_3=(TextView) findViewById(R.id.tx025_3);
        TextView tx026_0=(TextView) findViewById(R.id.tx026_0);
        TextView tx026_1=(TextView) findViewById(R.id.tx026_1);
        TextView tx026_2=(TextView) findViewById(R.id.tx026_2);
        TextView tx026_3=(TextView) findViewById(R.id.tx026_3);
        TextView tx027_0=(TextView) findViewById(R.id.tx027_0);
        TextView tx027_1=(TextView) findViewById(R.id.tx027_1);
        TextView tx027_2=(TextView) findViewById(R.id.tx027_2);
        TextView tx027_3=(TextView) findViewById(R.id.tx027_3);
        TextView tx028_0=(TextView) findViewById(R.id.tx028_0);
        TextView tx028_1=(TextView) findViewById(R.id.tx028_1);
        TextView tx028_2=(TextView) findViewById(R.id.tx028_2);
        TextView tx028_3=(TextView) findViewById(R.id.tx028_3);
        TextView tx029_0=(TextView) findViewById(R.id.tx029_0);
        TextView tx029_1=(TextView) findViewById(R.id.tx029_1);
        TextView tx029_2=(TextView) findViewById(R.id.tx029_2);
        TextView tx029_3=(TextView) findViewById(R.id.tx029_3);
        TextView tx030_0=(TextView) findViewById(R.id.tx030_0);
        TextView tx030_1=(TextView) findViewById(R.id.tx030_1);
        TextView tx030_2=(TextView) findViewById(R.id.tx030_2);
        TextView tx030_3=(TextView) findViewById(R.id.tx030_3);
        TextView tx031_0=(TextView) findViewById(R.id.tx031_0);
        TextView tx031_1=(TextView) findViewById(R.id.tx031_1);
        TextView tx031_2=(TextView) findViewById(R.id.tx031_2);
        TextView tx031_3=(TextView) findViewById(R.id.tx031_3);
        TextView tx032_0=(TextView) findViewById(R.id.tx032_0);
        TextView tx032_1=(TextView) findViewById(R.id.tx032_1);
        TextView tx032_2=(TextView) findViewById(R.id.tx032_2);
        TextView tx032_3=(TextView) findViewById(R.id.tx032_3);
        TextView tx033_0=(TextView) findViewById(R.id.tx033_0);
        TextView tx033_1=(TextView) findViewById(R.id.tx033_1);
        TextView tx033_2=(TextView) findViewById(R.id.tx033_2);
        TextView tx033_3=(TextView) findViewById(R.id.tx033_3);
        TextView tx034_0=(TextView) findViewById(R.id.tx034_0);
        TextView tx034_1=(TextView) findViewById(R.id.tx034_1);
        TextView tx034_2=(TextView) findViewById(R.id.tx034_2);
        TextView tx034_3=(TextView) findViewById(R.id.tx034_3);
        TextView tx035_0=(TextView) findViewById(R.id.tx035_0);
        TextView tx035_1=(TextView) findViewById(R.id.tx035_1);
        TextView tx035_2=(TextView) findViewById(R.id.tx035_2);
        TextView tx035_3=(TextView) findViewById(R.id.tx035_3);
        TextView tx036_0=(TextView) findViewById(R.id.tx036_0);
        TextView tx036_1=(TextView) findViewById(R.id.tx036_1);
        TextView tx036_2=(TextView) findViewById(R.id.tx036_2);
        TextView tx036_3=(TextView) findViewById(R.id.tx036_3);
        TextView tx037_0=(TextView) findViewById(R.id.tx037_0);
        TextView tx037_1=(TextView) findViewById(R.id.tx037_1);
        TextView tx037_2=(TextView) findViewById(R.id.tx037_2);
        TextView tx037_3=(TextView) findViewById(R.id.tx037_3);
        TextView tx038_0=(TextView) findViewById(R.id.tx038_0);
        TextView tx038_1=(TextView) findViewById(R.id.tx038_1);
        TextView tx038_2=(TextView) findViewById(R.id.tx038_2);
        TextView tx038_3=(TextView) findViewById(R.id.tx038_3);
        TextView tx039_0=(TextView) findViewById(R.id.tx039_0);
        TextView tx039_1=(TextView) findViewById(R.id.tx039_1);
        TextView tx039_2=(TextView) findViewById(R.id.tx039_2);
        TextView tx039_3=(TextView) findViewById(R.id.tx039_3);
        TextView tx040_0=(TextView) findViewById(R.id.tx040_0);
        TextView tx040_1=(TextView) findViewById(R.id.tx040_1);
        TextView tx040_2=(TextView) findViewById(R.id.tx040_2);
        TextView tx040_3=(TextView) findViewById(R.id.tx040_3);
        TextView tx041_0=(TextView) findViewById(R.id.tx041_0);
        TextView tx041_1=(TextView) findViewById(R.id.tx041_1);
        TextView tx041_2=(TextView) findViewById(R.id.tx041_2);
        TextView tx041_3=(TextView) findViewById(R.id.tx041_3);
        TextView tx042_0=(TextView) findViewById(R.id.tx042_0);
        TextView tx042_1=(TextView) findViewById(R.id.tx042_1);
        TextView tx042_2=(TextView) findViewById(R.id.tx042_2);
        TextView tx042_3=(TextView) findViewById(R.id.tx042_3);
        TextView tx043_0=(TextView) findViewById(R.id.tx043_0);
        TextView tx043_1=(TextView) findViewById(R.id.tx043_1);
        TextView tx043_2=(TextView) findViewById(R.id.tx043_2);
        TextView tx043_3=(TextView) findViewById(R.id.tx043_3);
        TextView tx044_0=(TextView) findViewById(R.id.tx044_0);
        TextView tx044_1=(TextView) findViewById(R.id.tx044_1);
        TextView tx044_2=(TextView) findViewById(R.id.tx044_2);
        TextView tx044_3=(TextView) findViewById(R.id.tx044_3);
        TextView tx045_0=(TextView) findViewById(R.id.tx045_0);
        TextView tx045_1=(TextView) findViewById(R.id.tx045_1);
        TextView tx045_2=(TextView) findViewById(R.id.tx045_2);
        TextView tx045_3=(TextView) findViewById(R.id.tx045_3);
        TextView tx046_0=(TextView) findViewById(R.id.tx046_0);
        TextView tx046_1=(TextView) findViewById(R.id.tx046_1);
        TextView tx046_2=(TextView) findViewById(R.id.tx046_2);
        TextView tx046_3=(TextView) findViewById(R.id.tx046_3);
        TextView tx047_0=(TextView) findViewById(R.id.tx047_0);
        TextView tx047_1=(TextView) findViewById(R.id.tx047_1);
        TextView tx047_2=(TextView) findViewById(R.id.tx047_2);
        TextView tx047_3=(TextView) findViewById(R.id.tx047_3);
        TextView tx048_0=(TextView) findViewById(R.id.tx048_0);
        TextView tx048_1=(TextView) findViewById(R.id.tx048_1);
        TextView tx048_2=(TextView) findViewById(R.id.tx048_2);
        TextView tx048_3=(TextView) findViewById(R.id.tx048_3);
        TextView tx049_0=(TextView) findViewById(R.id.tx049_0);
        TextView tx049_1=(TextView) findViewById(R.id.tx049_1);
        TextView tx049_2=(TextView) findViewById(R.id.tx049_2);
        TextView tx049_3=(TextView) findViewById(R.id.tx049_3);
        TextView tx050_0=(TextView) findViewById(R.id.tx050_0);
        TextView tx050_1=(TextView) findViewById(R.id.tx050_1);
        TextView tx050_2=(TextView) findViewById(R.id.tx050_2);
        TextView tx050_3=(TextView) findViewById(R.id.tx050_3);
        TextView tx051_0=(TextView) findViewById(R.id.tx051_0);
        TextView tx051_1=(TextView) findViewById(R.id.tx051_1);
        TextView tx051_2=(TextView) findViewById(R.id.tx051_2);
        TextView tx051_3=(TextView) findViewById(R.id.tx051_3);
        TextView tx052_0=(TextView) findViewById(R.id.tx052_0);
        TextView tx052_1=(TextView) findViewById(R.id.tx052_1);
        TextView tx052_2=(TextView) findViewById(R.id.tx052_2);
        TextView tx052_3=(TextView) findViewById(R.id.tx052_3);
        TextView tx053_0=(TextView) findViewById(R.id.tx053_0);
        TextView tx053_1=(TextView) findViewById(R.id.tx053_1);
        TextView tx053_2=(TextView) findViewById(R.id.tx053_2);
        TextView tx053_3=(TextView) findViewById(R.id.tx053_3);
        TextView tx054_0=(TextView) findViewById(R.id.tx054_0);
        TextView tx054_1=(TextView) findViewById(R.id.tx054_1);
        TextView tx054_2=(TextView) findViewById(R.id.tx054_2);
        TextView tx054_3=(TextView) findViewById(R.id.tx054_3);
        TextView tx055_0=(TextView) findViewById(R.id.tx055_0);
        TextView tx055_1=(TextView) findViewById(R.id.tx055_1);
        TextView tx055_2=(TextView) findViewById(R.id.tx055_2);
        TextView tx055_3=(TextView) findViewById(R.id.tx055_3);
        TextView tx056_0=(TextView) findViewById(R.id.tx056_0);
        TextView tx056_1=(TextView) findViewById(R.id.tx056_1);
        TextView tx056_2=(TextView) findViewById(R.id.tx056_2);
        TextView tx056_3=(TextView) findViewById(R.id.tx056_3);
        TextView tx058_0=(TextView) findViewById(R.id.tx058_0);
        TextView tx058_1=(TextView) findViewById(R.id.tx058_1);
        TextView tx058_2=(TextView) findViewById(R.id.tx058_2);
        TextView tx058_3=(TextView) findViewById(R.id.tx058_3);
        TextView tx059_0=(TextView) findViewById(R.id.tx059_0);
        TextView tx059_1=(TextView) findViewById(R.id.tx059_1);
        TextView tx059_2=(TextView) findViewById(R.id.tx059_2);
        TextView tx059_3=(TextView) findViewById(R.id.tx059_3);
        TextView tx060_0=(TextView) findViewById(R.id.tx060_0);
        TextView tx060_1=(TextView) findViewById(R.id.tx060_1);
        TextView tx060_2=(TextView) findViewById(R.id.tx060_2);
        TextView tx060_3=(TextView) findViewById(R.id.tx060_3);
        TextView tx061_0=(TextView) findViewById(R.id.tx061_0);
        TextView tx061_1=(TextView) findViewById(R.id.tx061_1);
        TextView tx061_2=(TextView) findViewById(R.id.tx061_2);
        TextView tx061_3=(TextView) findViewById(R.id.tx061_3);
        TextView tx062_0=(TextView) findViewById(R.id.tx062_0);
        TextView tx062_1=(TextView) findViewById(R.id.tx062_1);
        TextView tx062_2=(TextView) findViewById(R.id.tx062_2);
        TextView tx062_3=(TextView) findViewById(R.id.tx062_3);
        TextView tx063_0=(TextView) findViewById(R.id.tx063_0);
        TextView tx063_1=(TextView) findViewById(R.id.tx063_1);
        TextView tx063_2=(TextView) findViewById(R.id.tx063_2);
        TextView tx063_3=(TextView) findViewById(R.id.tx063_3);
        TextView tx064_0=(TextView) findViewById(R.id.tx064_0);
        TextView tx064_1=(TextView) findViewById(R.id.tx064_1);
        TextView tx064_2=(TextView) findViewById(R.id.tx064_2);
        TextView tx064_3=(TextView) findViewById(R.id.tx064_3);
        TextView tx065_0=(TextView) findViewById(R.id.tx065_0);
        TextView tx065_1=(TextView) findViewById(R.id.tx065_1);
        TextView tx065_2=(TextView) findViewById(R.id.tx065_2);
        TextView tx065_3=(TextView) findViewById(R.id.tx065_3);
        TextView tx066_0=(TextView) findViewById(R.id.tx066_0);
        TextView tx066_1=(TextView) findViewById(R.id.tx066_1);
        TextView tx066_2=(TextView) findViewById(R.id.tx066_2);
        TextView tx066_3=(TextView) findViewById(R.id.tx066_3);
        TextView tx067_0=(TextView) findViewById(R.id.tx067_0);
        TextView tx067_1=(TextView) findViewById(R.id.tx067_1);
        TextView tx067_2=(TextView) findViewById(R.id.tx067_2);
        TextView tx067_3=(TextView) findViewById(R.id.tx067_3);
        TextView tx068_0=(TextView) findViewById(R.id.tx068_0);
        TextView tx068_1=(TextView) findViewById(R.id.tx068_1);
        TextView tx068_2=(TextView) findViewById(R.id.tx068_2);
        TextView tx068_3=(TextView) findViewById(R.id.tx068_3);
        TextView tx070_0=(TextView) findViewById(R.id.tx070_0);
        TextView tx070_1=(TextView) findViewById(R.id.tx070_1);
        TextView tx070_2=(TextView) findViewById(R.id.tx070_2);
        TextView tx070_3=(TextView) findViewById(R.id.tx070_3);
        Intent intent = getIntent();
        Liquor_kind = intent.getStringExtra("Liquor_kind");
        Toast.makeText(this, Liquor_kind, Toast.LENGTH_SHORT).show();

        helper = new DBHelper(this);
        try {
            db = helper.getWritableDatabase(); //?????????????????? ????????? ??????
        } catch (SQLiteException ex) {
            db = helper.getReadableDatabase();
        }

        Cursor cursor = db.rawQuery("SELECT * FROM contacts WHERE kind='?????????'",null);
        cursor.moveToFirst();
        tx001_0.setText(cursor.getString(2));
        tx001_1.setText(cursor.getString(3));
        tx001_2.setText(cursor.getString(4));
        tx001_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx002_0.setText(cursor.getString(2));
        tx002_1.setText(cursor.getString(3));
        tx002_2.setText(cursor.getString(4));
        tx002_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx003_0.setText(cursor.getString(2));
        tx003_1.setText(cursor.getString(3));
        tx003_2.setText(cursor.getString(4));
        tx003_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx004_0.setText(cursor.getString(2));
        tx004_1.setText(cursor.getString(3));
        tx004_2.setText(cursor.getString(4));
        tx004_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx005_0.setText(cursor.getString(2));
        tx005_1.setText(cursor.getString(3));
        tx005_2.setText(cursor.getString(4));
        tx005_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx006_0.setText(cursor.getString(2));
        tx006_1.setText(cursor.getString(3));
        tx006_2.setText(cursor.getString(4));
        tx006_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx007_0.setText(cursor.getString(2));
        tx007_1.setText(cursor.getString(3));
        tx007_2.setText(cursor.getString(4));
        tx007_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx008_0.setText(cursor.getString(2));
        tx008_1.setText(cursor.getString(3));
        tx008_2.setText(cursor.getString(4));
        tx008_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx009_0.setText(cursor.getString(2));
        tx009_1.setText(cursor.getString(3));
        tx009_2.setText(cursor.getString(4));
        tx009_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx010_0.setText(cursor.getString(2));
        tx010_1.setText(cursor.getString(3));
        tx010_2.setText(cursor.getString(4));
        tx010_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx011_0.setText(cursor.getString(2));
        tx011_1.setText(cursor.getString(3));
        tx011_2.setText(cursor.getString(4));
        tx011_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx012_0.setText(cursor.getString(2));
        tx012_1.setText(cursor.getString(3));
        tx012_2.setText(cursor.getString(4));
        tx012_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx013_0.setText(cursor.getString(2));
        tx013_1.setText(cursor.getString(3));
        tx013_2.setText(cursor.getString(4));
        tx013_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx014_0.setText(cursor.getString(2));
        tx014_1.setText(cursor.getString(3));
        tx014_2.setText(cursor.getString(4));
        tx014_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx015_0.setText(cursor.getString(2));
        tx015_1.setText(cursor.getString(3));
        tx015_2.setText(cursor.getString(4));
        tx015_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx016_0.setText(cursor.getString(2));
        tx016_1.setText(cursor.getString(3));
        tx016_2.setText(cursor.getString(4));
        tx016_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx017_0.setText(cursor.getString(2));
        tx017_1.setText(cursor.getString(3));
        tx017_2.setText(cursor.getString(4));
        tx017_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx018_0.setText(cursor.getString(2));
        tx018_1.setText(cursor.getString(3));
        tx018_2.setText(cursor.getString(4));
        tx018_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx019_0.setText(cursor.getString(2));
        tx019_1.setText(cursor.getString(3));
        tx019_2.setText(cursor.getString(4));
        tx019_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx020_0.setText(cursor.getString(2));
        tx020_1.setText(cursor.getString(3));
        tx020_2.setText(cursor.getString(4));
        tx020_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx021_0.setText(cursor.getString(2));
        tx021_1.setText(cursor.getString(3));
        tx021_2.setText(cursor.getString(4));
        tx021_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx022_0.setText(cursor.getString(2));
        tx022_1.setText(cursor.getString(3));
        tx022_2.setText(cursor.getString(4));
        tx022_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx023_0.setText(cursor.getString(2));
        tx023_1.setText(cursor.getString(3));
        tx023_2.setText(cursor.getString(4));
        tx023_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx024_0.setText(cursor.getString(2));
        tx024_1.setText(cursor.getString(3));
        tx024_2.setText(cursor.getString(4));
        tx024_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx025_0.setText(cursor.getString(2));
        tx025_1.setText(cursor.getString(3));
        tx025_2.setText(cursor.getString(4));
        tx025_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx026_0.setText(cursor.getString(2));
        tx026_1.setText(cursor.getString(3));
        tx026_2.setText(cursor.getString(4));
        tx026_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx027_0.setText(cursor.getString(2));
        tx027_1.setText(cursor.getString(3));
        tx027_2.setText(cursor.getString(4));
        tx027_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx028_0.setText(cursor.getString(2));
        tx028_1.setText(cursor.getString(3));
        tx028_2.setText(cursor.getString(4));
        tx028_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx029_0.setText(cursor.getString(2));
        tx029_1.setText(cursor.getString(3));
        tx029_2.setText(cursor.getString(4));
        tx029_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx030_0.setText(cursor.getString(2));
        tx030_1.setText(cursor.getString(3));
        tx030_2.setText(cursor.getString(4));
        tx030_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx031_0.setText(cursor.getString(2));
        tx031_1.setText(cursor.getString(3));
        tx031_2.setText(cursor.getString(4));
        tx031_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx032_0.setText(cursor.getString(2));
        tx032_1.setText(cursor.getString(3));
        tx032_2.setText(cursor.getString(4));
        tx032_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx033_0.setText(cursor.getString(2));
        tx033_1.setText(cursor.getString(3));
        tx033_2.setText(cursor.getString(4));
        tx033_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx034_0.setText(cursor.getString(2));
        tx034_1.setText(cursor.getString(3));
        tx034_2.setText(cursor.getString(4));
        tx034_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx035_0.setText(cursor.getString(2));
        tx035_1.setText(cursor.getString(3));
        tx035_2.setText(cursor.getString(4));
        tx035_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx036_0.setText(cursor.getString(2));
        tx036_1.setText(cursor.getString(3));
        tx036_2.setText(cursor.getString(4));
        tx036_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx037_0.setText(cursor.getString(2));
        tx037_1.setText(cursor.getString(3));
        tx037_2.setText(cursor.getString(4));
        tx037_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx038_0.setText(cursor.getString(2));
        tx038_1.setText(cursor.getString(3));
        tx038_2.setText(cursor.getString(4));
        tx038_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx039_0.setText(cursor.getString(2));
        tx039_1.setText(cursor.getString(3));
        tx039_2.setText(cursor.getString(4));
        tx039_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx040_0.setText(cursor.getString(2));
        tx040_1.setText(cursor.getString(3));
        tx040_2.setText(cursor.getString(4));
        tx040_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx041_0.setText(cursor.getString(2));
        tx041_1.setText(cursor.getString(3));
        tx041_2.setText(cursor.getString(4));
        tx041_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx042_0.setText(cursor.getString(2));
        tx042_1.setText(cursor.getString(3));
        tx042_2.setText(cursor.getString(4));
        tx042_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx043_0.setText(cursor.getString(2));
        tx043_1.setText(cursor.getString(3));
        tx043_2.setText(cursor.getString(4));
        tx043_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx044_0.setText(cursor.getString(2));
        tx044_1.setText(cursor.getString(3));
        tx044_2.setText(cursor.getString(4));
        tx044_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx045_0.setText(cursor.getString(2));
        tx045_1.setText(cursor.getString(3));
        tx045_2.setText(cursor.getString(4));
        tx045_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx046_0.setText(cursor.getString(2));
        tx046_1.setText(cursor.getString(3));
        tx046_2.setText(cursor.getString(4));
        tx046_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx047_0.setText(cursor.getString(2));
        tx047_1.setText(cursor.getString(3));
        tx047_2.setText(cursor.getString(4));
        tx047_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx048_0.setText(cursor.getString(2));
        tx048_1.setText(cursor.getString(3));
        tx048_2.setText(cursor.getString(4));
        tx048_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx049_0.setText(cursor.getString(2));
        tx049_1.setText(cursor.getString(3));
        tx049_2.setText(cursor.getString(4));
        tx049_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx050_0.setText(cursor.getString(2));
        tx050_1.setText(cursor.getString(3));
        tx050_2.setText(cursor.getString(4));
        tx050_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx051_0.setText(cursor.getString(2));
        tx051_1.setText(cursor.getString(3));
        tx051_2.setText(cursor.getString(4));
        tx051_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx052_0.setText(cursor.getString(2));
        tx052_1.setText(cursor.getString(3));
        tx052_2.setText(cursor.getString(4));
        tx052_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx053_0.setText(cursor.getString(2));
        tx053_1.setText(cursor.getString(3));
        tx053_2.setText(cursor.getString(4));
        tx053_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx054_0.setText(cursor.getString(2));
        tx054_1.setText(cursor.getString(3));
        tx054_2.setText(cursor.getString(4));
        tx054_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx055_0.setText(cursor.getString(2));
        tx055_1.setText(cursor.getString(3));
        tx055_2.setText(cursor.getString(4));
        tx055_3.setText(cursor.getString(5));
        cursor.moveToNext();
        tx056_0.setText(cursor.getString(2));
        tx056_1.setText(cursor.getString(3));
        tx056_2.setText(cursor.getString(4));
        tx056_3.setText(cursor.getString(5));


        Cursor cursor1 = db.rawQuery("SELECT * FROM contacts WHERE kind='??????'",null);
        cursor1.moveToFirst();
        tx058_0.setText(cursor1.getString(2));
        tx058_1.setText(cursor1.getString(3));
        tx058_2.setText(cursor1.getString(4));
        tx058_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx059_0.setText(cursor1.getString(2));
        tx059_1.setText(cursor1.getString(3));
        tx059_2.setText(cursor1.getString(4));
        tx059_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx060_0.setText(cursor1.getString(2));
        tx060_1.setText(cursor1.getString(3));
        tx060_2.setText(cursor1.getString(4));
        tx060_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx061_0.setText(cursor1.getString(2));
        tx061_1.setText(cursor1.getString(3));
        tx061_2.setText(cursor1.getString(4));
        tx061_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx062_0.setText(cursor1.getString(2));
        tx062_1.setText(cursor1.getString(3));
        tx062_2.setText(cursor1.getString(4));
        tx062_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx063_0.setText(cursor1.getString(2));
        tx063_1.setText(cursor1.getString(3));
        tx063_2.setText(cursor1.getString(4));
        tx063_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx064_0.setText(cursor1.getString(2));
        tx064_1.setText(cursor1.getString(3));
        tx064_2.setText(cursor1.getString(4));
        tx064_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx065_0.setText(cursor1.getString(2));
        tx065_1.setText(cursor1.getString(3));
        tx065_2.setText(cursor1.getString(4));
        tx065_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx066_0.setText(cursor1.getString(2));
        tx066_1.setText(cursor1.getString(3));
        tx066_2.setText(cursor1.getString(4));
        tx066_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx067_0.setText(cursor1.getString(2));
        tx067_1.setText(cursor1.getString(3));
        tx067_2.setText(cursor1.getString(4));
        tx067_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx068_0.setText(cursor1.getString(2));
        tx068_1.setText(cursor1.getString(3));
        tx068_2.setText(cursor1.getString(4));
        tx068_3.setText(cursor1.getString(5));
        cursor1.moveToNext();
        tx070_0.setText(cursor1.getString(2));
        tx070_1.setText(cursor1.getString(3));
        tx070_2.setText(cursor1.getString(4));
        tx070_3.setText(cursor1.getString(5));
    }
}
