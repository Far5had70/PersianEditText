# PersianEdittext

![alt text](https://raw.githubusercontent.com/Far5had70/PersianEdittext/master/Capture.PNG)

Simple Custom EditText for Android

# Features

Border (stroke, radius, color)

Background (color)

Icon (Drawable)

Gravity (Right, Left, Center)

InputType(Phone, Number, Text, Password, MultiLine)

TypeFace(directory: Assets/fonts/sampleFont.ttf)




# Installation

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	implementation 'com.github.Far5had70:PersianEdittext:1.0.5'
	
Step 2. Add the dependency

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}



# Usage

1 - Include PersianEditText namespace to the root element :

	xmlns:PersianEditText="http://schemas.android.com/apk/res-auto"

2 - Add the PersianEditText View with custom params :

	<ir.waspar.persianedittext.PersianEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginRight="20dp"
        android:layout_marginLeft="20dp"
        PersianEditText:edtgravity="center"
        PersianEditText:edtInputType="number"
        PersianEditText:imageSrc="@drawable/ic_profile"
        PersianEditText:setHint="@string/app_name"
        PersianEditText:setImageBackground="@color/midnightgreen"
        PersianEditText:strokeColor="@color/black"
        PersianEditText:strokeRadius="40dp"
        PersianEditText:strokeSize="1dp"
        PersianEditText:textColor="@color/midnightgreen"
        PersianEditText:textSize="6dp"
        PersianEditText:typeface="bsans.ttf">
    </ir.waspar.persianedittext.PersianEditText>

# FAQ

How to add new fonts ? Just Paste your font inside assets/fonts/ folder for Text fonts and add this to attr PersianEditText

	PersianEditText:typeface="bsans.ttf"


# Developed By

Farshad Asgharzadeh

For contact, shoot me an email at ferik800@gmail.com
